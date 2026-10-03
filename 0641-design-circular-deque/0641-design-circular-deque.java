class MyCircularDeque {
    int[] queue;
    int front;
    int rear;
    int size;
    int count = 0;
    public MyCircularDeque(int k) {
        size = k;
        queue = new int[size];
        front = 0;
        rear = -1;
    }
    public boolean insertFront(int value) {
        if (count == size)
            return false;
        if (count == 0) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + size) % size;
        }
        queue[front] = value;
        count++;
        return true;
    }
    public boolean insertLast(int value) {
        if (count == size)
            return false;
        if (count == 0) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        queue[rear] = value;
        count++;
        return true;
    }
    public boolean deleteFront() {
        if (count == 0)
            return false;
        queue[front] = 0;
        if (count == 1) {
            front = 0;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        count--;
        return true;
    }
    public boolean deleteLast() {
        if (count == 0)
            return false;
        queue[rear] = 0;
        if (count == 1) {
            front = 0;
            rear = -1;
        } else {
            rear = (rear - 1 + size) % size;
        }
        count--;
        return true;
    }
    public int getFront() {
        if (count == 0)
            return -1;
        return queue[front];
    }
    public int getRear() {
        if (count == 0)
            return -1;
        return queue[rear];
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return count == size;
    }
}