/*Write a Java program to perform the following operations:
a) Create a file named Alphabets.txt and insert appropriate data into it
b) Read the file name and copy all the consonants into another file named Consonants.txt
c) If vowel is encountered, throw an exception VowelNotAllowedException and continue until end of file
 */
import java.io.*;

public class Ex4 {
	public static void main(String[] args)throws IOException{
		FileInputStream fin = new FileInputStream("C:/Users/arpit/OneDrive/Desktop/Assinment1/Alphabets.txt"); 
		FileOutputStream fout = new FileOutputStream("C:/Users/arpit/OneDrive/Desktop/Assinment1/Consonants.txt");
		int ch;
		while((ch = fin.read())!= -1){ 
            try{
				if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || 
				   ch =='o' || ch == 'O' || ch == 'u' || ch == 'U') 
					throw new VowelNotAllowedException();
				else 
					fout.write(ch);
			} catch(VowelNotAllowedException v){
				System.out.println( v);
			
		}
	}
	fin.close();
	fout.close();
}
}
class VowelNotAllowedException extends Exception{
	public String toString() {
		return "Vowel is restricted";
	}
}
		
