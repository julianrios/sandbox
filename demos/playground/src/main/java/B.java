import javax.lang.model.util.SimpleElementVisitor6;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B {
//    private int no=10;
//    private static String name ="Ram";

    public static void main(String[] args) {


        int[] numbers = new int[10];
        int[] given = new int[]{1,2,4,5,67};
//        printMyName("Jack");
//        System.out.println(no);
//        int a = 10/0;
//
//        try {
//            System.out.println(a);
//        } catch (ArithmeticException ex) {
//            ex.printStackTrace();
//        }

//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
//        System.out.println(formatter.parse("02-03-2015"));
//        System.out.println(new Date());
//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.getTime());

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now.toLocalTime());

//        List<String> list = new ArrayList<>();
//        list.add("j");
//        list.add("r");
//        String result = list.stream().reduce("",String::concat);
//        list.stream().forEach((name)-> {showSupplier(()->name);
//
//        });
//        System.out.println(result);
//
//        List<Integer> values = (List<Integer>) Arrays.asList
//                (10,40,20,69,0,60,30,40).stream()
//                .filter(value-> value > 18)
//                .sorted()
//                .sequential()
//                .map(Integer::new)
//                .distinct()
//                .collect(Collectors.toCollection(ArrayList::new));
//
//        System.out.println(values.toString());


//        Function<String, Integer> length = String::length;
//        Function<Integer, Boolean> condition = (i) -> i < 10;
//        Function<String, Boolean> function = length.andThen(condition);
//
//        System.out.println("The outcome is:" + function.apply("Java 8"));

//        Consumer<String> consumer = B::showName;

//        List<Integer> values = (List<Integer>) Arrays.asList
//                (1,2,3,4,5).stream().skip(4)
//                .collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(values.toString());
//
//    }

//        Stream.of("Mango", "Orange").filter(fruit -> {
//            System.out.println("Fruit" + fruit);
//            return true;
//        });






//    public static void showSupplier(Supplier<String> name) {
//        System.out.println("Welcome:" +name.get());
//    }


//    public static void showName() {
//        System.out.println("Welcome"+name);
//    }

//    public static void printMyName(String name) {
//        name= name+"Nelson";
//        Runnable r = () -> {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Welcome:"+name);
//        };
//        new Thread(r).start();
//        System.out.println("Your name is:"+name);
//    }


//    static String mergeStrings(String a, String b) {
//        String mergedString = "";
//
//
//        for (int i = 0; i < a.length(); i++) {
//            mergedString += a.charAt(i);
//            if (i < b.length()) {
//                mergedString += b.charAt(i);
//            }
//        }
//
//        if (b.length() > a.length()) {
//            mergedString += b.substring(a.length());
//        }
//        return mergedString;
//    }
    }
}
