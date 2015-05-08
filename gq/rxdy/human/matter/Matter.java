package gq.rxdy.human.matter;

/**
 * Created by Haze on 5/7/2015.
 */
public abstract class Matter {

    private String name;
    private float capacity, minimum, current;

    public Matter(String name) {
        this.name = name;
        this.capacity = 100;
        this.minimum = 0;
        this.current = 10;
    }

    public Matter(float current, String name, float capacity, float minimum) {
        this.current = current;
        this.name = name;
        this.capacity = capacity;
        this.minimum = minimum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getMinimum() {
        return minimum;
    }

    public void setMinimum(float minimum) {
        this.minimum = minimum;
    }

    public float getCurrent() {
        return current;
    }

    public void setCurrent(float current) {
        this.current = current;
    }
}
