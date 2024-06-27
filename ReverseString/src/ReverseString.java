
public class ReverseString {
    public static void main(String[] args) {
        String original = "hello";
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed string: " + reversed);
    }
}