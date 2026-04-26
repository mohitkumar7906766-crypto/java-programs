int n=20;
for(int i=2;i<=n;i++){
 boolean p=true;
 for(int j=2;j<=i/2;j++)
  if(i%j==0) p=false;
 if(p) System.out.print(i+" ");
}
