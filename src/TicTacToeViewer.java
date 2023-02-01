import java.awt.*;

public class TicTacToeViewer {
    // TODO: Complete this class
    private Image[][] board;
    //constructor
    public TicTacToeViewer(Image[][] board)
    {
        this.board = board;
        for(int i = 0; i < board.length;i++) {
            for(int j = 0; j < board.length;j++){
                Image square = new Image;
                board[i][j] = square;
            }
        }
    }

    //crate image objects
    //iterate through squares call draw on each
    //getImages() call draw image
    //draw axis
    //display winning message

}
