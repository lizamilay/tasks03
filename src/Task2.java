import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		int n = 10;
		int m = 8;
		int [][] arr = new int [n][m];
		
		Random rand = new Random();
		int k = rand.nextInt(n);
		int p = rand.nextInt(m);
		
		init(arr);
		System.out.println("�������� �������:");
		print(arr);
		
		System.out.println("��������� ����� � �������� ���������� � 0 ");
		System.out.println(k + "-� ������:");
		print(arr[k]);
		
		System.out.println(p + "-� �������:");
		for( int i=0; i < arr.length; i++) {
			System.out.print(arr[i][p] + " ");
    	}

		return;
	}
    public static void init(int[][] mas) {
    	Random rand = new Random();
    	for( int i=0; i < mas.length; i++) {
    		for(int j=0; j< mas[i].length; j++) {
    		    mas[i][j] = rand.nextInt(100);
    		}
    	}
    }
    
    public static void print(int[] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		System.out.print(mas[i] + " ");
    	}
    	System.out.println();
    }
    
public static void print(int[][] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		print(mas[i]);
    	}
    }
}
