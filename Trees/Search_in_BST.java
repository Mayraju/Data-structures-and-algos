/* Complete the function searchInBST given below
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

Node searchInBST(Node node, int key) {
    //write your code here
    if((node != null) && (node.value == key))
    {
      return node;
    }
    else if((node != null) && ( node.value > key))
    {
        return searchInBST(node.left,key);
       
    }
    else if((node != null) && (node.value < key))
    {
       return searchInBST(node.right,key);
    }
    return null;
}
