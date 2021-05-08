import java.util.*;
class ass20
{
  public static void main(String args[])
{
  int n;
  System.out.println(" Enter decimal number to convert in Hexadecimal: ");
  Scanner sc = new Scanner(System.in);
  n = sc.nextInt();
  System.out.println(" Decimal to Hexadecimal Conversion ");
  long b = 0;
  int r, i = 1;
  char[] a = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
  String  avalue = "  ";
  while(n!=0)
{
  r = n%16;
  n / = 16;
  avalue=avalue+a[r];
}
  System.out.print(" ConDTH: " +avalue);
}
}