int a[]={1,5,2};
int max=a[0],min=a[0];
for(int x:a){
 if(x>max) max=x;
 if(x<min) min=x;
}
System.out.println(max+" "+min);