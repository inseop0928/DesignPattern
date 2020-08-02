package pattern.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
    private List<Integer> scores = new ArrayList<Integer>();

    public void addScore(int score){
        scores.add(score);

        notifyObserves();
    }

    public List<Integer> getScores(){
        return scores;
    }
}
