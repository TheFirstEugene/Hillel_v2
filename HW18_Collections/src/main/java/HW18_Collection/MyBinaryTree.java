package HW18_Collection;

public class MyBinaryTree<T extends Comparable<T>> implements Tree<T> {
    private Node<T> root;


    private Node<T> getSuccessor(Node<T> delNode) {
        Node<T> successorParent = delNode;
        Node<T> successor = delNode;
        Node<T> current = delNode.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public class Node<T>{

        T iData;
        Node<T> leftChild;
        Node<T> rightChild;
        Node(T value){
            this.iData = value;
        }

    }


    @Override
    public void add(T data) {
        Node<T> node  = new Node<>(data);
        if(root == null){
            root = node;
        }else {
            Node<T> current = root;
            Node<T> parent;
            while (true){
                parent = current;
                if(data.compareTo(current.iData) < 0){
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = node;
                        return;
                    }

                }else{
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }
    @Override
    public void delete(T data) {
        Node<T> current = root;
        Node<T> parent = root;
        boolean isLeftChild = true;
        while (current.iData != data){
            parent = current;
            if(data.compareTo(current.iData) < 0){
                isLeftChild = true;
                current = current.leftChild;
            }else{
                isLeftChild = false;
                current = current.rightChild;
            }if (current == null){
                return;
            }
        }
        if (current.leftChild==null && current.rightChild == null){
            if(current == root) {
            root = null;
            }else if(isLeftChild){
                parent.leftChild = null;
            }else{
                parent.rightChild = null;
            }
        }
        else if(current.rightChild==null){
            if(current == root){
                root = current.leftChild;
            }else if(isLeftChild){
                parent.leftChild = current.leftChild;
            }else{
                parent.rightChild = current.leftChild;
            }
        }
        else if(current.leftChild == null){
            if(current == root){
                root = current.rightChild;
            }else if(isLeftChild){
                parent.leftChild = current.rightChild;
            }else {
                parent.rightChild = current.rightChild;
            }
        }
     else {
        Node<T> successor = getSuccessor(current);
        if (current == root) {
            root = successor;
        } else if (isLeftChild) {
            parent.leftChild = successor;
        } else {
            parent.rightChild = successor;
        }
    }
        return;
}
    public Node<T> find(T data){
        Node<T> current = root;
        while (current.iData != data){
            if(data.compareTo(current.iData)<0){
                current = current.leftChild;
            }else {
                current = current.rightChild;
            }if(current==null){
                return null;
            }
        }
        return current;
    }
    private String inOrder(Node<T> root) {
       if(root!=null){                                     // исправить данный кусок!
           inOrder(root.leftChild);
           System.out.println(root.iData + " ");
           inOrder(root.rightChild);
       }
        return  null;
    }


    @Override
    public T get(T data) {
        if (find(data) != null) {
            return find(data).iData;
        }
        return null;
    }


    /*
    Если будет свободное время реализовать обходы, пока оставляем!
     */
   /* @Override
    public void printDfs() {

    }

    @Override
    public void printBfs() {

    }*/

    @Override
    public String toString() {
        return inOrder(this.root);
    }
}
