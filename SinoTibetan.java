public class SinoTibetan extends Language {

    SinoTibetan(String setName, int setSpeakers){
        super(setName, setSpeakers, "Asia", "subject-object-verb");
        if(setName.contains("Chinese")){
            wordOrder = "subject-verb-object";
        }
    }
}
