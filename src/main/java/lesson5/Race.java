package lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    public static volatile boolean winnerCar = true;
    private ArrayList<Stage> stages;
    public ArrayList<Stage> getStages() { return stages; }
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}
