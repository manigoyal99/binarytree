public class BinarySearchTree {
class Node
{
int data;
Node left,right;

public Node(int data)
{
this.data=data;
left=right=null;
}
}
Node root; 
    BinarySearchTree() {  
        root = null;  
    } 
    
    void insert(int data)
    { 
     
    
    }
    void inorder()
    {
        
    }
   public void preorder()
    {
    
    }
   public void postorder()
    {
    
    }
    public static void main(String args[])
    {
    BinarySearchTree b=new BinarySearchTree();
    b.insert(60); 
        b.insert(20); 
        b.insert(10); 
        b.insert(40); 
        b.insert(70); 
        b.insert(60); 
        b.insert(80);
        b.inorder();
        b.preorder();
        b.postorder();
        
    }

}