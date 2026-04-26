int n=145,sum=0,temp=n;
while(n>0){
 int d=n%10,f=1;
 for(int i=1;i<=d;i++) f*=i;
 sum+=f; n/=10;
}
System.out.println(sum==temp);