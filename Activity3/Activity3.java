class Activity3{
	public static void main(String[] args){
	//factorial 8
	int x = 8;
	int fact = x*(x-1)+x*(x-2)+x*(x-3)+x*(x-4)+x*(x-5)+x*(x-6)+x*(x-7)+x*(x-8);
	System.out.println(fact);

	//factorial 7
	int x1 = 7;
	int fact1 = x1*(x1-1)+x1*(x1-2)+x1*(x1-3)+x1*(x1-4)+x1*(x1-5)+x1*(x1-6)+x1*(x1-7);
	System.out.println(fact1);	

	//factorial 4
	int y = 4;
	int fact2 = y*(y-1)+y*(y-2)+y*(y-3)+y*(y-4);
	System.out.println(fact2);

	//simple intrest 
	double p = 800000;
	double t = 60/12;
	double r = 12;
	
	double SI = p*r*t/100;
	System.out.println(SI);

	//
	int avg1 = 40, avg2= 30, avg3 = 56, avg4 = 78;
	int sum = (avg1+avg2+avg3+avg4)/4;
	System.out.println(sum);
	
	//
	double s = 78, ss = 89, m = 99, e = 88, h = 67;
	double sum1 = (s+ss+m+e+h)*100/500;
	System.out.println(sum1);
}
}
