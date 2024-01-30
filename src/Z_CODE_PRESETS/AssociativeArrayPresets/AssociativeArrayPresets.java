package Z_CODE_PRESETS.AssociativeArrayPresets;

import java.util.*;

public class AssociativeArrayPresets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //Creating Hash map=------------------------

        //      on position one we have what type of Data all of our "Keys"
        // are going to be in this HasMap
        //             on position 2 we have what type of Data will all our acossiated
        //        value to the key will be
        //
        //Linked Hasmap have structure , from A-z from 1 to10 etc.
        LinkedHashMap<String,Integer> linkedHashMapNameInCode = new LinkedHashMap<>();
        HashMap<String,Integer> hashMapNameInCode = new HashMap<>();
        //Creating Hash map=------------------------


        //populating hashmap with data with .put()----------------------
        //we give key string and value integer
        hashMapNameInCode.put("Boeng 23434",130);
        hashMapNameInCode.put("Svuma",4);

        linkedHashMapNameInCode.put("Boeng 23434",130);
        linkedHashMapNameInCode.put("Svuma",4);
        //if we have HashMap with dublicate keys the last value given to the dublicate key is taken
        linkedHashMapNameInCode.put("Svuma",564);

         //populating hashmap with data with .put()------------------

        //removing  data from hasmap ---------------------------------
        // always done when we remove the key
        linkedHashMapNameInCode.remove("Svuma");
        //we can remove the key using the value
        linkedHashMapNameInCode.remove("564");
        //removing  data from hasmap ---------------------------------

        //adding data to hash map if not present with a check v1------------
        if (!hashMapNameInCode.containsKey("ass")){
            hashMapNameInCode.put("ass",69);
        }
        //adding data to hash map if not present with a check v1------------
        //adding data to hash map if not present with a check v2------------
        hashMapNameInCode.putIfAbsent("ass",0);
        //adding data to hash map if not present with a check v2------------
        //adding stuff to the value of the key
        //so from "ass",69 -> "ass",70
        hashMapNameInCode.put("ass",hashMapNameInCode.get("ass")+1);
        //adding data to hash map if not present with a check

        //creating Map only hashmap -----------------
        Map<String,String> newMap = new HashMap<>();
        //creating Map only hashmap -----------------

        //creating TreeMap hashMap--------------
        // this map sorts elemnts like the Linked map just in a dirrefert way
        TreeMap<String,Integer> hashMapTree = new TreeMap<>();
        //creating TreeMap hashMap--------------

        //Iteration in HashMap & print HashMap---------------------------------------

        LinkedHashMap<String,Integer> linkedHashMapNameInCode2 = new LinkedHashMap<>();
        linkedHashMapNameInCode2.put("blallsda",130);
        linkedHashMapNameInCode2.put("Svuma",4);
        linkedHashMapNameInCode2.entrySet();
        // then we click "Show context Actions"
        //and we select iterate we get \/
        for (Map.Entry<String, Integer> entry : linkedHashMapNameInCode2.entrySet()) {
            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
        }

        //Iteration in HashMap & print HashMap 2 wa---------------------------------------

        //hashMap with a list inside it as value for a single key----------------------------------------
        //we create the hashMap with list in it
        //but we don't have and object created of the list "new ArrayList<>()"
        LinkedHashMap<String, ArrayList<String>> wordsMapValueList = new LinkedHashMap<>();
        //so we create it by adding it with .put
        String wordHashKey = "apples";
        //we create a key apple and give it a whole list
        wordsMapValueList.put(wordHashKey,new ArrayList<>());
        wordsMapValueList.get("apples").add("green");
        wordsMapValueList.get("apples").add("yellow");
        wordsMapValueList.get("apples").add("red");

        //if the don't have the key apple we create and give it a whole list
        if (!wordsMapValueList.containsKey("apples")){
            wordsMapValueList.put("apples",new ArrayList<>());
            //we give the list acissiated with the key a value with .add
            //like we normally work with lists
            wordsMapValueList.get("apples").add("green");
            wordsMapValueList.get("apples").add("yellow");
            wordsMapValueList.get("apples").add("red");
        }
        //pint out a ArrayList content from value position in a HashMap
        System.out.println();
        System.out.println("This is ArrayList content from value position in a HashMap below");
        for (Map.Entry<String, ArrayList<String>> entry : wordsMapValueList.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue()));
        }
        //hashMap with a list inside it as value for a single key----------------------------------------



    }
}
