import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer {
    // TODO: Complete this class
    private Square[][] board;
    private int Width;
    private Image X;
    private Image O;
    private int firstpoint;
    //constructor
    public TicTacToeViewer(Square[][] board)
    {
        this.board = board;
        X = new ImageIcon("Resources/X.png").getImage();
        O = new ImageIcon("Resources/O.png").getImage();
        Width = board[0][0].getWidth();
    }
    public void paint(Graphics g)
    {
        for(int i = 0; i < board.length;i++) {
            for(int j = 0; j < board.length;j++){

                board[i][j].Draw(X,O,g,firstpoint, Width,);
            }
        }
    }

    //crate image objects
    //iterate through squares call draw on each
    //getImages() call draw image
    //draw axis
    //display winning message

}
