package org.example.first;

public class JoinSentenceFromWordArray {
    public static void main(String[] args) {

        String[] string = {"hello", "my", "dear", "friend", "how", "are", "you"};

        System.out.println(smash(string));
        System.out.println(smashV2(string));
        System.out.println(smashV3(string));


    }
    public static String smashV3(String... words){
        return String.join(" ", words);
    }

    public static String smash(String... words){
        String res = "";
        for (int i = 0; i < words.length; i++) {
            if(i == words.length - 1){
                res += words[i];
            } else {
                res += words[i] + " ";
            }
        }
        return res;
    }

    public static String smashV2(String... words){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if(i == words.length - 1){
                res.append(words[i]);
            } else {
                res.append(words[i]).append(" ");
            }
        }
        return res.toString();
    }
}
