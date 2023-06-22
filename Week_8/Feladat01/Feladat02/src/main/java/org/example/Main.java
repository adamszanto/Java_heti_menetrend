package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 2.1 Read file.csv
        List<Data> datas = new ArrayList<>();
        String fileName = "src/main/java/org/example/files/file.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            String[] header = br.readLine().split(",");

            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String name = values[1];
                int code = Integer.parseInt(values[2]);

                Data data = new Data(id, name, code);
                datas.add(data);
            }
        } catch (IOException ex) {
            System.out.println("Something went wrong " + ex);
        }

        for(Data data : datas) {
            System.out.println(data.getId() + "\t " + data.getName() + "\t " + data.getCode());
        }

        // 2.2 Sort names:
        Collections.sort(datas, Comparator.comparing(Data::getName).reversed());
        datas.stream().map(Data::getName).forEach(System.out::println);

        // 2.3 Filter codes 2-6
        List<Data> filteredDatas = datas.stream()
                .filter(data -> data.getCode() >= 2 && data.getCode() <= 6)
                .collect(Collectors.toList());
        System.out.println("=========================");
        for(Data data : filteredDatas) {
            System.out.println(data.getId() + "\t" + data.getName() + "\t" + data.getCode());
        }

    }
}
