package fp452.ringo.kit;
import javax.swing.*; import java.awt.*;
public class FP452RINGOKIT {

    public static void main(String[] args) {
        JFrame frame = new JFrame("You Can Be a Starr!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrumPanel Ringo = new DrumPanel();
        frame.getContentPane().add(Ringo);
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
