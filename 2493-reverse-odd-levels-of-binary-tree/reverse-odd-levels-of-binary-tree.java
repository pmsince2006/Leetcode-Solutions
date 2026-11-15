class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {

        if (root == null) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            ArrayList<TreeNode> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                list.add(curr);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            if (level % 2 != 0) {

                int left = 0;
                int right = list.size() - 1;

                while (left < right) {

                    int temp = list.get(left).val;

                    list.get(left).val = list.get(right).val;

                    list.get(right).val = temp;

                    left++;
                    right--;
                }
            }

            level++;
        }

        return root;
    }
}