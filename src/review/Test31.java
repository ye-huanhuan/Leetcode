package review;

import java.util.HashMap;
import java.util.Map;

/**
 * 5022. 长度为 K 的无重复字符子串
 */
public class Test31 {
    public static void main(String[] args) {
        Test31 t31 = new Test31();
        int res = t31.numKLenSubstrNoRepeats("havefunonleetcode", 5);
        System.out.println(res);
    }
    public int numKLenSubstrNoRepeats(String S, int K) {
        int res = 0;
        if(S.length() < K) return res;
        Map<Character, Integer> map = new HashMap<>();
        int first = 0;
        int seconed = K;
        for(int i=first; i<seconed; i++) {
            if(map.containsKey(S.charAt(i))) {
                map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
            } else {
                map.put(S.charAt(i), 1);
            }
        }
        if(map.size() == K) {
            res++;
        }
        while(seconed < S.length()) {
            if(map.get(S.charAt(first)) == 1) {
                map.remove(S.charAt(first));
            } else {
                map.put(S.charAt(first), map.get(S.charAt(first)) - 1);
            }
            if(map.containsKey(S.charAt(seconed))) {
                map.put(S.charAt(seconed), map.get(S.charAt(seconed)) + 1);
            } else {
                map.put(S.charAt(seconed), 1);
            }
            first++;
            seconed++;
            if(map.size() == K){
                res++;
            }
        }
        return res;
    }
}
