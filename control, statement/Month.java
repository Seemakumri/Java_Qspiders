class Month{
public static void main(String [] args)
{
int c =6;
if (c== 1 || c== 3 || c== 5 || c== 7 || c== 8 || c==12){
System.out.println("31days");
}
else if (c==2){
System.out.println("28 or 29days");		
}
else if (c==4 || c==6 || c==9){
System.out.println("30days");
}

}
}