import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Ex4 {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		int ch;
		try {
			fin = new FileInputStream("C:/Users/arpit/OneDrive/Desktop/Assinment1/Alphabets.txt");
			fout = new FileOutputStream("C:/Users/arpit/OneDrive/Desktop/Assinment1/Consonants.txt");
			while((ch = fin.read())!= -1){ 
				if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || 
				ch =='o' || ch == 'O' || ch == 'u' || ch == 'U') {
					throw new VowelNotAllowedException();
					//ch++;
				}
				else {
					fout.write(ch);
					//ch++;
				}
			}	
		} catch(VowelNotAllowedException v){
			System.out.println( v);
		} catch(Exception e) {
			System.out.println("File not found " + e);
		}
	}
}

class VowelNotAllowedException extends Exception{
	public String toString() {
		return "Vowel is restricted";
	}
}
		