import javax.swing.*;

public class Main{

    public static boolean turn = true;
    public static MyFrame frame;
    public static CoinNewWindow newWindow;
    public static WinnerNewWindow winner;
    public static  Player player1 , player2;
    public static CartNewWindow bucart11 , bucart12 , bucart13 , bucart14 , bucart15 , bucart16 , bucart17 , bucart18;
    public static CartNewWindow bucart19 , bucart110 , bucart111 , bucart112 , bucart113 , bucart114 , bucart115;
    public static CartNewWindow bucart21 , bucart22 , bucart23 , bucart24 , bucart25 , bucart26 , bucart27 , bucart28;
    public static CartNewWindow bucart29 , bucart210 , bucart211 , bucart212 , bucart213 , bucart214 , bucart215;
    public static CartNewWindow bucart31 , bucart32 , bucart33 , bucart34 , bucart35 , bucart36 , bucart37 , bucart38;
    public static CartNewWindow bucart39 , bucart310 , bucart311 , bucart312 , bucart313 , bucart314 , bucart315;

    public static void turnChanger(){

        if(turn){

            frame.star1.setVisible(false);
            frame.star2.setVisible(true);

        }
        else{

            frame.star1.setVisible(true);
            frame.star2.setVisible(false);

        }

        turn = !turn;

    }

    public static void checkenable(){

        newWindow.whitebutton.setEnabled(true);
        newWindow.blackbutton.setEnabled(true);
        newWindow.redbutton.setEnabled(true);
        newWindow.bluebutton.setEnabled(true);
        newWindow.greenbutton.setEnabled(true);

        if(frame.WhiteCoin.CountCoin <= 0)
            newWindow.whitebutton.setEnabled(false);

        if(frame.BlackCoin.CountCoin <= 0)
            newWindow.blackbutton.setEnabled(false);

        if(frame.RedCoin.CountCoin <= 0)
            newWindow.redbutton.setEnabled(false);

        if(frame.BlueCoin.CountCoin <= 0)
            newWindow.bluebutton.setEnabled(false);

        if(frame.GreenCoin.CountCoin <= 0)
            newWindow.greenbutton.setEnabled(false);

    }

    public static void CartBuy1(Cart cart){

        if(cart.WhiteCoin != 0){

            cart.WhiteCoin -= player1.SpecialWhiteCoin;
            frame.WhiteCoin.CountCoin += cart.WhiteCoin;
            player1.WhiteCoin -= cart.WhiteCoin;

        }

        if(cart.BlackCoin != 0){

            cart.BlackCoin -= player1.SpecialBlackCoin;
            frame.BlackCoin.CountCoin += cart.BlackCoin;
            player1.BlackCoin -= cart.BlackCoin;

        }

        if(cart.RedCoin != 0){

            cart.RedCoin -= player1.SpecialRedCoin;
            frame.RedCoin.CountCoin += cart.RedCoin;
            player1.RedCoin -= cart.RedCoin;

        }

        if(cart.BlueCoin != 0){

            cart.BlueCoin -= player1.SpecialBlueCoin;
            frame.BlueCoin.CountCoin += cart.BlueCoin;
            player1.BlueCoin -= cart.BlueCoin;

        }

        if(cart.GreenCoin != 0){

            cart.GreenCoin -= player1.SpecialGreenCoin;
            frame.GreenCoin.CountCoin += cart.GreenCoin;
            player1.GreenCoin -= cart.GreenCoin;

        }

        player1.Score += cart.Score;
        checkwinner1();

        switch (cart.SpecialCoin){

            case "White" :
                player1.SpecialWhiteCoin ++;
                break;

            case "Black" :
                player1.SpecialBlackCoin ++;
                break;

            case "Red" :
                player1.SpecialRedCoin ++;
                break;

            case "Blue" :
                player1.SpecialBlueCoin ++;
                break;

            case "Green" :
                player1.SpecialGreenCoin ++;
                break;

        }

        prize11check();
        prize21check();
        prize31check();

        frame.changeScore1(player1.Score);

        frame.schangePlayerCoin1(player1.SpecialWhiteCoin , player1.SpecialBlackCoin , player1.SpecialRedCoin , player1.SpecialBlueCoin , player1.SpecialGreenCoin);

        frame.changePlayerCoin1(player1.WhiteCoin , player1.BlackCoin , player1.RedCoin , player1.BlueCoin , player1.GreenCoin , player1.GoldenCoin);

        turnChanger();

    }

