package org.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizGame extends Game{
    private final int numMaxQuiz = 10;
    private final HashMap<String, String> hashMap;
    private Scanner scanner = new Scanner(System.in);

    public QuizGame(String name, HashMap<String, String> hashMap){
        super(1, name);
        this.hashMap = hashMap;
        start();
        end();
    }

    private void start(){
        try
        {
            for(int i=0; i<numMaxQuiz;i++){
                Map.Entry<String, String> entry = (Map.Entry<String, String>) HashMapUtils.randomKeyValuePair(hashMap);
                if(checkAnswer(entry.getValue(), getQuestion(i, entry.getKey())))
                    calculateScore();
            }
        }catch (Exception e){
            Print.printConsole(e.getMessage());
        }
    }

    private void end(){
        ArrayList<String> results = new ArrayList<String>();
        ArrayList<Player> players = getPlayers();
        for(Player player :players){
            String result = "User '" + player.getName() + "' final score: " + getScore() + "/" + numMaxQuiz;
            results.add(result);
            Print.printConsole(result);
        }

        FileUtils.writeFileToResources("results.txt", results);
    }

    private String getQuestion(int questionNumber, String question){
        questionNumber = questionNumber+1;
        String questionNumberFormatted = questionNumber + "-";
        Print.printConsole(questionNumberFormatted + "What is the capital of '" + question + "'?");
        return scanner.nextLine();
    }

    private boolean checkAnswer(String correctAnswer, String userAnswer) {
        return correctAnswer.equals(userAnswer);
    }

    public int getNumMaxQuiz() {
        return numMaxQuiz;
    }

    private void calculateScore() {
        setScore(getScore()+1);
    }
}
