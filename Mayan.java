public class Mayan extends Language{
    Mayan(String setName, int setSpeakers){
        super(setName, setSpeakers, "Central America", "verb-object-subject");
    }
    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
        System.out.println("Fun fact: " + name + " is an ergative language");
    }
}
