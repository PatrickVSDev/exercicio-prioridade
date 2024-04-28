package AulaPrioridade;

public class TesteSomaArray {
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5}; // Soma deve ser 15

        ThreadSomaArray thread1 = new ThreadSomaArray("Filha #1", vetor);
        ThreadSomaArray thread2 = new ThreadSomaArray("Filha #2", vetor);

        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread principal interrompida.");
        }
    }
}
