/* Complete the function inOrderTraversal given below.
For your reference
class Node
{
    long value;
    Node left, right;
    public Node(long item)
    {
        value = item;
        left = right = null;
    }
}
*/

void inOrderTraversal(Node node) {
    
    //write your code here
    if(node == null)
    {
      return;
    }
    inOrderTraversal(node.left);
    System.out.print(node.value+" ");
    inOrderTraversal(node.right);
    
}
