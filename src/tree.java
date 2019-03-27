public class tree<K, V> {

    protected Node root;
    protected Node parent;
    protected Node grandParent;
    protected Node greatGrandParent;
    protected Node current;

    protected class Node implements EntryNode<K, V> {
        protected Node parent;
        protected Node left;
        protected Node right;
        protected char color;
        protected int key; //endpoint number
        protected int p; //summation
        protected int leftEnd; // leftmost endpoint in the subtree rooted at v.
        protected int rightEnd; // rightmost endpoint in the subtree rooted at v.

        public Node(int aKey) {
            key = aKey;
            p = 0;
            parent = null;
            left = null;
            right = null;
            color = 'r';
        }

        @Override
        public EntryNode<K, V> parent() {
            return parent;
        }

        @Override
        public EntryNode<K, V> left() {
            return left;
        }

        @Override
        public EntryNode<K, V> right() {
            return right;
        }

        @Override
        public int key() {
            return key;
        }

        @Override
        public int value() {
            return p;
        }

        public char color() {
            return color;
        }
    }

    public tree(){
        this.root = new Node(0);
    }


    private void sum(Node n){
        if (n.left != null){
            n.p = inOrderTrav(n.left);
        }
        else {
            n.p = 0;
        }
    }
    private int inOrderTrav(Node n){
        if (n.left == null){
            return n.key();
        } else {
            return inOrderTrav(n.left) + n.value() + inOrderTrav(n.right);
        }
    }

}
