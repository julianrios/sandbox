public class C {


    public static void main(String[] args) {
        System.out.println(winner("EMH", "EEEEEEEEEEEEE"));
    }


    public static String winner(String erica, String bob) {
        // Write your code here
        Integer ericaScore = calculateScore(erica);
        Integer bobScore = calculateScore(bob);
        if (ericaScore > bobScore) {
            return "Erica wins";
        } else if (ericaScore < bobScore) {
            return "Bob wins";
        } else {
            return "Tie";
        }
    }

    public static Integer calculateScore(String test) {
        Integer score = 0;
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == 'E') {
                score += 1;
            } else if (test.charAt(i) == 'M') {
                score += 3;
            } else if (test.charAt(i) == 'H') {
                score += 5;
            }
        }
        return score;
    }

}
