public class Chocolate implements Candy, Comparable<Chocolate> {

    private double weight;
    private String name;

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight() {

        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Chocolate o) {

        if(this.weight >  o.weight)
            return 1;
        else
            return -1;
    }
}
