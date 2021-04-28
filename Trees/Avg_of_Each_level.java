/*
Complete the function findAverageLevel given below.
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

void findAverageLevel(Node node) {
    //write your code here
    Queue<Node> q = new LinkedList<Node>();
    q.add(node);
    long a = -2;
    Node temp = new Node(a);
    long sum = 0;
    long count = 0;
    while(!(q.isEmpty()))
    {
        
      int size = q.size();
      q.add(temp);
      for(int i=0;i<size;i++)
      {
        Node curr = q.peek();
        q.remove();
        sum = sum + curr.value;
        count = count + 1;
        if(curr.left != null)
        {
          q.add(curr.left);
        }
        if(curr.right != null)
        {
          q.add(curr.right);
        }
      }
      Node val = q.peek();
      if(val.value == -2)
        {
           float l = (float)sum/count;
           String strDouble = String.format("%.2f", l);
           System.out.print(strDouble+" ");
           sum = 0;
           count=0;
           q.poll();
        }
      
    }
}
