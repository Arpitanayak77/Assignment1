/*Write Java Program to perform the following Operations :
	a) Read a line of text.
	b) Search for a sub-string SDMCET
	c) If found, then print success message
	d) Otherwise throw an exception SubStringNotFoundException
*/
import java.io.*;
class Ex3 {
	public static void main(String args[]) throws IOException{
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter lines of text");
		str = br.readLine();
		String s = "SDMCET";
		boolean a = str.toLowerCase().contains(s.toLowerCase());
		try{
			if(!a)		
				throw new SubStringNotFoundException();
			else
				System.out.println("SDMCET FOUND");
		}catch(SubStringNotFoundException ss){
			System.out.println(ss);
		}
	}
}

class SubStringNotFoundException extends Exception {
	String s;
	public String toString(){
		return "String not Found ";
	}
}
