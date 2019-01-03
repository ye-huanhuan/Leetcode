package month_10.day15;

import java.util.ArrayList;
import java.util.List;

public class Test13 {
    public static void main(String[] args) {
        String s = "25525511135";
        Solution02 s2 = new Solution02();
        List<String> ips = s2.restoreIpAddresses(s);
        for(String ip:ips) {
            System.out.println(ip);
        }
    }
}

/**
 * 恢复IP地址
 */
class Solution02 {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        getIp(s, 0, result, "");
        return result;
    }

    public void getIp(String s, int position, List<String> result, String tmpIp) {
        if(position == 3) {
            if(s.length() == 0 || "".equals(s) || s.length() > 3) return;
            if(s.length() > 1 && s.charAt(0) == '0') return;
            if(Integer.valueOf(s) <= 255 && Integer.valueOf(s) >= 0 ) {
                result.add(tmpIp + s);
                return;
            }
            return;
        } else {
            if(s.length() >= 1) {
                getIp(s.substring(1), position + 1, result, tmpIp + s.substring(0,1) + ".");
            }
            if(s.length() >= 2) {
                if(s.charAt(0) == '0') return;
                getIp(s.substring(2), position + 1, result, tmpIp + s.substring(0, 2) + ".");
            }
            if(s.length() >= 3) {
                if(s.charAt(0) == '0') return;
                if(Integer.valueOf(s.substring(0, 3)) <= 255) {
                    getIp(s.substring(3), position + 1, result, tmpIp + s.substring(0, 3) + ".");
                } else {
                    return;
                }
            }
        }
    }
}
