// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;

public class DebugFour3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w, l, h;

        System.out.print("Enter width of box >> ");
        w = input.nextInt();
        System.out.print("Enter length of box >> ");
        l = input.nextInt();
        System.out.print("Enter height of box >> ");
        h = input.nextInt();

        DebugBox aBox1 = new DebugBox(w, l, h);
        DebugBox aBox2 = new DebugBox();

        System.out.println("The dimensions of the first box are:");
        aBox1.showData();
        System.out.print("The volume of the first box is: ");
        showVolume(aBox1);

        System.out.println("\nThe dimensions of the second box are:");
        aBox2.showData();
        System.out.print("The volume of the second box is: ");
        showVolume(aBox2);
    }

    public static void showVolume(DebugBox aBox) {
        double vol = aBox.getVolume();
        System.out.println(vol);
    }
}
