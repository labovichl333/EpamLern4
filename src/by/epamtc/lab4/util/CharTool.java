package by.epamtc.lab4.util;

public class CharTool {
    private static char[] consonant={'б','в','г','д','ж','з','й','к','л','м','н','п','р','с','т','ф','х','ц','ч','ш','щ','b','c','d','f','g','j','k','l','m','n','p','q','s','t','v','x','z','h','r','w','y'};
    public static boolean isConsonant(char ch){
        boolean answer=false;
        if(Character.isLetter(ch)){
            for (int i = 0; i <consonant.length; i++) {
                if(ch==Character.toLowerCase(consonant[i])){
                    answer=true;
                    break;
                }
            }
        }

        return answer;
    }
}
