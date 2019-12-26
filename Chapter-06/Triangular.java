import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Triangular {

	static int theNumber;

	public static void main(String[] args) throws IOException {


		System.out.println("Enter the number");
		theNumber = getInt();
		int theAnswer = triangle(theNumber);
		System.out.print("triangle =" + theAnswer);

	}

	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;

	}
	private static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}

	public static int triangle(int n){
      System.out.println("Entering n = " +n);
      if (n == 1) {
      	System.out.println("returning 1");
      	return 1;

	  }
      else {
      	int temp = n + triangle (n - 1);
      	System.out.println("Returning " + temp);
      	return temp;
	  }
	}
}

