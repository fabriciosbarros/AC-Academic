package androidsrus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* This is NewLine Class. Contains the Methods to manipulate data from the New Line Androids */

public class NewLine extends Androids {

    public NewLine() {
    }

    public NewLine(int id, String model, String brain, String mobility, String vision, String arm, String mediaCenter, String powerPlant) {
        super(id, model, brain, mobility, vision, arm, mediaCenter, powerPlant);
    }

    //METHOD USED TO SHOW THE USER ALL THE MODELS AVAILABLE OF A PARTICULAR TYPE OF NEW ANDROIDS
    public void SeeModelsNew(String code, LinkedHashSet<NewLine> listOfNewLines) {
        Iterator<NewLine> it = listOfNewLines.iterator();
        switch(code) {
            case "Andy the Android":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ Andy the Android ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        NewLine nl = it.next();
                        if (nl.getModel().equals(code)) {
                            System.out.println(counter + "\t" + nl.toString());
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "Betty the Busibot":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ Betty the Busibot ] :\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        NewLine nl = it.next();
                        if (nl.getModel().equals(code)) {
                            System.out.println(counter + "\t" + nl.toString());
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "Bobi the Racedroid":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ Bobi the Racedroid ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        NewLine nl = it.next();
                        if (nl.getModel().equals(code)) {
                            System.out.println(counter + "\t" + nl.toString());
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "Fred the Friendlybot":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ Fred the Friendlybot ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        NewLine nl = it.next();
                        if (nl.getModel().equals(code)) {
                            System.out.println(counter + "\t" + nl.toString());
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
    
    //METHOD USED TO SHOW THE USER DETAIL OF A SPECIFIC ANDROID
    public void SearchSpecificAndroidNew(NewLine newLine) {
                
                System.out.println("\n\n============================================================");
                System.out.println("DETAILS ABOUT THE ANDROID SERIAL NUMBER: " + newLine.getId() + ":\n");
                System.out.println("Model: " + newLine.getModel());
                System.out.println("Serial number: " + newLine.getId());
                System.out.println("Brain: " + newLine.getBrain());
                System.out.println("Mobility: " + newLine.getMobility());
                System.out.println("Vision: " + newLine.getVision());
                System.out.println("Arm: " + newLine.getArm());
                System.out.println("Media Center: " + newLine.getMediaCenter());
                System.out.println("Power Plant: " + newLine.getPowerPlant());
                System.out.println("============================================================");
    
}
    //METHOD USED TO SHOW THE USER A SPECIFIC DONOR OF A SPECIFIC PART AND ALSO SHOWS THE NEW ANDROID TYPE AND ID THAT RECEIVED THAT SPECIFIC PART
    public void DonatorSearch(String part, NewLine newLine) {
        String oldSerial = "";
        String oldModel = "";
        String partDonated = "";
        if (part.equals("brain")) {
            int sSerial = newLine.getBrain().indexOf("serialNum");
            int sBegin = newLine.getBrain().indexOf("(M");
            oldSerial = newLine.getBrain().substring(sSerial + 12, sSerial + 19);
            oldModel = newLine.getBrain().substring(sBegin + 1, sBegin + 4);
            String brainType = newLine.getBrain().substring(0, sBegin);
            partDonated = "Brain [ " + brainType + " ]";
        }
        if (part.equals("mobility")) {
            int sSerial = newLine.getMobility().indexOf("serialNum");
            int sBegin = newLine.getMobility().indexOf("(M");
            oldSerial = newLine.getMobility().substring(sSerial + 12, sSerial + 19);
            oldModel = newLine.getMobility().substring(sBegin + 1, sBegin + 4);
            String mobilityType = newLine.getMobility().substring(0, sBegin);
            partDonated = "Mobility [ " + mobilityType + " ]";
        }
        if (part.equals("vision")) {
            int sSerial = newLine.getVision().indexOf("serialNum");
            int sBegin = newLine.getVision().indexOf("(M");
            oldSerial = newLine.getVision().substring(sSerial + 12, sSerial + 19);
            oldModel = newLine.getVision().substring(sBegin + 1, sBegin + 4);
            String visionType = newLine.getVision().substring(0, sBegin);
            partDonated = "Vision [ " + visionType + " ]";
        }
        if (part.equals("arm")) {
            int sSerial = newLine.getArm().indexOf("serialNum");
            int sBegin = newLine.getArm().indexOf("(M");
            oldSerial = newLine.getArm().substring(sSerial + 12, sSerial + 19);
            oldModel = newLine.getArm().substring(sBegin + 1, sBegin + 4);
            String armType = newLine.getArm().substring(0, sBegin);
            partDonated = "Arm [ " + armType + " ]";
        }
        if (part.equals("media")) {
            int sSerial = newLine.getMediaCenter().indexOf("serialNum");
            int sBegin = newLine.getMediaCenter().indexOf("(M");
            oldSerial = newLine.getMediaCenter().substring(sSerial + 12, sSerial + 19);
            oldModel = newLine.getMediaCenter().substring(sBegin + 1, sBegin + 4);
            String mediaType = newLine.getMediaCenter().substring(0, sBegin);
            partDonated = "Media Center [ " + mediaType + " ]";
        }
        if (part.equals("power")) {
            int sSerial = newLine.getPowerPlant().indexOf("serialNum");
            int sBegin = newLine.getPowerPlant().indexOf("(M");
            oldSerial = newLine.getPowerPlant().substring(sSerial + 12, sSerial + 19);
            oldModel = newLine.getPowerPlant().substring(sBegin + 1, sBegin + 4);
            String powerType = newLine.getPowerPlant().substring(0, sBegin);
            partDonated = "Power Plant [ " + powerType + " ]";
        }
        System.out.println("\n\n============================================================");
        System.out.println("Donor Model: " + oldModel);
        System.out.println("Donor Serial Number: " + oldSerial);
        System.out.println("Part Donated: " + partDonated);
        System.out.println("Receiving Model: " + newLine.getModel());
        System.out.println("Receiver Serial Number: " + newLine.getId());
    }

    //METHOD USED TO SHOW THE USER ALL THE MODELS AVAILABLE OF A PARTICULAR TYPE OF NEW ANDROIDS WITH AN ID TO EACH ONE SO THEY CAN PICK ONE TO SEE THE DETAILS
    public ArrayList<NewLine> SeeSpecificModelsNew(String model, LinkedHashSet<NewLine> listOfNewLines) {
        ArrayList<NewLine> tempNewList = new ArrayList();
        Iterator<NewLine> it = listOfNewLines.iterator();
        switch(model) {
            case "Andy the Android":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ Andy the Android ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        NewLine nl = it.next();
                        if (nl.getModel().equals(model)) {
                            System.out.println("ID: " + counter + "\t" + nl.ShowResult());
                            tempNewList.add(nl);
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "Betty the Busibot":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ Betty the Busibot ] :\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        NewLine nl = it.next();
                        if (nl.getModel().equals(model)) {
                            System.out.println("ID: " + counter + "\t" + nl.ShowResult());
                            tempNewList.add(nl);
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "Bobi the Racedroid":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ Bobi the Racedroid ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        NewLine nl = it.next();
                        if (nl.getModel().equals(model)) {
                            System.out.println("ID: " + counter + "\t" + nl.ShowResult());
                            tempNewList.add(nl);
                            counter++;
                        }
                    }
                    System.out.println("============================================================");
                    System.out.println("END OF THE LIST");
                    break;
                }
            case "Fred the Friendlybot":
                {
                    System.out.println("\n\n============================================================");
                    System.out.println("Showing all Androids of the model [ Fred the Friendlybot ]:\n");
                    int counter = 1;
                    while (it.hasNext()) {
                        NewLine nl = it.next();
                        if (nl.getModel().equals(model)) {
                            System.out.println("ID: " + counter + "\t" + nl.ShowResult());
                            tempNewList.add(nl);
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
        return tempNewList;
    }

    //METHOD USED TO PRINT TO THE USER A LIST OF OLD MODELS THAT WERE DONORS OF A PARTICULAR PART
    public void SeeDonors(String part, LinkedHashSet<NewLine> newLines) {
        Iterator<NewLine> it = newLines.iterator();
        if (part.equals("brain")) {
            int counter = 1;
            System.out.println("\n\n============================================================");
            System.out.println("Showing all Old Androids that donated Brain:\n");
            while (it.hasNext()) {
                NewLine nl = it.next();
                int sSerial = nl.getBrain().indexOf("serialNum");
                int sBegin = nl.getBrain().indexOf("(M");
                String oldSerial = nl.getBrain().substring(sSerial + 12, sSerial + 19);
                String oldModel = nl.getBrain().substring(sBegin + 1, sBegin + 4);
                System.out.println("ID :" + counter + "\t| Model: " + oldModel + "\t| Serial: " + oldSerial);
                counter++;
            }
        } else if (part.equals("mobility")) {
            int counter = 1;
            System.out.println("\n\n============================================================");
            System.out.println("Showing all Old Androids that donated Mobility:\n");
            while (it.hasNext()) {
                NewLine nl = it.next();
                int sSerial = nl.getMobility().indexOf("serialNum");
                int sBegin = nl.getMobility().indexOf("(M");
                String oldSerial = nl.getMobility().substring(sSerial + 12, sSerial + 19);
                String oldModel = nl.getMobility().substring(sBegin + 1, sBegin + 4);
                System.out.println("ID :" + counter + "\t| Model: " + oldModel + "\t| Serial: " + oldSerial);
                counter++;
            }
        } else if (part.equals("vision")) {
            int counter = 1;
            System.out.println("\n\n============================================================");
            System.out.println("Showing all Old Androids that donated Vision:\n");
            while (it.hasNext()) {
                NewLine nl = it.next();
                int sSerial = nl.getVision().indexOf("serialNum");
                int sBegin = nl.getVision().indexOf("(M");
                String oldSerial = nl.getVision().substring(sSerial + 12, sSerial + 19);
                String oldModel = nl.getVision().substring(sBegin + 1, sBegin + 4);
                System.out.println("ID :" + counter + "\t| Model: " + oldModel + "\t| Serial: " + oldSerial);
                counter++;
            }
        } else if (part.equals("arm")) {
            int counter = 1;
            System.out.println("\n\n============================================================");
            System.out.println("Showing all Old Androids that donated Arm:\n");
            while (it.hasNext()) {
                NewLine nl = it.next();
                int sSerial = nl.getArm().indexOf("serialNum");
                int sBegin = nl.getArm().indexOf("(M");
                String oldSerial = nl.getArm().substring(sSerial + 12, sSerial + 19);
                String oldModel = nl.getArm().substring(sBegin + 1, sBegin + 4);
                System.out.println("ID :" + counter + "\t| Model: " + oldModel + "\t| Serial: " + oldSerial);
                counter++;
            }
        } else if (part.equals("media")) {
            int counter = 1;
            System.out.println("\n\n============================================================");
            System.out.println("Showing all Old Androids that donated Media Center:\n");
            while (it.hasNext()) {
                NewLine nl = it.next();
                int sSerial = nl.getMediaCenter().indexOf("serialNum");
                int sBegin = nl.getMediaCenter().indexOf("(M");
                String oldSerial = nl.getMediaCenter().substring(sSerial + 12, sSerial + 19);
                String oldModel = nl.getMediaCenter().substring(sBegin + 1, sBegin + 4);
                System.out.println("ID :" + counter + "\t| Model: " + oldModel + "\t| Serial: " + oldSerial);
                counter++;
            }
        } else if (part.equals("power")) {
            int counter = 1;
            System.out.println("\n\n============================================================");
            System.out.println("Showing all Old Androids that donated Power Plant:\n");
            while (it.hasNext()) {
                NewLine nl = it.next();
                int sSerial = nl.getPowerPlant().indexOf("serialNum");
                int sBegin = nl.getPowerPlant().indexOf("(M");
                String oldSerial = nl.getPowerPlant().substring(sSerial + 12, sSerial + 19);
                String oldModel = nl.getPowerPlant().substring(sBegin + 1, sBegin + 4);
                System.out.println("ID :" + counter + "\t| Model: " + oldModel + "\t| Serial: " + oldSerial);
                counter++;
            }
        }
        System.out.println("============================================================");
        System.out.println("END OF THE LIST");
    }

    //METHOD TO PRINT FORMATTED COMPLETE INFORMATION ABOUT AN ANDROID AND OVERRIDE THE SUPERCLASS
    @Override
    public String toString() {
        return String.format("%-30s%1s%1s%-63s%-55s%-60s%-55s%1s", " | Model: " + super.getModel(), " | Serial number: " + super.getId(), " | Brain: " + super.getBrain(), " | Mobility: " + super.getMobility(), " | Vision: " + super.getVision(), " | Arm: " + super.getArm(), " | Media Center: " + super.getMediaCenter(), " | Power Plant: " + super.getPowerPlant());
    }

    //METHOD USED TO PRINT JUST THE MODEL AND SERIAL NUMBER OF THE ANDROID SO THE USER CAN PICK ONE TO SEE THE DETAILS
    public String ShowResult() {
        return "| Model: " + super.getModel() + "\t| Serial number: " + super.getId();
    }
}
