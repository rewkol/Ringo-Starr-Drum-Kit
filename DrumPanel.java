/*
 * 16 February 2017 | Mitchell Golding
 * The Ringo Drum Kit
 */
package fp452.ringo.kit;
import javax.swing.*; import java.awt.*; import java.awt.event.*; import java.io.*; import sun.audio.*;
public class DrumPanel extends JPanel{
    private JLabel Kit;
    
    DrumPanel()
    {
        Kit = new JLabel(new ImageIcon("Kit.jpg"));
        Kit.setFocusable(true);
        Kit.addKeyListener(new DrumPlay());
        add(Kit);
        
        setBackground(Color.white);
    }
    
    private class DrumPlay implements KeyListener
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyCode()==KeyEvent.VK_SPACE)//Kick Drum
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Kick.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("SPACE");
                }
                catch(IOException nope)
                {
                    System.out.println("Kick.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_T)//12" Tom
            {
                try
                {
                    InputStream input = new FileInputStream(new File("12 Tom.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("T");
                }
                catch(IOException nope)
                {
                    System.out.println("12 Tom.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_K)//Floor Tom
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Floor Tom.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("K");
                }
                catch(IOException nope)
                {
                    System.out.println("Floor Tom.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_O)//Ride Sust
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Ride-Sust.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("O");
                }
                catch(IOException nope)
                {
                    System.out.println("Ride-Sust.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_P)//Ride Sust
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Ride-Top.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("P");
                }
                catch(IOException nope)
                {
                    System.out.println("Ride-Top.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_E)//Crash
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Crash.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("E");
                }
                catch(IOException nope)
                {
                    System.out.println("Crash.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_W)//Light Crash
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Crash-Light.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("W");
                }
                catch(IOException nope)
                {
                    System.out.println("Crash-Light.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_Q)//Hi Hat Top
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Hi-Top.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("Q");
                }
                catch(IOException nope)
                {
                    System.out.println("Hi-Top.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_A)//Hi Hat mid
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Hi-Mid.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("A");
                }
                catch(IOException nope)
                {
                    System.out.println("Hi-Mid.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_Z)//Hi Hat Crash
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Hi-Crash.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("Z");
                }
                catch(IOException nope)
                {
                    System.out.println("Hi-Crash.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_X)//Hi Hat Pedal Light
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Hi-Pedal.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("X");
                }
                catch(IOException nope)
                {
                    System.out.println("Hi-Pedal.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_C)//Hi Hat Pedal Sustained
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Hi-Pedal-Sust.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("C");
                }
                catch(IOException nope)
                {
                    System.out.println("Hi-Pedal-Sust.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_S)//Snare!
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Snare-Mid.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("S");
                }
                catch(IOException nope)
                {
                    System.out.println("Snare-Mid.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_D)//Snare Off Centre
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Snare-Off.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("D");
                }
                catch(IOException nope)
                {
                    System.out.println("Snare-Off.wav not found");
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_F)//Snare Edge
            {
                try
                {
                    InputStream input = new FileInputStream(new File("Snare-Edge.wav"));
                    AudioStream as = new AudioStream(input);
                    AudioPlayer.player.start(as);
                    System.out.println("F");
                }
                catch(IOException nope)
                {
                    System.out.println("Snare-Edge.wav not found");
                }
            }
        }
        @Override
        public void keyReleased(KeyEvent e){}
        @Override
        public void keyTyped(KeyEvent e){}
    }
}
