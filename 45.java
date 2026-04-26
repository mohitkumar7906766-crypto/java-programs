int a[]={1,2,3,4},l=0,r=3,key=3;
while(l<=r){
 int m=(l+r)/2;
 if(a[m]==key) break;
 else if(a[m]<key) l=m+1;
 else r=m-1;
}