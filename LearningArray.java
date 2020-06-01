package week1.day1;

public class LearningArray {

	public static void main(String[] args) {

		String V1 = "Selenium";
		
		
		char[] each = V1.toCharArray();
		
		
		/*
		 * for (char c : each) {
			
			System.out.print(c + " ");
			
		}
		*/
	
		for(int i=0 ; i<V1.length() ;i++)
	
			if(i%2 == 0)
			{
				
				System.out.println( V1.charAt(i) );
			}	
		}
			
	
	//System.out.println(V1.length());
	
	//System.out.println(each[4]);
	
	
	
	
	}
	
	
	


