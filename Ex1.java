public class Ex1{
	public static void main(String args[]) {
		try{
			int a = args.length;
			System.out.println("a = " + a);
			int b = 45/a;
			int c[] = {1};
			c[42] = 100;
		}
		catch(ArithmeticException ae) {
			System.out.println("Divide by zero " +ae);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array out of Bounds " + ai);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
	