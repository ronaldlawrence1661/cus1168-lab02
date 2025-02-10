package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

  //p1
    public Tesla(String model, int year) {
        super("Tesla", model, year); 
        this.autopilotEnabled = false; 
        this.charging = false; 
    //p2
    @Override
    public void charge() {
        if (!charging) {
            charging = true;
            System.out.println(make + " " + model + " is now charging");
        } else {
            System.out.println(make + " " + model + " is already charging");
        }
    }
    @Override
    public boolean isCharging() {
        return charging;
    }
    @Override
    public void enableAutopilot() {
        if (!autopilotEnabled) {
            autopilotEnabled = true;
            System.out.println("Autopilot enabled");
        } else {
            System.out.println("Autopilot is already enabled");
        }
    }
    @Override
    public void disableAutopilot() {
        if (autopilotEnabled) {
            autopilotEnabled = false;
            System.out.println("Autopilot disabled");
        } else {
            System.out.println("Autopilot is already disabled");
        }
    }
    @Override
    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }
    }
