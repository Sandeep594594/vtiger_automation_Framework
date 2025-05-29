package seleni;

import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		ChromeDriver[]a=launch20Brouser();
		ChromeDriver print=a[2];
		System.out.println(print);
		
//          String sample="ABCD";
//          int res=12345;
//         String result="";
//          
//   		String value=sample.valueOf(res);
// 
//  		for (int i=0; i <value.length()-1; i++) {
//  		 result+=""+sample.charAt(i)+value.charAt(i);
//     
//        	  
//          }
//  		 System.out.println(result);
//  		
//  	
//        
//        	  
	}
          
	
    public static ChromeDriver[] launch20Brouser() {
      ChromeDriver driver=new ChromeDriver ();
      ChromeDriver driver1=new ChromeDriver ();
      ChromeDriver driver2=new ChromeDriver ();
      ChromeDriver driver3=new ChromeDriver ();
      System.out.println("ready");
      ChromeDriver driver4=new ChromeDriver ();
      ChromeDriver[]y= {driver,driver1,driver2,driver3,driver4};
      return y;
    }
    
	}


