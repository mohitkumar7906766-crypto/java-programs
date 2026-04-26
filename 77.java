int q[]=new int[5],front=0,rear=-1;
void enqueue(int x){ q[++rear]=x; }
void dequeue(){ front++; }