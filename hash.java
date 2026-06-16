//put
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // insert values
        map.put(1, "Ali");
        map.put(2, "Ahmed");
        map.put(3, "Sara");

        // get value
        System.out.println(map.get(2));

        // print all
        System.out.println(map);
    }
}

//get

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(freq);
    }
}
//contains

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        int[] arr = {5, 10, 15, 20};

        for (int num : arr) {
            map.put(num, true);
        }

        int target = 15;

        if (map.containsKey(target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

//

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String str = "aabbccaa";

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println(freq);
    }
}


get or default