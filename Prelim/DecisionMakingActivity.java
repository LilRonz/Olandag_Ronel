import java.util.Scanner;

public class DecisionMakingActivity {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Route to Moalboal\n");
    
    System.out.println("Is route A obstructed? (Yes = 1 or No = 0):");
    int isRouteObstructed = sc.nextInt();
    
    if (isRouteObstructed == 0) {
    System.out.println("Proceed to Default Route:");
    System.out.println("Minglanilla  Route 1");
    System.out.println("San Fernando Route 2");
    System.out.println("Carcar       Route 3");
    System.out.println("Barili       Route 4.1");
    System.out.println("Dumanjug     Route 4.1.1");
    System.out.println("Alcantara    Route 4.1.2");
    
    }
    else {
    System.out.println("Porceed to Route Directions");
    
    
    System.out.println("Route 3 (4.1 or 4.2):");
    int isRouteGoingTo = sc.nextInt();
    
    if (isRouteGoingTo == 4.2) {
     System.out.println("Route 3 (4.1 or 4.2):");
    System.out.println("Sibonga");
    System.out.println("Dumanjug = Alcantara");
    System.out.println("Aragao = Ronda = Alcantara");
    }
    else {
    System.out.println("Proceed to Route 4.1");
    System.out.println("Barili = Dumanjug = Alcantara");
    }
  }
}  