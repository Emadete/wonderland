import javax.swing.*;

public class HoldCart {

    public JFrame holdwindow;
    public JLabel backlabel;
    public Cart Cart1 , Cart2 , Cart3;
    public JButton bCart1 , bCart2 , bCart3;
    public int counter = 1;

    public HoldCart(){

        ImageIcon iconimage = new ImageIcon("D:\\projectphoto\\icon1.png");
        ImageIcon backimage = new ImageIcon("D:\\projectphoto\\back.png");

        backlabel = new JLabel(backimage);

        holdwindow = new JFrame();
        holdwindow.setIconImage(iconimage.getImage());
        holdwindow.setTitle("reserve cart");
        holdwindow.setSize(440 , 250);
        holdwindow.setContentPane(backlabel);
        holdwindow.setVisible(false);

    }

    public void setCart1(Cart cart){

        Cart1 = cart;
        bCart1 = new JButton(Cart1.image);
        bCart1.setBounds(10 , 10 , 125 , 175);
        holdwindow.add(bCart1);

    }

    public void setCart2(Cart cart){

        Cart2 = cart;
        bCart2 = new JButton(Cart2.image);
        bCart2.setBounds(145 , 10 , 125 , 175);
        holdwindow.add(bCart2);

    }

    public void setCart3(Cart cart){

        Cart3 = cart;
        bCart3 = new JButton(Cart3.image);
        bCart3.setBounds(280 , 10 , 125 , 175);
        holdwindow.add(bCart3);

    }

}
