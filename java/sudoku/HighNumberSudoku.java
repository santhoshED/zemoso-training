public class HighNumberSudoku{
	int[][] answer = new int[9][9];

	public HighNumberSudoku(int[][] myPuzzle){
		answer = myPuzzle;
	}

	public int getHighNumber(){
		String HighNumber = ""+ answer[0][0] + answer[0][1] + answer[0][2];

		return Integer.parseInt(HighNumber);
	}
}