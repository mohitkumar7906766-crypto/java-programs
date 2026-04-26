int a[]={1,2,3,4,5};
int n=2;
for(int i=0;i<n;i++){
 int first=a[0];
 for(int j=0;j<a.length-1;j++) a[j]=a[j+1];
 a[a.length-1]=first;
}