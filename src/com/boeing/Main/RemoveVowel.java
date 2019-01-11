import java.util.Scanner;

public class RemoveVowel {

    public static boolean removeVowel(boolean removeVowel){
        String[] placesArray = {"India", "Pakistan", "China", "Nepal", "Bhutan"};
//        for(int j = 0; j< 5; j++){
//            Scanner scan = new Scanner(System.in);
//            placesArray[j] = scan.nextLine();
//        }

        for (int i = 0; i < 5; i++) {
            String wordWithoutVowel = placesArray[i];
            wordWithoutVowel = wordWithoutVowel.replaceAll("[aeiou]", "");
            placesArray[i] = wordWithoutVowel;
        }
        for (int i = 0; i < placesArray.length; i++) {
            System.out.println("Place Name without Vowels:" + i + "  " + placesArray[i]);
        }
        removeVowel = true;
        return removeVowel;
    }
}

