import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;
public class Handler {
	
    public static void main(String[] args) throws IOException{
    	try {
    	String fileName = "res//1.txt";
    	String str = readUsingScanner(fileName);
    	String reverse = new StringBuffer(str).reverse().toString();
    	
    		FileWriter fw = new FileWriter("res//2.txt");
    		fw.write(reverse);
    		fw.close();
    	
    	} catch	(Exception e) {
    		System.out.print("Файл не найден");
    	}
    }
    
    private static String readUsingScanner(String fileName) throws IOException {
        Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
	}
}
