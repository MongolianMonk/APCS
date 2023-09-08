import java.util. Scanner; // Import the Scanner class

class gg {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in); // Create a Scanner object
    
    
    System.out.println("Please give me an animal name ");
    String input = s.nextLine();// nextLine() reads the next user imput
    System.out.println("How many legs does the animal have");
    String input2 = s.nextLine();
    System.out.println("What pattern does the animal have");
    String input3 = s.nextLine();
    System.out.println("What is the gender");
    String input4 = s.nextLine();
    System.out.println("Is the animal on the land or it can swim");
    String input5 = s.nextLine();
    System.out.println("What does it taste like");
    String input6 = s.nextLine ();
   
    System.out.println("My animal name is "+input+ "It has "+input2+" legs. It has a "+input3+" pattern. It is a "+input4+". It can "+input5+". It taste like "+input6);

    
    
    
  }
  
}
