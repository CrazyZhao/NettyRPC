package com.zbl.nettyrpc.utils;

/**
 * Java中将一个字符与对应Ascii码互转
 * 1 byte = 8bit 可以表示 0-127
 */
public class GetCharASCII {

    /**
     * 对字符串数组进行排序
     * @param keys
     * @return
     * */
    public static String[] getUrlParam(String[] keys){

        for (int i = 0; i < keys.length - 1; i++) {
            for (int j = 0; j < keys.length - i -1; j++) {
                String pre = keys[j];
                String next = keys[j + 1];
                if(isMoreThan(pre, next)){
                    String temp = pre;
                    keys[j] = next;
                    keys[j+1] = temp;
                }
            }
        }
        return keys;
    }

    /**
     * 比较两个字符串的大小，按字母的ASCII码比较
     * @param pre
     * @param next
     * @return
     * */
    private static boolean isMoreThan(String pre, String next){
        if(null == pre || null == next || "".equals(pre) || "".equals(next)){
            return false;
        }

        char[] c_pre = pre.toCharArray();
        char[] c_next = next.toCharArray();

        int minSize = Math.min(c_pre.length, c_next.length);

        for (int i = 0; i < minSize; i++) {
            if((int)c_pre[i] > (int)c_next[i]){
                return true;
            }else if((int)c_pre[i] < (int)c_next[i]){
                return false;
            }
        }
        if(c_pre.length > c_next.length){
            return true;
        }

        return false;
    }


    public static void main(String[] args) {

        String[] keys = getUrlParam(new String[]{"aa","a丽3","程z","程柳","成丽2","陈air","陈鹏","陈静于","bb"});

        for (String key : keys) {
            System.out.println(key);
        }

    }
}
