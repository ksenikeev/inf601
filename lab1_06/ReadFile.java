import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("Labirint.java"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}

// считать файл
// определить кол-во символов
// максимальную длину строки
// кол-во слов (по пробелу)
// подсчитать кол-во вхождений каждого слова
/*

String[] words = new String[21000]; //храним только в нижнем регистре
int[] counts = new int[21000];
int count = -1;

int findWord(String word);
String clearWord(String word) // .,:!?
 */