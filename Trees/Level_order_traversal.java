/* Complete the function levelOrderTraversal given below.
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

void levelOrderTraversal(Node node) {

    //write your code here
    Queue<Node> q = new LinkedList<Node>();
    q.add(node);
    while(!(q.isEmpty()))
    {
        Node curr = q.peek();
        q.poll();
        System.out.print(curr.value+" ");
        if(curr.left != null)
        {
            q.add(curr.left);
        }
        if(curr.right != null)
        {
           q.add(curr.right);
        }
    }
    
}
