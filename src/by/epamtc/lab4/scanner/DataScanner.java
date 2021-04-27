package by.epamtc.lab4.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataScanner {
    public static String scanFromConsole(){
        String line;

        Scanner scanner=new Scanner(System.in);

        line = scanner.nextLine();

        return line;
    }
    public static String scanFromFile(String path) throws FileNotFoundException {
        if(path==null){
            //выбросить своё исключение
        }
        Scanner scanner = new Scanner(new File(path));
        StringBuilder answer=new StringBuilder();
        while (scanner.hasNextLine()) {
            answer.append(scanner.nextLine());
        }
        scanner.close();
        return answer.toString();
    }
}
