import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame{
    // TODO: Complete this class
    private Square[][] board;
    private int Width;
    private Image X;
    private Image O;
    private int firstpointx = 150;
    private int firstpointy = 150;
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private final int SQUARE_SIZE = 200;
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
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[j][i].Draw(O,X,g,firstpointx,firstpointy, Width);
            }
        }
        g.setColor(Color.red);
        g.setFont(new Font("SERIF",Font.ITALIC,50));
        g.drawString("0",225,100);
        g.drawString("1",425,100);
        g.drawString("2",625,100);
        g.drawString("0",50,275);
        g.drawString("1",50,475);
        g.drawString("2",50,675);
    }

    //crate image objects
    //iterate through squares call draw on each
    //getImages() call draw image
    //draw axis
    //display winning message

}
