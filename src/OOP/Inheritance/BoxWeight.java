package OOP.Inheritance;

public class BoxWeight extends Box{
    private int weight;

    public BoxWeight() {
    }

    public BoxWeight(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int vellimi() {
        return super.vellimi();
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
