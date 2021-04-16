package StackImplamentation;

public class Stack {

    int [] stack = new int[6];
    int top = 0;


    public void push(int data) {

        if (top == 6) {
            System.out.println("The stack is full");
        } else {

            stack[top] = data;
            top++;
        }
    }

    public int pop() {
        int data=0;

        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            top--;
          data   = stack[top];
        }
        return data;

    }

    public int peek(){
        return stack[top];
    }

 public int  size(){

        return top;
 }

 public boolean isEmpty(){
        if(top<=0){
            return true;
        }
        return false;
 }

// public boolean isEmpty(){
//        return top<=0;
// }



}
