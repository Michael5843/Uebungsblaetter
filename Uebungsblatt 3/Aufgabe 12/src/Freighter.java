import java.util.ArrayList;

public class Freighter {
    public final double maxWeight;
    public ArrayList<FreightContainer> containers;

    public Freighter(double maxWeight) {
        this.maxWeight = maxWeight;
        containers = new ArrayList<>();
    }

    public boolean addContainer(FreightContainer container) {
        if (calculateContainerWeight() > maxWeight) {
            return false;
        } else {
            containers.add(container);
            return true;
        }
    }
    public void removeContainer(FreightContainer container) {containers.remove(container);}
    public void removeContainer(int index)  { containers.remove(index);}
    public double calculateContainerWeight() {
        double weight = 0;
        for (FreightContainer container : containers) {
            weight += container.getLoadWeight();
        }
        return weight;
    }

}
