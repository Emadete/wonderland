import javax.swing.*;

public class Cart {

    public int RedCoin , GreenCoin , WhiteCoin , BlackCoin , BlueCoin;
    public int Score;
    public String SpecialCoin;
    public ImageIcon image;

    public Cart(int RedCoin , int GreenCoin , int WhiteCoin , int BlackCoin , int BlueCoin , int Score , String SpecialCoin , ImageIcon image){

        this.RedCoin = RedCoin;
        this.GreenCoin = GreenCoin;
        this.WhiteCoin = WhiteCoin;
        this.BlackCoin = BlackCoin;
        this.BlueCoin = BlueCoin;
        this.Score = Score;
        this.SpecialCoin = SpecialCoin;
        this.image = image;

    }

}
