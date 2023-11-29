import java.util.*;
public class Organs{
    final private String name;
    private String medCond;
    static Scanner sc=new Scanner(System.in);
    public Organs(String name, String medCond) {
        this.medCond = medCond;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getMedCond() {
        return medCond;
    }

    
    public void setMedCond(String medCond) {
        this.medCond= medCond;
    }

    public void inputMedCond(){
        System.out.println("Insert medical condition:");
        this.medCond= sc.next();
    }

}
