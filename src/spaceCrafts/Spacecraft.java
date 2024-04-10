package spaceCrafts;
import java.util.ArrayList;
import java.util.List;

public class Spacecraft {

    //•	name: String
    //•	missionType: String
    //•	target: String
    //•	objective: String
    //•	weight: int
    private String name;
    private String missionType;
    private String target;
    private String objective;
    private int weight;

    public Spacecraft(String name, String missionType, String target, String objective, int weight) {
        this.name = name;
        this.missionType = missionType;
        this.target = target;
        this.objective = objective;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMissionType() {
        return missionType;
    }

//    public void setMissionType(String missionType) {
//        this.missionType = missionType;
//    }
//
//    public String getTarget() {
//        return target;
//    }
//
//    public void setTarget(String target) {
//        this.target = target;
//    }
//
//    public String getObjective() {
//        return objective;
//    }
//
//    public void setObjective(String objective) {
//        this.objective = objective;
//    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Override the toString() method in the following format:
    //The mission of {name} was to reach {target} and to {objective}
    @Override
    public String toString() {
        return "The mission of " + name + " was to reach " + target + " and to " + objective;
    }
}
