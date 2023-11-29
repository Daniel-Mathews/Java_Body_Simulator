import java.util.HashMap;
import java.util.Scanner;

public interface AppInterface {
    public void mainmenu();
    public void accessmenu();
    public void adduser();
    public void rmuser();
    public void printusers();
}

class healthRecords implements AppInterface {
    HashMap<String, Person> users= new HashMap<String, Person>();
    String id;

    static Scanner sc= new Scanner(System.in);

    public void mainmenu() {
        try{
            int choice;
            System.out.println("=========================================================================");
            System.out.println("Welcome to the Body Function Simulator (OOPS Showcase)!");
            while (true) {
                System.out.println("=========================================================================");
                System.out.println("1. Add user\n2. Remove User\n3. Access Menu\n4. Print users\n5. Quit Application");
                choice= sc.nextInt();

                switch(choice){
                    case 1: adduser();
                            break;
                    case 2: rmuser();
                            break;
                    case 3: accessmenu();
                            break;
                    case 4: printusers();
                            break;
                    case 5: System.out.println("Thanks for checking out this application!");
                            System.exit(0);
                            break;
                    default: System.out.println("Invalid Input!");
                }
            }
        }
        catch(Exception InputMismatchException){
            System.out.println("Invalid input! Input a number only! (Example: '1')");
        }

    }

    public void adduser() {
        System.out.println("New user creation process has begun. ");
        System.out.println("Enter new user ID <UID>) :");
        id= sc.next();

        Person objPerson= new Person("", 0, 0, 0.0);
        objPerson.setName();
        objPerson.setAge();
        objPerson.setHeight();
        objPerson.setWeight();

        users.put(id, objPerson);

        if(users.get(id)!= null){
            System.out.println("User with "+id+" successfully added!");
        }
    }

    public void rmuser() {
        System.out.println("Enter the ID of the person to be removed: ");
        id=sc.next();
        if(users.get(id)!= null){
            users.remove(id);
            System.out.println("User with "+id+" successfully removed!");
        }
    }

    public void accessmenu(){
        printusers();
        System.out.println("Enter ID of user to be accessed: ");
        id= sc.next();
        Person userobj= users.get(id);
        int choice=0;
        while(true) {
            System.out.println("=========================================================================");
            System.out.println("Choose an organ: ");
            System.out.println("1. Left Eye \n2. Right Eye \n3. Heart \n4. Quit");
            System.out.println("=========================================================================");
            choice= sc.nextInt();
            switch(choice){
                case 1: System.out.println(userobj.leftEye.getName());
                        userobj.leftEye.internalOptions();
                        break;
                case 2: System.out.println(userobj.rightEye.getName());
                        userobj.rightEye.internalOptions();
                        break;
                case 3: System.out.println(userobj.heart.getName());
                        userobj.heart.internalOptions();
                        break;
                case 4: return;
                default: System.out.println("Invalid Input!");
            }
        }

    }

    public void printusers(){
        System.out.println("ID\t\tNAME");
        for(String i: users.keySet()){
            System.out.println(i+"\t\t"+(users.get(i)).getName());
        }
    }

}