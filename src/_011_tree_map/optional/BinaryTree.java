package _011_tree_map.optional;

public class BinaryTree {

        private int data;
        private BinaryTree left;
        private BinaryTree right;

        public BinaryTree(int num) {
            this.data = num;
            this.left = null;
            this.right = null;
        }

        public void addNode(int num) {
            if (num < this.data) {
                if (this.left != null) {
                    this.left.addNode(num);
                } else {
                    this.left = new BinaryTree(num);
                }

            } else {
                if (this.right != null) {
                    this.right.addNode(num);
                } else {
                    this.right = new BinaryTree(num);
                }
            }
        }
        // Visit the node first, then left and right sub-trees
        public void traversePreOrder() {
            System.out.println( this.data );
            if( this.left != null ) {
                this.left.traversePreOrder();
            }
            if( this.right != null ) {
                this.right.traversePreOrder();
            }
        }
        // Visit left sub-tree, then node and then, right sub-tree
        public void traverseInOrder() {
            if( this.left != null ) {
                this.left.traverseInOrder();
            }
            System.out.println( this.data );
            if( this.right != null ) {
                this.right.traverseInOrder();
            }
        }
        // Visit left sub-tree, then right sub-tree and then the node
        public void traversePostOrder() {
            if( this.left != null ) {
                this.left.traversePostOrder();
            }
            if( this.right != null ) {
                this.right.traversePostOrder();
            }
            System.out.println( this.data );
        }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree( 20 );
        int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        for(int i : nums ) {
            tree.addNode( i );
        }
        System.out.println("----------------PreOrder-------------");
        tree.traversePreOrder();
        System.out.println("----------------InOder-------------");
        tree.traverseInOrder();
        System.out.println("----------------PostOrder-------------");
        tree.traversePostOrder();
        tree.addNode(3);
        tree.traverseInOrder();
    }

}
