public class Main{
    public static void main(String[]){
        GerenciadorNomes gNomes = new GerenciadorNomesMem();
        Ihm ihm = new Ihm(gNomes);
        ihm.dialogar();
    }
}