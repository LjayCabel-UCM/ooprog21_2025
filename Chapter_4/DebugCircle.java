public class DebugCircle {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

   
    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

   
    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

   
    public static void main(String[] args) {
        DebugCircle circle = new DebugCircle(5);

        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle diameter: " + circle.getDiameter());
        System.out.println("Circle area: " + circle.getArea());
    }
}
