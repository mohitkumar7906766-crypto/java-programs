String s="abc 123";
int v=0,c=0,d=0,sp=0;
for(char ch:s.toCharArray()){
 if(Character.isDigit(ch)) d++;
 else if(Character.isWhitespace(ch)) sp++;
 else if("aeiouAEIOU".indexOf(ch)!=-1) v++;
 else c++;
}
System.out.println(v+" "+c+" "+d+" "+sp);