class Narrowing{
public static void main (String[] args){

// narrowing
 int a = 90;
 byte b = (byte)a; //here we have to inititalize the typecasting

 System.out.println(a); //90
 System.out.println(b); //90


 //float int 

float g= 20;
int h= (int) g;
System.out.println(g);
System.out.println(h);

//int into char
int q=8;
char d= (char) q;
System.out.println(q);
System.out.println(d);

//double into byte
double w = 2999;
byte m = (byte) w;
System.out.println(w);
System.out.println(m);

//long into short 
long Ph_No = 123456;
short s = (short) Ph_No;
System.out.println(s);
System.out.println(Ph_No);

//int 128 into byte
int u= 123;
byte v = (byte) u;
System.out.println(u);
System.out.println(v);

//int 127 into byte
int y = 127;
byte z = (byte) y;
System.out.println(y);
System.out.println(z);

//int 129 into byte
int x = 129;
byte o = (byte) x;
System.out.println(x);
System.out.println(o);
}
}

 