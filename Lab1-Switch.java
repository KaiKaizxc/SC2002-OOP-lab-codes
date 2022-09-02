import java.util.*;


class Main {  
  public static void main(String args[]) { 
    System.out.println("Hello, world!");
    System.out.println("Please enter your input");
    Scanner scan = new Scanner(System.in);
    String myInput = scan.next();
    
    helperMain(myInput);
  } 


  public static void helperMain(String myInput) {
    System.out.println("logged");
    System.out.println(myInput);
    switch(myInput) {
      case "A":
        System.out.println("Action movie fan");
        break;
      case "a":
        System.out.println("Action movie fan");
        break;
      case "c":
        System.out.println("Comedy movie fan");
        break;
      case "C":
        System.out.println("Comedy movie fan");
        break;
      case "d":
        System.out.println("Drama movie fan");
        break;
      case "D":
        System.out.println("Drama movie fan");
        break;
      default:
        System.out.println("invalid input");
        
        
        
        
    }
    
  }
}
