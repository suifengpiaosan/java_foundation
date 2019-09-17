import java.util.ArrayList;

public class Mystack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getsize() {
        return list.size();
    }

    public Object peek() {
        //获取栈顶元素
        return list.get(getsize() - 1);
    }

    public Object pop() {
        //删除栈顶元素并返回该元素
        Object o = list.get(getsize() - 1);
        list.remove(getsize() - 1);
        return o;
    }

    public void push(Object o ){
        //将指定元素添加到栈中
        list.add(o);
    }

    @Override
    public String toString() {
        return  "stack: "  + list.toString();
    }
}
