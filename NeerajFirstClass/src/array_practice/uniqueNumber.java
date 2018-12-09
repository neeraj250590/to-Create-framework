package array_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class uniqueNumber {

	public static void main(String args[])throws IOException {
		// int k=0;
		//5444int arr[] = { 4, 4, 5, 5, 7, 7,10 };
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        int n=Integer.parseInt(br.readLine());
		
		String s=Integer.toString(n);
		int flag=0;
		int l=s.length();
		 for(int i=0;i<l-1;i++)
	        {
	            for(int j=i+1;j<l;j++)
	            {
	                if(s.charAt(i)==s.charAt(j)) //if any digits match, then we know it is not a Unique Number
	                {
	                    flag=1;
	                    break;
	                }
	            }
	        }
	 
	        if(flag==0)
	        System.out.println("**** The Number is a Unique Number ****");
	        else
	        System.out.println("**** The Number is Not a Unique Number ****");

		}

	}


