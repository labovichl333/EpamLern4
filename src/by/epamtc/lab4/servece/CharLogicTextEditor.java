package by.epamtc.lab4.servece;

import by.epamtc.lab4.util.CharTool;

import java.util.Arrays;

public class CharLogicTextEditor implements TextEditor {
    @Override
    public String replaceLetter(String str, int numOfLetter, char symbol) {
        if (str==null){
            //выбросить своё исключение
         }
        if(numOfLetter<0){
            //выбросить своё исключение
        }
        char[] text=str.toCharArray();
        int counter=0;
        for (int i = 0; i <text.length; i++) {
            if(text[i]==' '){
                counter=0;
                continue;
            }
            if(counter==numOfLetter){
                text[i]=symbol;
            }
            counter++;
        }

        return new String(text);
    }

    @Override
    public String correctMistake(String str, char previousLetter, char correctLetter, char uncorrectLetter) {
        if (str==null){
            //выбросить своё исключение
        }
        char[] text=str.toCharArray();
        for (int i = 1; i <text.length; i++) {
            if(Character.toLowerCase(text[i-1])==Character.toLowerCase(previousLetter)  &&
                    Character.toLowerCase(text[i])==Character.toLowerCase(uncorrectLetter)){
                if(Character.isLowerCase(text[i])){
                    text[i]=Character.toLowerCase(correctLetter);
                }else {
                    text[i]=Character.toUpperCase(correctLetter);
                }


            }
        }
        return new String(text);
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
        char[] text=str.toCharArray();
        char[] subText=substr.toCharArray();
        char[] answer;
        int counter=0;
        int numOfReplacementWords=0;

        for (int i = 0; i <text.length; i++) {
            if(text[i]==' '){
                counter=0;
                continue;
            }
            if((counter==lenOfReplacementWords-1 && i==text.length-1) || (counter==lenOfReplacementWords-1 && text[i+1]==' ')){
                numOfReplacementWords++;
            }
            counter++;
        }

        int lenOfAnswer=numOfReplacementWords*(substr.length()-lenOfReplacementWords)+text.length;

        answer=new char[lenOfAnswer];

        int counter2=0;
        int j=0;
        for (int i = 0; i <text.length; i++) {
            if(text[i]==' '){
                answer[j]=' ';
                j++;
                counter2=0;
                continue;
            }
            if((counter2==lenOfReplacementWords-1 && i==text.length-1) || (counter2==lenOfReplacementWords-1 && text[i+1]==' ')){
                j=j-counter2;
                for (int k = 0; k <subText.length; k++) {
                    answer[j]=subText[k];
                    j++;
                }

            }else {
                answer[j]=text[i];
                j++;
            }
            counter2++;
        }

        return new String(answer);
    }

    @Override
    public String leaveLettersAndSpace(String str) {

        if (str==null){
            //выбросить своё исключение
        }
        char[] text=str.toCharArray();
        char[] answer;
        int counter=0;
        for (char c : text) {
            if (Character.isLetter(c) || c == ' ') {
                counter++;
            }
        }
        answer=new char[counter];
        int j=0;
        for (int i = 0; i <text.length; i++) {
            if (Character.isLetter(text[i]) || text[i] == ' ') {
                answer[j]=text[i];
                j++;
            }
        }
        return new String(answer);
    }

    @Override
    public String deleteConsonantWordsByLen(String str, int len) {
        if (str==null){
            //выбросить своё исключение
        }
        if (len<0){
            //выбросить своё исключение
        }
        char[] text=str.toCharArray();
        int counter=0;
        int numOfDeletedWords=0;

        for (int i = 0; i <text.length; i++) {
            if(text[i]==' '){
                counter=0;
                continue;
            }
            if(counter==len-1  && CharTool.isConsonant(text[i-counter]) && (i==text.length-1 || text[i+1]==' ')){
                numOfDeletedWords++;
            }
            counter++;
        }
        int lenOfMas=text.length-numOfDeletedWords*len;
        char[] answer=new char[lenOfMas];
        int counter2=0;
        int j=0;
        for (int i = 0; i <text.length; i++) {
            if(text[i]==' '){
                answer[j]=' ';
                j++;
                counter2=0;
                continue;
            }
            if(counter2==len-1  && CharTool.isConsonant(text[i-counter2]) && (i==text.length-1 || text[i+1]==' ')){
                j=j-counter2;
            }else {
                answer[j]=text[i];
                j++;
            }
            counter2++;
        }
        return new String(answer);
    }
}
