package com.codeforcause.batch;

public class ItsConfediantialHackerEarth {
    public static void main(String[] args) {
        String str = "bacd";
        decrypt(str);
    }

    private static String decrypt(String str) {
        int mid = (str.length() - 1)/2;

        if(mid > 0) {
            return str.charAt(mid) + decrypt(str.substring(0, mid)) + decrypt(str.substring(mid+1));
        } else if (mid < 0) {
                return "";
        } else {
            return str;
        }


    }


}
