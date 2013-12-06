/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.entity;

/**
 *
 * @author Tami
 */
public class QuestaoTexto extends QuestaoAbstrata {

    public QuestaoTexto(String enunciado, int idPergunta, EnumIdioma idioma, EnumNivel nivel, String[] resposta, int indiceRespostaCerta) {
        super(enunciado, idPergunta, idioma, nivel, resposta, indiceRespostaCerta);
        
    }

    public void criarNovaQuestao(){
        
    }
}
