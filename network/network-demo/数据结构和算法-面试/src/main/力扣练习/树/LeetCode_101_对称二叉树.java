package main.力扣练习.树;


import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/symmetric-tree/
 * <p>
 * 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 *  
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 *  
 * <p>
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 *  
 * <p>
 * 进阶：
 * <p>
 * 你可以运用递归和迭代两种方法解决这个问题吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/symmetric-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author meijunjie
 */
public class LeetCode_101_对称二叉树 {


    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }

        return dfs(root.left,root.right);
    }

    private static boolean dfs(TreeNode left, TreeNode right){

        // 左右节点都是null  返回true
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }

        if(left.val != right.val){
            return false;
        }

        return dfs(left.left,right.right) && dfs(left.right,right.left);
    }



    public static boolean isSymmetricV2(TreeNode root){
        if(root == null || (root.left == null && root.right == null)){
            return true;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.push(root.left);
        queue.push(root.right);

        while (!queue.isEmpty()){
            TreeNode left = queue.pop();
            TreeNode right = queue.pop();

            if(left == null && right == null){
                continue;
            }

            // 左右子节点
            if(left == null || right == null){
                return false;
            }

            if(left.val != right.val){
                return false;
            }

            queue.push(left.left);
            queue.push(right.right);

            queue.push(left.right);
            queue.push(right.left);
        }


        return true;
    }
}
