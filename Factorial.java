import java.util.*;
import java.lang.*;
import java.io.*;

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

void Zeros(long number){
long result=0;
for(long i=5;i<=number;i=i*5){
result+=number/i;
//System.out.println("i is: "+i);
}
System.out.println(result);

}

	public static void main (String[] args)
	{
		Factorial Factorial1=new Factorial();
		long No_TestCases=Long.parseLong(Factorial1.getLine());
		while(No_TestCases >0){
		
		Factorial1.Zeros(Long.parseLong(Factorial1.getLine()));
		No_TestCases--;
		}
		//System.out.println(Factorial1.getLine());
		Factorial1.close();	
	}
}
