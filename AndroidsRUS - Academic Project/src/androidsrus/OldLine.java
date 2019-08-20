package androidsrus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;


/* This is OldLine Class. Contains the Methods to manipulate data from the Old Line Androids */
public class OldLine extends Androids {

    public OldLine() {
    }

    public OldLine(int id, String name, String brain, String mobility, String vision, String arm, String mediaCenter, String powerPlant) {
        super(id, name, brain, mobility, vision, arm, mediaCenter, powerPlant);
    }

    //METHOD USED TO SHOW THE USER ALL THE MODELS AVAILABLE OF A PARTICULAR TYPE OF OLD ANDROIDS
    public void SeeModelsOld(String code, LinkedHashSet<OldLine> listOfOldLines) {
        Iterator<OldLine> it = listOfOldLines.iterator();
        switch(code) {
            case "MK1":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ MK1 ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        OldLine ol = it.next();
                        if (ol.getModel().equals(code)) {
                            System.out.println(counter + "\t" + ol.toString());
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "MK2":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ MK2 ] :\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        OldLine ol = it.next();
                        if (ol.getModel().equals(code)) {
                            System.out.println(counter + "\t" + ol.toString());
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "MK3":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ MK3 ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        OldLine ol = it.next();
                        if (ol.getModel().equals(code)) {
                            System.out.println(counter + "\t" + ol.toString());
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "MK4":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ MK4 ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        OldLine ol = it.next();
                        if (ol.getModel().equals(code)) {
                            System.out.println(counter + "\t" + ol.toString());
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "MK5":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ MK5 ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        OldLine ol = it.next();
                        if (ol.getModel().equals(code)) {
                            System.out.println(counter + "\t" + ol.toString());
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            default:
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("ERROR MESSAGE: No models were found.");
                    break;
                }
        }
    }

    //METHOD USED TO SHOW THE USER ALL THE MODELS AVAILABLE OF A PARTICULAR TYPE OF OLD ANDROIDS WITH AN ID TO EACH ONE SO THEY CAN PICK ONE TO SEE THE DETAILS
    public ArrayList<OldLine> SeeSpecificModelsOld(String model, LinkedHashSet<OldLine> listOfOldLines) {
        ArrayList<OldLine> tempOldList = new ArrayList();
        Iterator<OldLine> it = listOfOldLines.iterator();
        switch(model) {
            case "MK1":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ MK1 ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        OldLine ol = it.next();
                        if (ol.getModel().equals(model)) {
                            System.out.println("ID: " + counter + "\t" + ol.ShowResult());
                            tempOldList.add(ol);
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "MK2":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ MK2 ] :\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        OldLine ol = it.next();
                        if (ol.getModel().equals(model)) {
                            System.out.println("ID: " + counter + "\t" + ol.ShowResult());
                            tempOldList.add(ol);
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "MK3":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ MK3 ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        OldLine ol = it.next();
                        if (ol.getModel().equals(model)) {
                            System.out.println("ID: " + counter + "\t" + ol.ShowResult());
                            tempOldList.add(ol);
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "MK4":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ MK4 ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        OldLine ol = it.next();
                        if (ol.getModel().equals(model)) {
                            System.out.println("ID: " + counter + "\t" + ol.ShowResult());
                            tempOldList.add(ol);
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "MK5":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ MK5 ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        OldLine ol = it.next();
                        if (ol.getModel().equals(model)) {
                            System.out.println("ID: " + counter + "\t" + ol.ShowResult());
                            tempOldList.add(ol);
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            default:
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("ERROR MESSAGE: No models were found.");
                    break;
                }
        }
        return tempOldList;
    }

    //METHOD USED TO SHOW THE USER DETAIL OF A SPECIFIC ANDROID
    public void SearchSpecificAndroidOld(OldLine oldLine) {

        
                System.out.println("\n\n============================================================");
                System.out.println("DETAILS ABOUT THE ANDROID SERIAL NUMBER: " + oldLine.getId() + ":\n");
                System.out.println("Model: " + oldLine.getModel());
                System.out.println("Serial number: " + oldLine.getId());
                System.out.println("Brain: " + oldLine.getBrain());
                System.out.println("Mobility: " + oldLine.getMobility());
                System.out.println("Vision: " + oldLine.getVision());
                System.out.println("Arm: " + oldLine.getArm());
                System.out.println("Media Center: " + oldLine.getMediaCenter());
                System.out.println("Power Plant: " + oldLine.getPowerPlant());
                System.out.println("============================================================");
            }

    //METHOD TO PRINT FORMATTED COMPLETE INFORMATION ABOUT AN ANDROID AND OVERRIDE THE SUPERCLASS
    @Override
    public String toString() {
        return String.format("%1s%1s%1s%-31s%-22s%-28s%-25s%1s", " | Model: " + super.getModel(), " | Serial number: " + super.getId(), " | Brain: " + super.getBrain(), " | Mobility: " + super.getMobility(), " |Vision: " + super.getVision(), " | Arm: " + super.getArm(), " | Media Center: " + super.getMediaCenter(), " | Power Plant: " + super.getPowerPlant());
    }

    //METHOD USED TO PRINT JUST THE MODEL AND SERIAL NUMBER OF THE ANDROID SO THE USER CAN PICK ONE TO SEE THE DETAILS
    public String ShowResult() {
        return "| Model: " + super.getModel() + "\t| Serial number: " + super.getId();
    }
}
