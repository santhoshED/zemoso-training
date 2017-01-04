import java.util.*;

public class Sudoku{
  static int N = 9;
  int[][] myPuzzle = new int[9][9];

  public Sudoku(String puzzle){
    if ( puzzle.length() != 81 ){
      System.out.println("Invalid Sudoku puzzle syntax. Should be 81 numbers.");
      System.exit(1);
    }

    for ( int row = 0; row <= 8; row++ ){
      for ( int column = 0; column <= 8; column++ ){
        myPuzzle[row][column] = Character.getNumericValue(puzzle.charAt(row*9+column));
      }
    }

    if ( puzzleIsValid() == false ){
      System.out.println("Illegal puzzle.");
      System.exit(1);
    }
  }

  private boolean puzzleIsValid(){
    for ( byte y = 0; y <=8; y++ ){
      boolean[] oneThroughNine = new boolean[] {false, false, false, false, false, false, false, false, false};
      for ( byte x = 0; x <=8; x++ ){
        if ( myPuzzle[y][x] != 0 ){
          if ( oneThroughNine[myPuzzle[y][x] - 1] == false ){
            oneThroughNine[myPuzzle[y][x] - 1] = true;     
          }
          else{
            return false;
          }
        }
      }
    }

    for ( byte x = 0; x <=8; x++ ){
      boolean[] oneThroughNine = new boolean[] {false, false, false, false, false, false, false, false, false};
      for ( byte y = 0; y <=8; y++ ){
        if ( myPuzzle[y][x] != 0 ){
          if ( oneThroughNine[myPuzzle[y][x] - 1] == false ){
            oneThroughNine[myPuzzle[y][x] - 1] = true;
          }
          else{
            return false;
          }
        }
      }
    } 

    for(byte j=0;j<=6;j+=3){
      for(byte i=0;i<=6;i+=3){
        for(byte x = i;x<=2+i;x++){
          for(byte y = j;y<=2+j;y++){
            boolean[] oneThroughNine  =new  boolean[]{false,false,false,false,false,false,false,false,false};
            if( myPuzzle[x][y] != 0){
              if(oneThroughNine[myPuzzle[x][y]-1] == false){
                oneThroughNine[myPuzzle[x][y]-1] = true;
              }
              else{
                return false;
              }
            }
          }
        }
      }
    }
    return true;
  }

  static class Cell {
    int row, col;

    public Cell(int row, int col) {
      super();
      this.row = row;
      this.col = col;
    }

    public String toString() {
      return "Cell [row=" + row + ", col=" + col + "]";
    }
  };

  private boolean isValid(Cell cell, int value) {
    if (myPuzzle[cell.row][cell.col] != 0) {
      throw new RuntimeException(
      "Cannot call for cell which already has a value");
    }

    for (int c = 0; c < 9; c++) {
      if (myPuzzle[cell.row][c] == value)
        return false;
    }

    for (int r = 0; r < 9; r++) {
      if (myPuzzle[r][cell.col] == value)
        return false;
    }

    int x1 = 3 * (cell.row / 3);
    int y1 = 3 * (cell.col / 3);
    int x2 = x1 + 2;
    int y2 = y1 + 2;

    for (int x = x1; x <= x2; x++)
      for (int y = y1; y <= y2; y++)
        if (myPuzzle[x][y] == value)
          return false;

    return true;
  }

  private Cell getNextCell(Cell cur) {
    int row = cur.row;
    int col = cur.col;

    col++;

    if (col > 8) {
      col = 0;
      row++;
    }

    if (row > 8)
      return null;

    Cell next = new Cell(row, col);
      return next;
    }

  public boolean solve(){
    Cell cur = new Cell(0,0);
    return trail(cur);
  }
  private boolean trail(Cell cur) {

    if (cur == null)
      return true;
    
    if (myPuzzle[cur.row][cur.col] != 0) {   
      return trail(getNextCell(cur));
    }
    
    for (int i = 1; i <= 9; i++) {
      boolean valid = isValid(cur, i);
      if (!valid) 
        continue;
      myPuzzle[cur.row][cur.col] = i;

      boolean solved = trail(getNextCell(cur));
      if (solved)
        return true;
      else
        myPuzzle[cur.row][cur.col] = 0;
    }
    return false;
  }

  public void printPuzzle() {
    for (int row = 0; row < N; row++) {
      for (int col = 0; col < N; col++){
        System.out.print(myPuzzle[row][col]);
        if(col==2||col==5) 
            System.out.print(" ");
      }
      System.out.println();
      if(row==2||row==5||row==8) 
        System.out.println();
    }
  }
}