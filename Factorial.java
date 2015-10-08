import java.util.*;
import java.lang.*;
import java.io.*;
//I just want to write a comment
class Factorial
{
	private BufferedReader in;

	Factorial(){	
			this.in = new BufferedReader(new InputStreamReader(System.in));	
	}

	Factorial(String infile) {
		try{
			this.in = new BufferedReader(new FileReader(infile));
		}catch(IOException io){
			io.printStackTrace();
		}
	}

	int getChar() {
		try {
			return in.read();
		} catch (IOException e) {
			System.out.println( e.getMessage() );
			return -1;
		}	
	}

	String getLine(){
		try{
			return in.readLine();
		}
		catch(IOException e){
			System.out.println( e.getMessage() );
			return "error";
		}	
	}

	void close() {
		try{
			this.in.close();
		}catch(IOException e){
			System.out.println( e.getMessage() );
			System.exit(1);

		}
	}


	public static void main (String[] args)
	{
		Factorial Instance=new Factorial();
		long No_TestCases=Long.parseLong(Instance.getLine());
		while(No_TestCases >0){
		//your own implementation after getting each line here 
		//Factorial1.Zeros(Long.parseLong(Instance.getLine()));
		No_TestCases--;
		}
		//System.out.println(Factorial1.getLine());
		Instance.close();	
	}
}
