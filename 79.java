Stack<Character> st=new Stack<>();
String s="()";
for(char c:s.toCharArray()){
 if(c=='(') st.push(c);
 else if(!st.isEmpty()) st.pop();
}
System.out.println(st.isEmpty());