import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "C:/Users/BAMMTest2/Desktop/example.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(line);
		System.out.println("Hello");
		System.out.println("Meep2");
		System.out.println("Meep3");
		System.out.println("Meep4");
		//Test5
		//Test6
		//Test7
		//Test8
		//Test9
		//Test10
		//Test11
		}
		
		in.close();
		
	
	}

}
