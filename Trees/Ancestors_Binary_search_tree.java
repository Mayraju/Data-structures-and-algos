public static void findComm(Node root,int v1,ArrayList<Node> a)
{
   if(root == null)
   {
      return;
   }
   if((root.value < v1) && (root.value != v1))
   {
     a.add(root);
     findComm(root.right,v1,a);
   }
   else if((root.value > v1) && (root.value != v1))
   {
      a.add(root);
      findComm(root.left,v1,a);
   }
   else
   {
       a.add(root);
       return;
   }
}
Node findLowestAncestor(Node node, int v1, int v2) {
    //write your code here
    Node root = node;
    Node root1 = node;
    
    ArrayList<Node> a1  = new ArrayList<Node>();
    ArrayList<Node> a2  = new ArrayList<Node>();
    findComm(root,v1,a1);
    findComm(root1,v2,a2);
    
    /*for(int i=0;i<a1.size();i++)
    {
      System.out.print(a1.get(i).value+" ");
    }
    System.out.println();
    for(int j=0;j<a2.size();j++)
    {
      System.out.print(a2.get(j).value+" ");
    }
    System.out.println();*/
     int i=0,j=0;
     Node a11 = null;
     Node a22 = null;
     while((i < a1.size()) && (j < a2.size()))
     {
          a11 = a1.get(i);
           a22 = a2.get(j);
          if(a11.value != a22.value)
          {
            a11 = a1.get(i-1);
             break;
          }
          i++;
          j++;
     }
     return a11;
    
}
