import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*
        FebruaryMonth february = new FebruaryMonth();

        february.printFebruary();
        february.lowestSaturday();
        february.averageFebruary();
        february.averageWeekdays();
        february.highestFebruary();


        */


        Recipe paprikash = new Recipe("Paprikash", 4);
        RecipeIngredient onion = new RecipeIngredient("Onion", 150, Unit.G);
        RecipeIngredient meat = new RecipeIngredient("Meat", 400, Unit.G);
        RecipeIngredient paprika = new RecipeIngredient("Paprika spice",30, Unit.G);
        RecipeIngredient water = new RecipeIngredient("Water",500, Unit.ML);
        paprikash.addIngredient(onion);
        paprikash.addIngredient(meat);
        paprikash.addIngredient(paprika);
        paprikash.addIngredient(water);


        System.out.println("Recipe " + paprikash.getName() + " servings: " + paprikash.getServingSize());
        paprikash.addSteps("Fry chopped onions", 3);
        paprikash.addSteps("Add salt, pepper, paprika", 2);
        paprikash.addSteps("Add chicken and some water, simmer", 40);
        paprikash.listSteps();
        System.out.println("Recipe " + paprikash.getName() + " cooking time is: " + paprikash.getCookingTime() + " minutes.");

        paprikash.listIngredients();


/*
        DivideNums nums = new DivideNums();
        nums.divideTwoNums(5,0);

 */
        /*



        CustomSet set = new CustomSet();
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
        set.remove(2);
        set.contains(3);
        set.print();

    */

        /*
        // Stream API
        // Immutable lista az első 2:
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> num = List.of(1,2,3,4,5);

        // Mutable lista:
        List<Integer> num = new ArrayList<>();

        List<Integer> squares = num.stream().map(i -> i*i).distinct().collect(Collectors.toList());
    */

        /*
        StringList list = new StringList();

        list.addString("Kedd");
        list.addString("Szerda");
        list.addString("Csütörtök");
        list.addString("Péntek");

        list.removeString("Szerda");

        System.out.println(list.getString(0));
        System.out.println(list.getSize());


         */

    }
}