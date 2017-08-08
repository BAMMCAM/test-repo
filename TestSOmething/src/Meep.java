import java.io.IOException;
public class Meep {

	public static void main(String[] args) {

		
		 /*Runtime rt = Runtime.getRuntime();
		  rt.exec(new String[]{"cmd.exe","/c","start","/k"});//, "C:\\Users\\TestUser1\\Downloads\\runsikulix.cmd -r C:\\Users\\TestUser1\\Stuff.sikuli\\stuff.skl"});
		  
		  //C:\Users\TestUser1\Downloads\runsikulix.cmd -r C:\Users\TestUser1\Stuff.sikuli\stuff.skl
		  //rt.exec(new String[]{"cmd.exe c start, C:\\Users\\TestUser1\\Downloads\\runsikulix.cmd -r C:\\Users\\TestUser1\\Stuff.sikuli\\stuff.skl"});
		  //, C:\\Users\\TestUser1\\Downloads\\sikulix
		   * */
		  
		  /* String cmd = "cmd.exe /c start";
		  try {
		         @SuppressWarnings("unused")
		         Process ps = Runtime.getRuntime().exec(cmd);
		     } catch (IOException e) {
		         e.printStackTrace();
		     }
		     */
		  
		  /*Runtime.getRuntime().exec(new String[] {
		          "cmd",
		          "/k",
		          "C:\\Users\\TestUser1\\Downloads\\runsikulix.cmd -r C:\\Users\\TestUser1\\Stuff.sikuli\\stuff.skl",
		         
		  });
		  */
		  
		  String[] cmd = { "cmd.exe", "/c", "start", "C:\\Users\\TestUser1\\Downloads\\runsikulix.cmd -r C:\\Users\\TestUser1\\Stuff.sikuli\\stuff.skl"};
		  
		  try {
		         @SuppressWarnings("unused")
		         Process ps = Runtime.getRuntime().exec(cmd);
		     } catch (IOException e) {
		         e.printStackTrace();
		     }
		  
		 }

		
	}


