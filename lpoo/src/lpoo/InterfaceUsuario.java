/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo;

/**
 *
 * @author Tami
 */
import java.util.Scanner;
    

public class InterfaceUsuario {
    
    int opcao;
    Scanner entrada = new Scanner(System.in);
    
    public InterfaceUsuario() {
        //fazer método para iniciarJogo
        System.out.println(">> Digite o numero do idioma: \n   1. Portugues \n   2. Ingles");
        opcao = entrada.nextInt();
//        defineLinguagem(opcao);
    }
    
}
