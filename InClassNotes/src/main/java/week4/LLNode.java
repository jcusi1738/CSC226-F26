package week4;

public class LLNode<T> {
    T info;
    LLNode<T> next;

    public LLNode(T info){
        //constructor for our Node
        this.info=info;
        this.next=null;
    }
    public void setNext(){
        //Setter for the node object
        this.next=next;
    }
    public LLNode<T> getNext(){
       //get the next node in the chain
       this.next=next;
       return next; //placeholder 
    }
    public void setInfo(){
        //set the nodes info
        this.info= info();
    }
    public T getInfo(){
        //get the nodes info
        return info;//placeholder
    }
}