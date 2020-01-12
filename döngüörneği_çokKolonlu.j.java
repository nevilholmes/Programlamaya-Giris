package bilgisayarkavramları;

public class döngüörneği_çok_kolonlu {

	public static void main(String[] args) {
		// https://github.com/BilgisayarKavramlari/Programlamaya-Giris/projects?query=is%3Aopen+sort%3Acreated-asc
		// 11. soru
		
		int [][] two = new int [4][6];
		
		for (int i = 0; i < 4; i++) {
			
			int k = 10;
			
			for (int j = 0; j < 6; j++) {
				
				if (i == 0) 
						
					two[i][j] = (j+1) * 15;
				
				else if (i == 1)
					
					two[i][j] = (j+1) * 5;
				
				else if (i == 2) {
					
					two[i][j] = (j+k) * 10;
					k = k -2;
				}
				
				else
					
					two[i][j] = (int) Math.pow(2, j+1);
					
					
			}
		}
		
		for (int i = 0; i < two.length; i++)
		{
			for (int j = 0; j < two[i].length; j++) {
				
				System.out.print(two[i][j] + " ");
			}
			System.out.println();
		}

	}

}
