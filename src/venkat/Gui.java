package venkat;
import javax.swing.*;
public class Gui {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog ( "Enter your name" );
        JOptionPane.showMessageDialog ( JOptionPane.getRootFrame (),"hello "+name );
        int n= Integer.parseInt ( JOptionPane.showInputDialog ( "Enter your age" ) );
        JOptionPane.showMessageDialog ( null,"hello your age is "+n );


    }
}
