import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    Random randMachine = new Random();

    public int[] getTenRolls() {
        int[] answer = new int[10];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = randMachine.nextInt(21);
        }
        return answer;
    }

    public String getRandomLetter() {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        return alphabet[randMachine.nextInt(26)];
        
    }

    public String generatePassword() {
        String password = "";
        for(int i = 1; i <= 8; i++){
            password = password.concat(getRandomLetter());
        }
        return password;
    }

    public String[] getNewPasswordSet(int length){
        String[] passwords = new String[length];
        for (int i = 0; i < passwords.length; i++){
            passwords[i] = generatePassword();
        }
        return passwords;
    }

    public void shuffleArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            int swapIndex = randMachine.nextInt(array.length);
            int temp = array[swapIndex];
            array[swapIndex] = array[i];
            array[i] = temp;
        }
        for (int value : array){
            System.out.println(value);
        }
    }
}