
import java.awt.Graphics;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(300,300);
        this.setVisible(true);
    }
    
    public void pain(Graphics graphics){
        super.paint(graphics);
        String msg = "I Rule!!";
        graphics.drawString(msg,100,100);
    }
    
    public static void main(String[] args){
        MyFrame myframe = new MyFrame("Head First Design patterns");
    }
}
