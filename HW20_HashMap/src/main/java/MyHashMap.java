import java.util.Arrays;

public class MyHashMap implements Map {
    int n;
    Node[] data;





    MyHashMap(int data){
        n = data;
        this.data = new Node[n];

    }


    @Override
    public void put(Object o, Object o2) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    /*@Override
    public boolean containsKey(Object o) {
        return false;
    }*/

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyHashMap myHashMap = (MyHashMap) o;

        if (n != myHashMap.n) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(data, myHashMap.data);
    }

    @Override
    public int hashCode() {
        int result = n;
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }


    /*
    Реализуем класс узла
     */
    public class Node{
        String key;
        String value;
        Node next;

        Node(String key, String value){
            this.key = key;
            this.value = value;
        }
        public  String getKey(){
            return key;
        }
        public void setValue(String value){
            this.value = value;
        }
        public String getValue(){
            return  value;
        }
        public Node getNext(){
            return  next;
        }
        public void setNext(Node data){
            next = data;
        }

        private void add(Node data){
            Node start = this;
            while (true){
                if(start.equals(data)){
                    start.setValue(data.getValue());
                }else if(start.getNext() == null){
                    start.setNext(data);
                }else{
                    start = start.getNext();
                }
            }
        }

        public void put(String key, String value){
            Node node = new Node(key, value);
            add(node);
        }
        @Override
        public boolean equals(Object obj){
            if(this == obj) return true;
            if(this == null) return  false;
            if(this.getClass() != obj.getClass()) return false;

            Node node = (Node) obj;
            return key.equals(((Node) obj).getKey());
        }
        public  String get(String key){
            Node start = this;
            while (true){
                if(start.getKey().equals(key)){
                   return start.getValue();
                }else if(start.getNext() == null){
                    return null;
                }else{
                    start = start.getNext();
                }
            }

        }
    }
}