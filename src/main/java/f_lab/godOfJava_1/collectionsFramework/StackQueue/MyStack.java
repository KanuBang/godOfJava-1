package f_lab.godOfJava_1.collectionsFramework.StackQueue;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {
    public Object push(Object item){
        addElement(item);
        return item;
    }

    public Object pop() {
        Object peek = peek();
        removeElementAt(size()-1);
        return peek;
    }

    public Object peek() {
        int len = size();
        if(len == 0) {
            throw new EmptyStackException();
        }
        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

    public int search(Object o) {
        int i = lastIndexOf(o); // 객체 o가 마지막으로 나타는 위치를 찾는다.

        if(i > 0) {
            return size()-1;
        }
        return -1;
    }
}
