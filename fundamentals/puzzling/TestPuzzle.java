public class TestPuzzle {

    public static void main(String[] args){
        PuzzleJava appTest = new PuzzleJava();

        // TEN ROLES TEST
        System.out.println("-------Ten Rolls Test-------"); 
        int[] roles = appTest.getTenRolls();
        for (int role : roles) {
            System.out.println(role);
        }
        
        //GET RANDOM LETTER TEST
        System.out.println("-------Get Random Letter Test-------");
        System.out.println(appTest.getRandomLetter());
        
        //GENERATE PASSWORD TEST
        System.out.println("-------Generate Password Test-------");
        System.out.println(appTest.generatePassword());

        //GET PASSWORD SET TEST
        System.out.println("-------Get Password Set Test-------");
        String[] passwords = appTest.getNewPasswordSet(5);
        for (String password : passwords) {
            System.out.println(password);
        }

        //SHUFFLE ARRAY TEST
        System.out.println("-------Shuffle Array Test-------");
        int[] testInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        appTest.shuffleArray(testInts);
        
        
    }
}