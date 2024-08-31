
public class LazyHash {

    public static int lazyHash(String word) {

        word = word.toLowerCase();

        if (word.length() < 3) {
            word = String.format("%-3s", word).replace(' ', 'x');
        }

        int first = (int) word.charAt(0);
        int second = (int) word.charAt(1);
        int third = (int) word.charAt(2);

        int hashValue = first * (27 * 27) + second * 27 + third;

        return hashValue;
    }

    public static void main(String[] args) {
        String word1 = "Algoritm";
        String word2 = "algoritm";
        String word3 = "abc";
        String word4 = "ab";
        String word5 = "Zebra";

        System.out.println("Hash for 'Algoritm': " + lazyHash(word1));
        System.out.println("Hash for 'algoritm': " + lazyHash(word2));
        System.out.println("Hash for 'abc': " + lazyHash(word3));
        System.out.println("Hash for 'ab': " + lazyHash(word4));
        System.out.println("Hash for 'Zebra': " + lazyHash(word5));
    }
}
