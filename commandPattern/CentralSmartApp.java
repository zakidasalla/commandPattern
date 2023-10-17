package commandPattern;
import java.util.*;

public class CentralSmartApp {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        printHeader();
        while(true){
            System.out.println("Select a device: ");
            System.out.println("1: Lights");
            System.out.println("2: Thermostat");
            System.out.println("3: TV");
            System.out.println("4: Exit");
            System.out.print("Enter your preferred Appliance: ");
            int userChoice = sc.nextInt();
            if(userChoice==4){
                printFooter();
                break;
            }
            switch(userChoice){
                case 1:
                    while(true){
                        System.out.println("Do you want the Lights... ");
                        System.out.println("1: On?");
                        System.out.println("2: Off");
                        System.out.println("3: Change to Warm Tone");
                        System.out.println("4: Change to Cool Tone");
                        System.out.println("0: Exit Appliance");
                        System.out.println("Enter command: ");
                        int userCommand = sc.nextInt();
                        if(userCommand==0){
                            System.out.println("Exiting appliance...\n Please pick new appliance.");
                            break;
                        }else{
                            applianceRemoteSet(userCommand,userChoice);
                        }
                        System.out.println();
                    }break;
                case 2:
                    while(true){
                        System.out.println("Do you want the Thermostat... ");
                        System.out.println("1: On?");
                        System.out.println("2: Off? ");
                        System.out.println("3: Increase Temperature?");
                        System.out.println("4: Decrease Temperature?");
                        System.out.println("5: Increase Fan Speed?");
                        System.out.println("6: Decrease Fan Speed?");
                        System.out.println("0: Exit Appliance");
                        System.out.print("Enter command: ");
                        int userCommand = sc.nextInt();
                        if(userCommand==0){
                            System.out.println("Exiting appliance...\n Please pick new appliance.");
                            break;
                        }else{
                            applianceRemoteSet(userCommand,userChoice);
                        }
                        System.out.println();
                    }break;
                case 3:
                    while(true){
                        System.out.println("Do you want the TV... ");
                        System.out.println("1: On?");
                        System.out.println("2: Off? ");
                        System.out.println("3: to Open Netflix?");
                        System.out.println("4: to Open Spotify? ");
                        System.out.println("5: to Open CNN?");
                        System.out.println("0: Exit Appliance");
                        System.out.print("Enter command: ");
                        int userCommand = sc.nextInt();
                        if(userCommand==0){
                            System.out.println("Exiting appliance...\n Please pick new appliance.");
                            break;
                        }else{
                            applianceRemoteSet(userCommand,userChoice);
                        }
                        System.out.println();
                    }break;
                default:
                    System.out.println("Invalid Choice. Please enter [0-4]");
            }
        }
    }
    private static void applianceRemoteSet(int userCommand,int userChoice){

        switch(userChoice){
            case 1:
                Lights light = new Lights();
                RemoteControl lightRemote = new RemoteControl();
                Command lightPowerOn = new LightsOn(light);
                Command lightPowerOff = new LightsOff(light);
                Command lightWarmTone = new LightsWarmTone(light);
                Command lightCoolTone = new LightsCoolTone(light);
                lightRemote.addButton(lightPowerOn);
                lightRemote.addButton(lightPowerOff);
                lightRemote.addButton(lightWarmTone);
                lightRemote.addButton(lightCoolTone);
                switch (userCommand){
                    case 1:
                        lightRemote.pressButton(0);
                        break;
                    case 2:
                        lightRemote.pressButton(1);
                        break;
                    case 3:
                        lightRemote.pressButton(2);
                        break;
                    case 4:
                        lightRemote.pressButton(3);
                        break;
                    default:
                        System.out.println("Invalid Input!");
                        break;
                }break;
            case 2:
                Thermostat thermo =new Thermostat();
                RemoteControl thermoRemote = new RemoteControl();
                Command thermoOn = new ThermoOn(thermo);
                Command thermoOff = new ThermoOff(thermo);
                Command thermoIncTemp = new ThermoIncTemp(thermo);
                Command thermoDecTemp = new ThermoDecTemp(thermo);
                Command thermoIncFan = new ThermoIncFan(thermo);
                Command thermoDecFan = new ThermoDecFan(thermo);
                thermoRemote.addButton(thermoOn);
                thermoRemote.addButton(thermoOff);
                thermoRemote.addButton(thermoIncTemp);
                thermoRemote.addButton(thermoDecTemp);
                thermoRemote.addButton(thermoIncFan);
                thermoRemote.addButton(thermoDecFan);
                switch(userCommand){
                    case 1:
                        thermoRemote.pressButton(0);
                        break;
                    case 2:
                        thermoRemote.pressButton(1);
                        break;
                    case 3:
                        thermoRemote.pressButton(2);
                        break;
                    case 4:
                        thermoRemote.pressButton(3);
                        break;
                    case 5:
                        thermoRemote.pressButton(4);
                        break;
                    case 6:
                        thermoRemote.pressButton(5);
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }break;
            case 3:
                TV tv = new TV();
                RemoteControl tvRemote = new RemoteControl();
                Command tvOn = new TVOn(tv);
                Command tvOff = new TVOff(tv);
                Command tvNetflix = new TVNetflix(tv);
                Command tvSpotify = new TVSpotify(tv);
                Command tvCNN = new TVCnn(tv);
                tvRemote.addButton(tvOn);
                tvRemote.addButton(tvOff);
                tvRemote.addButton(tvNetflix);
                tvRemote.addButton(tvSpotify);
                tvRemote.addButton(tvCNN);
                switch (userCommand){
                    case 1:
                        tvRemote.pressButton(0);
                        break;
                    case 2:
                        tvRemote.pressButton(1);
                        break;
                    case 3:
                        tvRemote.pressButton(2);
                        break;
                    case 4:
                        tvRemote.pressButton(3);
                        break;
                    case 5:
                        tvRemote.pressButton(4);
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }break;
        }
    }

    private static void printHeader() {
        System.out.println("[]--  Welcome to your Smart Home's Central Panel!!  --[]");
        System.out.println("[]--  Where all your Smart Devices are connected  --[]");
    }

    private static void printFooter() {
        System.out.println("\n[]---------Program Exit---------[]");
        System.out.println("[]--by Emmanuel Zaki Dasalla--[]");
        System.out.println("[]----------3-BSCS-2----------[]");
    }
}
