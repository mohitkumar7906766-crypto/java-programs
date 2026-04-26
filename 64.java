String s="aab";
for(char c:s.toCharArray()){
 int count=0;
 for(char d:s.toCharArray())
  if(c==d) count++;
 System.out.println(c+" "+count);
}