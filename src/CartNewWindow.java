import javax.swing.*;

public class CartNewWindow {

    public ImageIcon image;
    public JFrame Cartwindow;
    public JLabel cartlabel;
    public JButton hold , buy;

    public CartNewWindow(ImageIcon image){

        ImageIcon iconimage = new ImageIcon("D:\\projectphoto\\icon1.png");
        ImageIcon back = new ImageIcon("D:\\projectphoto\\coinback.png");
        JLabel coinback =  new JLabel(back);

        Cartwindow = new JFrame("Transaction Cart");
        Cartwindow.setIconImage(iconimage.getImage());
        Cartwindow.setSize(250 , 230);
        Cartwindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Cartwindow.setLayout(null);
        Cartwindow.setContentPane(coinback);
        Cartwindow.setLocation(1290 , 25);
        Cartwindow.setVisible(true);

        cartlabel = new JLabel(image);
        cartlabel.setBounds(10 , 10 , 125 , 175);
        Cartwindow.add(cartlabel);

        hold = new JButton("Hold");
        hold.setBounds(150 , 120 , 60 , 20);
        Cartwindow.add(hold);

        buy = new JButton("Buy");
        buy.setBounds(150 , 60 , 60 , 20 );
        Cartwindow.add(buy);
        buy.setEnabled(false);

    }

}
