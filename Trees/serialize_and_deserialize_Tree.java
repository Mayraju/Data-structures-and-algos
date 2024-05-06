class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                a.add(-1);
            }else{
                a.add(curr.data);
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return a;
        
    }
    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
        // code here
        Node root = new Node(A.get(0));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(i < A.size()){
             int nodeValue = A.get(i);
             i++;
             if(nodeValue == -1){
                 curr.left = null;
             }else{
                 curr.left = new Node(nodeValue);
                 q.add(curr.left);
             }
             int nodeValue2= A.get(i);
             i++;
             if(nodeValue2 == -1){
                 curr.right = null;
             }else{
                 curr.right = new Node(nodeValue2);
                 q.add(curr.right);
             }
            }
        }
        
        return root;
    }
};


