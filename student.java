public class student extends people {

    private String Educational_level;
    static int counter = 0;

    public student(int id, String fName, String lName, String Educational_level) {
        super(id, fName, lName);
        this.Educational_level = Educational_level;
    }

    public String getEducational_level() {
        return Educational_level;
    }

    public void setEducational_level(String educational_level) {
        Educational_level = educational_level;
    }

}





