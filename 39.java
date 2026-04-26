int a[]={1,2,3,4,0};
int pos=2,val=99,n=4;
for(int i=n;i>pos;i--) a[i]=a[i-1];
a[pos]=val;
