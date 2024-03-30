package org.example.first;

public class DNAReplaceMany {
    public static void main(String[] args) {

        System.out.println(makeComplement("GTAT"));

    }

    public static String makeComplement(String dna) {

        StringBuilder output = new StringBuilder();

        for(int i = 0; i < dna.length(); i++) {
            switch (String.valueOf(dna.charAt(i))) {
                case "A" -> output.append("T");
                case "T" -> output.append("A");
                case "G" -> output.append("C");
                case "C" -> output.append("G");
            }
        }
        return String.valueOf(output);

    }
}
