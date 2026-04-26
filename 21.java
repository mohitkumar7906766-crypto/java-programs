int n=7; boolean prime=true;
for(int i=2;i<=n/2;i++)
 if(n%i==0) prime=false;
System.out.println(prime?"Prime":"Not");
