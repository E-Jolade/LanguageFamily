import java.util.Scanner;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    Scanner user = new Scanner(System.in);


    Language(String setName, int setSpeakers, String setRegions, String setOrder){
        name = setName;
        numSpeakers = setSpeakers;
        regionsSpoken = setRegions;
        wordOrder = setOrder;
    }

    public void setName(String getName){
        name = getName;
    }
    public void setSpeakers(int getSpeakers){
        numSpeakers = getSpeakers;
    }
    public void setRegion(String getRegion){
        regionsSpoken = getRegion;
    }
    public void setWordOrder(){
        System.out.println("Which word order would you like to select?");
        System.out.println("1.) subject-verb-object");
        System.out.println("2.) subject-object-verb");
        System.out.println("3.) verb-subject-object");
        System.out.println("4.) verb-object-subject");
        System.out.println("5.) object-verb-subject");
        System.out.println("6.) object-subject-verb");

        int menu = user.nextInt();

        switch(menu){
            case 1:
                wordOrder = "subject-verb-object";
                break;
            case 2:
                wordOrder = "subject-object-verb";
                break;
            case 3:
                wordOrder = "verb-subject-object";
                break;
            case 4:
                wordOrder = "verb-object-subject";
                break;
            case 5:
                wordOrder = "object-verb-subject";
                break;
            case 6:
                wordOrder = "object-subject-verb";
                break;
            default:
                wordOrder = "I don't know how this got here";
                break;
        }
        System.out.println("Word order modified!");
    }

    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
    }

    public static void main (String[] args){
        String newRegion = "";
        String newName = "";
        int newSpeakers = 0;
        int choice = 0;
        Scanner option = new Scanner(System.in);
        Scanner option2 = new Scanner(System.in);
        boolean running = true;
        Language spanish = new Language("Spanish", 46789, "North America",
                "subject-verb-object");
        Mayan chontal = new Mayan("Chontal", 36810);
        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
        SinoTibetan chinese = new SinoTibetan("Chinese", 899340);

        Language[] languages = {spanish, chontal, burmese, chinese};
        do{
            for(Language details: languages){
                details.getInfo();
            }

            System.out.println("Would you like to modify any of this information?");
            System.out.println("1.) Yes");
            System.out.println("2.) No");
            
            choice = option.nextInt();
            
            if(choice == 1){
                System.out.println("What variable would you like to modify?");
                System.out.println("1.) Name of language");
                System.out.println("2.) Number of speakers");
                System.out.println("3. Region");
                System.out.println("4. Word order");

                choice = option.nextInt();

                if(choice == 1){
                    System.out.println("Which language's variable do you want to modify?");
                    System.out.println("1.) Spanish");
                    System.out.println("2.) Chontal");
                    System.out.println("3.) Burmese");
                    System.out.println("4.) Chinese");

                    choice = option.nextInt();

                    if(choice == 1){
                        System.out.println("Please print the new name: ");
                         newName = option2.nextLine();
                        spanish.setName(newName);
                    }
                    else if(choice == 2){
                        System.out.println("Please print the new name: ");
                         newName = option2.nextLine();
                        chontal.setName(newName);
                    }
                    else if(choice == 3){
                        System.out.println("Please print the new name: ");
                         newName = option2.nextLine();
                        burmese.setName(newName);
                    }
                    else if(choice == 4){
                        System.out.println("Please print the new name: ");
                         newName = option2.nextLine();
                        chinese.setName(newName);
                    }
                    else{
                        System.out.println("Invalid input detected. Ending program...");
                        running = false;
                    }
                }
                else if(choice == 2){
                        System.out.println("Which language's variable do you want to modify?");
                        System.out.println("1.) Spanish");
                        System.out.println("2.) Chontal");
                        System.out.println("3.) Burmese");
                        System.out.println("4.) Chinese");

                        choice = option.nextInt();

                        if(choice == 1){
                            System.out.println("Please print the new number of speakers: ");
                            newSpeakers = option.nextInt();
                            spanish.setSpeakers(newSpeakers);
                        }
                        else if(choice == 2){
                            System.out.println("Please print the new number of speakers: ");
                            newSpeakers = option.nextInt();
                            chontal.setSpeakers(newSpeakers);
                        }
                        else if(choice == 3){
                            System.out.println("Please print the new number of speakers: ");
                            newSpeakers = option.nextInt();
                            burmese.setSpeakers(newSpeakers);
                        }
                        else if(choice == 4){
                            System.out.println("Please print the new number of speakers: ");
                            newSpeakers = option.nextInt();
                            chinese.setSpeakers(newSpeakers);
                        }
                        else{
                            System.out.println("Invalid input detected. Ending program...");
                            running = false;
                        }
                }
                else if(choice == 3){
                    System.out.println("Which language's variable do you want to modify?");
                    System.out.println("1.) Spanish");
                    System.out.println("2.) Chontal");
                    System.out.println("3.) Burmese");
                    System.out.println("4.) Chinese");

                    choice = option.nextInt();

                    if(choice == 1){
                        System.out.println("Please print the new Region: ");
                        newRegion = option2.nextLine();
                        spanish.setRegion(newRegion);
                    }
                    else if(choice == 2){
                        System.out.println("Please print the new Region: ");
                        newRegion = option2.nextLine();
                        chontal.setRegion(newRegion);
                    }
                    else if(choice == 3){
                        System.out.println("Please print the new Region: ");
                        newRegion = option2.nextLine();
                        burmese.setRegion(newRegion);
                    }
                    else if(choice == 4){
                        System.out.println("Please print the new Region: ");
                        newRegion = option2.nextLine();
                        chinese.setRegion(newRegion);
                    }
                    else{
                        System.out.println("Invalid input detected. Ending program...");
                        running = false;
                    }
                }
                else if(choice == 4){
                    System.out.println("Which language's variable do you want to modify?");
                    System.out.println("1.) Spanish");
                    System.out.println("2.) Chontal");
                    System.out.println("3.) Burmese");
                    System.out.println("4.) Chinese");

                    choice = option.nextInt();

                    if(choice == 1){
                        spanish.setWordOrder();
                    }
                    else if(choice == 2){
                        chontal.setWordOrder();
                    }
                    else if(choice == 3){
                        burmese.setWordOrder();
                    }
                    else if(choice == 4){
                        chinese.setWordOrder();
                    }
                    else{
                        System.out.println("Invalid input detected. Ending program...");
                        running = false;
                    }
                }
                else{
                    System.out.println("Invalid input detected. Ending program...");
                    running = false;
                }

            }
            else if(choice == 2){
                System.out.println("Ending program...");
                running = false;
            }
            else{
                System.out.println("Invalid input detected, terminating program.");
                running = false;
            }

        }while(running);
    }
}

