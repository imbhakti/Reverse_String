public class Main {
    public static void main(String[] args) {
        String name = "Bhakti Bhanage";
        String reverse = "";
        int length = name.length();
        System.out.println("Given String: Bhakti Bhanage");
        for (int i = length - 1; i > 0; i--) {
            reverse= reverse+ name.charAt(i);
        }
        System.out.println("Reverse of given string is: " + reverse);
    }
}