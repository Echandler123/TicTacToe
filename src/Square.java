import java.awt.*;


/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

public class Square {

    private String marker;
    private int row;
    private int col;
    private int pointx;
    private int pointy;
    private int firstpointx;
    private int firstpointy;
            
    private boolean isWinningSquare;
    private TicTacToeViewer T;

    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col) {
        this.row = row;
        this.col = col;

        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
    }

    /******************** Getters and Setters ********************/
    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }
    public int getWidth()
    {
        return 200;
    }
    public void Draw(Image O, Image X, Graphics g, int firstpointx, int firstpointy, int Width)
    {
        this.firstpointx = firstpointx;
        this.firstpointy = firstpointy;
        pointx = firstpointx+ Width*row;
        pointy = firstpointy+ Width*col;
        if(isWinningSquare == true)
        {
            g.setColor(Color.green);
            g.fillRect(firstpointx  + pointx,firstpointy + pointy,Width, Width);
        }
        g.setColor(Color.black);
        g.drawRect(pointx, pointy,Width,Width);
        if(marker.equals("X"))
        {
            g.drawImage(X, pointx,  pointy, 200,200,T);
        }
        else if(marker.equals("O"))
        {
            g.drawImage(O,  + pointx,  pointy,200,200,T);
        }



    }



    //makedraw params x image o image graphics g ind dim x,y view makerer 4 which image to draw if winning fill green
    // rect draw black rect     draw image
}
