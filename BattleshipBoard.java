package week6;


public class BattleshipBoard {
	private char[][] board;
    private static final int BOARD_SIZE = 20;
    
    public BattleshipBoard() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        createBoard();
    }

    // Create Board method
    public void createBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '0';
            }
        }
    }

    // Place Ship method
    public void placeShip(int x, int y, String type, String direction) {
        int length = 0;
        
        if("carrier".equals(type)) {
        	length = 5;
            if ("horizontal".equals(direction)) {
                for (int i = 0; i < length; i++) {
                	if(board[y][x+i]== '0') {
                		board[y][x + i] = '-';
                
                	}
                	else {
                		System.out.println("Occupied");
                	}
                }
            } 
            if ("vertical".equals(direction)) {
                for (int i = 0; i < length; i++) {
                	if(board[y+i][x]=='0') {
                		board[y + i][x] = '-';
                	}
                	else {
                		System.out.println("Occupied");
                	}
                }
            }
        }
        else if("battleship".equals(type)) {
        	length = 4;
            if ("horizontal".equals(direction)) {
                for (int i = 0; i < length; i++) {
                	if(board[y][x+i]=='0') {
                		board[y][x + i] = '-';
                	}
                	else {
                		System.out.println("Occupied");
                	}
                }
            } 
            if ("vertical".equals(direction)) {
                for (int i = 0; i < length; i++) {
                	if(board[y+i][x]=='0') {
                		board[y + i][x] = '-';
                    
                	}
                }
            }
        }
        else if("destroyer".equals(type)) {
        	length = 2;
            if ("horizontal".equals(direction)) {
                for (int i = 0; i < length; i++) {
                	if(board[y][x+i]=='0') {
                		board[y][x + i] = '-';
                	}
                	else {
                		System.out.println("Occupied");
                	}
                }
            } 
            
            if ("vertical".equals(direction)) {
                for (int i = 0; i < length; i++) {
                	if(board[y+i][x]=='0') {
                		board[y + i][x] = '-';
                	}
                	else {
                		System.out.println("Occupied");
                	}
                }
            }
        }
        else if("cruiser".equals(type)) {
        	length = 3;
            if ("horizontal".equals(direction)) {
                for (int i = 0; i < length; i++) {
                	if(board[y][x+i]=='0') {
                		board[y][x + i] = '-';
                	}
                	else {
                		System.out.println("Occupied");
                	}
                }
            } 
            
            if ("vertical".equals(direction)) {
                for (int i = 0; i < length; i++) {
                	if(board[y+i][x]=='0') {
                		board[y + i][x] = '-';
                	}
                	else {
                		System.out.println("Occupied");
                	}
                }
            }
        }
        else if("submarine".equals(type)) {
        	length = 3;
            if ("horizontal".equals(direction)) {
                for (int i = 0; i < length; i++) {
                	if(board[y][x+i]=='0') {
                		board[y][x + i] = '-';
                	}
                	else {
                		System.out.println("Occupied");
                	}
    
                }
            } 
            
            if ("vertical".equals(direction)) {
                for (int i = 0; i < length; i++) {
                	if(board[y+i][x]=='0') {
                		board[y + i][x] = '-';
                	}
                	else {
                		System.out.println("Occupied");
                	}
                }
            
             }

        }
        
    }

    // Print Board method
    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    // Fire method
    public void fire(int x, int y) {
        if (board[y][x] == '-') {
            board[y][x] = 'X';
            System.out.println("hit");
        } else {
            board[y][x] = '?';
            System.out.println("miss");
        }
    }

    public static void main(String[] args) {
        BattleshipBoard gameBoard = new BattleshipBoard();

        gameBoard.printBoard();
        gameBoard.fire(7,5);
        gameBoard.placeShip(5, 5, "carrier", "horizontal");
        gameBoard.printBoard();
        gameBoard.placeShip(5, 5, "submarine", "horizontal");
        gameBoard.fire(3, 4);
        gameBoard.printBoard();
    }
	
		
		
	}
	
	
	


