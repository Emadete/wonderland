import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    public JLabel backlabel;
    public GameCoin WhiteCoin , BlackCoin , RedCoin , BlueCoin , GreenCoin;
    public Cart Cart11 , Cart12 , Cart13 , Cart14 , Cart15 , Cart16 , Cart17 , Cart18 , Cart19 , Cart110;
    public Cart Cart111 , Cart112 , Cart113 , Cart114 , Cart115;
    public Cart Cart21 , Cart22 , Cart23 , Cart24 , Cart25 , Cart26 , Cart27 , Cart28 , Cart29 , Cart210;
    public Cart Cart211 , Cart212 , Cart213 , Cart214 , Cart215;
    public Cart Cart31 , Cart32 , Cart33 , Cart34 , Cart35 , Cart36 , Cart37 , Cart38 , Cart39 , Cart310;
    public Cart Cart311 , Cart312 , Cart313 , Cart314 , Cart315;
    public JButton bcart11 , bcart12 , bcart13 , bcart14 , bcart15 , bcart16 , bcart17 , bcart18 , bcart19 , bcart110;
    public JButton bcart111 , bcart112 , bcart113 , bcart114 , bcart115 , bcart21 , bcart22 , bcart23 , bcart24 , bcart25;
    public JButton bcart26 , bcart27 , bcart28 , bcart29 , bcart210 , bcart211 , bcart212 , bcart213 , bcart214 , bcart215;
    public JButton bcart31 , bcart32 , bcart33 , bcart34 , bcart35 , bcart36 , bcart37 , bcart38 , bcart39 , bcart310;
    public JButton bcart311 , bcart312 , bcart313 , bcart314 , bcart315;
    public JLabel whitelabel , blacklabel , redlabel , bluelabel , greenlabel;
    public JLabel pwhite1 , pblack1 , pred1 , pblue1 , pgreen1 , pgold1;
    public JLabel pwhiteCount1 , pblackCount1 , predCount1 , pblueCount1 , pgreenCount1 , pgoldCount1;
    public JLabel spwhiteCount1 , spblackCount1 , spredCount1 , spblueCount1 , spgreenCount1 , spgoldCount1;
    public JLabel pwhiteCount2 , pblackCount2 , predCount2 , pblueCount2 , pgreenCount2 , pgoldCount2;
    public JLabel spwhiteCount2 , spblackCount2 , spredCount2 , spblueCount2 , spgreenCount2 , spgoldCount2;
    public JLabel pwhite2 , pblack2 , pred2 , pblue2 , pgreen2 , pgold2;
    public Princes prince1 , prince2 , prince3;
    public JLabel lprize1 , lprize2 , lprize3 , goldenlabel;
    public JLabel player1 , name1 , score1 , star1;
    public JLabel player2 , name2 , score2 , star2;
    public JButton newcoinwindow;

    public MyFrame(){

        ImageIcon backimage = new ImageIcon("D:\\projectphoto\\back.png");  // this image for game background
        ImageIcon iconimage = new ImageIcon("D:\\projectphoto\\icon1.png");  // this image for game icon
        ImageIcon redcoin = new ImageIcon("D:\\projectphoto\\redcoin.png");  // this image for red coin
        ImageIcon greencoin = new ImageIcon("D:\\projectphoto\\greencoin.png");  // this image for green coin
        ImageIcon bluecoin = new ImageIcon("D:\\projectphoto\\bluecoin.png");  // this image for blue coin
        ImageIcon blackcoin = new ImageIcon("D:\\projectphoto\\blackcoin.png");  // this image for black coin
        ImageIcon whitecoin = new ImageIcon("D:\\projectphoto\\whitecoin.png");  // this image for white coin
        ImageIcon goldencoin = new ImageIcon("D:\\projectphoto\\goldencoin.png");  // this image for golden coin
        ImageIcon playerlabel = new ImageIcon("D:\\projectphoto\\label.png");
        ImageIcon star = new ImageIcon("D:\\projectphoto\\star.png");
        ImageIcon predcoin = new ImageIcon("D:\\projectphoto\\redcoin2.png");  // this image for red coin
        ImageIcon pgreencoin = new ImageIcon("D:\\projectphoto\\greencoin2.png");  // this image for green coin
        ImageIcon pbluecoin = new ImageIcon("D:\\projectphoto\\bluecoin2.png");  // this image for blue coin
        ImageIcon pblackcoin = new ImageIcon("D:\\projectphoto\\blackcoin2.png");  // this image for black coin
        ImageIcon pwhitecoin = new ImageIcon("D:\\projectphoto\\whitecoin2.png");  // this image for white coin
        ImageIcon pgoldencoin = new ImageIcon("D:\\projectphoto\\goldencoin2.png");  // this image for golden coin
        ImageIcon prize1 = new ImageIcon("D:\\projectphoto\\prince\\first.png");  // this image for prize cart
        ImageIcon prize2 = new ImageIcon("D:\\projectphoto\\prince\\second.png");  // this image for prize cart
        ImageIcon prize3 = new ImageIcon("D:\\projectphoto\\prince\\third.png");  // this image for prize cart
        ImageIcon cart11 = new ImageIcon("D:\\projectphoto\\level1\\black11.png"); // this image for level1 cart
        ImageIcon cart12 = new ImageIcon("D:\\projectphoto\\level1\\black12.png"); // this image for level1 cart
        ImageIcon cart13 = new ImageIcon("D:\\projectphoto\\level1\\black13.png"); // this image for level1 cart
        ImageIcon cart14 = new ImageIcon("D:\\projectphoto\\level1\\blue11.png"); // this image for level1 cart
        ImageIcon cart15 = new ImageIcon("D:\\projectphoto\\level1\\blue12.png"); // this image for level1 cart
        ImageIcon cart16 = new ImageIcon("D:\\projectphoto\\level1\\blue13.png"); // this image for level1 cart
        ImageIcon cart17 = new ImageIcon("D:\\projectphoto\\level1\\green11.png"); // this image for level1 cart
        ImageIcon cart18 = new ImageIcon("D:\\projectphoto\\level1\\green12.png"); // this image for level1 cart
        ImageIcon cart19 = new ImageIcon("D:\\projectphoto\\level1\\green13.png"); // this image for level1 cart
        ImageIcon cart110 = new ImageIcon("D:\\projectphoto\\level1\\red11.png"); // this image for level1 cart
        ImageIcon cart111 = new ImageIcon("D:\\projectphoto\\level1\\red12.png"); // this image for level1 cart
        ImageIcon cart112 = new ImageIcon("D:\\projectphoto\\level1\\red13.png"); // this image for level1 cart
        ImageIcon cart113 = new ImageIcon("D:\\projectphoto\\level1\\white11.png"); // this image for level1 cart
        ImageIcon cart114 = new ImageIcon("D:\\projectphoto\\level1\\white12.png"); // this image for level1 cart
        ImageIcon cart115 = new ImageIcon("D:\\projectphoto\\level1\\white13.png"); // this image for level1 cart
        ImageIcon cart21 = new ImageIcon("D:\\projectphoto\\level2\\black21.png"); // this image for level2 cart
        ImageIcon cart22 = new ImageIcon("D:\\projectphoto\\level2\\black22.png"); // this image for level2 cart
        ImageIcon cart23 = new ImageIcon("D:\\projectphoto\\level2\\black23.png"); // this image for level2 cart
        ImageIcon cart24 = new ImageIcon("D:\\projectphoto\\level2\\blue21.png"); // this image for level2 cart
        ImageIcon cart25 = new ImageIcon("D:\\projectphoto\\level2\\blue22.png"); // this image for level2 cart
        ImageIcon cart26 = new ImageIcon("D:\\projectphoto\\level2\\blue23.png"); // this image for level2 cart
        ImageIcon cart27 = new ImageIcon("D:\\projectphoto\\level2\\green21.png"); // this image for level2 cart
        ImageIcon cart28 = new ImageIcon("D:\\projectphoto\\level2\\green22.png"); // this image for level2 cart
        ImageIcon cart29 = new ImageIcon("D:\\projectphoto\\level2\\green23.png"); // this image for level2 cart
        ImageIcon cart210 = new ImageIcon("D:\\projectphoto\\level2\\red21.png"); // this image for level2 cart
        ImageIcon cart211 = new ImageIcon("D:\\projectphoto\\level2\\red22.png"); // this image for level2 cart
        ImageIcon cart212 = new ImageIcon("D:\\projectphoto\\level2\\red23.png"); // this image for level2 cart
        ImageIcon cart213 = new ImageIcon("D:\\projectphoto\\level2\\white21.png"); // this image for level2 cart
        ImageIcon cart214 = new ImageIcon("D:\\projectphoto\\level2\\white22.png"); // this image for level2 cart
        ImageIcon cart215 = new ImageIcon("D:\\projectphoto\\level2\\white23.png"); // this image for level2 cart
        ImageIcon cart31 = new ImageIcon("D:\\projectphoto\\level3\\black31.png"); // this image for level3 cart
        ImageIcon cart32 = new ImageIcon("D:\\projectphoto\\level3\\black32.png"); // this image for level3 cart
        ImageIcon cart33 = new ImageIcon("D:\\projectphoto\\level3\\black33.png"); // this image for level3 cart
        ImageIcon cart34 = new ImageIcon("D:\\projectphoto\\level3\\blue31.png"); // this image for level3 cart
        ImageIcon cart35 = new ImageIcon("D:\\projectphoto\\level3\\blue32.png"); // this image for level3 cart
        ImageIcon cart36 = new ImageIcon("D:\\projectphoto\\level3\\blue33.png"); // this image for level3 cart
        ImageIcon cart37 = new ImageIcon("D:\\projectphoto\\level3\\green31.png"); // this image for level3 cart
        ImageIcon cart38 = new ImageIcon("D:\\projectphoto\\level3\\green32.png"); // this image for level3 cart
        ImageIcon cart39 = new ImageIcon("D:\\projectphoto\\level3\\green33.png"); // this image for level3 cart
        ImageIcon cart310 = new ImageIcon("D:\\projectphoto\\level3\\red31.png"); // this image for level3 cart
        ImageIcon cart311 = new ImageIcon("D:\\projectphoto\\level3\\red32.png"); // this image for level3 cart
        ImageIcon cart312 = new ImageIcon("D:\\projectphoto\\level3\\red33.png"); // this image for level3 cart
        ImageIcon cart313 = new ImageIcon("D:\\projectphoto\\level3\\white31.png"); // this image for level3 cart
        ImageIcon cart314 = new ImageIcon("D:\\projectphoto\\level3\\white32.png"); // this image for level3 cart
        ImageIcon cart315 = new ImageIcon("D:\\projectphoto\\level3\\white33.png"); // this image for level3 cart

        backlabel = new JLabel(backimage);  // this label for game background

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // set how to close game
        setLayout(null);
        setTitle("Wonderland");  // set game name
        setExtendedState(JFrame.MAXIMIZED_BOTH);  // set maximized game screan
        setIconImage(iconimage.getImage());  // set geme icon
        setVisible(true);  // set visible frame to show player

        setContentPane(backlabel);  // set game background

        player1 = new JLabel(playerlabel);
        name1 = new JLabel("Player 1");
        score1 = new JLabel(" 0 ");
        star1 = new JLabel(star);
        pwhite1 = new JLabel(pwhitecoin);
        pwhiteCount1 = new JLabel("0");
        spwhiteCount1 = new JLabel("0");
        pblack1 = new JLabel(pblackcoin);
        pblackCount1 = new JLabel("0");
        spblackCount1 = new JLabel("0");
        pred1 = new JLabel(predcoin);
        predCount1 = new JLabel("0");
        spredCount1 = new JLabel("0");
        pblue1 = new JLabel(pbluecoin);
        pblueCount1 = new JLabel("0");
        spblueCount1 = new JLabel("0");
        pgreen1 = new JLabel(pgreencoin);
        pgreenCount1 = new JLabel("0");
        spgreenCount1 = new JLabel("0");
        pgold1 = new JLabel(pgoldencoin);
        pgoldCount1 = new JLabel("0");
        spgoldCount1 = new JLabel("0");
        name1.setBounds(50 , 30 , 100 , 30);
        score1.setBounds(200 , 30 , 100 , 30);
        star1.setBounds(275 , 20 , 50 , 50);
        pwhite1.setBounds(35 , 80 , 50 , 50);
        pblack1.setBounds(92 , 80 , 50 , 50);
        pred1.setBounds(149 , 80 , 50 , 50);
        pblue1.setBounds(206 , 80 , 50 , 50);
        pgreen1.setBounds(263 , 80 , 50 , 50);
        pgold1.setBounds(320 , 80 , 50 , 50);
        pwhiteCount1.setBounds(53 , 135 , 50 , 30);
        pblackCount1.setBounds(110 , 135 , 50 , 30);
        predCount1.setBounds(167 , 135 , 50 , 30);
        pblueCount1.setBounds(224 , 135 , 50 , 30);
        pgreenCount1.setBounds(281 , 135 , 50 , 30);
        pgoldCount1.setBounds(338 , 135 , 50 , 30);
        spwhiteCount1.setBounds(53 , 165 , 50 , 30);
        spblackCount1.setBounds(110 , 165 , 50 , 30);
        spredCount1.setBounds(167 , 165 , 50 , 30);
        spblueCount1.setBounds(224 , 165 , 50 , 30);
        spgreenCount1.setBounds(281 , 165 , 50 , 30);
        spgoldCount1.setBounds(338 , 165 , 50 , 30);
        name1.setFont(new Font("Arial", Font.PLAIN, 20));
        score1.setFont(new Font("Arial", Font.PLAIN, 20));
        pwhiteCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        pblackCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        predCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        pblueCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        pgreenCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        pgoldCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        spwhiteCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        spblackCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        spredCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        spblueCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        spgreenCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        spgoldCount1.setFont(new Font("Arial", Font.PLAIN, 20));
        player1.setLayout(null);
        player1.setBounds(70 , 150 , 400 , 250);
        player1.add(name1);
        player1.add(score1);
        player1.add(star1);
        player1.add(pwhite1);
        player1.add(pblack1);
        player1.add(pred1);
        player1.add(pblue1);
        player1.add(pgreen1);
        player1.add(pgold1);
        player1.add(pwhiteCount1);
        player1.add(pblackCount1);
        player1.add(predCount1);
        player1.add(pblueCount1);
        player1.add(pgreenCount1);
        player1.add(pgoldCount1);
        player1.add(spwhiteCount1);
        player1.add(spwhiteCount1);
        player1.add(spblackCount1);
        player1.add(spredCount1);
        player1.add(spblueCount1);
        player1.add(spgreenCount1);
        player1.add(spgoldCount1);
        add(player1);

        player2 = new JLabel(playerlabel);
        name2 = new JLabel("Player 2");
        score2 = new JLabel(" 0 ");
        star2 = new JLabel(star);
        pwhite2 = new JLabel(pwhitecoin);
        pwhiteCount2 = new JLabel("0");
        spwhiteCount2 = new JLabel("0");
        pblack2 = new JLabel(pblackcoin);
        pblackCount2 = new JLabel("0");
        spblackCount2 = new JLabel("0");
        pred2 = new JLabel(predcoin);
        predCount2 = new JLabel("0");
        spredCount2 = new JLabel("0");
        pblue2 = new JLabel(pbluecoin);
        pblueCount2 = new JLabel("0");
        spblueCount2 = new JLabel("0");
        pgreen2 = new JLabel(pgreencoin);
        pgreenCount2 = new JLabel("0");
        spgreenCount2 = new JLabel("0");
        pgold2 = new JLabel(pgoldencoin);
        pgoldCount2 = new JLabel("0");
        spgoldCount2 = new JLabel("0");
        name2.setBounds(50 , 30 , 100 , 30);
        score2.setBounds(200 , 30 , 100 , 30);
        star2.setBounds(275 , 20 , 50 , 50);
        pwhite2.setBounds(35 , 80 , 50 , 50);
        pblack2.setBounds(92 , 80 , 50 , 50);
        pred2.setBounds(149 , 80 , 50 , 50);
        pblue2.setBounds(206 , 80 , 50 , 50);
        pgreen2.setBounds(263 , 80 , 50 , 50);
        pgold2.setBounds(320 , 80 , 50 , 50);
        pwhiteCount2.setBounds(53 , 135 , 50 , 30);
        pblackCount2.setBounds(110 , 135 , 50 , 30);
        predCount2.setBounds(167 , 135 , 50 , 30);
        pblueCount2.setBounds(224 , 135 , 50 , 30);
        pgreenCount2.setBounds(281 , 135 , 50 , 30);
        pgoldCount2.setBounds(338 , 135 , 50 , 30);
        spwhiteCount2.setBounds(53 , 165 , 50 , 30);
        spblackCount2.setBounds(110 , 165 , 50 , 30);
        spredCount2.setBounds(167 , 165 , 50 , 30);
        spblueCount2.setBounds(224 , 165 , 50 , 30);
        spgreenCount2.setBounds(281 , 165 , 50 , 30);
        spgoldCount2.setBounds(338 , 165 , 50 , 30);
        name2.setFont(new Font("Arial", Font.PLAIN, 20));
        score2.setFont(new Font("Arial", Font.PLAIN, 20));
        pwhiteCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        pblackCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        predCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        pblueCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        pgreenCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        pgoldCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        spwhiteCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        spblackCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        spredCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        spblueCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        spgreenCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        spgoldCount2.setFont(new Font("Arial", Font.PLAIN, 20));
        player2.setLayout(null);
        player2.setBounds(70 , 450 , 400 , 250);
        player2.add(name2);
        player2.add(score2);
        player2.add(star2);
        player2.add(pwhite2);
        player2.add(pblack2);
        player2.add(pred2);
        player2.add(pblue2);
        player2.add(pgreen2);
        player2.add(pgold2);
        player2.add(pwhiteCount2);
        player2.add(pblackCount2);
        player2.add(predCount2);
        player2.add(pblueCount2);
        player2.add(pgreenCount2);
        player2.add(pgoldCount2);
        player2.add(spwhiteCount2);
        player2.add(spwhiteCount2);
        player2.add(spblackCount2);
        player2.add(spredCount2);
        player2.add(spblueCount2);
        player2.add(spgreenCount2);
        player2.add(spgoldCount2);
        star2.setVisible(false);
        add(player2);

        bcart11 = new JButton(cart11);
        Cart11 = new Cart(1 , 1 , 1 , 0 , 1 , 0 , "Black" , cart11);
        bcart11.setBounds(700,595,125,175);
        add(bcart11);

        bcart12 = new JButton(cart12);
        Cart12 = new Cart(1 , 2 , 0 , 0 , 0 , 0 , "Black" , cart12);
        bcart12.setBounds(875,595,125,175);
        add(bcart12);

        bcart13 = new JButton(cart13);
        Cart13 = new Cart(0 , 0 , 0 , 0 , 4 , 1 , "Black" , cart13);
        bcart13.setBounds(1050,595,125,175);
        add(bcart13);

        bcart14 = new JButton(cart14);
        Cart14 = new Cart(0 , 2 , 0 , 2 , 1 , 0 , "Blue" , cart14);
        bcart14.setBounds(1225,595,125,175);
        add(bcart14);

        bcart15 = new JButton(cart15);
        Cart15 = new Cart(0 , 0 , 0 , 3 , 0 , 0 , "Blue" , cart15);
        bcart15.setBounds(700,595,125,175);
        add(bcart15);

        bcart16 = new JButton(cart16);
        Cart16 = new Cart(4 , 0 , 0 , 0 , 0 , 1 , "Blue" , cart16);
        bcart16.setBounds(875,595,125,175);
        add(bcart16);

        bcart17 = new JButton(cart17);
        Cart17 = new Cart(0 , 0 , 2 , 0 , 1 , 0 , "Green" , cart17);
        bcart17.setBounds(1050,595,125,175);
        add(bcart17);

        bcart18 = new JButton(cart18);
        Cart18 = new Cart(2 , 0 , 0 , 2 , 1 , 0 , "Green" , cart18);
        bcart18.setBounds(1225,595,125,175);
        add(bcart18);

        bcart19 = new JButton(cart19);
        Cart19 = new Cart(0 , 0 , 0 , 4 , 0 , 1 , "Green" , cart19);
        bcart19.setBounds(700,595,125,175);
        add(bcart19);

        bcart110 = new JButton(cart110);
        Cart110 = new Cart(0 , 1 , 2 , 1 , 1 , 0 , "Red" , cart110);
        bcart110.setBounds(875,595,125,175);
        add(bcart110);

        bcart111 = new JButton(cart111);
        Cart111 = new Cart(0 , 1 , 0 , 0 , 2 , 0 , "Red" , cart111);
        bcart111.setBounds(1050,595,125,175);
        add(bcart111);

        bcart112 = new JButton(cart112);
        Cart112 = new Cart(0 , 0 , 4 , 0 , 0 , 1 , "Red" , cart112);
        bcart112.setBounds(1225,595,125,175);
        add(bcart112);

        bcart113 = new JButton(cart113);
        Cart113 = new Cart(2 , 0 , 0 , 1 , 0 , 0 , "White" , cart113);
        bcart113.setBounds(700,595,125,175);
        add(bcart113);

        bcart114 = new JButton(cart114);
        Cart114 = new Cart(0 , 0 , 0 , 2 , 2 , 0 , "White" , cart114);
        bcart114.setBounds(875,595,125,175);
        add(bcart114);

        bcart115 = new JButton(cart115);
        Cart115 = new Cart(0 , 4 , 0 , 0 , 0 , 1 , "White" , cart115);
        bcart115.setBounds(1050,595,125,175);
        add(bcart115);


        bcart21 = new JButton(cart21);
        Cart21 = new Cart(3 , 5 , 0 , 0 , 0 , 2 , "Black" , cart21);
        bcart21.setBounds(700,395,125,175);
        add(bcart21);

        bcart22 = new JButton(cart22);
        Cart22 = new Cart(0 , 0 , 5 , 0 , 0 , 2 , "Black" , cart22);
        bcart22.setBounds(875,395,125,175);
        add(bcart22);

        bcart23 = new JButton(cart23);
        Cart23 = new Cart(0 , 0 , 0 , 6 , 0 , 3 , "Black" , cart23);
        bcart23.setBounds(1050,395,125,175);
        add(bcart23);

        bcart24 = new JButton(cart24);
        Cart24 = new Cart(1 , 0 , 2 , 4 , 0 , 2 , "Blue" , cart24);
        bcart24.setBounds(1225,395,125,175);
        add(bcart24);

        bcart25 = new JButton(cart25);
        Cart25 = new Cart(0 , 0 , 5 , 0 , 3 , 2 , "Blue" , cart25);
        bcart25.setBounds(700,395,125,175);
        add(bcart25);

        bcart26 = new JButton(cart26);
        Cart26 = new Cart(0 , 0 , 0 , 0 , 6 , 3 , "Blue" , cart26);
        bcart26.setBounds(875,395,125,175);
        add(bcart26);

        bcart27 = new JButton(cart27);
        Cart27 = new Cart(0 , 0 , 4 , 1 , 2 , 2 , "Green" , cart27);
        bcart27.setBounds(1050,395,125,175);
        add(bcart27);

        bcart28 = new JButton(cart28);
        Cart28 = new Cart(0 , 5 , 0 , 0 , 0 , 2 , "Green" , cart28);
        bcart28.setBounds(1225,395,125,175);
        add(bcart28);

        bcart29 = new JButton(cart29);
        Cart29 = new Cart(0 , 6 , 0 , 0 , 0 , 3 , "Green" , cart29);
        bcart29.setBounds(700,395,125,175);
        add(bcart29);

        bcart210 = new JButton(cart210);
        Cart210 = new Cart(0 , 0 , 0 , 5 , 0 , 2 , "Red" , cart210);
        bcart210.setBounds(875,395,125,175);
        add(bcart210);

        bcart211 = new JButton(cart211);
        Cart211 = new Cart(0 , 2 , 1 , 0 , 4 , 2 , "Red" , cart211);
        bcart211.setBounds(1050,395,125,175);
        add(bcart211);

        bcart212 = new JButton(cart212);
        Cart212 = new Cart(6 , 0 , 0 , 0 , 0 , 3 , "Red" , cart212);
        bcart212.setBounds(1225,395,125,175);
        add(bcart212);

        bcart213 = new JButton(cart213);
        Cart213 = new Cart(4 , 1 , 0 , 2 , 0 , 2 , "White" , cart213);
        bcart213.setBounds(700,395,125,175);
        add(bcart213);

        bcart214 = new JButton(cart214);
        Cart214 = new Cart(5 , 0 , 0 , 3 , 0 , 2 , "White" , cart214);
        bcart214.setBounds(875,395,125,175);
        add(bcart214);

        bcart215 = new JButton(cart215);
        Cart215 = new Cart(0 , 0 , 6 , 0 , 0 , 3 , "White" , cart215);
        bcart215.setBounds(1050,395,125,175);
        add(bcart215);

        bcart31 = new JButton(cart31);
        Cart31 = new Cart(3 , 5 , 3 , 0 , 3 , 3 , "Black" , cart31);
        bcart31.setBounds(700,195,125,175);
        add(bcart31);

        bcart32 = new JButton(cart32);
        Cart32 = new Cart(7 , 0 , 0 , 0 , 0 , 4 , "Black" , cart32);
        bcart32.setBounds(875,195,125,175);
        add(bcart32);

        bcart33 = new JButton(cart33);
        Cart33 = new Cart(7 , 0 , 0 , 3 , 0 , 5 , "Black" , cart33);
        bcart33.setBounds(1050,195,125,175);
        add(bcart33);

        bcart34 = new JButton(cart34);
        Cart34 = new Cart(3 , 3 , 3 , 5 , 0 , 3 , "Blue" , cart34);
        bcart34.setBounds(1225,195,125,175);
        add(bcart34);

        bcart35 = new JButton(cart35);
        Cart35 = new Cart(0 , 0 , 7 , 0 , 0 , 4 , "Blue" , cart35);
        bcart35.setBounds(700,195,125,175);
        add(bcart35);

        bcart36 = new JButton(cart36);
        Cart36 = new Cart(0 , 0 , 7 , 0 , 3 , 5 , "Blue" , cart36);
        bcart36.setBounds(875,195,125,175);
        add(bcart36);

        bcart37 = new JButton(cart37);
        Cart37 = new Cart(3 , 0 , 5 , 3 , 3 , 3 , "Green" , cart37);
        bcart37.setBounds(1050,195,125,175);
        add(bcart37);

        bcart38 = new JButton(cart38);
        Cart38 = new Cart(0 , 3 , 3 , 0 , 6 , 4 , "Green" , cart38);
        bcart38.setBounds(1225,195,125,175);
        add(bcart38);

        bcart39 = new JButton(cart39);
        Cart39 = new Cart(0 , 3 , 0 , 0 , 7 , 5 , "Green" , cart39);
        bcart39.setBounds(700,195,125,175);
        add(bcart39);

        bcart310 = new JButton(cart310);
        Cart310 = new Cart(0 , 3 , 3 , 3 , 5 , 3 , "Red" , cart310);
        bcart310.setBounds(875,195,125,175);
        add(bcart310);

        bcart311 = new JButton(cart311);
        Cart311 = new Cart(3 , 6 , 0 , 0 , 3 , 4 , "Red" , cart311);
        bcart311.setBounds(1050,195,125,175);
        add(bcart311);

        bcart312 = new JButton(cart312);
        Cart312 = new Cart(3 , 7 , 0 , 0 , 0 , 5 , "Red" , cart312);
        bcart312.setBounds(1225,195,125,175);
        add(bcart312);

        bcart313 = new JButton(cart313);
        Cart313 = new Cart(5 , 3 , 0 , 3 , 3 , 3 , "White" , cart313);
        bcart313.setBounds(700,195,125,175);
        add(bcart313);

        bcart314 = new JButton(cart314);
        Cart314 = new Cart(0 , 0 , 0 , 7 , 0 , 4 , "White" , cart314);
        bcart314.setBounds(875,195,125,175);
        add(bcart314);

        bcart315 = new JButton(cart315);
        Cart315 = new Cart(0 , 0 , 3 , 7 , 0 , 5 , "White" , cart315);
        bcart315.setBounds(1050,195,125,175);
        add(bcart315);

        lprize1 = new JLabel(prize1);
        prince1 = new Princes(0 , 0 , 4 , 0 , 4);
        lprize1.setBounds(750,25,150,150);
        add(lprize1);

        lprize2 = new JLabel(prize2);
        prince2 = new Princes(3 , 0 , 3 , 3 , 0);
        lprize2.setBounds(950,25,150,150);
        add(lprize2);

        lprize3 = new JLabel(prize3);
        prince3 = new Princes(0 , 3 , 3 , 0 , 3);
        lprize3.setBounds(1150,25,150,150);
        add(lprize3);

        goldenlabel = new JLabel(goldencoin);
        goldenlabel.setBounds(530,50,100,100);
        add(goldenlabel);

        WhiteCoin = new GameCoin();
        BlackCoin = new GameCoin();
        RedCoin = new GameCoin();
        BlueCoin = new GameCoin();
        GreenCoin = new GameCoin();

        newcoinwindow = new JButton(backimage);
        newcoinwindow.setLayout(null);
        newcoinwindow.setBounds(530 , 170 , 100 , 600);
        add(newcoinwindow);

        whitelabel = new JLabel(whitecoin);
        whitelabel.setBounds(0,0,100,100);
        newcoinwindow.add(whitelabel);

        blacklabel = new JLabel(blackcoin);
        blacklabel.setBounds(0,120,100,100);
        newcoinwindow.add(blacklabel);

        redlabel = new JLabel(redcoin);
        redlabel.setBounds(0,240,100,100);
        newcoinwindow.add(redlabel);

        bluelabel = new JLabel(bluecoin);
        bluelabel.setBounds(0,360,100,100);
        newcoinwindow.add(bluelabel);

        greenlabel = new JLabel(greencoin);
        greenlabel.setBounds(0,480,100,100);
        newcoinwindow.add(greenlabel);

    }

    public void changePlayerCoin1(int whitecoin ,  int blackcoin , int redcoin , int bluecoin , int greencoin , int goldencoin){

        pwhiteCount1.setText(String.valueOf(whitecoin));
        pblackCount1.setText(String.valueOf(blackcoin));
        predCount1.setText(String.valueOf(redcoin));
        pblueCount1.setText(String.valueOf(bluecoin));
        pgreenCount1.setText(String.valueOf(greencoin));
        pgoldCount1.setText(String.valueOf(goldencoin));

    }

    public void changePlayerCoin2(int whitecoin ,  int blackcoin , int redcoin , int bluecoin , int greencoin , int goldencoin){

        pwhiteCount2.setText(String.valueOf(whitecoin));
        pblackCount2.setText(String.valueOf(blackcoin));
        predCount2.setText(String.valueOf(redcoin));
        pblueCount2.setText(String.valueOf(bluecoin));
        pgreenCount2.setText(String.valueOf(greencoin));
        pgoldCount2.setText(String.valueOf(goldencoin));

    }

    public void schangePlayerCoin1(int whitecoin ,  int blackcoin , int redcoin , int bluecoin , int greencoin){

        spwhiteCount1.setText(String.valueOf(whitecoin));
        spblackCount1.setText(String.valueOf(blackcoin));
        spredCount1.setText(String.valueOf(redcoin));
        spblueCount1.setText(String.valueOf(bluecoin));
        spgreenCount1.setText(String.valueOf(greencoin));

    }

    public void schangePlayerCoin2(int whitecoin ,  int blackcoin , int redcoin , int bluecoin , int greencoin){

        spwhiteCount2.setText(String.valueOf(whitecoin));
        spblackCount2.setText(String.valueOf(blackcoin));
        spredCount2.setText(String.valueOf(redcoin));
        spblueCount2.setText(String.valueOf(bluecoin));
        spgreenCount2.setText(String.valueOf(greencoin));

    }

}
