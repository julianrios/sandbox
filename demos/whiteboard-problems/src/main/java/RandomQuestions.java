public class RandomQuestions {
    private static Integer x = 10;
    private static Integer y = 2;

    public static void main(String[] args) {
        swap();
    }

    public static void swap(){
        System.out.println("Before x: " + x);
        System.out.println("Before y: " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After x: " + x);
        System.out.println("After y: " + y);
    }
}
