package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character < 'A' || character > 'z') {
            System.out.println("wrong alphabet!");
        } else if (character == 'A' || character == 'a' ||
                character == 'E' || character == 'e' ||
                character == 'U' || character == 'u' ||
                character == 'I' || character == 'i' ||
                character == 'O' || character == 'o') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
