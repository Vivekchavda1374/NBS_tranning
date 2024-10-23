
class Node{

    
        int data;
        Node next;
    
    Node top;
    
   Node(int data){
    this.top = top;
    this.next = null;

   }

   public void push(int data){
    Node newNode = new Node(data);
    if(top==null)
    {
     top = newNode;
    }
    else
    {
     newNode.next = top;
     top = newNode;
    }
    System.out.println(data + " pushed to stack");
   }
   
   public int pop(){
    if(top==null)
    {
     System.out.println("Stack is empty");
     return -1;
    }
    else
    {
     int poppedData = top.data;
     top = top.next;
     return poppedData;
    }
}
}
class StackusingJava{


   public static void main(String[] args) {
       Node stack = new Node(10);
       stack.push(10);
       stack.push(12);
       stack.push(15);
       stack.pop();
       stack.push(14);
       

   }
}
