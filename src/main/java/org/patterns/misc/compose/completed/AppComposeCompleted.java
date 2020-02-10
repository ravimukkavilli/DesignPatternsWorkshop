package org.patterns.misc.compose.completed;

public class AppComposeCompleted {

    public static void main(String[] args) {
        System.out.println(getSumOfTopTwoScoringStudents());
    }

    // SLAP your methods
    private static int getSumOfTopTwoScoringStudents() {
        //load the score of all the students from a file;
        loadScores();
        // sort the scores in descending order
        sortScores();
        // pick the top 2 or n
        getTopScores();
        // sum the numbers
        addScores();
        // return the sum

        return 0;
    }

    private static void addScores() {
        // iterate and add the scores
    }

    private static void getTopScores() {
        // pick top scores and return;
    }

    private static void sortScores() {
        // code to sort the scores
    }

    private static void loadScores() {
       // code to read the file and load the data
    }


}
