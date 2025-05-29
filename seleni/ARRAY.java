package seleni;

import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;

public class ARRAY {
	public static void main(String[] args) {
		//ChromeDriver[]a=Launch5Brouser();          //1 METHOD
		//ChromeDriver z=a[2];
		
		int[]x= {29,35,57,56};                 //2METHOD
		int y=x[2];
		System.out.println(y);
		
		int[]arr=new int[20];                 //3METHOD
		arr[0]=28*1;
		arr[1]=28*2;
		arr[2]=28*3;
		arr[3]=28*4;
		int b=arr[2];
		System.out.println(b);
		
		
		
		int[]w= {29,35,57,56};                 	
		int[]array=new int[20];              //4METHOD
       for(int i=0;i<=3;i++) {
    	   
       int t=w[i];
       System.out.println(t);
       }
       String[] StrArr=new String[3];
       StrArr[0]="Sandeep";
       StrArr[1]="Supriya";
       StrArr[2]="Shivam";
    int arryItemCount= StrArr.length;
    String[] NewStrArr=new String[arryItemCount+5];
    for(int i=0;i<=arryItemCount-1;i++) {
    	NewStrArr[i]=StrArr[i];
    }
    NewStrArr[3]="ajay";
    NewStrArr[4]="duggu";	
    NewStrArr[5]="priya";	
    System.out.println("");
    
    
    //Ararylist   =  isme size ka no problem jitna mn utna daale
     //            =duplicate data allowed ,insertion order maintain
      //               =data tyes se mtlab nhi hai
    
    
    ArrayList<String> al= new ArrayList<String>();
    
    al.add("efe");
    al.add("eferfrf");
    al.add("efefr");
    al.add("efdfe");
    al.add("efdfe");
    al.get(2);
	}
	public static ChromeDriver[] Launch5Brouser() {
		ChromeDriver driver=new	ChromeDriver();
		ChromeDriver driver1=new ChromeDriver();
		ChromeDriver driver2=new	ChromeDriver();
		ChromeDriver driver3=new	ChromeDriver();
		ChromeDriver driver4=new	ChromeDriver();
		ChromeDriver[]y= {driver,driver1,driver2,driver3,driver4};
		return y;

	}

}
