package AulaPrioridade;

public class SomaArray {
    int soma;

    // Método que realiza a soma dos elementos do array
    // synchronized int somaElementos(int nums[]) { // Uma forma de fazer usando o synchronized
    int somaElementos(int nums[]) {
        soma = 0;
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
            System.out.println("Valor atual da soma para a "+
                    Thread.currentThread().getName() + " é "+soma);

            try {
                Thread.sleep(10); // Facilita visualização dos resultados
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida.");
            }
        }
        return soma;
    }
}
