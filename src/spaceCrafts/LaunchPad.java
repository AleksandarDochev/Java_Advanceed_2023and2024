package spaceCrafts;
import java.util.ArrayList;
import java.util.List;

public class LaunchPad {
    private String name;
    private int capacity;
    private List<Spacecraft> spacecrafts;

    //The class constructor should receive name and capacity. Also, it should initialise
    // the spacecrafts with a new collection instance.
    public LaunchPad(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.spacecrafts = new ArrayList<>();
    }

    public void addSpacecraft(Spacecraft spacecraft) {
        if (spacecrafts.size() < capacity) {
            spacecrafts.add(spacecraft);
        } else {
            System.out.println("This launchpad is at full capacity!");
        }
    }

    public boolean removeSpacecraft(String name) {
        for (Spacecraft spacecraft : spacecrafts) {
            if (spacecraft.getName().equals(name)) {
                spacecrafts.remove(spacecraft);
                return true;
            }
        }
        return false;
    }

    public String getHeaviestSpacecraft() {
        Spacecraft heaviest = null;
        for (Spacecraft spacecraft : spacecrafts) {
            if (heaviest == null || spacecraft.getWeight() > heaviest.getWeight()) {
                heaviest = spacecraft;
            }
        }
        if (heaviest != null) {
            return heaviest.getName() + " - " + heaviest.getWeight() + "kg.";
        }
        return "";
    }

    public Spacecraft getSpacecraft(String name) {
        for (Spacecraft spacecraft : spacecrafts) {
            if (spacecraft.getName().equals(name)) {
                return spacecraft;
            }
        }
        return null;
    }

    public int getCount() {
        return spacecrafts.size();
    }

    public List<Spacecraft> getSpacecraftsByMissionType(String missionType) {
        List<Spacecraft> filtered = new ArrayList<>();
        for (Spacecraft spacecraft : spacecrafts) {
            if (spacecraft.getMissionType().equals(missionType)) {
                filtered.add(spacecraft);
            }
        }
        if (filtered.isEmpty()) {
            System.out.println("There are no spacecrafts to respond to this criteria.");
        }
        return filtered;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("Spacecrafts launched from ").append(name).append(":\n");
        if (spacecrafts.isEmpty()) {
            sb.append("none");
        } else {
            int count = 1;
            for (Spacecraft spacecraft : spacecrafts) {
                sb.append(count).append(". ").append(spacecraft.getName()).append("\n");
                count++;
            }
        }
        return sb.toString();
    }
}
