
public class Student {
    private String name;
    private int grade;
    private boolean LearnedEnough;
    private int AssignmentsDone;


    public Student(String name, int grade, boolean learnedEnough, int doAssignment) {
        this.name = name;
        this.grade = grade;
        LearnedEnough = learnedEnough;
        this.AssignmentsDone = AssignmentsDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isLearnedEnough() {
        return LearnedEnough;
    }

    public void setLearnedEnough(boolean learnedEnough) {
        LearnedEnough = learnedEnough;
    }

    public int AssignmentsDone() {
        return AssignmentsDone;
    }

    public void setAssignmentsDone(int assignmentsDone) {
        this.AssignmentsDone = assignmentsDone;
    }

    void promoteToChef() {
        System.out.println("Yay, I'm promoted to Check at Keith's Restaurant!");
    }

    void TakeNotes() {
        System.out.println(this.name + "takes his notes to prepare for his culinary class.");
    }

    void DoAssignment() {
        System.out.println();
    }
}