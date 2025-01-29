package com.sakshi.learning0122;

public class CharacterUnicodeEx {

    public static void main(String[] args) {

        // international std of representing char to symbles,
        //remains same for all platforms & languages
        char unicodeChar1 = 458;
        System.out.println("Character:: "+ unicodeChar1);

        char unicodeChar2 = '\u03A9';
        System.out.println("Character:: "+ unicodeChar2);

        char unicodeChar3 = '\u2764';
        System.out.println("Characters::"+ unicodeChar3);

        String smileEmoji = "\uD83D\uDE0A"; // 😊
        String fireEmoji = "\uD83D\uDD25"; // 🔥
        String thumbsUpEmoji = "\uD83D\uDC4D"; // 👍

        System.out.println("Smiling Face Emoji: " + smileEmoji);
        System.out.println("Fire Emoji: " + fireEmoji);
        System.out.println("Thumbs Up Emoji: " + thumbsUpEmoji);

    }
}
