package ps2.lab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import static java.lang.System.out;
import java.util.Scanner;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	private ProfessorRepo professorRepo;

	@Autowired
	private FaculdadeRepo faculdadeRepo;

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) {
		out.println("# Gerenciador de Professores e Faculdades!");
		boolean sair = false;

		while (!sair){
			out.print("\nMenu");
			out.print("(1) Criar Faculdade");
			out.print("(2) Listar Faculdades");
			out.print("(3) Criar Professor");
			out.print("(4) Listar Professor");
			out.print("(0) Sair");
			out.print("#Escolha uma opção:");
			int opcao = Interger.parseInt(entrada);
		}



		out.print("");
	}
	private static void criarFacudade(){
		out.printnl("\n# CRIAÇÃO DE NOVA FACULDADE");
		out.print("Nome da nova faculdade: ");
		
	}
}
