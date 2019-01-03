package month_11.day19;

import java.util.ArrayList;
import java.util.List;

public class Test27 {
}


class Solution05 {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        postorde(root, res);
        res.add(root.val);
        return res;
    }

    public void postorde(Node root, List<Integer> res) {
        if(root.children == null) return;
        for(Node node : root.children) {
            postorde(node, res);
            res.add(node.val);
        }
    }
}