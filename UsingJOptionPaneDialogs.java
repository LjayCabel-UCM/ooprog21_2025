import javax.swing.*;
public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            
            String name = JOptionPane.showInputDialog(null, "Please enter your name:");
            
               if (name == null) {
               break;
            }
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to display your name?", "Confirm", JOptionPane.YES_NO_OPTION);
            
            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break;  
            }
        }
    }
}
