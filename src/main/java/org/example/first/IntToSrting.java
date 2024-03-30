package org.example.first;

public class IntToSrting {
    public static void main(String[] args) {

        System.out.println(expandedForm(120251503));

    }

    public static String expandedForm(int num){

        String text = String.valueOf(num);
        char[] arr = text.toCharArray();
        String out = "";

        for (int i = 0; i < text.length(); i++) {
            if (i == text.length() - 1){
                if (arr[i - 1] == '0'){
                    out = out.concat(String.valueOf(arr[i]));
                    for (int j = 0; j < text.length() - 1 - i; j++) {
                        out = out.concat("0");
                    }
                } else {
                    out = out.concat(" + " + arr[i]);
                    for (int j = 0; j < text.length() - 1 - i; j++) {
                        out = out.concat("0");
                    }
                }
            } else if (arr[i] != '0'){

                out = out.concat(String.valueOf(arr[i]));
                for (int j = 0; j < text.length() - 1 - i; j++) {
                    out = out.concat("0");
                }
                if(getIndex(arr, i) > 0 && i < arr.length - 2) {
                    out = out.concat(" + ");
                }

                if(getIndex(arr, i) == 0) {
                    out = out.concat(" + ");
                }
            }
        }
        return out;
    }

    public static int getIndex(char[] arr, int x){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == x){
                return i;
            }
        }
        return 1;
    }
}
