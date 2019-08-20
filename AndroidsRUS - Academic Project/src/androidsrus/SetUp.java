package androidsrus;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* This is SetUp Class. Contains the Methods used to create Old and New Androids and also calculates the total amount of Androids (Old an New) */

public class SetUp {

    private final int initialRangeOld = 1000000;

    private final int finalRangeOld = 1999999;

    private final int initialRangeNew = 2000000;

    private final int finalRangeNew = 2999999;

    private String modelAA = null;

    private String modelBB = null;

    private String modelBR = null;

    private String modelFF = null;

    private Random rd = new Random();

    public SetUp() {
    }

    //METHOD TO CREATE OLD LINES ANDROIDS
    public LinkedHashSet<OldLine> OldFileCreation(String fileName, int productionOld) throws IOException {
        LinkedHashSet<OldLine> oldLines = new LinkedHashSet();
        FileInputStream fs = new FileInputStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(fs));
        Set<Integer> idNumbersOld = new TreeSet();
        
        while (idNumbersOld.size() < productionOld) {
            int rID = rd.nextInt((finalRangeOld - initialRangeOld) + 1) + initialRangeOld;
            idNumbersOld.add(rID);
        }
        String line = br.readLine();
        String[] models = line.split(",");
        line = br.readLine();
        String[] brains = line.split(",");
        line = br.readLine();
        String[] mobilities = line.split(",");
        line = br.readLine();
        String[] visions = line.split(",");
        line = br.readLine();
        String[] arms = line.split(",");
        line = br.readLine();
        String[] mediaCenters = line.split(",");
        line = br.readLine();
        String[] powerPlants = line.split(",");
        Iterator itId = idNumbersOld.iterator();
        while (itId.hasNext()) {
            int rModel = rd.nextInt(models.length);
            int rBrain = rd.nextInt(brains.length);
            int rMobility = rd.nextInt(mobilities.length);
            int rVision = rd.nextInt(visions.length);
            int rArm = rd.nextInt(arms.length);
            int rMedia = rd.nextInt(mediaCenters.length);
            int rPower = rd.nextInt(powerPlants.length);
            int newId = Integer.parseInt(itId.next().toString());
            String newModel = models[rModel];
            String newBrain = brains[rBrain];
            String newMobility = mobilities[rMobility];
            String newVision = visions[rVision];
            String newArm = arms[rArm];
            String newMedia = mediaCenters[rMedia];
            String newPower = powerPlants[rPower];
            OldLine tempOld = new OldLine(newId, newModel, newBrain, newMobility, newVision, newArm, newMedia, newPower);
            oldLines.add(tempOld);
        }
        return oldLines;
    }

    //METHOD TO CREATE NEW LINES ANDROIDS
    public LinkedHashSet<NewLine> NewFileCreation(String fileName, int productionNew, LinkedHashSet<OldLine> listOldLine) throws IOException {
        LinkedHashSet<NewLine> newLines = new LinkedHashSet();
        FileInputStream fs = new FileInputStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(fs));
        Set<Integer> idNumbersNew = new TreeSet();
        ArrayList<OldLine> oldLines = new ArrayList(listOldLine);
        
        String line = br.readLine();
        String[] models = line.split(",");
        this.setModelAA(models[0]);
        this.setModelBB(models[1]);
        this.setModelBR(models[2]);
        this.setModelFF(models[3]);
        while (idNumbersNew.size() < productionNew) {
            int rID = rd.nextInt((finalRangeNew - initialRangeNew) + 1) + initialRangeNew;
            idNumbersNew.add(rID);
        }
        Iterator itNew = idNumbersNew.iterator();
        while (itNew.hasNext()) {
            int rModel = rd.nextInt(models.length);
            String newModel = models[rModel];
            int newID = Integer.parseInt(itNew.next().toString());
            String newBrain = "";
            String newMobility = "";
            String newVision = "";
            String newArm = "";
            String newMedia = "";
            String newPower = "";
            int rOld = 0;
            boolean robotAvailable = false;
            boolean maxRobot = true;
            boolean brainAvailable = false;
            boolean mobilityAvailable = false;
            boolean visionAvailable = false;
            boolean armAvailable = false;
            boolean mediaAvailable = false;
            boolean powerAvailable = false;
            
            //BRAIN ASSIGNMENT
            while (!brainAvailable) {
                rOld = rd.nextInt(oldLines.size());
                robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                while (robotAvailable == false) {
                    oldLines.remove(oldLines.get(rOld));
                    rOld = rd.nextInt(oldLines.size());
                    robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                }
                brainAvailable = CheckPart("brain", oldLines.get(rOld));
            }
            newBrain = oldLines.get(rOld).getBrain() + " (" + oldLines.get(rOld).getModel() + " : serialNum : " + oldLines.get(rOld).getId() + ")";
            oldLines.get(rOld).setBrain("REMOVED");
            
            //MOBILITY ASSIGNMENT
            while (!mobilityAvailable) {
                rOld = rd.nextInt(oldLines.size());
                robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                while (robotAvailable == false) {
                    oldLines.remove(oldLines.get(rOld));
                    rOld = rd.nextInt(oldLines.size());
                    robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                }
                //maxRobot = CheckMaxRobot(newBrain, newMobility, newVision, newArm, newMedia, newPower, oldLines.get(rOld));
                mobilityAvailable = CheckPart("mobility", oldLines.get(rOld));
            }
            newMobility = oldLines.get(rOld).getMobility() + " (" + oldLines.get(rOld).getModel() + " : serialNum : " + oldLines.get(rOld).getId() + ")";
            oldLines.get(rOld).setMobility("REMOVED");
           
            
            //VISION ASSIGNMENT
            while (maxRobot || !visionAvailable) {
                rOld = rd.nextInt(oldLines.size());
                robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                while (robotAvailable == false) {
                    oldLines.remove(oldLines.get(rOld));
                    rOld = rd.nextInt(oldLines.size());
                    robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                }
                maxRobot = CheckMaxRobot(newBrain, newMobility, newVision, newArm, newMedia, newPower, oldLines.get(rOld));
                visionAvailable = CheckPart("vision", oldLines.get(rOld));
            }
            newVision = oldLines.get(rOld).getVision() + " (" + oldLines.get(rOld).getModel() + " : serialNum : " + oldLines.get(rOld).getId() + ")";
            oldLines.get(rOld).setVision("REMOVED");
            maxRobot = true;
            
            //ARM ASSIGNMENT
            while (maxRobot || !armAvailable) {
                rOld = rd.nextInt(oldLines.size());
                robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                while (robotAvailable == false) {
                    oldLines.remove(oldLines.get(rOld));
                    rOld = rd.nextInt(oldLines.size());
                    robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                }
                maxRobot = CheckMaxRobot(newBrain, newMobility, newVision, newArm, newMedia, newPower, oldLines.get(rOld));
                armAvailable = CheckPart("arm", oldLines.get(rOld));
            }
            newArm = oldLines.get(rOld).getArm() + " (" + oldLines.get(rOld).getModel() + " : serialNum : " + oldLines.get(rOld).getId() + ")";
            oldLines.get(rOld).setArm("REMOVED");
            maxRobot = true;
            
            //MEDIA CENTER ASSIGNMENT
            while (maxRobot || !mediaAvailable) {
                rOld = rd.nextInt(oldLines.size());
                robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                while (robotAvailable == false) {
                    oldLines.remove(oldLines.get(rOld));
                    rOld = rd.nextInt(oldLines.size());
                    robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                }
                maxRobot = CheckMaxRobot(newBrain, newMobility, newVision, newArm, newMedia, newPower, oldLines.get(rOld));
                mediaAvailable = CheckPart("media", oldLines.get(rOld));
            }
            newMedia = oldLines.get(rOld).getMediaCenter() + " (" + oldLines.get(rOld).getModel() + " : serialNum : " + oldLines.get(rOld).getId() + ")";
            oldLines.get(rOld).setMediaCenter("REMOVED");
            maxRobot = true;
            
            //POWER PLANT ASSIGNMENT
            while (maxRobot || !powerAvailable) {
                rOld = rd.nextInt(oldLines.size());
                robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                while (robotAvailable == false) {
                    oldLines.remove(oldLines.get(rOld));
                    rOld = rd.nextInt(oldLines.size());
                    robotAvailable = CheckUnitAvailability(oldLines.get(rOld));
                }
                maxRobot = CheckMaxRobot(newBrain, newMobility, newVision, newArm, newMedia, newPower, oldLines.get(rOld));
                powerAvailable = CheckPart("power", oldLines.get(rOld));
            }
            newPower = oldLines.get(rOld).getPowerPlant() + " (" + oldLines.get(rOld).getModel() + " : serialNum : " + oldLines.get(rOld).getId() + ")";
            oldLines.get(rOld).setPowerPlant("REMOVED");
            NewLine tempNew = new NewLine(newID, newModel, newBrain, newMobility, newVision, newArm, newMedia, newPower);
            newLines.add(tempNew);
        }
        return newLines;
    }

    //METHOD TO CHEC IF A GIVEN OLD ANDROID HAS ALL ITS PARTS REMOVED
    public boolean CheckUnitAvailability(OldLine oldRobot) {
        boolean result = true;
        if (oldRobot.getBrain().equals("REMOVED") && oldRobot.getMobility().equals("REMOVED") && oldRobot.getVision().equals("REMOVED") && oldRobot.getArm().equals("REMOVED") && oldRobot.getMediaCenter().equals("REMOVED") && oldRobot.getPowerPlant().equals("REMOVED")) {
            result = false;
        }
        return result;
    }

    //METHOD TO CHECK IF A GIVEN OLD ANDROID WAS ALREADY USED TWICE TO BUILD THE SAME NEW
    public boolean CheckMaxRobot(String brain, String mobility, String vision, String arm, String media, String power, OldLine tempOld) {
        boolean result = true;
        int tempOldAv = 0;
        String id = Integer.toString(tempOld.getId());
        if (brain.contains(id)) {
            tempOldAv++;
        }
        if (mobility.contains(id)) {
            tempOldAv++;
        }
        if (vision.contains(id)) {
            tempOldAv++;
        }
        if (arm.contains(id)) {
            tempOldAv++;
        }
        if (media.contains(id)) {
            tempOldAv++;
        }
        if (power.contains(id)) {
            tempOldAv++;
        }
        if (tempOldAv < 2) {
            result = false;
        }
        return result;
    }

    //METHOD TO CHECK IF THE PART OF THE NEW ANDROID THAT'S BEING CREATED EXISTS IN THE OLD ROBOT RANDOMLY CHOSEN
    public boolean CheckPart(String part, OldLine oldLine) {
        boolean result = false;
        if (part.equals("brain")) {
            if (!oldLine.getBrain().equals("REMOVED")) {
                result = true;
            }
        }
        if (part.equals("mobility")) {
            if (!oldLine.getMobility().equals("REMOVED")) {
                result = true;
            }
        }
        if (part.equals("vision")) {
            if (!oldLine.getVision().equals("REMOVED")) {
                result = true;
            }
        }
        if (part.equals("arm")) {
            if (!oldLine.getArm().equals("REMOVED")) {
                result = true;
            }
        }
        if (part.equals("media")) {
            if (!oldLine.getMediaCenter().equals("REMOVED")) {
                result = true;
            }
        }
        if (part.equals("power")) {
            if (!oldLine.getPowerPlant().equals("REMOVED")) {
                result = true;
            }
        }
        return result;
    }

    //METHOD TO SHOW TO THE USER THE NUMBER OF ANDROIDS (OLD AND NEW) AVAILABLE
    public void TotalCounts(LinkedHashSet<NewLine> listNewLine, LinkedHashSet<OldLine> listOldLine) {
        int mk1 = 0;
        int mk2 = 0;
        int mk3 = 0;
        int mk4 = 0;
        int mk5 = 0;
        int aa = 0;
        int bb = 0;
        int br = 0;
        int ff = 0;
        Iterator<OldLine> itOld = listOldLine.iterator();
        Iterator<NewLine> itNew = listNewLine.iterator();
        while (itOld.hasNext()) {
            OldLine ol = itOld.next();
            String model = ol.getModel();
            switch(model) {
                case "MK1":
                    {
                        mk1++;
                        break;
                    }
                case "MK2":
                    {
                        mk2++;
                        break;
                    }
                case "MK3":
                    {
                        mk3++;
                        break;
                    }
                case "MK4":
                    {
                        mk4++;
                        break;
                    }
                case "MK5":
                    {
                        mk5++;
                        break;
                    }
                default:
                    {
                        break;
                    }
            }
        }
        while (itNew.hasNext()) {
            NewLine nl = itNew.next();
            String model = nl.getModel();
            switch(model) {
                case "Andy the Android":
                    {
                        aa++;
                        break;
                    }
                case "Betty the Busibot":
                    {
                        bb++;
                        break;
                    }
                case "Bobi the Racedroid":
                    {
                        br++;
                        break;
                    }
                case "Fred the Friendlybot":
                    {
                        ff++;
                        break;
                    }
                default:
                    {
                        break;
                    }
            }
        }
        int totalOld = mk1 + mk2 + mk3 + mk4 + mk5;
        int totalNew = aa + bb + br + ff;
        System.out.println("\n\n============================================================");
        System.out.println("TOTAL COUNTS FOR EACH ANDROID:\n");
        System.out.println("============================================================");
        System.out.println("\nOLD LINES:");
        System.out.println("MK1: " + mk1);
        System.out.println("MK2: " + mk2);
        System.out.println("MK3: " + mk3);
        System.out.println("MK4: " + mk4);
        System.out.println("MK5: " + mk1);
        System.out.println("____________________________________________________________");
        System.out.println("Total Old Lines: " + totalOld);
        System.out.println("\nNEW LINES:");
        System.out.println("Andy the Android: " + aa);
        System.out.println("Betty the Busibot: " + bb);
        System.out.println("Bobi the Racedroid: " + br);
        System.out.println("Fred the Friendlybot: " + ff);
        System.out.println("____________________________________________________________");
        System.out.println("Total New Lines: " + totalNew);
        System.out.println("\n============================================================");
        System.out.println("TOTAL OF ANDROIDS: " + (totalOld + totalNew));
    }

    //GETTERS AND SETTERS
    
    
    public void setModelAA(String modelAA) {
        this.modelAA = modelAA;
    }

    public void setModelBB(String modelBB) {
        this.modelBB = modelBB;
    }

    public void setModelBR(String modelBR) {
        this.modelBR = modelBR;
    }

    public void setModelFF(String modelFF) {
        this.modelFF = modelFF;
    }

    public String getModelAA() {
        return modelAA;
    }

    public String getModelBB() {
        return modelBB;
    }

    public String getModelBR() {
        return modelBR;
    }

    public String getModelFF() {
        return modelFF;
    }
}
