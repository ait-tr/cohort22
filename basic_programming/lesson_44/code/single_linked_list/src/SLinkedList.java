public class SLinkedList {
    private Node first = new Node(null, null);
    // первый выступает своего рода болванкой, мы в нем не будем ничего хранить в data
    // там хранится только ссылка на "настоящий" первый элемент
    private Node last = first;
    public void add(String string){
        Node newNode = new Node(string, null);
        last.next = newNode;
        last = newNode;
    }
    public void addFirst(String element) {
        Node newNode = new Node(element, first.next);
        first.next = newNode;
    }
    public void printAll(){
        Node temp = first.next;
        while(temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }
    public int size(){
        int counter = 0;
        Node temp = first.next;
        while(temp != null){
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public String getFirst(){
        return first.next.data;
    }

    public String getLast(){
        return last.data;
    }
    static class Node {
        String data;      // То что хранится внутри - т.е. значение
        Node next;        // Ссылка на следующий узел
        public Node(String data, Node next){
            this.data = data;
            this.next = next;
        }
        @Override
        public String toString(){
            return data;
        }
    }

}
