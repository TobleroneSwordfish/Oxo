class Board
{
    public string toString()
    {
        
=======
    Player cells[][];
    Player currentPlayer;
    Board()
    {
        cells = new Player[3][3];
        currentPlayer = X;
        for (int i = 0; i < 9; i++)
        {
            cells[i / 3][i % 3] = None;
        }
>>>>>>> 3968b5549e864037fc929526f4dc70aa30ae018f
    }
}