    public static void CartBuy2(Cart cart){

        if(cart.WhiteCoin != 0){

            cart.WhiteCoin -= player2.SpecialWhiteCoin;
            frame.WhiteCoin.CountCoin += cart.WhiteCoin;
            player2.WhiteCoin -= cart.WhiteCoin;

        }

        if(cart.BlackCoin != 0){

            cart.BlackCoin -= player2.SpecialBlackCoin;
            frame.BlackCoin.CountCoin += cart.BlackCoin;
            player2.BlackCoin -= cart.BlackCoin;

        }

        if(cart.RedCoin != 0){

            cart.RedCoin -= player2.SpecialRedCoin;
            frame.RedCoin.CountCoin += cart.RedCoin;
            player2.RedCoin -= cart.RedCoin;

        }

        if(cart.BlueCoin != 0){

            cart.BlueCoin -= player2.SpecialBlueCoin;
            frame.BlueCoin.CountCoin += cart.BlueCoin;
            player2.BlueCoin -= cart.BlueCoin;

        }

        if(cart.GreenCoin != 0){

            cart.GreenCoin -= player2.SpecialGreenCoin;
            frame.GreenCoin.CountCoin += cart.GreenCoin;
            player2.GreenCoin -= cart.GreenCoin;

        }

        player2.Score += cart.Score;
        checkwinner2();

        switch (cart.SpecialCoin){

            case "White" :
                player2.SpecialWhiteCoin ++;
                break;

            case "Black" :
                player2.SpecialBlackCoin ++;
                break;

            case "Red" :
                player2.SpecialRedCoin ++;
                break;

            case "Blue" :
                player2.SpecialBlueCoin ++;
                break;

            case "Green" :
                player2.SpecialGreenCoin ++;
                break;

        }

        prize12check();
        prize22check();
        prize32check();

        frame.changeScore2(player2.Score);

        frame.schangePlayerCoin2(player2.SpecialWhiteCoin , player2.SpecialBlackCoin , player2.SpecialRedCoin , player2.SpecialBlueCoin , player2.SpecialGreenCoin);

        frame.changePlayerCoin2(player2.WhiteCoin , player2.BlackCoin , player2.RedCoin , player2.BlueCoin , player2.GreenCoin , player2.GoldenCoin);

        turnChanger();

    }

    public static void prize11check(){

        if(player1.SpecialWhiteCoin >= frame.prince1.SpecialWhiteCoin && player1.SpecialBlackCoin >= frame.prince1.SpecialBlackCoin && player1.SpecialRedCoin >= frame.prince1.SpecialRedCoin &&  player1.SpecialBlueCoin >= frame.prince1.SpecialBlueCoin &&  player1.SpecialGreenCoin >= frame.prince1.SpecialGreenCoin){

            checkwinner1();

            player1.Score += frame.prince1.Score;

            frame.lprize1.setVisible(false);

        }

    }
    public static void prize12check(){

        if(player2.SpecialWhiteCoin >= frame.prince1.SpecialWhiteCoin && player2.SpecialBlackCoin >= frame.prince1.SpecialBlackCoin && player2.SpecialRedCoin >= frame.prince1.SpecialRedCoin &&  player2.SpecialBlueCoin >= frame.prince1.SpecialBlueCoin &&  player2.SpecialGreenCoin >= frame.prince1.SpecialGreenCoin){

            checkwinner2();

            player2.Score += frame.prince1.Score;

            frame.lprize1.setVisible(false);

        }

    }

    public static void prize21check(){

        if(player1.SpecialWhiteCoin >= frame.prince2.SpecialWhiteCoin && player1.SpecialBlackCoin >= frame.prince2.SpecialBlackCoin && player1.SpecialRedCoin >= frame.prince2.SpecialRedCoin &&  player1.SpecialBlueCoin >= frame.prince2.SpecialBlueCoin &&  player1.SpecialGreenCoin >= frame.prince2.SpecialGreenCoin){

            checkwinner1();

            player1.Score += frame.prince2.Score;

            frame.lprize2.setVisible(false);

        }

    }
    public static void prize22check(){

        if(player2.SpecialWhiteCoin >= frame.prince2.SpecialWhiteCoin && player2.SpecialBlackCoin >= frame.prince2.SpecialBlackCoin && player2.SpecialRedCoin >= frame.prince2.SpecialRedCoin &&  player2.SpecialBlueCoin >= frame.prince2.SpecialBlueCoin &&  player2.SpecialGreenCoin >= frame.prince2.SpecialGreenCoin){

            checkwinner2();

            player2.Score += frame.prince2.Score;

            frame.lprize2.setVisible(false);

        }

    }

    public static void prize31check(){

        if(player1.SpecialWhiteCoin >= frame.prince3.SpecialWhiteCoin && player1.SpecialBlackCoin >= frame.prince3.SpecialBlackCoin && player1.SpecialRedCoin >= frame.prince3.SpecialRedCoin &&  player1.SpecialBlueCoin >= frame.prince3.SpecialBlueCoin &&  player1.SpecialGreenCoin >= frame.prince3.SpecialGreenCoin){

            checkwinner1();

            player1.Score += frame.prince3.Score;

            frame.lprize3.setVisible(false);

        }

    }
    public static void prize32check(){

        if(player2.SpecialWhiteCoin >= frame.prince3.SpecialWhiteCoin && player2.SpecialBlackCoin >= frame.prince3.SpecialBlackCoin && player2.SpecialRedCoin >= frame.prince3.SpecialRedCoin &&  player2.SpecialBlueCoin >= frame.prince3.SpecialBlueCoin &&  player2.SpecialGreenCoin >= frame.prince3.SpecialGreenCoin){

            checkwinner2();

            player2.Score += frame.prince3.Score;

            frame.lprize3.setVisible(false);

        }

    }

    public static void checkwinner1(){

        if(player1.Score >= 15){

            winner = new WinnerNewWindow(player1.Name);
            frame.setVisible(false);

        }

    }

    public static void checkwinner2(){

        if(player2.Score >= 15){

            winner = new WinnerNewWindow(player2.Name);
            frame.setVisible(false);

        }

    }

