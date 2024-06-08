package packagea;

import java.time.temporal.ValueRange;
import java.util.*;
import java.util.stream.Stream;

public class Chick {
    final String name = "Fluffy";

    {
        System.out.println("setting field");
        System.out.println(name);
    }

    public Chick() {


        System.out.println(name);
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        String  name1 = "Fluffy";
        int n = 0;
        Integer integer =  10;
//        integer=10;
        System.out.println(integer.toString());
//        System.out.println( name1.equals(chick.name));
        var name ="hello";
        var id =10;
        System.out.println(name);
        String eyeTest = "Java Study Guide\n by Scott & Jeanne";
        System.out.println(eyeTest);

        int[] ints= new int[10];
        System.out.println(ints[0]);
        System.out.println("---------------------------------------------------------------------------------");


        List<Integer> list = new ArrayList<>();
        List<String> stringList = new LinkedList<>();
        Map<Integer,String>  integerStringMap = new HashMap<>();
        Map<Integer,String> stringMap = new Hashtable<>();
        stringMap.put(2,"kjh");
//        System.out.println(stringMap.get(2));
        list.add(102);
        list.add(02);
////        Stream.iterate(1, element->element+1)
//                .filter(element->element%5==0)
//                .limit(10)
//                .forEach(System.out::println);
//        System.out.println(list.stream().count());
//        integerStringMap.put(1,"kj");
//        System.out.println(integerStringMap.get(1));
//        stringList.add("fdgh");
//        stringList.add("kjhg");
//        list.add(1);
//        list.add(110);
//        list.add(10);
//        list.add(1020);
//        System.out.println(list.get(1));

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        for (int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));
//
//        }

        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        System.out.println(primitive);
        System.out.println(wrapper.toString());

        System.gc();






























    }
}
