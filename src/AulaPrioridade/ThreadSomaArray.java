package AulaPrioridade;

public class ThreadSomaArray implements Runnable {
    Thread thread;
    // Objeto de soma array compartilhado entre todas as instãncias da Thread
    static SomaArray soma = new SomaArray();
    int vetor[];
    int resposta;

    public ThreadSomaArray(String nome, int nums[]) {
        thread = new Thread(this,nome);
        vetor = nums;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Thread "+thread.getName()+" começou.");
        resposta = soma.somaElementos(vetor);

        // Usando um bloco synchronized, podemos definir o que queremos que seja sincronizado!
        synchronized (soma) {
            resposta = soma.somaElementos(vetor);
        }
        System.out.println("Valor final da soma para a thread "+
                thread.getName()+" é "+resposta);
        System.out.println("Thread "+thread.getName()+" finalizou.");
    }
}
