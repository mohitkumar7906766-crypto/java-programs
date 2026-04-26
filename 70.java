void rev(String s){
 if(s.length()==0) return;
 rev(s.substring(1));
 System.out.print(s.charAt(0));
}