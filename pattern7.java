class pattern7
{
  public static void main(String args[])
{
  for(int i=1; i<=9; i++)
{
  for(int j=8; j>=i; j--)
{
  System.out.print(" ");
}
  for(int k=1; k<=i; k++)
{
  System.out.print("*");
}
  for(int m=5; m>=1; m--)
{
  for(int n=2; n<=m; n++)
{
  System.out.print(" ");
}
  for(int o=2; o<=m; o++)
{
  System.out.print("*");
}
  System.out.println();
}
}
}
}