import java.io.*;

public class Dev1 {

public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String sTest = br.readLine();
if(sTest != null && !sTest.isEmpty() && Dev1.isNumeric(sTest)){
int iTest = Integer.parseInt(sTest);
String[] strArray = new String[iTest];
int[] size = new int[iTest];
int[] total = new int[iTest];
for (int i = 0; i < iTest; i++) {
	String mnInput = br.readLine();
	if(mnInput != null && !mnInput.isEmpty()){
		String[] mnSplit = mnInput.split(" ");
		if(mnSplit.length == 2){
			size[i] = Integer.parseInt(mnSplit[0]);
			total[i] = Integer.parseInt(mnSplit[1]);
			strArray[i] = br.readLine();
		} else {
			System.out.println("Please enter values for m and n saperated by space");
		}
	}

}
for (int i = 0; i < iTest; i++) {
	checkSubArray(strArray[i], size[i], total[i]);
}
} else {
System.out.println("Please enter valid integer value for test cases");
}

}

public static void checkSubArray(String strArray, int size, int total){
String[] sArray = strArray.split(" ");
int newSum = 0;
if(sArray.length == size){
for (int i = 0; i < size; i++) { 
	newSum = Integer.parseInt(sArray[i]); 

	for (int j = i+1; j <= size; j++) { 
    	if (newSum == total) { 
        System.out.println((i + 1) + " " + j); 
        return; 
    	} 
    	if (newSum > total || j == size) 
        	break; 
   		newSum = newSum + Integer.parseInt(sArray[j]); 
	} 
} 

System.out.println("-1");
} else {
System.out.println("Array size not match with provided length");
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