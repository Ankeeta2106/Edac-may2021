import java.util.*;
class ass19
{
  public static void main(String args[])
{
  int num;
  System.out.println(" enter decimal number to convert it into binary: ");
  Scanner sc = new Scanner(System.in);
  num= sc.nextInt();
  System.out.println(" Decimal to Binary conversion: ");
  long binary = ConvertDecimalToBinary(num);
  System.out.println(" Binary number=" + binary);
}
  public static long convertDecimalToBinary(int n)
{
  long b=0;
  int r, i=1;
  while(n!=0)
{
  r=n%2;
  n/=2;
  b=b+r*i;
  i=i*10;
}
  return b;
}
}