import java.util.*;
public class StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(list.size()==-1) return -1;
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            return list.get(list.size()-1);
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        s.push(16);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
