package seleni;

import org.testng.annotations.Test;

public class reverse_pattern {
	
 
	public static void main(String[] args) {
		String mySentence = "india is my country";

		String[] reverse = mySentence.split(" ");
		for (int i = reverse.length - 1; i >= 0; i--) {

			System.out.println(reverse[i] + "");

		}
		System.out.println();
		String word = "Hello World";

		String reversed = "";
		for (int i = word.length() - 1; i >= 0; i--) {

			reversed = reversed + word.charAt(i);
		}
		System.out.println(reversed);
//	        	    }
//	    String str = "Hello World";
//	    String reversed = "";
//	    String strArr[]= str.split(" ");
//	    for (int j = 0; j < strArr.length ; j++) {
//	            char[] charArray = strArr[j].toCharArray();
//	             for (int i = charArray.length - 1; i >= 0; i--)
//	     {
//	                reversed += charArray[i]; 
//	            }
//	    reversed=reversed+" ";
//	    }
//	            System.out.println(reversed);

		int[] arr = { 1, 2, 3, 4, 5 };
		
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");
		}

	}

	String str="NAHOR";
	String store="";
	for(int i=str.length()-1;i>=0;i--) {
		
	

}
