class Project {
    private String name;
    private String description;
    private int initialCost;
    public Project() {}
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description, int initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setInitialCost(int num) {
        this.initialCost = num;
    }
    public int getInitialCost() {
        return this.initialCost;
    }
    public void elevatorPitch() {
        System.out.println(this.name + " ($" + this.initialCost + "): " + this.description);
}
}