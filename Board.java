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
                    default:
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

    public Position position(String s)
    {
        int r, c;
        if (s.length() != 2) return null;
        switch (s.charAt(0))
        {
            case 'a':
                r = 0; break;
            case 'b':
                r = 1; break;
            case 'c':
                r = 2; break;
            default:
                return null;
        }
        switch (s.charAt(1))
        {
            case '1':
                c = 0; break;
            case '2':
                c = 1; break;
            case '3':
                c = 2; break;
            default:
                return null;
        }

        return new Position(r, c);
    }

    //chicken dinner
    Player winner()
    {
        //draw test
        boolean drawn = true;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 0; j++)
            {
                if (cells[i][j] == None)
                {
                    drawn = false;
                }
            }
        }
        if (drawn)
        {
            return Both;
        }

        //row and col test
        for (int i = 0; i < 3; i++)
        {
            if (cells[i][0] == cells[i][1] == cells[i][2])
            {
                return cells[i][0];
            }
            if (cells[0][i] == cells[1][i] == cells[2][i])
            {
                return cells[0][i];
            }
        }

        //diagonal test
        if (cells[0][0] == cells[1][1] == cells[2][2])
        {
            return cells[0][0];
        }
        if (cells[0][2] == cells[1][1] == cells[2][0])
        {
            return cells[0][2];
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