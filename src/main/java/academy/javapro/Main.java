package academy.javapro;

public class Main {
    public static void main(String[] args) {
        //p1
        Tesla tesla = new Tesla("Model S", 2024);

        //p2
        System.out.println("Initial Status:");
        System.out.println(tesla.getMake() + " " + tesla.getModel() + " " + tesla.getYear());
        System.out.println("Running: " + tesla.isRunning());
        System.out.println("Autopilot: " + tesla.isAutopilotEnabled());
        System.out.println("Charging: " + tesla.isCharging());
       //p3
        System.out.println("\nTesting basic vehicle functions:");
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();
        //p4
        System.out.println("\nTesting autonomous features:");
        tesla.enableAutopilot();
        System.out.println("Autopilot is currently: " + (tesla.isAutopilotEnabled() ? "enabled" : "disabled"));
        tesla.disableAutopilot();

        //p5
        System.out.println("\nTesting electric features:");
        tesla.charge();
        System.out.println("Charging status: " + tesla.isCharging());

        // p6
        System.out.println("\nFinal car status:");
        tesla.stopEngine();
        System.out.println("Running: " + tesla.isRunning());
        System.out.println("Autopilot: " + tesla.isAutopilotEnabled());
        System.out.println("Charging: " + tesla.isCharging());
    }
}
