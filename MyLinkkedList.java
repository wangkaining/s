package Java1702;

/**
 * Created by 王凯宁 on 2017/4/11.
 */
public class MyLinkkedList {
    private Node first ;
    private Node last;
    private int size;

    public MyLinkkedList(){
    }
    public static void main(String[] args) {
        MyLinkkedList myLinkkedList = new MyLinkkedList();
        myLinkkedList.add("a");
        myLinkkedList.add("b");
        myLinkkedList.add("c");
        System.out.println(myLinkkedList.first);
        System.out.println(myLinkkedList.last);
    }
    public boolean add(String element) { // 必须return  一个返回值
        if (first == null) {
            Node node = new Node(element, null, null);
            first = node;
            last = node;
        } else {
            Node node = new Node(element, last, null);
            last.next=node;
            last=node;
        }
        return true;
    }
    private class Node { // Node  节点
        String element; // element  元素
        Node prev ; // prev  previous 以前的
        Node next ;

        public Node(String element, Node prev, Node next) { // 快捷键 是 Alt+shift+Insert
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

}
