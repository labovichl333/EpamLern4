package by.epamtc.lab4.servece;

import by.epamtc.lab4.util.CharTool;

public class SrtingLogicTextEditor implements TextEditor {

    @Override
    public String replaceLetter(String str, int numOfLetter, char symbol) {
        if (str==null){
            //выбросить своё исключение
        }
        if(numOfLetter<0){
            //выбросить своё исключение
        }
        StringBuilder answer=new StringBuilder(str.length());
        String[] masOfWords=str.split(" ");
        for (String word : masOfWords) {
            if (numOfLetter < word.length()) {
                StringBuilder temp = new StringBuilder(word.length());
                for (int j = 0; j < word.length(); j++) {
                    if (j == numOfLetter) {
                        temp.append(symbol);
                    } else {
                        temp.append(word.charAt(j));
                    }
                }
                answer.append(temp);
                answer.append(" ");
            } else {
                answer.append(word);
                answer.append(" ");
            }
        }
        return answer.toString();
    }

    @Override
    public String correctMistake(String str, char previousLetter, char correctLetter, char uncorrectLetter) {
        if (str==null){
            //выбросить своё исключение
        }
        StringBuilder answer=new StringBuilder(str.length());
        answer.append(str.charAt(0));
        for (int i = 1; i <str.length(); i++) {
            if(Character.toLowerCase(str.charAt(i-1))==Character.toLowerCase(previousLetter)  &&
                    Character.toLowerCase(str.charAt(i))==Character.toLowerCase(uncorrectLetter)){
                if(Character.isLowerCase(str.charAt(i))){
                    answer.append(Character.toLowerCase(correctLetter));
                }else {
                    answer.append(Character.toUpperCase(correctLetter));
                }


            }else {
                answer.append(str.charAt(i));
            }
        }

        return answer.toString();
    }

    @Override
    public String replaceSubstring(String str, String substr, int lenOfReplacementWords) {
        if (str==null ){
            //выбросить своё исключение
        }
        if (substr==null ){
            //выбросить своё исключение
        }
        if(lenOfReplacementWords<0){
            //выбросить своё исключение
        }
        StringBuilder answer=new StringBuilder(str.length());
        String[] masOfWords=str.split(" ");
        for (String word : masOfWords) {
            if (word.length() == lenOfReplacementWords) {
                answer.append(substr);
                answer.append(" ");
            } else {
                answer.append(word);
                answer.append(" ");
            }
        }
        return answer.toString();
    }

    @Override
    public String leaveLettersAndSpace(String str) {
        if (str==null){
            //выбросить своё исключение
        }
        StringBuilder answer=new StringBuilder(str.length());
        for (int i = 0; i <str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || str.charAt(i) == ' ') {
              answer.append(str.charAt(i));
            }
        }
        return answer.toString();
    }

    @Override
    public String deleteConsonantWordsByLen(String str, int len) {
        if (str==null){
            //выбросить своё исключение
        }
        if (len<0){
            //выбросить своё исключение
        }
        StringBuilder answer=new StringBuilder(str.length());
        String[] masOfWords=str.split(" ");
        for (String word : masOfWords) {
            if (!(word.length() == len && CharTool.isConsonant(word.charAt(0)))) {
                answer.append(word);
                answer.append(" ");
            } else {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
