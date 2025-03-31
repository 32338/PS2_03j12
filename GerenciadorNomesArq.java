import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GerenciadorNomesArq implements GerenciadorNomes {
    private static final Path path = Paths.get("C:/temp/ide_/_mycode/nomes.txt");
    private List<String> nomes;

    public GerenciadorNomesArq() {
        carregarNomes();
    }

    private void carregarNomes() {
        try {
            if (Files.exists(path)) {
                nomes = Files.readAllLines(path);
            } else {
                nomes = new ArrayList<>();
            }
        } catch (IOException e) {
            e.printStackTrace();
            nomes = new ArrayList<>();
        }
    }

    @Override
    public List<String> obterNomes() {
        return new ArrayList<>(nomes); // Retorna uma cópia para evitar modificações externas
    }

    @Override
    public void adicionarNome(String nome) {
        if (nome.length() > MAX_CARACTERES_NOMES) {
            System.out.println("Erro: Nome excede o limite de caracteres.");
            return;
        }
        nomes.add(nome);
        salvarNomes();
    }

    private void salvarNomes() {
        try {
            Files.write(path, nomes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
