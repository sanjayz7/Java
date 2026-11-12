
class Solution {

    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return ans;
    }

    public String dfs(TreeNode root) {

        if (root == null) {
            return "#";
        }

        String left = dfs(root.left);
        String right = dfs(root.right);

        String key = root.val + "," + left + "," + right;

        map.put(key, map.getOrDefault(key, 0) + 1);

        if (map.get(key) == 2) {
            ans.add(root);
        }

        return key;
    }
}
