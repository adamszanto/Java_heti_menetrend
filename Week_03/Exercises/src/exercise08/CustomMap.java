package exercise08;

import java.util.HashMap;
import java.util.Map;

public class CustomMap {
    private Map<Integer, String> map;

    public CustomMap() {
        this.map = new HashMap<Integer, String>();
    }


    public void addMap(Integer num, String str) {
        map.put(num, str);
    }

    public void removeMap(Integer num) {
        map.remove(num);
    }

    public String getValueForKey(Integer num) {
        return map.get(num);
    }

    public void printMap() {
        System.out.println(map);
    }


}
