public class Main{

    public static boolean turn = true;
    public static MyFrame frame;
    public static CoinNewWindow newWindow;
    public static  Player player1 , player2;

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

        if(frame.WhiteCoin.CountCoin == 0)
            newWindow.whitebutton.setEnabled(false);

        if(frame.BlackCoin.CountCoin == 0)
            newWindow.blackbutton.setEnabled(false);

        if(frame.RedCoin.CountCoin == 0)
            newWindow.redbutton.setEnabled(false);

        if(frame.BlueCoin.CountCoin == 0)
            newWindow.bluebutton.setEnabled(false);

        if(frame.GreenCoin.CountCoin == 0)
            newWindow.greenbutton.setEnabled(false);

    }

    public static void main(String[] args) {

        frame = new MyFrame();
        player1 = new Player();
        player2 = new Player();
        newWindow = new CoinNewWindow();

        //CartNewWindow first =  new CartNewWindow(frame.Cart11.image);

        frame.newcoinwindow.addActionListener(e -> {

            newWindow.setcount(frame.WhiteCoin.CountCoin , frame.BlackCoin.CountCoin , frame.RedCoin.CountCoin , frame.BlueCoin.CountCoin , frame.GreenCoin.CountCoin );

            newWindow.coinwindow.setVisible(true);

            checkenable();

            newWindow.whitebutton.addActionListener(e1 -> {

                newWindow.whitecoin++;
                newWindow.whitebutton.setEnabled(false);

            });

            newWindow.blackbutton.addActionListener(e1 -> {

                newWindow.blackcoin++;
                newWindow.blackbutton.setEnabled(false);

            });

            newWindow.redbutton.addActionListener(e1 -> {

                newWindow.redcoin++;
                newWindow.redbutton.setEnabled(false);

            });

            newWindow.bluebutton.addActionListener(e1 -> {

                newWindow.bluecoin++;
                newWindow.bluebutton.setEnabled(false);

            });

            newWindow.greenbutton.addActionListener(e1 -> {

                newWindow.greencoin++;
                newWindow.greenbutton.setEnabled(false);

            });

            newWindow.submitbutton.addActionListener(e1 -> {

                newWindow.coinwindow.setVisible(false);

                if(turn){

                    if(newWindow.whitecoin != 0){

                        player1.WhiteCoin += newWindow.whitecoin;
                        newWindow.whitecoin = 0;
                        frame.WhiteCoin.CountCoin--;

                    }

                    if(newWindow.blackcoin != 0){

                        player1.BlackCoin += newWindow.blackcoin;
                        newWindow.blackcoin = 0;
                        frame.BlackCoin.CountCoin--;

                    }

                    if(newWindow.redcoin != 0){

                        player1.RedCoin += newWindow.redcoin;
                        newWindow.redcoin = 0;
                        frame.RedCoin.CountCoin--;

                    }

                    if(newWindow.bluecoin != 0){

                        player1.BlueCoin += newWindow.bluecoin;
                        newWindow.bluecoin = 0;
                        frame.BlueCoin.CountCoin--;

                    }

                    if(newWindow.greencoin != 0){

                        player1.GreenCoin += newWindow.greencoin;
                        newWindow.greencoin = 0;
                        frame.GreenCoin.CountCoin--;

                    }

                    frame.changePlayerCoin1(player1.WhiteCoin , player1.BlackCoin , player1.RedCoin , player1.BlueCoin , player1.GreenCoin , player1.GoldenCoin);

                    turnChanger();

                }
                else{

                    if(newWindow.whitecoin != 0){

                        player2.WhiteCoin += newWindow.whitecoin;
                        newWindow.whitecoin = 0;
                        frame.WhiteCoin.CountCoin--;

                    }

                    if(newWindow.blackcoin != 0){

                        player2.BlackCoin += newWindow.blackcoin;
                        newWindow.blackcoin = 0;
                        frame.BlackCoin.CountCoin--;

                    }

                    if(newWindow.redcoin != 0){

                        player2.RedCoin += newWindow.redcoin;
                        newWindow.redcoin = 0;
                        frame.RedCoin.CountCoin--;

                    }

                    if(newWindow.bluecoin != 0){

                        player2.BlueCoin += newWindow.bluecoin;
                        newWindow.bluecoin = 0;
                        frame.BlueCoin.CountCoin--;

                    }

                    if(newWindow.greencoin != 0){

                        player2.GreenCoin += newWindow.greencoin;
                        newWindow.greencoin = 0;
                        frame.GreenCoin.CountCoin--;

                    }

                    frame.changePlayerCoin2(player2.WhiteCoin , player2.BlackCoin , player2.RedCoin , player2.BlueCoin , player2.GreenCoin , player2.GoldenCoin);

                    turnChanger();

                }

            });

        });

        frame.bcart11.addActionListener(e -> {

            CartNewWindow first =  new CartNewWindow(frame.Cart11.image);

            if(player1.WhiteCoin + player1.SpecialWhiteCoin == frame.Cart11.WhiteCoin && player1.BlackCoin + player1.SpecialBlackCoin == frame.Cart11.BlackCoin && player1.RedCoin + player1.SpecialRedCoin == frame.Cart11.RedCoin && player1.BlueCoin + player1.SpecialBlueCoin == frame.Cart11.BlueCoin && player1.GreenCoin + player1.SpecialGreenCoin == frame.Cart11.GreenCoin)
                first.buy.setVisible(true);

            first.buy.addActionListener(e1 -> {

                frame.Cart11.WhiteCoin -= player1.SpecialWhiteCoin;
                frame.WhiteCoin.CountCoin += frame.Cart11.WhiteCoin;
                player1.WhiteCoin -= frame.Cart11.WhiteCoin;

                frame.Cart11.BlackCoin -= player1.SpecialBlackCoin;
                frame.BlackCoin.CountCoin += frame.Cart11.BlackCoin;
                player1.BlackCoin -= frame.Cart11.BlackCoin;

                frame.Cart11.RedCoin -= player1.SpecialRedCoin;
                frame.RedCoin.CountCoin += frame.Cart11.RedCoin;
                player1.RedCoin -= frame.Cart11.RedCoin;

                frame.Cart11.BlueCoin -= player1.SpecialBlueCoin;
                frame.BlueCoin.CountCoin += frame.Cart11.BlueCoin;
                player1.BlueCoin -= frame.Cart11.BlueCoin;

                frame.Cart11.GreenCoin -= player1.SpecialGreenCoin;
                frame.GreenCoin.CountCoin += frame.Cart11.GreenCoin;
                player1.GreenCoin -= frame.Cart11.GreenCoin;

                player1.Score += frame.Cart11.Score;

                switch (frame.Cart11.SpecialCoin){

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

                frame.schangePlayerCoin1(player1.SpecialWhiteCoin , player1.SpecialBlackCoin , player1.SpecialRedCoin , player1.SpecialBlueCoin , player1.SpecialGreenCoin);

                frame.changePlayerCoin1(player1.WhiteCoin , player1.BlackCoin , player1.RedCoin , player1.BlueCoin , player1.GreenCoin , player1.GoldenCoin);

                frame.bcart11.setVisible(false);

                first.Cartwindow.setVisible(false);

            });

        });

    }

}