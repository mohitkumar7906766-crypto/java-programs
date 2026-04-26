boolean flag=true;
int a[][]={{1,2},{2,1}};
for(int i=0;i<2;i++)
 for(int j=0;j<2;j++)
  if(a[i][j]!=a[j][i]) flag=false;
System.out.println(flag);