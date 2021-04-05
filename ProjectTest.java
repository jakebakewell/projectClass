class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("Panda Cuddle Cafe");
        Project project3 = new Project("New Website", "Will create a new, sleek website adjusted for client needs", 1200);
        project3.elevatorPitch();
    }
}