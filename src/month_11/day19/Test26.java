package month_11.day19;

import java.util.List;

public class Test26 {
}

/**
 * 559. N叉树的最大深度
 */
class Solution04 {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int res = 0;
        if(root.children == null) return 1;
        List<Node> childrens = root.children;
        int max = 0;
        for(Node node : childrens) {
            int tmp = maxDepth(node);
            if(tmp >= max) {
                max = tmp;
            }
        }
        res = 1 + max;
        return res;
    }
}