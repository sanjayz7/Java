
class Solution {

    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return ans;
    }

    
    public String  dfs(TreeNode node){
        if(node==null){
            return "%";
        }
        String left=dfs(node.left);
        String right=dfs(node.right);

        String key=node.val+","+left+","+right;
        map.put(key,map.getOrDefault(key,0)+1);

        if(map.get(key)==2){
            ans.add(node);
        }
        return key;

    }
}
