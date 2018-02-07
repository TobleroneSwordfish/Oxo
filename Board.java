class Board
{
    public string toString()
    {
        StringBuilder str;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; i++)
            {
                switch (cells[i][j])
                {
                    case X:
                        str.append("X");
                        break;
                    case O:
                        str.append("O");
                        break;
                    case else:
                        str.append(".");
                        break;
                }
            }
        }
        return str.toString();
    }

    public move(Position pos)
    {
        cells[pos.row()][pos.col()] = currentPlayer;
        if (currentPlayer == X)
        {
            currentPlayer = O;
        }
        else
        {
            currentPlayer = X;
        }
    }

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
    }

}