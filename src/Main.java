import java.util.Locale;

public class Main {


    public static void main(String[] args) {

        String tryOut = " Hello World! ";

        System.out.println(tryOut.length());
        System.out.println(tryOut.toUpperCase());
        System.out.println(tryOut.toLowerCase());
        System.out.println(tryOut.replaceFirst("World", "CodersBay"));
        System.out.println(tryOut.stripLeading());
        System.out.println((tryOut + "\n").repeat(15));

    }
}