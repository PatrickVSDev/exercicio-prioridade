package AulaPrioridade;

public class TesteContagem {
    public static void main(String[] args) {
        ContagemComPrioridade thread1 = new ContagemComPrioridade("Alta prioridade");
        ContagemComPrioridade thread2 = new ContagemComPrioridade("Baixa prioridade");

        // Definir as prioridades das threads
        thread1.thread.setPriority(Thread.NORM_PRIORITY + 3);
        thread2.thread.setPriority(Thread.NORM_PRIORITY - 3);

        // Iniciar as thread
        thread1.thread.start();
        thread2.thread.start();

        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread principal interrompida.");
        }
        System.out.println("A Thread de alta prioridade contou até: "
        +thread1.cont);
        System.out.println("A Thread de baixa prioridade contou até: "
                +thread2.cont);
    }
}
