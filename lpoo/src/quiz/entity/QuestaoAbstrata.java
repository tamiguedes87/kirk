/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.entity;

import java.lang.reflect.Array;


/**
 *
 * @author Tamires Guedes & Marcia Silva
 * 
 * Responsabilidade da classe QuestaoAbstrata: representar perguntas ormadas por enunciado, com o enunciado da 
 * questão, o nivel(fácil, médio e dificil), o idioma da  mesma, contendo
 * um vetor com as alternativas de cada pergunta bem como um campo para 
 * armazenar a alternativa correta da questao.
 * 
 */
 abstract class QuestaoAbstrata {
    String enunciado;
    int idPergunta;
    EnumIdioma idioma;
    EnumNivel nivel;
    String resposta[];
    int indiceRespostaCerta;

    public QuestaoAbstrata(String enunciado, int idPergunta, EnumIdioma idioma, EnumNivel nivel, String[] resposta, int indiceRespostaCerta) {
        this.enunciado = enunciado;
        this.idPergunta = idPergunta;
        this.idioma = idioma;
        this.nivel = nivel;
        this.resposta = resposta;
        this.indiceRespostaCerta = indiceRespostaCerta;
    }


    
    public void CriarNovaQuestao(){
        
    };
 
 }
