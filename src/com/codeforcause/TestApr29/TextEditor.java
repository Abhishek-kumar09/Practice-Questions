package com.codeforcause.TestApr29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bf.readLine());
        StringBuilder S = new StringBuilder();
        String ps = "";
        List<StringBuilder> undo = new ArrayList<>();
        undo.add(new StringBuilder());

        while(q-- > 0) {
            String query = bf.readLine();
            int type = Integer.parseInt(query.split(" ")[0]);
            switch (type) {
                case 1:
                    S.append(query.split(" ")[1]);
                    undo.add(S);
                    break;
                case 2:
                    S = new StringBuilder(S.toString()
                            .substring(0, S.length() - Integer.parseInt(query.split(" ")[1])));
                    undo.add(S);
                    break;
                case 3:
                    System.out.println(S.charAt(Integer.parseInt(query.split(" ")[1]) - 1));
                    break;
                case 4:
                    undo.remove(undo.size() - 1);
                    S = new StringBuilder(undo.get(undo.size() - 1));
            }
        }
    }
}
