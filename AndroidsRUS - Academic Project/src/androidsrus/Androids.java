package androidsrus;

/* This is the superclass Androids. */

public class Androids {

    private int id;

    private String model;

    private String brain;

    private String mobility;

    private String vision;

    private String arm;

    private String mediaCenter;

    private String powerPlant;

    public Androids() {
    }

    public Androids(int id, String model, String brain, String mobility, String vision, String arm, String mediaCenter, String powerPlant) {
        this.id = id;
        this.model = model;
        this.brain = brain;
        this.mobility = mobility;
        this.vision = vision;
        this.arm = arm;
        this.mediaCenter = mediaCenter;
        this.powerPlant = powerPlant;
    }

    
    //GETTERS AND SETTERS
    
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrain() {
        return brain;
    }

    public String getMobility() {
        return mobility;
    }

    public String getVision() {
        return vision;
    }

    public String getArm() {
        return arm;
    }

    public String getMediaCenter() {
        return mediaCenter;
    }

    public String getPowerPlant() {
        return powerPlant;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrain(String brain) {
        this.brain = brain;
    }

    public void setMobility(String mobility) {
        this.mobility = mobility;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }

    public void setMediaCenter(String mediaCenter) {
        this.mediaCenter = mediaCenter;
    }

    public void setPowerPlant(String powerPlant) {
        this.powerPlant = powerPlant;
    }
}
