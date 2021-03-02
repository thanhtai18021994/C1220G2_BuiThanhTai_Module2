package _011_tree_map.practice.pracetice1;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

public class Test_BTS {
    public static <nums> void main(String[] args) {
        BinaryTree tree = new BinaryTree() {
            @Override
            public Kind getKind() {
                return null;
            }

            @Override
            public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
                return null;
            }

            @Override
            public ExpressionTree getLeftOperand() {
                return null;
            }

            @Override
            public ExpressionTree getRightOperand() {
                return null;
            }

            int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};

        };
    }
}
