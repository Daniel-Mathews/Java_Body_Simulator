public class Heart extends Organs {
    private int heartRate;
    private boolean alive_status=true;

    public Heart(String name, String medCond) {
        super(name, medCond);
    }

    public void internalOptions(){
        int choice;
        System.out.println("1. Input heart rate\n2. Check heart status\n3. Revive");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();

        switch (choice) {
            case 1:
                inputHeartRate();
                break;

            case 2:
                System.out.println("Current Heart Rate: "+getHeartRate());
                System.out.println(isAliveStatus());
                break;

            case 3:
                if(heartRate==0){
                    setHeartRate(85);
                    alive_status=true;
                    System.out.println("User has been revived! Heart rate: "+getHeartRate());
                }
                else{
                    System.out.println("User is still alive! Cannot be revived");
                }
                break;
        
            default:
                System.out.println("Invalid input!");
                break;
        }
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void inputHeartRate(){
        System.out.println("Input the heart rate: ");
        this.heartRate= sc.nextInt();

        if(heartRate==0){
            alive_status=false;
        }
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;

        if(heartRate==0){
            alive_status=false;
        }
    }

    public String isAliveStatus() {
        if(alive_status==true)
            return "The user is alive";
        else
            return "The user is dead";
    }
}