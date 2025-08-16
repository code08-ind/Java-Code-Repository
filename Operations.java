import java.text.NumberFormat;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        final float PI = 3.14f;
//        We can't update the constant variable.
//        pi = 1;

//        Implicit Casting: Small type will be converted to the bigger type under the hood if small type is having
//        any operation with bigger type: byte > short > int > long > float > double.
        short x = 1;
        int y = x+2;

//        Explicit Casting: It can work between types that are compatible
        double z = 1.1;
        int a = (int)z+2;

//        We can parse these types by using the wrapper classes.

//        Math Class
//        Math.round(), Math.random() * 100, Math.ceil(), Math.floor() etc

//        We also can Format Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123456.89);
        System.out.println(result);

//        We also have a percent format as well for us.

//        We can also take input from the user
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

//        To get the full name without spaces in between
        String name = sc.nextLine();
        System.out.println(name);
    }
}
