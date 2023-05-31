public class ScrabbleScore {
//    String ONE_POINT_SCORE = "AEIOULNRST";
//    String TWO_POINT_SCORE = "DG";
//    String THREE_POINT_SCORE = "BCMP";
//    String FOUR_POINT_SCORE = "FHVWY";
//    String FIVE_POINT_SCORE = "K";
//    String EIGHT_POINT_SCORE = "JX";
//    String TEN_POINT_SCORE = "QZ";

    final static String[] POINT_SCORE_LETTERS = {"AEIOULNRST", "DG", "BCMP", "FHVWY", "K", "JX", "QZ"};
    final static int[] POINT_SCORES = {1, 2, 3, 4, 5, 8, 10};

    public int getScrabbleScore (String word) {
        int wordScore = 0;
        for (char letter: word.toUpperCase().toCharArray()) {
            for (int i = 0; i < POINT_SCORES.length; i++) {
                if (POINT_SCORE_LETTERS[i].indexOf(letter) != -1)
                    wordScore += POINT_SCORES[i];
            }
        }

//        for (char letter: word.toUpperCase().toCharArray()) {
//            if (ONE_POINT_SCORE.indexOf(letter) != -1) {
//                wordScore++;
//            } else if (TWO_POINT_SCORE.indexOf(letter) != -1) {
//                wordScore += 2;
//            } else if (THREE_POINT_SCORE.indexOf(letter) != -1) {
//                wordScore += 3;
//            } else if (FOUR_POINT_SCORE.indexOf(letter) != -1) {
//                wordScore += 4;
//            } else if (FIVE_POINT_SCORE.indexOf(letter) != -1) {
//                wordScore += 5;
//            } else if (EIGHT_POINT_SCORE.indexOf(letter) != -1) {
//                wordScore += 8;
//            } else if (TEN_POINT_SCORE.indexOf(letter) != -1) {
//                wordScore += 10;
//            }
//        }
        return wordScore;
    }
}
