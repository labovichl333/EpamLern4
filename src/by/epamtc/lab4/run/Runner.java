package by.epamtc.lab4.run;

import by.epamtc.lab4.scanner.DataScanner;
import by.epamtc.lab4.servece.CharLogicTextEditor;
import by.epamtc.lab4.servece.RegexLogicTextEditor;
import by.epamtc.lab4.servece.TextEditor;
import by.epamtc.lab4.servece.SrtingLogicTextEditor;

public class Runner {
    public static void main(String[] args) {
        TextEditor charLogicTextEditor=new CharLogicTextEditor();
        TextEditor stringLogicEditor=new SrtingLogicTextEditor();
        TextEditor regexLogicTextEditor=new RegexLogicTextEditor();

        System.out.println("1");
        System.out.println(charLogicTextEditor.replaceLetter("q qw  qwerty qwert",4,'!'));
        System.out.println(stringLogicEditor.replaceLetter("q qw  qwerty qwert",4,'!'));
        System.out.println(regexLogicTextEditor.replaceLetter("q qw  qwerty qwert",4,'!'));
        System.out.println("2");
        System.out.println(charLogicTextEditor.correctMistake("poQwe Poqwe oP POqwe",'p','a','o'));
        System.out.println(stringLogicEditor.correctMistake("poQwe Poqwe oP POqwe",'p','a','o'));
        System.out.println(regexLogicTextEditor.correctMistake("poQwe Poqwe oP POqwe",'p','a','o'));
        System.out.println("3");
        System.out.println(charLogicTextEditor.replaceSubstring("12345  1234 123  0123 ","qwe",4));
        System.out.println(stringLogicEditor.replaceSubstring("12345  1234 123  0123 ","qwe",4));
        System.out.println(regexLogicTextEditor.replaceSubstring("12345  1234 123  0123 ","qwe",4));
        System.out.println("4");
        System.out.println(charLogicTextEditor.leaveLettersAndSpace("  qwerty123 123asdf  123,.zxcvb123 456 ! \n 12313qwerty"));
        System.out.println(stringLogicEditor.leaveLettersAndSpace("  qwerty123 123asdf  123,.zxcvb123 456 ! \n 12313qwerty"));
        System.out.println(regexLogicTextEditor.leaveLettersAndSpace("  qwerty123 123asdf  123,.zxcvb123 456 ! \n 12313qwerty"));
        System.out.println("5");
        System.out.println(charLogicTextEditor.deleteConsonantWordsByLen(" qwerty  Qwerty  Qwe  qwe  asdfg Asdfg Asd asd ",5));
        System.out.println(stringLogicEditor.deleteConsonantWordsByLen(" qwerty  Qwerty  Qwe  qwe  asdfg Asdfg Asd asd ",5));
        System.out.println(regexLogicTextEditor.deleteConsonantWordsByLen(" qwerty  Qwerty  Qwe  qwe  asdfg Asdfg Asd asd ",5));


         System.out.println(DataScanner.scanFromConsole());
       // System.out.println(DataScanner.scanFromFile("путь"));
    }

}
