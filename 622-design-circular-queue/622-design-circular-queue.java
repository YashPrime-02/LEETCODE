class MyCircularQueue {
int queue[];
int front,rear,size;       
    
    public MyCircularQueue(int k) 
    {
    this.queue=new int[k]; 
    this.front=-1;
    this.rear=-1;
    this.size=k;
    }
    
    public boolean enQueue(int value) 
    {
    if(isFull())
       return(false);
            
    if(isEmpty())
    {
    front=rear=0;
            
    }
     else
    {
    rear=(rear+1)%size;        
    }
    queue[rear]=value;        
    return true;
    }
    
    public boolean deQueue() 
    {
     if(isEmpty())
     return(false);
     
     if(front == rear){
        front = rear = -1;
     }       
     else
     {
     front=(front+1)%size;
     }
     return true;       
            
    }
    
    public int Front() 
    {
     return((isEmpty())?-1:queue[front]);   
    }
    
    public int Rear() 
    {
    return((isEmpty())?-1:queue[rear]);    
    }
    
    public boolean isEmpty() 
    {
    return(front==-1);    
    }
    
    public boolean isFull() 
    {
    return((rear + 1) % size ==(front));    
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */