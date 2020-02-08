public  class Sweet implements  Candy, Comparable<Sweet>{
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

    public int compareTo(Sweet o) {
        if(this.weight >  o.weight)
            return 1;
        else
            return -1;
    }
}
