import java.io.*;

public class Dev3 {

public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String sTest = br.readLine();
if(sTest != null && !sTest.isEmpty() && Dev3.isNumeric(sTest)){
	int iTest = Integer.parseInt(sTest);
	String[] strArray = new String[iTest];
	int m[] = new int[iTest];
	int n[] = new int[iTest];
	for (int i = 0; i < iTest; i++) {
		String mnInput = br.readLine();
		if(mnInput != null && !mnInput.isEmpty()){
			String[] mnSplit = mnInput.split(" ");
			if(mnSplit.length == 2){
				m[i] = Integer.parseInt(mnSplit[0]);
				n[i] = Integer.parseInt(mnSplit[1]);
				strArray[i] = br.readLine();
			} else {
				System.out.println("Please enter values for m and n saperated by space");
			}
		}

	}
	
} else {
	System.out.println("Please enter valid integer value for test cases");
}

}


public static boolean isNumeric(String str) { 
try {  
Integer.parseInt(str);  
return true;
} catch(NumberFormatException e){  
return false;  
}  
}
}