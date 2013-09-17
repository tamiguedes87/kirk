/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo;

/**
 *
 * @author Tami
 * 
 * Regra de negócio:
 * a) todo obejto do tipo resposta terá em sua posição 0 a alternativa correta
 */

public class Resposta {
    
    String alternativas[];
    int idDaPergunta;
    
    public Resposta(String[] alternativas, int idDaPergunta) {
        this.alternativas = alternativas;
        this.idDaPergunta = idDaPergunta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    public int getIdDaPergunta() {
        return idDaPergunta;
    }

    public void setIdDaPergunta(int idDaPergunta) {
        this.idDaPergunta = idDaPergunta;
    }
    
    
}
