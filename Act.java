import java.util.*;
class Act{
  public static void main(String teyo[]){
Scanner input = new Scanner(System.in);
int [] grades= new int[5];
    int sum=0;
    int highest=0;
    System.out.println("Enter grades: ");
for (int i=0; i<grades.length;i++){
  grades[i]=input.nextInt();
  sum+=grades[i];
  if (grades[i]> highest){
    highest=grades[i];
  }
}
    double avg= (double) sum/ grades.length;
    System.out.println("Average Grade"+ avg);
    System.out.println("Highest Grade"+ highest);
  }
}
