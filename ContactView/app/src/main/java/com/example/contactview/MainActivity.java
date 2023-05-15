package com.example.contactview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String API_URL = "https://randomuser.me/api/?results=5&nat=us";

    private ArrayList<Contact> contactList = new ArrayList<>();

    private LinearLayout contactListView;
    private RelativeLayout detailLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactListView = findViewById(R.id.contact_list);

        new FetchContactsTask().execute(API_URL);
    }

    private void showContactList() {
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);

            View cardView = getLayoutInflater().inflate(R.layout.contact_card, null);

            ImageView profileImage = cardView.findViewById(R.id.profile_image);
            TextView email = cardView.findViewById(R.id.email);
            TextView address = cardView.findViewById(R.id.address);

            Glide.with(this)
                    .load(contact.getProfileImage())
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(profileImage);

            email.setText(contact.getEmail());
            address.setText(contact.getAddress());

            cardView.setTag(i);
            cardView.setOnClickListener(v -> showContactDetail((int) v.getTag()));

            contactListView.addView(cardView);
        }
    }

    private void showContactDetail(int position) {
        Contact contact = contactList.get(position);

        ImageView profileImage = detailLayout.findViewById(R.id.profile_image);
        TextView fullName = detailLayout.findViewById(R.id.full_name);
        TextView phoneNumber = detailLayout.findViewById(R.id.phone_number);
        TextView email = detailLayout.findViewById(R.id.email);

        Glide.with(this)
                .load(contact.getProfileImage())
                .placeholder(R.drawable.ic_launcher_background)
                .into(profileImage);

        fullName.setText(contact.getFullName());
        phoneNumber.setText(contact.getPhone());
        email.setText(contact.getEmail());

        contactListView.setVisibility(View.GONE);
        detailLayout.setVisibility(View.VISIBLE);
    }

    private class FetchContactsTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {
            String url = urls[0];
            try {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url(url)
                        .build();
                Response response = client.newCall(request).execute();
                return response.body().string();
            } catch (IOException e) {
                Log.e(TAG, e.getMessage(), e);
                return null;
            }
        }

        @Override
        protected void onPostExecute(String result) {
            if (result != null) {
                try {
                    JSONObject jsonObject = new JSONObject(result);
                    JSONArray results = jsonObject.getJSONArray("results");

                    for (int i = 0; i < results.length(); i++) {
                        JSONObject object = results.getJSONObject(i);

                        String fullName = object.getJSONObject("name").getString("first") + " " + object.getJSONObject("name").getString("last");
                        String email = object.getString("email");
                        String phone = object.getString("phone");
                        String address = object.getJSONObject("location").getString("street") + ", " + object.getJSONObject("location").getString("city") + ", " + object.getJSONObject("location").getString("state") + " " + object.getJSONObject("location").getString("postcode");
                        String profileImage = object.getJSONObject("picture").getString("large");

                        Contact contact = new Contact(fullName, email, phone, address, profileImage);
                        contactList.add(contact);
                    }

                    showContactList();
                } catch (JSONException e) {
                    Log.e(TAG, e.getMessage(), e);
                }
            }
        }
    }
}
