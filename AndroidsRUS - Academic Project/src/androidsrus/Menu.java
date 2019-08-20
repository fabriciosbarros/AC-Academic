package androidsrus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;

/* This is the Menu Class. It show the user printed options so they can walk through the options and get the results for searching and viewing */

public final class Menu {

    Scanner scan = new Scanner(System.in);

    int choice = -1;

    public Menu() {
    }

    public Menu(SetUp su, LinkedHashSet<NewLine> listNewLine, LinkedHashSet<OldLine> listOldLine) {
        
        PrintMainMenu(su, listNewLine, listOldLine);
    }

    //PRINTS THE MAIN MENU FOR THE USER
    public void PrintMainMenu(SetUp su, LinkedHashSet<NewLine> listNewLine, LinkedHashSet<OldLine> listOldLine) {
        Scanner nScan = new Scanner(System.in);
        choice = -1;
        System.out.println("\n\n============================================================");
        System.out.println("WELCOME TO AndroidsRUS");
        System.out.println("\nMAIN MENU");
        System.out.println("\nSELECT ONE OF THE OPTIONS BELOW:");
        System.out.println("\n(1) View all models available of a particular type");
        System.out.println("(2) View one model of a partiular type");
        System.out.println("(3) Total counts of available types ");
        System.out.println("(4) View a model that donated a particular part");
        System.out.println("(5) Quit");
        while (!nScan.hasNextInt()) {
            String tempChoice = nScan.nextLine();
            System.out.println("\n\n============================================================");
            System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
        }
        choice = Integer.parseInt(nScan.next());
        while (!equals("")) {
            switch(choice) {
                case 1:
                    {
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
                case 2:
                    {
                        PrintMenuTwo(su, listNewLine, listOldLine);
                        break;
                    }
                case 3:
                    {
                        su.TotalCounts(listNewLine, listOldLine);
                        System.out.println("\n\n");
                        PrintMainMenu(su, listNewLine, listOldLine);
                        break;
                    }
                case 4:
                    {
                        PrintMenuFour(su, listNewLine, listOldLine);
                        break;
                    }
                case 5:
                    {
                        System.exit(0);
                        break;
                    }
                default:
                    {
                        System.out.println("\n\n============================================================");
                        System.out.println("ERROR MESSAGE: [ " + choice + " ] is not a valid option. Please, try again.");
                        PrintMainMenu(su, listNewLine, listOldLine);
                        break;
                    }
            }
        }
    }

    //PRINTS THE SUBMENU FOR THE OPTION 1
    public void PrintMenuOne(SetUp su, LinkedHashSet<NewLine> listNewLine, LinkedHashSet<OldLine> listOldLine) {
        Scanner nScan = new Scanner(System.in);
        choice = -1;
        System.out.println("\n\n============================================================");
        System.out.println("VIEW ALL MODELS OF A PARTICULAR TYPE");
        System.out.println("\n\nPlease, select the type you want to see the models available or you can chose the option to go back to the Main Menu:");
        System.out.println("\nNEW MODELS:");
        System.out.println("(1) " + su.getModelAA());
        System.out.println("(2) " + su.getModelBB());
        System.out.println("(3) " + su.getModelBR());
        System.out.println("(4) " + su.getModelFF());
        System.out.println("\nOLD MODELS:");
        System.out.println("(5) MK1");
        System.out.println("(6) MK2");
        System.out.println("(7) MK3");
        System.out.println("(8) MK4");
        System.out.println("(9) MK5");
        System.out.println("\n(10) Back to the Main Menu");
        while (!nScan.hasNextInt()) {
            String tempChoice = nScan.nextLine();
            System.out.println("\n\n============================================================");
            System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
        }
        choice = Integer.parseInt(nScan.next());
        while (!equals("")) {
            switch(choice) {
                case 1:
                    {
                        NewLine nl = new NewLine();
                        nl.SeeModelsNew(su.getModelAA(), listNewLine);
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
                case 2:
                    {
                        new NewLine().SeeModelsNew(su.getModelBB(), listNewLine);
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
                case 3:
                    {
                        new NewLine().SeeModelsNew(su.getModelBR(), listNewLine);
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
                case 4:
                    {
                        new NewLine().SeeModelsNew(su.getModelFF(), listNewLine);
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
                case 5:
                    {
                        new OldLine().SeeModelsOld("MK1", listOldLine);
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
                case 6:
                    {
                        new OldLine().SeeModelsOld("MK2", listOldLine);
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
                case 7:
                    {
                        new OldLine().SeeModelsOld("MK3", listOldLine);
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
                case 8:
                    {
                        new OldLine().SeeModelsOld("MK4", listOldLine);
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
                case 9:
                    {
                        new OldLine().SeeModelsOld("MK5", listOldLine);
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
                case 10:
                    {
                        PrintMainMenu(su, listNewLine, listOldLine);
                        break;
                    }
                default:
                    {
                        System.out.println("\n\n============================================================");
                        System.out.println("ERROR MESSAGE: [ " + choice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
                        PrintMenuOne(su, listNewLine, listOldLine);
                        break;
                    }
            }
        }
    }

    //PRINTS THE SUBMENU FOR OPTION 2
    public void PrintMenuTwo(SetUp su, LinkedHashSet<NewLine> listNewLine, LinkedHashSet<OldLine> listOldLine) throws InputMismatchException {
        Scanner nScan = new Scanner(System.in);
        Scanner nScan2 = new Scanner(System.in);
        choice = -1;
        System.out.println("\n\n============================================================");
        System.out.println("VIEW ONE MODEL OF A PARTICULAR TYPE");
        System.out.println("\n\nPlease, select the type you want to search for or you can chose the option to go back to the Main Menu:");
        System.out.println("\nNEW MODELS:");
        System.out.println("(1) " + su.getModelAA());
        System.out.println("(2) " + su.getModelBB());
        System.out.println("(3) " + su.getModelBR());
        System.out.println("(4) " + su.getModelFF());
        System.out.println("\nOLD MODELS:");
        System.out.println("(5) MK1");
        System.out.println("(6) MK2");
        System.out.println("(7) MK3");
        System.out.println("(8) MK4");
        System.out.println("(9) MK5");
        System.out.println("\n(10) Back to the Main Menu");
        while (!nScan.hasNextInt()) {
            String tempChoice = nScan.nextLine();
            System.out.println("\n\n============================================================");
            System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
        }
        choice = Integer.parseInt(nScan.next());
        while (!equals("")) {
            switch(choice) {
                case 1:
                    {
                        String sChoice = su.getModelAA();
                        ArrayList<NewLine> options = new NewLine().SeeSpecificModelsNew(sChoice, listNewLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("\nPlease, type in the ID of the " + su.getModelAA() + " you want to view in detail:");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= options.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid ID. Please, type in a NUMBER according to the list above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > options.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in one of the IDs in the list above.");
                            }
                        }
                        new NewLine().SearchSpecificAndroidNew(options.get(choice2 - 1));
                        PrintMenuTwo(su, listNewLine, listOldLine);
                        break;
                    }
                case 2:
                    {
                        String sChoice = su.getModelBB();
                        ArrayList<NewLine> options = new NewLine().SeeSpecificModelsNew(sChoice, listNewLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("Please, type in the ID of the " + su.getModelBB() + " you want to view: in detail");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= options.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid ID. Please, type in a NUMBER according to the list above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > options.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in one of the IDs in the list above.");
                            }
                        }
                        new NewLine().SearchSpecificAndroidNew(options.get(choice2 - 1));
                        PrintMenuTwo(su, listNewLine, listOldLine);
                        break;
                    }
                case 3:
                    {
                        String sChoice = su.getModelBR();
                        ArrayList<NewLine> options = new NewLine().SeeSpecificModelsNew(sChoice, listNewLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("Please, type in the ID of the " + su.getModelBR() + " you want to view: in detail");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= options.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid ID. Please, type in a NUMBER according to the list above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > options.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in one of the IDs in the list above.");
                            }
                        }
                        new NewLine().SearchSpecificAndroidNew(options.get(choice2 - 1));
                        PrintMenuTwo(su, listNewLine, listOldLine);
                        break;
                    }
                case 4:
                    {
                        String sChoice = su.getModelFF();
                        ArrayList<NewLine> options = new NewLine().SeeSpecificModelsNew(sChoice, listNewLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("Please, type in the ID of the " + su.getModelFF() + " you want to view: in detail");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= options.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid ID. Please, type in a NUMBER according to the list above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > options.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in one of the IDs in the list above.");
                            }
                        }
                        new NewLine().SearchSpecificAndroidNew(options.get(choice2 - 1));
                        PrintMenuTwo(su, listNewLine, listOldLine);
                        break;
                    }
                case 5:
                    {
                        String sChoice = "MK1";
                        ArrayList<OldLine> options = new OldLine().SeeSpecificModelsOld(sChoice, listOldLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("Please, type in the ID of the " + sChoice + " you want to view: in detail");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= options.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid ID. Please, type in a NUMBER according to the list above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > options.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in one of the IDs in the list above.");
                            }
                        }
                        new OldLine().SearchSpecificAndroidOld(options.get(choice2 - 1));
                        PrintMenuTwo(su, listNewLine, listOldLine);
                        break;
                    }
                case 6:
                    {
                        String sChoice = "MK2";
                        ArrayList<OldLine> options = new OldLine().SeeSpecificModelsOld(sChoice, listOldLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("Please, type in the ID of the " + sChoice + " you want to view: in detail");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= options.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid ID. Please, type in a NUMBER according to the list above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > options.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in one of the IDs in the list above.");
                            }
                        }
                        new OldLine().SearchSpecificAndroidOld(options.get(choice2 - 1));
                        PrintMenuTwo(su, listNewLine, listOldLine);
                        break;
                    }
                case 7:
                    {
                        String sChoice = "MK3";
                        ArrayList<OldLine> options = new OldLine().SeeSpecificModelsOld(sChoice, listOldLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("Please, type in the ID of the " + sChoice + " you want to view: in detail");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= options.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid ID. Please, type in a NUMBER according to the list above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > options.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in one of the IDs in the list above.");
                            }
                        }
                        new OldLine().SearchSpecificAndroidOld(options.get(choice2 - 1));
                        PrintMenuTwo(su, listNewLine, listOldLine);
                        break;
                    }
                case 8:
                    {
                        String sChoice = "MK4";
                        ArrayList<OldLine> options = new OldLine().SeeSpecificModelsOld(sChoice, listOldLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("Please, type in the ID of the " + sChoice + " you want to view: in detail");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= options.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid ID. Please, type in a NUMBER according to the list above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > options.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in one of the IDs in the list above.");
                            }
                        }
                        new OldLine().SearchSpecificAndroidOld(options.get(choice2 - 1));
                        PrintMenuTwo(su, listNewLine, listOldLine);
                        break;
                    }
                case 9:
                    {
                        String sChoice = "MK5";
                        ArrayList<OldLine> options = new OldLine().SeeSpecificModelsOld(sChoice, listOldLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("Please, type in the ID of the " + sChoice + " you want to view: in detail");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= options.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid ID. Please, type in a NUMBER according to the list above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > options.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in one of the IDs in the list above.");
                            }
                        }
                        new OldLine().SearchSpecificAndroidOld(options.get(choice2 - 1));
                        PrintMenuTwo(su, listNewLine, listOldLine);
                        break;
                    }
                case 10:
                    {
                        PrintMainMenu(su, listNewLine, listOldLine);
                        break;
                    }
                default:
                    {
                        System.out.println("\n\n============================================================");
                        System.out.println("ERROR MESSAGE: [ " + choice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
                        PrintMenuTwo(su, listNewLine, listOldLine);
                    }
            }
        }
    }

    //PRINTS SUBMENU FOR OPTION 4
    public void PrintMenuFour(SetUp su, LinkedHashSet<NewLine> listNewLine, LinkedHashSet<OldLine> listOldLine) {
        Scanner nScan = new Scanner(System.in);
        Scanner nScan2 = new Scanner(System.in);
        ArrayList<NewLine> nlArray = new ArrayList(listNewLine);
        choice = -1;
        System.out.println("\n\n============================================================");
        System.out.println("VIEW A MODEL THAT DONATED A PARTICULAR PART");
        System.out.println("\n\nPlease, select the number according to which part you want to see the DONORS or you can chose the option to go back to the Main Menu:");
        System.out.println("\n(1) Brain");
        System.out.println("(2) Mobility");
        System.out.println("(3) Vision");
        System.out.println("(4) Arm");
        System.out.println("(5) Media Center");
        System.out.println("(6) Power Plant");
        System.out.println("(7) Back to the Main Menu");
        while (!nScan.hasNextInt()) {
            String tempChoice = nScan.nextLine();
            System.out.println("\n\n============================================================");
            System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
        }
        choice = Integer.parseInt(nScan.next());
        while (!equals("")) {
            switch(choice) {
                case 1:
                    {
                        new NewLine().SeeDonors("brain", listNewLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("\nPlease, type in the ID of the Old Model you want to view the Details:");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= listNewLine.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > listNewLine.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in a NUMBER according to the options above.");
                            }
                        }
                        new NewLine().DonatorSearch("brain", nlArray.get(choice2 - 1));
                        PrintMenuFour(su, listNewLine, listOldLine);
                        break;
                    }
                case 2:
                    {
                        new NewLine().SeeDonors("mobility", listNewLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("\nPlease, type in the ID of the Old Model you want to view the Details:");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= listNewLine.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > listNewLine.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in a NUMBER according to the options above.");
                            }
                        }
                        new NewLine().DonatorSearch("mobility", nlArray.get(choice2 - 1));
                        PrintMenuFour(su, listNewLine, listOldLine);
                        break;
                    }
                case 3:
                    {
                        new NewLine().SeeDonors("vision", listNewLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("\nPlease, type in the ID of the Old Model you want to view the Details:");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= listNewLine.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > listNewLine.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in a NUMBER according to the options above.");
                            }
                        }
                        new NewLine().DonatorSearch("vision", nlArray.get(choice2 - 1));
                        PrintMenuFour(su, listNewLine, listOldLine);
                        break;
                    }
                case 4:
                    {
                        new NewLine().SeeDonors("arm", listNewLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("\nPlease, type in the ID of the Old Model you want to view the Details:");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= listNewLine.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > listNewLine.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in a NUMBER according to the options above.");
                            }
                        }
                        new NewLine().DonatorSearch("arm", nlArray.get(choice2 - 1));
                        PrintMenuFour(su, listNewLine, listOldLine);
                        break;
                    }
                case 5:
                    {
                        new NewLine().SeeDonors("media", listNewLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("\nPlease, type in the ID of the Old Model you want to view the Details:");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= listNewLine.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > listNewLine.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in a NUMBER according to the options above.");
                            }
                        }
                        new NewLine().DonatorSearch("media", nlArray.get(choice2 - 1));
                        PrintMenuFour(su, listNewLine, listOldLine);
                        break;
                    }
                case 6:
                    {
                        new NewLine().SeeDonors("power", listNewLine);
                        System.out.println("\n\n============================================================");
                        System.out.println("\nPlease, type in the ID of the Old Model you want to view the Details:");
                        int choice2 = -1;
                        while (!((choice2 >= 1) && (choice2 <= listNewLine.size()))) {
                            while (!nScan2.hasNextInt()) {
                                String tempChoice = nScan2.nextLine();
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + tempChoice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
                            }
                            choice2 = Integer.parseInt(nScan2.next());
                            if (((choice2 < 1) || (choice2 > listNewLine.size()))) {
                                System.out.println("\n\n============================================================");
                                System.out.println("ERROR MESSAGE: [ " + choice2 + " ] is not a valid ID. Please, type in a NUMBER according to the options above.");
                            }
                        }
                        new NewLine().DonatorSearch("power", nlArray.get(choice2 - 1));
                        PrintMenuFour(su, listNewLine, listOldLine);
                        break;
                    }
                case 7:
                    {
                        PrintMainMenu(su, listNewLine, listOldLine);
                        break;
                    }
                default:
                    {
                        System.out.println("\n\n============================================================");
                        System.out.println("ERROR MESSAGE: [ " + choice + " ] is not a valid option. Please, type in a NUMBER according to the options above.");
                        PrintMenuFour(su, listNewLine, listOldLine);
                    }
            }
        }
    }
}