    public static void main(String[] args) {

        player1 = new Player();
        player2 = new Player();

        player1.Name = JOptionPane.showInputDialog("player 1, Enter your name ?");
        player2.Name = JOptionPane.showInputDialog("player 2, Enter your name ?");

        frame = new MyFrame();
        frame.changePlayerName(player1.Name , player2.Name);

        frame.newcoinwindow.addActionListener(e -> {

            newWindow = new CoinNewWindow();

            newWindow.setcount(frame.WhiteCoin.CountCoin , frame.BlackCoin.CountCoin , frame.RedCoin.CountCoin , frame.BlueCoin.CountCoin , frame.GreenCoin.CountCoin );

            newWindow.coinwindow.setVisible(true);

            checkenable();

            newWindow.whitebutton.addActionListener(e1 -> {

                newWindow.maxcoin++;

                if(frame.WhiteCoin.CountCoin == 4 || newWindow.whitecoin != 0){

                    newWindow.whitecoin++;

                    if(newWindow.whitecoin == 2){

                        newWindow.whitebutton.setEnabled(false);
                        newWindow.blackbutton.setEnabled(false);
                        newWindow.redbutton.setEnabled(false);
                        newWindow.bluebutton.setEnabled(false);
                        newWindow.greenbutton.setEnabled(false);

                    }

                }
                else{

                    newWindow.whitecoin++;
                    newWindow.whitebutton.setEnabled(false);

                }

                if(newWindow.maxcoin == 3){

                    newWindow.whitebutton.setEnabled(false);
                    newWindow.blackbutton.setEnabled(false);
                    newWindow.redbutton.setEnabled(false);
                    newWindow.bluebutton.setEnabled(false);
                    newWindow.greenbutton.setEnabled(false);

                }

            });

            newWindow.blackbutton.addActionListener(e1 -> {

                newWindow.maxcoin++;

                if(frame.BlackCoin.CountCoin == 4 || newWindow.blackcoin != 0){

                    newWindow.blackcoin++;

                    if(newWindow.blackcoin == 2){

                        newWindow.whitebutton.setEnabled(false);
                        newWindow.blackbutton.setEnabled(false);
                        newWindow.redbutton.setEnabled(false);
                        newWindow.bluebutton.setEnabled(false);
                        newWindow.greenbutton.setEnabled(false);

                    }

                }
                else{

                    newWindow.blackcoin++;
                    newWindow.blackbutton.setEnabled(false);

                }

                if(newWindow.maxcoin == 3){

                    newWindow.whitebutton.setEnabled(false);
                    newWindow.blackbutton.setEnabled(false);
                    newWindow.redbutton.setEnabled(false);
                    newWindow.bluebutton.setEnabled(false);
                    newWindow.greenbutton.setEnabled(false);

                }

            });

            newWindow.redbutton.addActionListener(e1 -> {

                newWindow.maxcoin++;

                if(frame.RedCoin.CountCoin == 4 || newWindow.redcoin != 0){

                    newWindow.redcoin++;

                    if(newWindow.redcoin == 2){

                        newWindow.whitebutton.setEnabled(false);
                        newWindow.blackbutton.setEnabled(false);
                        newWindow.redbutton.setEnabled(false);
                        newWindow.bluebutton.setEnabled(false);
                        newWindow.greenbutton.setEnabled(false);

                    }

                }
                else{

                    newWindow.redcoin++;
                    newWindow.redbutton.setEnabled(false);

                }

                if(newWindow.maxcoin == 3){

                    newWindow.whitebutton.setEnabled(false);
                    newWindow.blackbutton.setEnabled(false);
                    newWindow.redbutton.setEnabled(false);
                    newWindow.bluebutton.setEnabled(false);
                    newWindow.greenbutton.setEnabled(false);

                }

            });

            newWindow.bluebutton.addActionListener(e1 -> {

                newWindow.maxcoin++;

                if(frame.BlueCoin.CountCoin == 4 || newWindow.bluecoin != 0){

                    newWindow.bluecoin++;

                    if(newWindow.bluecoin == 2){

                        newWindow.whitebutton.setEnabled(false);
                        newWindow.blackbutton.setEnabled(false);
                        newWindow.redbutton.setEnabled(false);
                        newWindow.bluebutton.setEnabled(false);
                        newWindow.greenbutton.setEnabled(false);

                    }

                }
                else{

                    newWindow.bluecoin++;
                    newWindow.bluebutton.setEnabled(false);

                }

                if(newWindow.maxcoin == 3){

                    newWindow.whitebutton.setEnabled(false);
                    newWindow.blackbutton.setEnabled(false);
                    newWindow.redbutton.setEnabled(false);
                    newWindow.bluebutton.setEnabled(false);
                    newWindow.greenbutton.setEnabled(false);

                }

            });

            newWindow.greenbutton.addActionListener(e1 -> {

                newWindow.maxcoin++;

                if(frame.GreenCoin.CountCoin == 4 || newWindow.greencoin != 0){

                    newWindow.greencoin++;

                    if(newWindow.greencoin == 2){

                        newWindow.whitebutton.setEnabled(false);
                        newWindow.blackbutton.setEnabled(false);
                        newWindow.redbutton.setEnabled(false);
                        newWindow.bluebutton.setEnabled(false);
                        newWindow.greenbutton.setEnabled(false);

                    }

                }
                else{

                    newWindow.greencoin++;
                    newWindow.greenbutton.setEnabled(false);

                }

                if(newWindow.maxcoin == 3){

                    newWindow.whitebutton.setEnabled(false);
                    newWindow.blackbutton.setEnabled(false);
                    newWindow.redbutton.setEnabled(false);
                    newWindow.bluebutton.setEnabled(false);
                    newWindow.greenbutton.setEnabled(false);

                }

            });

            newWindow.submitbutton.addActionListener(e1 -> {

                newWindow.coinwindow.setVisible(false);

                if(turn){

                    if(newWindow.whitecoin != 0){

                        player1.WhiteCoin += newWindow.whitecoin;
                        frame.WhiteCoin.CountCoin -= newWindow.whitecoin;
                        newWindow.whitecoin = 0;

                    }

                    if(newWindow.blackcoin != 0){

                        player1.BlackCoin += newWindow.blackcoin;
                        frame.BlackCoin.CountCoin -= newWindow.blackcoin;
                        newWindow.blackcoin = 0;

                    }

                    if(newWindow.redcoin != 0){

                        player1.RedCoin += newWindow.redcoin;
                        frame.RedCoin.CountCoin -= newWindow.redcoin;
                        newWindow.redcoin = 0;

                    }

                    if(newWindow.bluecoin != 0){

                        player1.BlueCoin += newWindow.bluecoin;
                        frame.BlueCoin.CountCoin -= newWindow.bluecoin;
                        newWindow.bluecoin = 0;

                    }

                    if(newWindow.greencoin != 0){

                        player1.GreenCoin += newWindow.greencoin;
                        frame.GreenCoin.CountCoin -= newWindow.greencoin;
                        newWindow.greencoin = 0;

                    }

                    frame.changePlayerCoin1(player1.WhiteCoin , player1.BlackCoin , player1.RedCoin , player1.BlueCoin , player1.GreenCoin , player1.GoldenCoin);


                }
                else{

                    if(newWindow.whitecoin != 0){

                        player2.WhiteCoin += newWindow.whitecoin;
                        frame.WhiteCoin.CountCoin -= newWindow.whitecoin;
                        newWindow.whitecoin = 0;

                    }

                    if(newWindow.blackcoin != 0){

                        player2.BlackCoin += newWindow.blackcoin;
                        frame.BlackCoin.CountCoin -= newWindow.blackcoin;
                        newWindow.blackcoin = 0;

                    }

                    if(newWindow.redcoin != 0){

                        player2.RedCoin += newWindow.redcoin;
                        frame.RedCoin.CountCoin -= newWindow.redcoin;
                        newWindow.redcoin = 0;

                    }

                    if(newWindow.bluecoin != 0){

                        player2.BlueCoin += newWindow.bluecoin;
                        frame.BlueCoin.CountCoin -= newWindow.bluecoin;
                        newWindow.bluecoin = 0;

                    }

                    if(newWindow.greencoin != 0){

                        player2.GreenCoin += newWindow.greencoin;
                        frame.GreenCoin.CountCoin -= newWindow.greencoin;
                        newWindow.greencoin = 0;

                    }

                    frame.changePlayerCoin2(player2.WhiteCoin , player2.BlackCoin , player2.RedCoin , player2.BlueCoin , player2.GreenCoin , player2.GoldenCoin);


                }

                turnChanger();

            });

        });

        frame.bcart11.addActionListener(e -> {

            bucart11 =  new CartNewWindow(frame.Cart11.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart11.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart11.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart11.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart11.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart11.GreenCoin)
                    bucart11.buy.setEnabled(true);

                bucart11.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart11);

                    frame.bcart11.setVisible(false);

                    bucart11.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart11.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart11.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart11.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart11.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart11.GreenCoin)
                    bucart11.buy.setEnabled(true);

                bucart11.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart11);

