class ImproveTicTacToe {

    private final int boardLength = 3;
    private final String emptyCell = "E";
    private final String X = "X";
    private final String O = "O" ; 
    private String whoseTurn = "X";

    private String[][] board = new String[boardLength][boardLength];
public void gameState(){
    if (isTie()){
        System.out.println("Game End: IT IS A TIE");
    }
    else if (isXwinner()){
        System.out.println("Game End: X IS THE WINNER");
    }
    else if (isOwinner()){
        System.out.println("Game End: O IS THE WINNER");
    }
}
 private Boolean isTie(){
    Boolean check = true;
    if(isXwinner() || isOwinner()){
        check = false;
        return check;
    }
    else{
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                if(board[i][j] == emptyCell){
                    check = false;
                    return check;
                }
            }
        }
    }
    return check;
 }

 private Boolean isXwinner(){
    Boolean xWinner = false;
    if (checkWinner("X")){
        xWinner = true;
        return xWinner;
    }
    return xWinner;
 }

 private Boolean isOwinner(){
    Boolean oWinner = false;
    if (checkWinner("O")){
        oWinner = true;
        return oWinner;
    }
    return oWinner;
 }
 private Boolean checkWinner(String winner){
    Boolean win = false;
            if((board[0][0]== winner) && (board[0][1] == winner) && (board[0][2]==winner)){
                win =true;
                return win;
            }
            else if((board[1][0]== winner) && (board[1][1] == winner) && (board[1][2]==winner)){
                win =true;
                return win;
            }
            else if((board[2][0]== winner) && (board[2][1] == winner) && (board[2][2]==winner)){
                win =true;
                return win;
            }
            else if((board[0][0]== winner) && (board[1][0] == winner) && (board[2][0]==winner)){
                win =true;
                return win;
            }
            else if((board[1][0]== winner) && (board[1][1] == winner) && (board[1][2]==winner)){
                win =true;
                return win;
            }
            else if((board[2][0]== winner) && (board[2][1] == winner) && (board[2][2]==winner)){
                win =true;
                return win;
            }
            else if((board[0][0]== winner) && (board[1][1] == winner) && (board[2][2]==winner)){
                win =true;
                return win;
            }
            else if((board[2][0]== winner) && (board[1][1] == winner) && (board[2][0]==winner)){
                win =true;
                return win;
            }
        
     return win;       
           
 }


 
    ImproveTicTacToe() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }

        whoseTurn = X;
    }

    private void changeTurn() {
        if (whoseTurn == X) {
            whoseTurn = O;
        } else {
            whoseTurn = X;
        }
    }

    public void updateBoard(int x, int y) {
        if (x >= boardLength
            || x < 0 
            || y >= boardLength 
            || y < 0) {
                System.out.println("invalid coordinate x: " + x + "y: " + y);
            } 

        if (board[x][y] != emptyCell) {
            System.out.println("invalid move. cell not empty");
        } else {
            board[x][y] = whoseTurn;
            changeTurn();
        }
    }

    public void initializeBoard() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }
        whoseTurn = X;
    }

    public void printBoard() {
        System.out.println("current turn: " + whoseTurn);
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                System.out.print(" " +board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class ImproveTicTacToeDemo {
    public static void main(String[] args) {

        //State to check if the Game is Tie
        ImproveTicTacToe board = new ImproveTicTacToe();
        //board.printBoard();
        board.updateBoard(1, 1);
        //board.printBoard();
        board.updateBoard(1, 2);
       // board.printBoard();
        board.updateBoard(1, 0);
       // board.printBoard();
        board.updateBoard(2, 1);
        //board.printBoard();
        board.updateBoard(2, 2);
        //board.printBoard();
        board.updateBoard(2, 0);
        //board.printBoard();
        //board.gameState();
        board.updateBoard(0, 1);
        // board.printBoard();
        board.updateBoard(0, 0);
        //board.printBoard();
        board.updateBoard(0, 2);
        board.printBoard();
        board.gameState();

        //State to check if the Game is xWinner
        ImproveTicTacToe board1 = new ImproveTicTacToe();
        //board1.printBoard();
        board1.updateBoard(1, 1);
        //board1.printBoard();
        board1.updateBoard(1, 2);
        //board1.printBoard();
        board1.updateBoard(1, 0);
        //board1.printBoard();
        board1.updateBoard(2, 1);
        //board1.printBoard();
        board1.updateBoard(2, 2);
        //board1.printBoard();
        board1.updateBoard(2, 0);
        //board1.printBoard();
        board1.updateBoard(0, 1);
        //board1.printBoard();
        board1.updateBoard(0, 2);
        //board1.printBoard();
        board1.updateBoard(0, 0);
        board1.printBoard();
        board1.gameState();

        //State to check if the Game oWinner
        ImproveTicTacToe board2 = new ImproveTicTacToe();
        //board1.printBoard();
        board2.updateBoard(0, 0);
        //board1.printBoard();
        board2.updateBoard(2, 0);
        //board1.printBoard();
        board2.updateBoard(1, 0);
        //board1.printBoard();
        board2.updateBoard(0, 2);
        //board1.printBoard();
        board2.updateBoard(0, 1);
        //board1.printBoard();
        board2.updateBoard(1, 1);
        //board1.printBoard();
        board2.updateBoard(1, 2);
        //board1.printBoard();
        board2.updateBoard(2, 1);
        //board1.printBoard();
        board2.updateBoard(2, 2);
        board2.printBoard();
        board2.gameState();

    }
}
    

