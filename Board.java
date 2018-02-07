class Board
{
    public string toString()
    {
        //stuff
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