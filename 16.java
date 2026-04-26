double a=1,b=5,c=6,d=b*b-4*a*c;
if(d>=0){
 double r1=(-b+Math.sqrt(d))/(2*a);
 double r2=(-b-Math.sqrt(d))/(2*a);
 System.out.println(r1+" "+r2);
}