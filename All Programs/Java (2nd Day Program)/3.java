public class Main
{


  public static void main(String[] args) {
   int a=4, i, b, j;
      for(i=0; i<a; i++)
      {
         for(b=i; b<a; b++)
            System.out.print(" ");
         for(j=0; j<(i+1); j++)
            System.out.print("* ");
         System.out.print("\n");
      }
   }
  
}
