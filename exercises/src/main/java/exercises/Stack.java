package exercises;

public class Stack {

    private int[] array;
    private int top;             //first free site


    public Stack(int maxSize) {
        array = new int[maxSize];
        top = 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == array.length;
    }

    public int getSize() {
        return top;
    }

    public void push(int item) {
        if (!isFull()) {
            array[top] = item;
            top++;
        }else {
            throw new IndexOutOfBoundsException("Sorry, stack is full!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int popItem = array[top - 1];
            top--;
            return popItem;
        }else {
            throw new IndexOutOfBoundsException("Sorry, stack is empty!");
        }
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = top - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }else {
            throw new IndexOutOfBoundsException("Sorry, stack is empty!");
        }
    }
}
