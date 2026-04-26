class Stack{
 int top=-1,a[]=new int[5];
 void push(int x){ a[++top]=x; }
 void pop(){ top--; }
}