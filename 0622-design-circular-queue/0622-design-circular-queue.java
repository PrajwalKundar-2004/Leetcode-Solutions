class MyCircularQueue {
    int[] queue;
    int front;
    int rear;
    int size;
    public MyCircularQueue(int k) {
        size=k;
        queue=new int[size];
        front=-1;
        rear=-1;
    }
    
    public boolean enQueue(int value) {
        if((rear+1)%size==front){
            return false;
        }
        if(front==-1) front=0;
        rear=(rear+1)%size;
        queue[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(front==-1) return false;
        if((front%size)==rear){
            front=-1;
            rear=-1;
            return true;
        }
        queue[front]=0;
        front=(front+1)%size;
        return true;
    }
    
    public int Front() {
        if(front==-1) return -1;
        return queue[front];
    }
    
    public int Rear() {
        if(rear==-1) return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        if(front==-1) return true;
        return false;
    }
    
    public boolean isFull() {
        if((rear+1)%size==front) return true;
        return false;
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