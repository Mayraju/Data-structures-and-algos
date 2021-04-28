/* Complete the function checkSumTree given below
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

boolean checkSumTree(Node node) {
    //write your code here
    
    if(isSum(node) != 0)
    {
        return true;
    }
    return false;
}

public static long findSum(Node root)
{
   if(root == null)
   {
     return 0;
   }
   return (findSum(root.left) + root.value + findSum(root.right));
}


public static long isSum(Node node)
{
   long ls=0,rs=0;
   if(node == null || node.left == null || node.right == null)
   {
     return 1;
   }
   ls = findSum(node.left);
   rs = findSum(node.right);
   if(node.value == (ls + rs) && isSum(node.left) != 0 && isSum(node.right) != 0)
   {
     return 1;
   }
   return 0;
}
