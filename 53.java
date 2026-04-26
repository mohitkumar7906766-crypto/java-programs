boolean eq=true;
int a[][]={{1,2},{3,4}},b[][]={{1,2},{3,4}};
for(int i=0;i<2;i++)
 for(int j=0;j<2;j++)
  if(a[i][j]!=b[i][j]) eq=false;
System.out.println(eq);