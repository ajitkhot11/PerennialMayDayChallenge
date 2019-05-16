import java.io.*;

public class Dev2{
public static void main(String[] args) throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String sTest = br.readLine();
if(sTest != null && !sTest.isEmpty() && Dev2.isNumeric(sTest)){
int iTest = Integer.parseInt(sTest);
String[] array = new String[iTest];
for (int i = 0; i < iTest; i++) {
	String sSize = br.readLine();
	if(sSize != null && !sSize.isEmpty() && Dev2.isNumeric(sSize)){
		int iSize = Integer.parseInt(sSize);
		array[i] = br.readLine();
		if(array[i] != null && !array[i].isEmpty() && (array[i].split(" ")).length == iSize){
		} else {
			System.out.println("Please enter valid array");
			System.exit(0);
		}
	} else {
		System.out.println("Please enter valid size");
		System.exit(0);
	}
}
for(int i = 0; i < array.length; i++){
	String[] strArray = array[i].split(" ");
	checkEquilibrium(strArray);
}
} else {
System.out.println("Please enter valid integer value for test cases");
System.exit(0);
}
}

public static void checkEquilibrium(String[] strArray){
int sumFirst = 0, sumSecond = 0, count = 0;
for(int i = 0; i < strArray.length; i++) {
sumFirst = 0;
sumSecond = 0;
for (int j = 0; j < i; j++) {
	sumFirst += Integer.parseInt(strArray[j]); 
}
for (int j = i + 1; j < strArray.length; j++) {
	sumSecond += Integer.parseInt(strArray[j]);
}
if(sumFirst == sumSecond){
	System.out.println(i + 1);
	count = 1;
	break;
}
}
if(count != 1){
System.out.println("-1");
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