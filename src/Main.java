import java.util.*;

public class Main {
  public static void main(String[] args) {
	  String consonants = "BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz";
	  char consonant[] = consonants.toCharArray();
	  Scanner scan = new Scanner(System.in);
	  String orgText = scan.nextLine();
	  String newText = "";
	  
	  scan.close();
	  
	  for (int i = 0; i < orgText.length(); i++){
		  if (ArrayUtils.contains(consonant, orgText.charAt(i))) {
			  System.out.println("CONSONANT FOUND");
			  newText += "o" + orgText.charAt(i);
		  }
		  else {
			  newText += orgText.charAt(i);
		  }
	  }
	  System.out.println(newText);
  }
}