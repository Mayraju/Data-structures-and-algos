class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        if(node.left == null && node.right == null){
            a.add(-1);
            return a;
        }
        q.add(node);
        while(!q.isEmpty()){
            Node curr = q.remove();
            Boolean leftChild = false;
            Boolean rightChild = false;
            
            if(curr.left == null && curr.right == null){
                continue;
            }
            if(curr.left != null){
                leftChild = true;
                q.add(curr.left);
            }
            if(curr.right != null){
                rightChild = true;
                q.add(curr.right);
            }
            
            if(leftChild == false && rightChild == true){
                a.add(curr.right.data);
            }else if(leftChild == true && rightChild == false){
                a.add(curr.left.data);
            }
            
        }
        
        if(a.size() == 0){
            a.add(-1);
            return a;
        }
        
        Collections.sort(a);
        
        return a;
        
        
    }
}