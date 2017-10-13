package lt.vcs.laivumusis.USSENTERPRISE;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lt.vcs.laivumusis.USSENTERPRISE.zaidimas.Zaidimas;
import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;
import lt.vcs.laivumusis.common.Langelis;

public class Main {
	
	static int[][] board = new int[5][5];
	
	public static void initBoard(int[][] board){
        for(int row=0 ; row < 5 ; row++ )
            for(int column=0 ; column < 5 ; column++ )
                board[row][column]=-1;
	}
	
	public static void showBoard(int[][] board) {
        System.out.println("\t1 \t2 \t3 \t4 \t5");
        System.out.println();
        
        for(int row=0 ; row < 5 ; row++ ){
            System.out.print((row+1)+"");
            for(int column=0 ; column < 5 ; column++ ){
                if(board[row][column]==-1){
                    System.out.print("\t"+"~");
                }else if(board[row][column]==0){
                    System.out.print("\t"+"*");
                }else if(board[row][column]==1){
                    System.out.print("\t"+"X");
                }
                
            }
            System.out.println();
        }

    }
	

	public static void main(String[] args) {
	
	
		 initBoard(board);
		 showBoard(board);
		

		
	}

}
