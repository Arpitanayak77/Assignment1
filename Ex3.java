import java.io.*;
class Ex3 {
	public static void main(String args[]) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter lines of text");
		try{
			do{
				str = br.readLine();
				//System.out.println(str);
			}while(str.equals("SDMCET"));
			throw new SubStringNotFoundException(str);
		}
		catch(SubStringNotFoundException ss){
			System.out.println("String not Found " + ss);
		}
		finally {
			System.out.println("SDMCET FOUND");
		}
	}
}

class SubStringNotFoundException extends Exception {
	String s;
	SubStringNotFoundException(String ch) {
		s=ch;
	}
}