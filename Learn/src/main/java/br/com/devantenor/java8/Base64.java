package br.com.devantenor.java8;

public class Base64 {
    public static void tests() {
        System.out.println("The secret sentence:");
        String secretSentence = "I`m testing the java base64 encodding";
        System.out.println(secretSentence);

        java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();
        System.out.println("\nEncoded secret sentence:");
        String encodedSecretWord = encoder.encodeToString(secretSentence.getBytes());
        System.out.println(encodedSecretWord);

        System.out.println("\nDecoded secret sentence:");
        byte[] decodedSecretWord = java.util.Base64.getDecoder().decode(encodedSecretWord);
        System.out.println(new String(decodedSecretWord));
    }
}