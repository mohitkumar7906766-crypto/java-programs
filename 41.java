int a[]={1,2,2,3};
for(int i=0;i<a.length;i++){
 for(int j=i+1;j<a.length;j++){
  if(a[i]==a[j]){
   for(int k=j;k<a.length-1;k++) a[k]=a[k+1];
   j--;
  }
 }
}