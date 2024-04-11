import javax.swing.*;
import java.awt.*;

public class CoinNewWindow{

    public JLabel backlabel;
    public JFrame coinwindow;
    public int whitecoin , blackcoin , redcoin , bluecoin , greencoin;
    public JButton whitebutton , blackbutton , redbutton , bluebutton , greenbutton , submitbutton;
    public int whiteCount , blackCount , redCount , blueCount , greenCount;
    public JLabel lwhiteCount , lblackCount , lredCount , lblueCount , lgreenCount;

    public CoinNewWindow(){

        ImageIcon backimage = new ImageIcon("D:\\projectphoto\\back2.png");
        ImageIcon iconimage = new ImageIcon("D:\\projectphoto\\icon1.png");
        ImageIcon redcoin = new ImageIcon("D:\\projectphoto\\redcoin2.png");
        ImageIcon greencoin = new ImageIcon("D:\\projectphoto\\greencoin2.png");
        ImageIcon bluecoin = new ImageIcon("D:\\projectphoto\\bluecoin2.png");
        ImageIcon blackcoin = new ImageIcon("D:\\projectphoto\\blackcoin2.png");
        ImageIcon whitecoin = new ImageIcon("D:\\projectphoto\\whitecoin2.png");

        backlabel = new JLabel(backimage);

        coinwindow = new JFrame();
        coinwindow.setIconImage(iconimage.getImage());
        coinwindow.setSize(500 , 200);
        coinwindow.setContentPane(backlabel);
        coinwindow.setLayout(null);
        coinwindow.setTitle("select coin");
        coinwindow.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        coinwindow.setResizable(true);
        coinwindow.setVisible(false);

        submitbutton = new JButton("submit");
        submitbutton.setBounds(200 , 100 , 100 , 50);
        submitbutton.setBackground(Color.GRAY);
        coinwindow.add(submitbutton);
        submitbutton.setEnabled(true);

        whitebutton = new JButton(whitecoin);
        lwhiteCount = new JLabel(String.valueOf(whiteCount));
        whitebutton.setBounds(70 , 20 , 50 , 50);
        lwhiteCount.setBounds(90 , 75 , 10 , 15);
        whitebutton.setBackground(Color.GRAY);
        coinwindow.add(whitebutton);
        coinwindow.add(lwhiteCount);

        blackbutton = new JButton(blackcoin);
        lblackCount = new JLabel(String.valueOf(blackCount));
        blackbutton.setBounds(150 , 20 , 50 , 50);
        lblackCount.setBounds(170 , 75 , 10 , 15);
        blackbutton.setBackground(Color.GRAY);
        coinwindow.add(blackbutton);
        coinwindow.add(lblackCount);

        redbutton = new JButton(redcoin);
        lredCount = new JLabel(String.valueOf(redCount));
        redbutton.setBounds(230 , 20 , 50 , 50);
        lredCount.setBounds(250 , 75 , 10 , 15);
        redbutton.setBackground(Color.GRAY);
        coinwindow.add(redbutton);
        coinwindow.add(lredCount);

        bluebutton = new JButton(bluecoin);
        lblueCount = new JLabel(String.valueOf(blueCount));
        bluebutton.setBounds(310 , 20 , 50 , 50);
        lblueCount.setBounds(330 , 75 , 10 , 15);
        bluebutton.setBackground(Color.GRAY);
        coinwindow.add(bluebutton);
        coinwindow.add(lblueCount);

        greenbutton = new JButton(greencoin);
        lgreenCount = new JLabel(String.valueOf(greenCount));
        greenbutton.setBounds(390 , 20 , 50 , 50);
        lgreenCount.setBounds(410 , 75 , 10 , 15);
        greenbutton.setBackground(Color.GRAY);
        coinwindow.add(greenbutton);
        coinwindow.add(lgreenCount);

    }

    public void setcount(int whiteCount , int blackCount , int redCount , int blueCount , int greenCount){

        this.whiteCount = whiteCount;
        lwhiteCount.setText(String.valueOf(whiteCount));

        this.blackCount = blackCount;
        lblackCount.setText(String.valueOf(blackCount));

        this.redCount = redCount;
        lredCount.setText(String.valueOf(redCount));

        this.blueCount = blueCount;
        lblueCount.setText(String.valueOf(blueCount));

        this.greenCount = greenCount;
        lgreenCount.setText(String.valueOf(greenCount));

    }

}
