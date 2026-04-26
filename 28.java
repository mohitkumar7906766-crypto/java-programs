int a=12,b=18,g;
for(g=Math.min(a,b);g>0;g--)
 if(a%g==0 && b%g==0) break;
int lcm=(a*b)/g;
System.out.println(g+" "+lcm);