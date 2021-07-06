package geek.leetcode.week03;

public class InorderPostorder {
    private int[] postorder;
    private int[] inorder;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        this.inorder = inorder;
        return build(0,postorder.length - 1, 0, inorder.length - 1);

    }
    private TreeNode build(int l1, int r1, int l2, int r2) {
        if (l1 > r1) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[r1]);
        int mid = l2;
        while (inorder[mid] != postorder[r1]){
            mid++;
        }
        root.left = build(l1, l1 + mid - l2 - 1, l2, mid - 1);
        root.right = build(l1 + mid - l2 , r1-1, mid + 1, r2);
        return root;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
}
