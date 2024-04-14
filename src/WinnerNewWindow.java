import javax.swing.*;
import java.awt.*;

public class WinnerNewWindow {

    public String name;
    public JLabel background , playername;
    public JFrame winnerwindow;

    public WinnerNewWindow(String name){

        ImageIcon iconimage = new ImageIcon("D:\\projectphoto\\icon1.png");
        ImageIcon back = new ImageIcon("D:\\projectphoto\\winner.png");

        background = new JLabel(back);

        playername = new JLabel(name + " is winner");
        playername.setFont(new Font("MV Boli", Font.BOLD, 22));
        playername.setBounds(100 , 5 , 200 , 200);

        winnerwindow = new JFrame();
        winnerwindow.setTitle("congratulations");
        winnerwindow.setLocation(575 , 100);
        winnerwindow.setIconImage(iconimage.getImage());
        winnerwindow.setSize(400 , 400);
        winnerwindow.setContentPane(background);
        winnerwindow.add(playername);
        winnerwindow.setVisible(true);

        this.name = name;

    }

}
