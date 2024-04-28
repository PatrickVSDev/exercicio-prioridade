package AulaPrioridade;

public class ContagemComPrioridade implements Runnable{
    Thread thread;
    int cont;
    static String threadAtual;
    static boolean terminou = false; // flag que garante que quando uma thread terminar, todas as outras terminaram

    public ContagemComPrioridade(String nome) {
        thread = new Thread(this,nome);
        cont = 0;
        threadAtual = nome;
    }

    @Override
    public void run() {
        System.out.println(thread.getName()+" iniciou.");
        // Laço que para quando a thread contar até 500000
        do {
            cont++;
            // Verificar se houve alternância entre a Threads
            if (!threadAtual.equals(thread.getName())) {
                threadAtual = thread.getName();
                System.out.println("Thread "+threadAtual+" executando...");
            }
        }while (!terminou && cont < 500000);
        terminou = true;
        System.out.println("a Thread "+thread.getName()+" terminou!");
    }
}