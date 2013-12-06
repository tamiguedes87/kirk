/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo;

import java.lang.reflect.Array;

/**
 *
 * @author Tami
 */
abstract class RespostaAbstrata {
    int idPergunta;
    EnumIdioma idioma;
    EnumNivel nivel;
    Array alternativas[];

    public RespostaAbstrata(int idPergunta, EnumIdioma idioma, EnumNivel nivel, Array[] alternativas) {
        this.idPergunta = idPergunta;
        this.idioma = idioma;
        this.nivel = nivel;
        this.alternativas = alternativas;
    }
    
    public void adicionarAlternativas(){
        
    }
    
}