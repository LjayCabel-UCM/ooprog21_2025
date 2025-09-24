public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public static void main(String[] args) {
    
      DebugPen pen1 = new DebugPen(); 
      System.out.println("Pen 1 color: " + pen1.getColor());
      System.out.println("Pen 1 point: " + pen1.getPoint());

        
      DebugPen pen2 = new DebugPen("blue", "medium");
      System.out.println("Pen 2 color: " + pen2.getColor());
      System.out.println("Pen 2 point: " + pen2.getPoint());
    }
}
