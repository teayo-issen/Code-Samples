import java.util.*;
class Act{
  public static void main(String teyo[]){
Scanner input = new Scanner(System.in);
    int n=0;
    int ctr= 0;
        int ectr= 0;
        int octr= 0;
int arr[];
  System.out.print("How many number: ");
    ctr= input.nextInt();
    arr= new int[ctr];
  
  int i=1;
    do{
System.out.println("Entered "+ OE(n)+ " number");
      i++;
    } while (i<=ctr);
    for (int x=0; x<arr.length;x++){
      if (arr[x]%2==0) ++ectr;
      else ++octr;
    } 
    System.out.println("Total number of even: "+ ectr);
     System.out.println("Total number of odd: "+ octr);
  } static String OE(int i){
    if (i%2==0)
      return "Even";
    else
      return "Odd";
  }
}
