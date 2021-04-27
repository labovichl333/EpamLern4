package by.epamtc.lab4.servece;

public interface TextEditor {
    // 1 подзадача
    // numOfLetter начинается с 0
    String replaceLetter(String str, int numOfLetter, char symbol);
    // 2 подзадача
    String correctMistake(String str,char previousLetter,char correctLetter,char uncorrectLetter);
    // 3 подзадача
    String replaceSubstring(String str,String substr,int lenOfReplacementWords);
    // 4 подзадача
    String leaveLettersAndSpace(String str);
    // 5 подзадача
    String deleteConsonantWordsByLen(String str,int len);
}
