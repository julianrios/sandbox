public class Leet {

    public static void main(String[] args) {














        /*
        * Reverse Words in a String III
        *
        * Given a string, you need to reverse the order of characters in each word
        * within a sentence while still preserving whitespace and initial word order.
        * */
        String s = "Let's take LeetCode contest";
        System.out.println(s);
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        // split into an array of words
        String[] words = splitIntoWords(s);
        // reverse each word in the array
        String[] reverseWords = reverseWordsArray(words);
        // join each reversed word by a space
        return String.join(" ", reverseWords);
    }

    // reverse each word
    public static String[] reverseWordsArray(String[] arr) {
        String[] reverseArr = new String[arr.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = sb.append(arr[i]).reverse().toString();
            sb.delete(0, sb.length());
        }

        return reverseArr;
    }

    // split each sentence into an array of words
    public static String[] splitIntoWords(String s) {
        String[] words = s.split(" ");
        return words;
    }
}
