import java.util.*;
class arrayDemo{
public static void main(String theo[]){
int N[] a, b;
  int [] x,y;

  N= new int[5];
  N[0]=6;
  N[1]=12;
  N[2]=18;
  N[3]=24;
  N[4]=32;
for (a=0; a<N;a++)
  System.out.println(N[a]);

  x= new int[5];
  for (a=0; a<x; a++)
    x[a]=a+1;
  for (a=0; a<x;a++)
     System.out.println(x[a]);

  y= new int[10];
  int ctr= 4;
  for (b=0; b<y; b++){
    y[b]= ctr; ctr+=4;
  } for (a=0; a<y.length;a++)
     System.out.println(y[a]);
}
}
