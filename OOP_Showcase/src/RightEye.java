public class RightEye extends Organs{
    private String color= "Not inputted";
    private boolean eyeOpenStatus = false;

    public RightEye(String name, String medCond) {
        super(name, medCond);
        
    }

    public void internalOptions(){
        int choice;
        System.out.println("1. Close Eye\n2. Open Eye\n3. Input Eye Color\n4. Check eye status");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();

        switch (choice) {
            case 1:
                setEyeOpenStatus(false);
                break;
            case 2:
                setEyeOpenStatus(true);
                break;
            case 3:
                inputColor();
                break;
            case 4:
                System.out.println("The right eye -> Colour: "+getColor()+"\n"+isEyeOpenStatus());
                break;
        
            default:
            System.out.println("Invalid Input");
                break;
        }
    }

    public String getColor() {
        return color;
    }

    public void inputColor() {
        System.out.println("Input eye color: ");
        this.color= sc.next();
    }

    public String isEyeOpenStatus() {
        if(eyeOpenStatus==true)
            return "The eye is open.";
        else
            return "The eye is closed.";
    }

    public void setEyeOpenStatus(boolean eyeOpenStatus) {
        this.eyeOpenStatus = eyeOpenStatus;
    }   
    
    
}
    
