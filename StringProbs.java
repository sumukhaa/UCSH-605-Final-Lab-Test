package com.mycompany.app;

public class StringProbs
{
	String result="";
	int letter;
	
	
	
	//Q1) -c part A (convert string into uppercase)
	public String Ucase_func(String str)	
	{
		//Ascii values of A-Z: 65-90, Ascii of a-z: 97-122

		int x, lower, upper;
		
		int len=str.length();
		
		//Creating a character array of string length
		char[] array=new char[len];
		
		
		for(x=0; x<len; x++)
		{
			//Storing each char of string in the array
			array[x]=str.charAt(x);
			
			//Checking if the character is a lowercase alphabet
			if(array[x]>=97 && array[x]<=122)
			{
				lower=array[x];
				upper=lower-32;
				array[x]=(char)upper;
			}
			
			//Concatenating each character of the array to result string
			result=result+array[x];
		}
		
		//Returning the result string
		return result;
	}
	
	
	
	
	
	//Q1) -c part B (convert string into lowercase)
	public String Lcase_func(String str)	
	{
		//Ascii values of A-Z: 65-90, Ascii of a-z: 97-122

		int x, lower, upper;
		
		int len=str.length();
		
		//Creating a character array of string length
		char[] array=new char[len];
		
		
		for(x=0; x<len; x++)
		{
			//Storing each char of string in the array
			array[x]=str.charAt(x);
			
			//Checking if the character is a lowercase alphabet
			if(array[x]>=65 && array[x]<=90)
			{
				upper=array[x];
				lower=upper+32;
				array[x]=(char)lower;
			}
			
			//Concatenating each character of the array to result string
			result=result+array[x];
		}
		
		//Returning the result string
		return result;
	}
	
	
	
	
	
	
	
	
	//Q4) -a (printing ascii values of each char in a string)
	public String Ascii(String str)
	{
		int x;
		
		int len=str.length();
		
		//Creating a character array of string length
		char[] array=new char[len];
		
		
		for(x=0; x<len; x++)
		{
			//Storing each char of string in the array
			array[x]=str.charAt(x);
			
			if(array[x]>=32 && array[x]<=126)
			{
				//letter stores the ascii values
				letter=(int)array[x];
			}
			
			//Concatenating each ascii value of the character to result string
			result=result+letter+" ";
		}
		
		//Returning the result string
		return result;
	}


	
	//Q5) -p (adding prefix )
	public String Prefix(String str, String pref)
	{
		int x;
		
		//Creating a character array of string length
		String[] array=str.split("\n");
		
		int len=array.length;
		
		String[] new_array= new String[len];	
		
		for(x=0; x<len; x++)
		{
			//Adding prefix to each line and storing in new array
			new_array[x]=pref+" "+array[x];
			
			
			//Concatenating each ascii value of the character to result string
			result=result+new_array[x]+" ";
		}
		
		//Returning the result string
		return result;
	}


}
