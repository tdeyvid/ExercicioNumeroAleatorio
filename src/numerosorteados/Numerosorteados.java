/*
 * 1)Exiba 50 números sorteados de 1 a 100 para o usuário.
 */
package numerosorteados;
/**
 * @author : Tarciano Deyvid
 * Curso: ADS - FIC
 */
public class Numerosorteados {
   
    public static void main(String[] args) {
        double numAle;
        for(int i=0;i<50;i++){
            numAle = (Math.random() * 100);
            System.out.println("Numero: "+Math.ceil(numAle));
        }
        
    }
    
}
