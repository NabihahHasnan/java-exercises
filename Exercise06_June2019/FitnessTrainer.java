package Exercise06_June2019;

import java.security.acl.Group;

/*-----------------------------------------------
|               June 2019 – CSC435              |
|                       Part B                  |
|                      Question 3               |
------------------------------------------------*/
public class FitnessTrainer {
    protected String name;
    protected int experience;
    protected boolean certified; //true - has certification, false - no certification
    protected double basicSalary;

    // Normal constructor
    // Accessors
    //toString()
}

public class PersonalTrainer extends FitnessTrainer {

    private String workplace; // gym or home
    private int hoursWork;    // daily hours

    // Normal constructor
    // Accessors
    // toString method
    public double calculateIncentive();
}

public class GroupTrainer extends FitnessTrainer {

    private String workSchedule; // weekday or weekend
    private String activity;    // yoga, zumba, aerobics

    // Normal constructor
    public PersonalTrainer(String name, int experience, boolean certified, double basicSalary, String workplace, int hoursWork) {
    // Accessors
    // toString method
}

// a) Write program fragments for the following tasks
// i) A normal constructor for PersonalTrainer and GroupTrainer.
    public PersonalTrainer(String name, int experience, boolean certified, double basicSalary, String workplace, int hoursWork) {
        super(name, experience, certified, basicSalary);// Initialize inherited attributes
        this.workplace = workplace;
        this.hoursWork = hoursWork;
    }

    public GroupTrainer(String name, int experience, boolean certified, double basicSalary, String workSchedule, String activity) {
        super(name, experience, certified, basicSalary);
        this.workSchedule = workSchedule;
        this.activity = activity;
    }

// ii) A processor method calculateIncentive() for PersonalTrainer:
// If daily working hours > 8, incentive = RM50 for each additional hour.
// Otherwise, incentive = RM0.
    public double calculateIncentive(){
        if (hoursWork > 8){
            return (hoursWork - 8) * 50.0;
        } else {
            return 0.0;
        }
    }

// b) Write a main application to perform the following tasks:
// Declare an array personal to store 20 PersonalTrainer objects and another array group to store 20 GroupTrainer objects.
    public static void main(String[] args) {
        PersonalTrainer[] personal = new PersonalTrainer[20];
        GroupTrainer[] group = new GroupTrainer[20];
    }
// Calculate and display the incentive earned by each personal trainer whose workplace is gym.
    public static void displayGymPersonalTrainerIncentives(PersonalTrainer[] personal) {
        for (int i = 0; i < personal.length; i++) {
            if (personal[i].getWorkplace().equalsIgnoreCase("gym")) {
                double incentive = personal[i].calculateIncentive();
                System.out.println("Personal Trainer: " + personal[i].getName() + ", Incentive: RM" + incentive);
            }
        }
    }
// Display all activities conducted during weekend by the group trainers.
    public static void displayWeekendGroupTrainerActivities(GroupTrainer[] group) {
        for (int i = 0; i < group.length; i++){
            if (group[i].getActivity().equalsIgnoreCase("weekend")){
                System.out.println("Group Trainer: " + group[i].getName() + ", Activity: " + group[i].getActivity());
            }
        }












        for (int i = 0; i < group.length; i++) {
            if (group[i].getWorkSchedule().equalsIgnoreCase("weekend")) {
                System.out.println("Group Trainer: " + group[i].getName() + ", Activity: " + group[i].getActivity());
            }
        }
    }
