public class teacher extends people{
    private float salare ;
    static int co = 0;

    public teacher(int id, String fName, String lName, float salare) {
        super(id, fName, lName);
        this.salare = salare;
    }

    public float getSalare() {
        return salare;
    }

    public void setSalare(float salare) {
        this.salare = salare;
    }
}
