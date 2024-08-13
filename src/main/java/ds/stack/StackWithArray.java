package ds.stack;

import java.util.ArrayList;
import java.util.List;

public class StackWithArray {
    List<Integer> list = new ArrayList<>();
    public StackWithArray(int value) {
        this.list.add(value);
    }
    public List push(int value){
        this.list.add(value);
        return this.list;
    }

    public List pop(){
        this.list.remove(this.list.size()-1);
        return this.list;
    }

    public int peek(){
        return this.list.get(this.list.size()-1);
    }

    @Override
    public String toString() {
        return "StackWithArray{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {
        StackWithArray stackWithArray = new StackWithArray(1);
        stackWithArray.push(2);
        stackWithArray.push(3);
        stackWithArray.push(4);
        System.out.println(stackWithArray);
        System.out.println(stackWithArray.peek());
        stackWithArray.pop();
        stackWithArray.pop();
        System.out.println(stackWithArray);
        System.out.println(stackWithArray.peek());
    }
}
