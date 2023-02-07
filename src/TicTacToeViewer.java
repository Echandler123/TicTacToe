import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame{
    // TODO: Complete this class
    private Square[][] board;
    private int Width;
    private Image X;
    private Image O;
    private int firstpointx = 100;
    private int firstpointy = 100;
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private final int SQUARE_SIZE = 20;
    private TicTacToe t;
    //constructor
    public TicTacToeViewer(Square[][] board, TicTacToe t)
    {
        this.t = t;
        this.board = board;
        X = new ImageIcon("Resources/X.png").getImage();
        O = new ImageIcon("Resources/O.png").getImage();
        Width = board[0][0].getWidth();
        this.setTitle("TicTacToe Screen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);

    }
    public void paint(Graphics g)
    {

        for(int i = 0; i < board.length;i++) {
            for(int j = 0; j < board.length;j++){
                //board[i][j].setWinningSquare();
                board[i][j].Draw(O,X,g,firstpointx,firstpointy, Width);
            }
        }
    }

    //crate image objects
    //iterate through squares call draw on each
    //getImages() call draw image
    //draw axis
    //display winning message

}
