/* Complete the function calculateHeight given below
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

int calculateHeight(Node node) {
    //write your code here
    
    if(node == null)
    {
      return 0;
    }
    int left = 1 + calculateHeight(node.left);
    int right = 1+ calculateHeight(node.right);
    return ((left > right) ? left : right);
}
