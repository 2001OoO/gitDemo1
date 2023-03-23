import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class 罗马数字转整数 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = solution.romanToInt2("XXX");
        System.out.println(num);
    }
}

class Solution {
//    第一种解法
    public int romanToInt(String s) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>() {
            {
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
            }
        };

        int ans = 0;
        int l = s.length();
        char k;
        int v;
        for(int i=0;i<l;i++){
            v = hashMap.get(String.valueOf(s.charAt(i)));
            if(i<l-1 && v < hashMap.get(String.valueOf(s.charAt(i+1)))){
                ans-=v;
            }else {
                ans+=v;
            }
        }
        return ans;
    }

//    第二种解法
    public int romanToInt2(String s){
        s = s.replace("IV","a");
        s = s.replace("IX","b");
        s = s.replace("XL","c");
        s = s.replace("XC","d");
        s = s.replace("CD","e");
        s = s.replace("CM","f");
        int ans = 0;
        for(int i=0;i<s.length();i++){
            ans+=which(s.charAt(i));
        }
        return ans;
    }

    private int which(char a){
        switch (a){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            case 'a': return 4;
            case 'b': return 9;
            case 'c': return 40;
            case 'd': return 90;
            case 'e': return 400;
            case 'f': return 900;
        }
        return 0;
    }

}
