package utils;

import java.util.Random;

public class RandomGeneration {

    Random random = new Random();

    public void randomString(int LengthOfString) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String randomString = "";
        int length = LengthOfString;

        char[] text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }

        System.out.println(randomString);
    }


    public void randomBool() {
        boolean z = random.nextBoolean();
        System.out.println(z);
    }


    public Long getRandomNumber(int length) {
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        while (salt.length() < length) {
            int index = (int) (random.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        Long random = Long.valueOf(salt.toString());

        System.out.println(random);
        return random;
    }

    public void randomStringNumbers(int LengthOfString) {
        String characters = "1234567890";
        String randomString = "";
        int length = LengthOfString;

        char[] text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }

        System.out.println(randomString);
    }


}

