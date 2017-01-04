import java.util.*;
import java.io.*;

public class SudokuSolver{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileReader("sudoku.txt"));
            int sum = 0;
            for(int n =1;n<=50;n++){
                StringBuilder sb = new StringBuilder();
                String line = sc.nextLine();
                int l=1;
                while(l<=9){
                    line = sc.nextLine();
                    sb.append(line);
                    l++;
                }
                String puzzle = sb.toString();
                
                Sudoku pz = new Sudoku(puzzle);
                pz.solve();

                HighNumberSudoku pi = new HighNumberSudoku(pz.myPuzzle);
                sum += pi.getHighNumber();
            }
            System.out.println(sum);
        } catch(IOException e){
            System.out.println("file not found");
        } 
        
    }    
}