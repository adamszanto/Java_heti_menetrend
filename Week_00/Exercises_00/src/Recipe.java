import java.util.ArrayList;
import java.util.HashMap;

// ArrayList<Ingredient>
// Milyen metódusokat kell majd felhasználni a collectionben tároláshoz a custom classunkhoz? Equals, hashcode metódus.
// Hogyan működik az add, contains, remove? Megnézni.
// Equals = csak akkor ad igazat ha ugyanarra mutat 2 objektum, de tartalmukban is össze akarjuk hasonlítani, hogy az attributumokat vegye figyelembe.
// Ingredient 2-3 attribútum, elnevezés, űrtartalom, mennyiség mennyi kell a recepthez...
// mértékegység, unit része (ENUM legyen, összes ingredient amihez a projekt. Lista.)
// Minden ref. típusú változó alapértéke null ha nincs inicializálva
// Lokális változót ha nem inicializálunk akkor ott szemét lesz foglalva, le sem fordul ha használni akarjuk.
// Primitív típusnál van default érték ha nem inicializálunk
// TODO: get konvencio = ne legyen sout-ba rakva, csak simán adja vissza az űrértéket. Vagy nevezzem át "print stb valami"-re.

public class Recipe {
    private String name;
    private ArrayList<RecipeIngredient> ingredientList = new ArrayList<>();
    private HashMap<String, Integer> steps = new HashMap<>();
    int servingSize = 0;
    int totalCookingTime = 0;

    public Recipe() {
    }

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, int servingSize) {
        //   int serving;
        //   System.out.println(serving);
        this.name = name;
        this.servingSize = servingSize;
    }

    public String getName() {
        return name;
    }




    public void setServingSize(int number) {
        this.servingSize = number;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void addSteps(String step, Integer minutes) {
        steps.put(step, minutes);
        totalCookingTime+=minutes;
    }

    public void listSteps() {
        for(String i : steps.keySet()) {
            System.out.println("Step " + i + " for " + steps.get(i) + " minutes.");
        }
    }

    public int getCookingTime() {
        return totalCookingTime;
    }

    // TODO: ArrayList<RecipeIngredient> felhasznált metódusok: add, contains, remove.

    public void addIngredient(RecipeIngredient recipe) {
        ingredientList.add(recipe);
    }

    public void listIngredients() {
        System.out.println(this.getName() + " list of ingredients: ");
        System.out.println(ingredientList.toString() + "\n");
    }

}
