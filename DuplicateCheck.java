package week1.day1;

import java.util.Arrays;

public class DuplicateCheck {

	public static void main(String[] args) {


		int[] arr = {1,2,3,4,7,6,8};

		Arrays.sort(arr);
		
		for(int i=0; i< arr.length ; i++)
		{
		
			/*for(int j=1; j< arr.length-1; j++)
				
			{
				
				if (arr[i] + 1 == arr[j] )
				{
					System.out.println("no miss");
				}
					
				else
				{
					System.out.println(arr[i]+1);
				}
				*/	
				
			
		if (arr[i] != i+1)
			
		{
			System.out.println(i+1);
			break;
		}
			
			
				
			}
				}
			
		
		
		
		}
		
		
			
		
		
		
		
		
		