                    frame.bcart11.setVisible(false);

                    bucart11.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart12.addActionListener(e -> {

            bucart12 =  new CartNewWindow(frame.Cart12.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart12.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart12.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart12.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart12.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart12.GreenCoin)
                    bucart12.buy.setEnabled(true);

                bucart12.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart12);

                    frame.bcart12.setVisible(false);

                    bucart12.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart12.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart12.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart12.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart12.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart12.GreenCoin)
                    bucart12.buy.setEnabled(true);

                bucart12.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart12);

                    frame.bcart12.setVisible(false);

                    bucart12.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart13.addActionListener(e -> {

            bucart13 =  new CartNewWindow(frame.Cart13.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart13.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart13.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart13.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart13.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart13.GreenCoin)
                    bucart13.buy.setEnabled(true);

                bucart13.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart13);

                    frame.bcart13.setVisible(false);

                    bucart13.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart13.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart13.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart13.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart13.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart13.GreenCoin)
                    bucart13.buy.setEnabled(true);

                bucart13.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart13);

                    frame.bcart13.setVisible(false);

                    bucart13.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart14.addActionListener(e -> {

            bucart14 =  new CartNewWindow(frame.Cart14.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart14.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart14.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart14.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart14.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart14.GreenCoin)
                    bucart14.buy.setEnabled(true);

                bucart14.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart14);

                    frame.bcart14.setVisible(false);

                    bucart14.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart14.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart14.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart14.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart14.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart14.GreenCoin)
                    bucart14.buy.setEnabled(true);

                bucart14.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart14);

                    frame.bcart14.setVisible(false);

                    bucart14.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart15.addActionListener(e -> {

            bucart15 =  new CartNewWindow(frame.Cart15.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart15.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart15.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart15.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart15.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart15.GreenCoin)
                    bucart15.buy.setEnabled(true);

                bucart15.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart15);

                    frame.bcart15.setVisible(false);

                    bucart15.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart15.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart15.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart15.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart15.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart15.GreenCoin)
                    bucart15.buy.setEnabled(true);

                bucart15.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart15);

                    frame.bcart15.setVisible(false);

                    bucart15.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart16.addActionListener(e -> {

            bucart16 =  new CartNewWindow(frame.Cart16.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart16.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart16.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart16.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart16.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart16.GreenCoin)
                    bucart16.buy.setEnabled(true);

                bucart16.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart16);

                    frame.bcart16.setVisible(false);

                    bucart16.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart16.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart16.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart16.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart16.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart16.GreenCoin)
                    bucart16.buy.setEnabled(true);

                bucart16.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart16);

                    frame.bcart16.setVisible(false);

                    bucart16.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart17.addActionListener(e -> {

            bucart17 =  new CartNewWindow(frame.Cart17.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart17.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart17.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart17.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart17.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart17.GreenCoin)
                    bucart17.buy.setEnabled(true);

                bucart17.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart17);

                    frame.bcart17.setVisible(false);

                    bucart17.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart17.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart17.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart17.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart17.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart17.GreenCoin)
                    bucart17.buy.setEnabled(true);

                bucart17.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart17);

                    frame.bcart17.setVisible(false);

                    bucart17.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart18.addActionListener(e -> {

            bucart18 =  new CartNewWindow(frame.Cart18.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart18.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart18.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart18.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart18.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart18.GreenCoin)
                    bucart18.buy.setEnabled(true);

                bucart18.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart18);

                    frame.bcart18.setVisible(false);

                    bucart18.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart18.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart18.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart18.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart18.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart18.GreenCoin)
                    bucart18.buy.setEnabled(true);

                bucart18.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart18);

                    frame.bcart18.setVisible(false);

                    bucart18.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart19.addActionListener(e -> {

            bucart19 =  new CartNewWindow(frame.Cart19.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart19.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart19.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart19.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart19.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart19.GreenCoin)
                    bucart19.buy.setEnabled(true);

                bucart19.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart19);

                    frame.bcart19.setVisible(false);

                    bucart19.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart19.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart19.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart19.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart19.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart19.GreenCoin)
                    bucart19.buy.setEnabled(true);

                bucart19.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart19);

                    frame.bcart19.setVisible(false);

                    bucart19.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart110.addActionListener(e -> {

            bucart110 =  new CartNewWindow(frame.Cart110.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart110.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart110.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart110.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart110.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart110.GreenCoin)
                    bucart110.buy.setEnabled(true);

                bucart110.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart110);

                    frame.bcart110.setVisible(false);

                    bucart110.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart110.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart110.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart110.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart110.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart110.GreenCoin)
                    bucart110.buy.setEnabled(true);

                bucart110.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart110);

                    frame.bcart110.setVisible(false);

                    bucart110.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart111.addActionListener(e -> {

            bucart111 =  new CartNewWindow(frame.Cart111.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart111.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart111.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart111.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart111.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart111.GreenCoin)
                    bucart111.buy.setEnabled(true);

                bucart111.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart111);

                    frame.bcart111.setVisible(false);

                    bucart111.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart111.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart111.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart111.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart111.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart111.GreenCoin)
                    bucart111.buy.setEnabled(true);

                bucart111.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart111);

                    frame.bcart111.setVisible(false);

                    bucart111.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart112.addActionListener(e -> {

            bucart112 =  new CartNewWindow(frame.Cart112.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart112.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart112.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart112.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart112.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart112.GreenCoin)
                    bucart112.buy.setEnabled(true);

                bucart112.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart112);

                    frame.bcart112.setVisible(false);

                    bucart112.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart112.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart112.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart112.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart112.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart112.GreenCoin)
                    bucart112.buy.setEnabled(true);

                bucart112.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart112);

                    frame.bcart112.setVisible(false);

                    bucart112.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart113.addActionListener(e -> {

            bucart113 =  new CartNewWindow(frame.Cart113.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart113.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart113.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart113.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart113.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart113.GreenCoin)
                    bucart113.buy.setEnabled(true);

                bucart113.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart113);

                    frame.bcart113.setVisible(false);

                    bucart113.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart113.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart113.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart113.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart113.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart113.GreenCoin)
                    bucart113.buy.setEnabled(true);

                bucart113.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart113);

                    frame.bcart113.setVisible(false);

                    bucart113.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart114.addActionListener(e -> {

            bucart114 =  new CartNewWindow(frame.Cart114.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart114.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart114.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart114.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart114.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart114.GreenCoin)
                    bucart114.buy.setEnabled(true);

                bucart114.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart114);

                    frame.bcart114.setVisible(false);

                    bucart114.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart114.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart114.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart114.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart114.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart114.GreenCoin)
                    bucart114.buy.setEnabled(true);

                bucart114.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart114);

                    frame.bcart114.setVisible(false);

                    bucart114.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart115.addActionListener(e -> {

            bucart115 =  new CartNewWindow(frame.Cart115.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart115.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart115.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart115.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart115.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart115.GreenCoin)
                    bucart115.buy.setEnabled(true);

                bucart115.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart115);

                    frame.bcart115.setVisible(false);

                    bucart115.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart115.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart115.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart115.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart115.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart115.GreenCoin)
                    bucart115.buy.setEnabled(true);

                bucart115.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart115);

                    frame.bcart115.setVisible(false);

                    bucart115.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart21.addActionListener(e -> {

            bucart21 =  new CartNewWindow(frame.Cart21.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart21.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart21.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart21.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart21.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart21.GreenCoin)
                    bucart21.buy.setEnabled(true);

                bucart21.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart21);

                    frame.bcart21.setVisible(false);

                    bucart21.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart21.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart21.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart21.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart21.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart21.GreenCoin)
                    bucart21.buy.setEnabled(true);

                bucart21.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart21);

                    frame.bcart21.setVisible(false);

                    bucart21.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart22.addActionListener(e -> {

            bucart22 =  new CartNewWindow(frame.Cart22.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart22.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart22.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart22.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart22.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart22.GreenCoin)
                    bucart22.buy.setEnabled(true);

                bucart22.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart22);

                    frame.bcart22.setVisible(false);

                    bucart22.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart22.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart22.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart22.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart22.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart22.GreenCoin)
                    bucart22.buy.setEnabled(true);

                bucart22.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart22);

                    frame.bcart22.setVisible(false);

                    bucart22.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart23.addActionListener(e -> {

            bucart23 =  new CartNewWindow(frame.Cart23.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart23.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart23.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart23.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart23.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart23.GreenCoin)
                    bucart23.buy.setEnabled(true);

                bucart23.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart23);

                    frame.bcart23.setVisible(false);

                    bucart23.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart23.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart23.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart23.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart23.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart23.GreenCoin)
                    bucart23.buy.setEnabled(true);

                bucart23.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart23);

                    frame.bcart23.setVisible(false);

                    bucart23.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart24.addActionListener(e -> {

            bucart24 =  new CartNewWindow(frame.Cart24.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart24.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart24.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart24.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart24.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart24.GreenCoin)
                    bucart24.buy.setEnabled(true);

                bucart24.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart24);

                    frame.bcart24.setVisible(false);

                    bucart24.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart24.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart24.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart24.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart24.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart24.GreenCoin)
                    bucart24.buy.setEnabled(true);

                bucart24.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart24);

                    frame.bcart24.setVisible(false);

                    bucart24.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart25.addActionListener(e -> {

            bucart25 =  new CartNewWindow(frame.Cart25.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart25.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart25.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart25.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart25.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart25.GreenCoin)
                    bucart25.buy.setEnabled(true);

                bucart25.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart25);

                    frame.bcart25.setVisible(false);

                    bucart25.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart25.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart25.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart25.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart25.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart25.GreenCoin)
                    bucart25.buy.setEnabled(true);

                bucart25.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart25);

                    frame.bcart25.setVisible(false);

                    bucart25.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart26.addActionListener(e -> {

            bucart26 =  new CartNewWindow(frame.Cart26.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart26.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart26.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart26.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart26.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart26.GreenCoin)
                    bucart26.buy.setEnabled(true);

                bucart26.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart26);

                    frame.bcart26.setVisible(false);

                    bucart26.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart26.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart26.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart26.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart26.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart26.GreenCoin)
                    bucart26.buy.setEnabled(true);

                bucart26.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart26);

                    frame.bcart26.setVisible(false);

                    bucart26.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart27.addActionListener(e -> {

            bucart27 =  new CartNewWindow(frame.Cart27.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart27.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart27.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart27.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart27.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart27.GreenCoin)
                    bucart27.buy.setEnabled(true);

                bucart27.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart27);

                    frame.bcart27.setVisible(false);

                    bucart27.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart27.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart27.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart27.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart27.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart27.GreenCoin)
                    bucart27.buy.setEnabled(true);

                bucart27.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart27);

                    frame.bcart27.setVisible(false);

                    bucart27.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart28.addActionListener(e -> {

            bucart28 =  new CartNewWindow(frame.Cart28.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart28.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart28.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart28.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart28.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart28.GreenCoin)
                    bucart28.buy.setEnabled(true);

                bucart28.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart28);

                    frame.bcart28.setVisible(false);

                    bucart28.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart28.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart28.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart28.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart28.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart28.GreenCoin)
                    bucart28.buy.setEnabled(true);

                bucart28.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart28);

                    frame.bcart28.setVisible(false);

                    bucart28.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart29.addActionListener(e -> {

            bucart29 =  new CartNewWindow(frame.Cart29.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart29.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart29.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart29.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart29.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart29.GreenCoin)
                    bucart29.buy.setEnabled(true);

                bucart29.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart29);

                    frame.bcart29.setVisible(false);

                    bucart29.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart29.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart29.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart29.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart29.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart29.GreenCoin)
                    bucart29.buy.setEnabled(true);

                bucart29.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart29);

                    frame.bcart29.setVisible(false);

                    bucart29.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart210.addActionListener(e -> {

            bucart210 =  new CartNewWindow(frame.Cart210.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart210.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart210.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart210.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart210.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart210.GreenCoin)
                    bucart210.buy.setEnabled(true);

                bucart210.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart210);

                    frame.bcart210.setVisible(false);

                    bucart210.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart210.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart210.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart210.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart210.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart210.GreenCoin)
                    bucart210.buy.setEnabled(true);

                bucart210.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart210);

                    frame.bcart210.setVisible(false);

                    bucart210.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart211.addActionListener(e -> {

            bucart211 =  new CartNewWindow(frame.Cart211.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart211.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart211.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart211.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart211.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart211.GreenCoin)
                    bucart211.buy.setEnabled(true);

                bucart211.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart211);

                    frame.bcart211.setVisible(false);

                    bucart211.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart211.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart211.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart211.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart211.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart211.GreenCoin)
                    bucart211.buy.setEnabled(true);

                bucart211.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart211);

                    frame.bcart211.setVisible(false);

                    bucart211.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart212.addActionListener(e -> {

            bucart212 =  new CartNewWindow(frame.Cart212.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart212.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart212.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart212.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart212.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart212.GreenCoin)
                    bucart212.buy.setEnabled(true);

                bucart212.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart212);

                    frame.bcart212.setVisible(false);

                    bucart212.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart212.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart212.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart212.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart212.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart212.GreenCoin)
                    bucart212.buy.setEnabled(true);

                bucart212.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart212);

                    frame.bcart212.setVisible(false);

                    bucart212.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart213.addActionListener(e -> {

            bucart213 =  new CartNewWindow(frame.Cart213.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart213.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart213.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart213.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart213.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart213.GreenCoin)
                    bucart213.buy.setEnabled(true);

                bucart213.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart213);

                    frame.bcart213.setVisible(false);

                    bucart213.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart213.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart213.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart213.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart213.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart213.GreenCoin)
                    bucart213.buy.setEnabled(true);

                bucart213.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart213);

                    frame.bcart213.setVisible(false);

                    bucart213.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart214.addActionListener(e -> {

            bucart214 =  new CartNewWindow(frame.Cart214.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart214.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart214.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart214.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart214.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart214.GreenCoin)
                    bucart214.buy.setEnabled(true);

                bucart214.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart214);

                    frame.bcart214.setVisible(false);

                    bucart214.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart214.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart214.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart214.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart214.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart214.GreenCoin)
                    bucart214.buy.setEnabled(true);

                bucart214.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart214);

                    frame.bcart214.setVisible(false);

                    bucart214.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart215.addActionListener(e -> {

            bucart215 =  new CartNewWindow(frame.Cart215.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart215.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart215.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart215.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart215.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart215.GreenCoin)
                    bucart215.buy.setEnabled(true);

                bucart215.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart215);

                    frame.bcart215.setVisible(false);

                    bucart215.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart215.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart215.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart215.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart215.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart215.GreenCoin)
                    bucart215.buy.setEnabled(true);

                bucart215.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart215);

                    frame.bcart215.setVisible(false);

                    bucart215.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart31.addActionListener(e -> {

            bucart31 =  new CartNewWindow(frame.Cart31.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart31.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart31.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart31.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart31.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart31.GreenCoin)
                    bucart31.buy.setEnabled(true);

                bucart31.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart31);

                    frame.bcart31.setVisible(false);

                    bucart31.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart31.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart31.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart31.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart31.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart31.GreenCoin)
                    bucart31.buy.setEnabled(true);

                bucart31.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart31);

                    frame.bcart31.setVisible(false);

                    bucart31.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart32.addActionListener(e -> {

            bucart32 =  new CartNewWindow(frame.Cart32.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart32.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart32.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart32.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart32.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart32.GreenCoin)
                    bucart32.buy.setEnabled(true);

                bucart32.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart32);

                    frame.bcart32.setVisible(false);

                    bucart32.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart32.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart32.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart32.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart32.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart32.GreenCoin)
                    bucart32.buy.setEnabled(true);

                bucart32.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart32);

                    frame.bcart32.setVisible(false);

                    bucart32.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart33.addActionListener(e -> {

            bucart33 =  new CartNewWindow(frame.Cart33.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart33.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart33.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart33.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart33.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart33.GreenCoin)
                    bucart33.buy.setEnabled(true);

                bucart33.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart33);

                    frame.bcart33.setVisible(false);

                    bucart33.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart33.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart33.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart33.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart33.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart33.GreenCoin)
                    bucart33.buy.setEnabled(true);

                bucart33.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart33);

                    frame.bcart33.setVisible(false);

                    bucart33.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart34.addActionListener(e -> {

            bucart34 =  new CartNewWindow(frame.Cart34.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart34.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart34.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart34.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart34.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart34.GreenCoin)
                    bucart34.buy.setEnabled(true);

                bucart34.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart34);

                    frame.bcart34.setVisible(false);

                    bucart34.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart34.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart34.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart34.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart34.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart34.GreenCoin)
                    bucart34.buy.setEnabled(true);

                bucart34.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart34);

                    frame.bcart34.setVisible(false);

                    bucart34.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart35.addActionListener(e -> {

            bucart35 =  new CartNewWindow(frame.Cart35.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart35.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart35.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart35.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart35.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart35.GreenCoin)
                    bucart35.buy.setEnabled(true);

                bucart35.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart35);

                    frame.bcart35.setVisible(false);

                    bucart35.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart35.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart35.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart35.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart35.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart35.GreenCoin)
                    bucart35.buy.setEnabled(true);

                bucart35.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart35);

                    frame.bcart35.setVisible(false);

                    bucart35.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart36.addActionListener(e -> {

            bucart36 =  new CartNewWindow(frame.Cart36.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart36.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart36.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart36.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart36.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart36.GreenCoin)
                    bucart36.buy.setEnabled(true);

                bucart36.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart36);

                    frame.bcart36.setVisible(false);

                    bucart36.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart36.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart36.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart36.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart36.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart36.GreenCoin)
                    bucart36.buy.setEnabled(true);

                bucart36.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart36);

                    frame.bcart36.setVisible(false);

                    bucart36.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart37.addActionListener(e -> {

            bucart37 =  new CartNewWindow(frame.Cart37.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart37.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart37.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart37.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart37.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart37.GreenCoin)
                    bucart37.buy.setEnabled(true);

                bucart37.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart37);

                    frame.bcart37.setVisible(false);

                    bucart37.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart37.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart37.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart37.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart37.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart37.GreenCoin)
                    bucart37.buy.setEnabled(true);

                bucart37.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart37);

                    frame.bcart37.setVisible(false);

                    bucart37.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart38.addActionListener(e -> {

            bucart38 =  new CartNewWindow(frame.Cart38.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart38.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart38.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart38.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart38.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart38.GreenCoin)
                    bucart38.buy.setEnabled(true);

                bucart38.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart38);

                    frame.bcart38.setVisible(false);

                    bucart38.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart38.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart38.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart38.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart38.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart38.GreenCoin)
                    bucart38.buy.setEnabled(true);

                bucart38.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart38);

                    frame.bcart38.setVisible(false);

                    bucart38.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart39.addActionListener(e -> {

            bucart39 =  new CartNewWindow(frame.Cart39.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart39.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart39.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart39.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart39.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart39.GreenCoin)
                    bucart39.buy.setEnabled(true);

                bucart39.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart39);

                    frame.bcart39.setVisible(false);

                    bucart39.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart39.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart39.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart39.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart39.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart39.GreenCoin)
                    bucart39.buy.setEnabled(true);

                bucart39.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart39);

                    frame.bcart39.setVisible(false);

                    bucart39.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart310.addActionListener(e -> {

            bucart310 =  new CartNewWindow(frame.Cart310.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart310.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart310.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart310.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart310.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart310.GreenCoin)
                    bucart310.buy.setEnabled(true);

                bucart310.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart310);

                    frame.bcart310.setVisible(false);

                    bucart310.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart310.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart310.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart310.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart310.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart310.GreenCoin)
                    bucart310.buy.setEnabled(true);

                bucart310.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart310);

                    frame.bcart310.setVisible(false);

                    bucart310.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart311.addActionListener(e -> {

            bucart311 =  new CartNewWindow(frame.Cart311.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart311.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart311.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart311.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart311.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart311.GreenCoin)
                    bucart311.buy.setEnabled(true);

                bucart311.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart311);

                    frame.bcart311.setVisible(false);

                    bucart311.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart311.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart311.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart311.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart311.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart311.GreenCoin)
                    bucart311.buy.setEnabled(true);

                bucart311.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart311);

                    frame.bcart311.setVisible(false);

                    bucart311.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart312.addActionListener(e -> {

            bucart312 =  new CartNewWindow(frame.Cart312.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart312.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart312.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart312.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart312.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart312.GreenCoin)
                    bucart312.buy.setEnabled(true);

                bucart312.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart312);

                    frame.bcart312.setVisible(false);

                    bucart312.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart312.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart312.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart312.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart312.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart312.GreenCoin)
                    bucart312.buy.setEnabled(true);

                bucart312.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart312);

                    frame.bcart312.setVisible(false);

                    bucart312.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart313.addActionListener(e -> {

            bucart313 =  new CartNewWindow(frame.Cart313.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart313.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart313.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart313.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart313.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart313.GreenCoin)
                    bucart313.buy.setEnabled(true);

                bucart313.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart313);

                    frame.bcart313.setVisible(false);

                    bucart313.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart313.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart313.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart313.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart313.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart313.GreenCoin)
                    bucart313.buy.setEnabled(true);

                bucart313.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart313);

                    frame.bcart313.setVisible(false);

                    bucart313.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart314.addActionListener(e -> {

            bucart314 =  new CartNewWindow(frame.Cart314.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart314.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart314.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart314.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart314.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart314.GreenCoin)
                    bucart314.buy.setEnabled(true);

                bucart314.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart314);

                    frame.bcart314.setVisible(false);

                    bucart314.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart314.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart314.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart314.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart314.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart314.GreenCoin)
                    bucart314.buy.setEnabled(true);

                bucart314.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart314);

                    frame.bcart314.setVisible(false);

                    bucart314.Cartwindow.setVisible(false);

                });

            }

        });

        frame.bcart315.addActionListener(e -> {

            bucart315 =  new CartNewWindow(frame.Cart315.image);

            if(turn){

                if(player1.WhiteCoin + player1.SpecialWhiteCoin >= frame.Cart315.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin >= frame.Cart315.BlackCoin && player1.RedCoin + player1.SpecialRedCoin >= frame.Cart315.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin >= frame.Cart315.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin >= frame.Cart315.GreenCoin)
                    bucart315.buy.setEnabled(true);

                bucart315.buy.addActionListener(e1 -> {

                    CartBuy1(frame.Cart315);

                    frame.bcart315.setVisible(false);

                    bucart315.Cartwindow.setVisible(false);

                });

            }
            else{

                if(player2.WhiteCoin + player2.SpecialWhiteCoin >= frame.Cart315.WhiteCoin && player2.BlackCoin + player2.SpecialBlackCoin >= frame.Cart315.BlackCoin && player2.RedCoin + player2.SpecialRedCoin >= frame.Cart315.RedCoin && player2.BlueCoin + player2.SpecialBlueCoin >= frame.Cart315.BlueCoin && player2.GreenCoin + player2.SpecialGreenCoin >= frame.Cart315.GreenCoin)
                    bucart315.buy.setEnabled(true);

                bucart315.buy.addActionListener(e1 -> {

                    CartBuy2(frame.Cart315);

                    frame.bcart315.setVisible(false);

                    bucart315.Cartwindow.setVisible(false);

                });

            }

        });

    }

}