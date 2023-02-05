import java.sql.Array;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,8,1);
        System.out.println(filterList(list));
    }

    public static List<Integer> filterList(List<Integer> list) {
        List<Integer> checkedList = new ArrayList<>();
        List<Integer> filteredList = new ArrayList<>();
        for(Integer element : list) {
            if(!checkedList.contains(element)) {
                checkedList.add(element);
            } else {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}