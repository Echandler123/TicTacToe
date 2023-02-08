import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame{
    // TODO: Complete this class
    private Square[][] board;
    private int Width;
    private Image X;
    private Image O;
    private int firstpointx = 150;
    private int firstpointy = 125;
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private final int SQUARE_SIZE = 200;
    private TicTacToe t;
    //takes in the board 2d array and observer creates the image for the X and O and makes the window for the game
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
    /*
    iterates through each square in the array and calls draw on them also draws the numbers on the outside of the
    board
     */
    public void paint(Graphics g)
    {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[j][i].Draw(O,X,g,firstpointx,firstpointy, Width);
            }
        }
        g.setColor(Color.red);
        g.setFont(new Font("SERIF",Font.ITALIC,50));
        g.drawString("0",225,75);
        g.drawString("1",425,75);
        g.drawString("2",625,75);
        g.drawString("0",50,250);
        g.drawString("1",50,450);
        g.drawString("2",50,650);
    }
}
