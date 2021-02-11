import java.util.Locale;

public class Main {


    public static void main(String[] args) {

        String tryOut = " Hello World! ";

        System.out.println(tryOut.length());
        System.out.println(tryOut.toUpperCase(Locale.ROOT));
        System.out.println(tryOut.toLowerCase(Locale.ROOT));
        System.out.println(tryOut.replaceFirst("World", "CodersBay"));
        System.out.println(tryOut.stripLeading());

        for (int i = 1; i <= 15; i++) {

            System.out.println(tryOut);
        }

    }
}