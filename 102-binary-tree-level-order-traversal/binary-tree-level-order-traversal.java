import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result; 
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int levelSize = queue.size(); 
            List<Integer> currentLevelList = new ArrayList<>();


            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                

                currentLevelList.add(current.val); 

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            result.add(currentLevelList); 
        }

        return result;
    }
}



/*class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            List<Integer> currentLevel = new ArrayList<>();

            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {

                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }
}*/