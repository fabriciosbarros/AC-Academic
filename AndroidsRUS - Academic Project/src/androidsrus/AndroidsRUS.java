package androidsrus;

import java.io.IOException;
import java.util.LinkedHashSet;

/*
This class contains the Main Method. It’s in this class that the amount of Androids (Old and New) is defined. This class also verifies if the amount of Old and New Lines are coherent and correct them if necessary and has a call for the Main Menu. 
*/

public class AndroidsRUS {

    public static void main(String[] args) throws IOException {
        int initialNewProduction = 400;
        int initialOldProduction = 600;
        String fileSetUpOld = "setupoldlines.csv";
        String fileSetUpNew = "setupnewlines.csv";
        SetUp su = new SetUp();
        if (initialOldProduction <= initialNewProduction) {
            System.out.println("ERROR MESSAGE: The number of productions for New Models can't be greater than Old Models. The amount of Old Models was changed from " + initialOldProduction + " to " + (initialNewProduction + 50) + ".");
            initialOldProduction = (initialNewProduction + 50);
        }
        System.out.println("GENERATING DATA...\n");
        LinkedHashSet<OldLine> initialListOld = su.OldFileCreation(fileSetUpOld, initialOldProduction);
        LinkedHashSet<NewLine> initialListNew = su.NewFileCreation(fileSetUpNew, initialNewProduction, initialListOld);
        System.out.println("\nDATA CREATION FINISHED!");
        new Menu(su, initialListNew, initialListOld);
    }
}
