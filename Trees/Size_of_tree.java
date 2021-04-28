/*
Complete the function calculateSize given below.
For your reference:

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

int calculateSize(Node node) {
    //write your code here
    if(node == null)
    {
      return 0;
    }
    
    return 1 + calculateSize(node.left)+calculateSize(node.right);
}
