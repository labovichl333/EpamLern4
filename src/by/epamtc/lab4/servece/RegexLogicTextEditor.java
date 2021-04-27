package by.epamtc.lab4.servece;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLogicTextEditor implements TextEditor {
    @Override
    public String replaceLetter(String str, int numOfLetter, char symbol) {
        if (str==null){
            //выбросить своё исключение
        }
        if(numOfLetter<0){
            //выбросить своё исключение
        }
        StringBuilder answer=new StringBuilder(str);
        Pattern pattern=Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if(matcher.end()-matcher.start()>numOfLetter){
               answer.setCharAt(matcher.start()+numOfLetter,symbol);
            }
        }

        return answer.toString();
    }

    @Override
    public String correctMistake(String str, char previousLetter, char correctLetter, char uncorrectLetter) {
        if (str==null){
            //выбросить своё исключение
        }
        StringBuilder answer=new StringBuilder(str);
        String reg=""+previousLetter+uncorrectLetter;
        Pattern pattern=Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(str);
        while (matcher.find()){
            if (Character.isLowerCase(str.charAt(matcher.end()-1))){
                answer.setCharAt(matcher.end()-1,Character.toLowerCase(correctLetter));
            }else {
                answer.setCharAt(matcher.end()-1,Character.toUpperCase(correctLetter));
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

        return str.replaceAll("(?<=\\s|^)\\w{"+lenOfReplacementWords+"}(?=\\s|$)",substr);
    }

    @Override
    public String leaveLettersAndSpace(String str) {
        if (str==null){
            //выбросить своё исключение
        }
        return str.replaceAll("[^ A-Za-zА-Яа-я]","");
    }

    @Override
    public String deleteConsonantWordsByLen(String str, int len) {
        if (str==null){
            //выбросить своё исключение
        }
        if (len<0){
            //выбросить своё исключение
        }
        return str.replaceAll("(?<=\\s|^)[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz" +
                        "БбВвГгДдЖжЗзЙйКкЛлМмНнПпРрСсТтФфХхЦцЧчШшЩщ][A-Za-zА-Яа-я]{" + (len - 1) + "}(?=\\s|$)", "");
    }
}
