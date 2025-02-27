import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GerenciadorNomesArq {
    public static void main(String[]){
        Path path = Paths.get("C:/temp/ide_/_mycode/nomes.txt");
        try {
            byte[] bs = Files.readAllBytes(path);
            List<String> nomes = Files.readAllLines(path);
            System.out.println("Read lines: \n"+strings);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


