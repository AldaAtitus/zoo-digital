package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

/*
Não é o ser mitoloígico. O gavião-real (nome científico: Harpia harpyja), também chamado cutucurim,
gavião-de-penacho, HARPIA, uiraçu, uiracuir, uiruuetê, uraçu, águia-imperial-brasileira,
águia-imperial ou uiraçu-verdadeiro, é uma ave acipitriforme da família dos acipitrídeos
(Accipitridae). É a maior e mais poderosa ave de rapina encontrada em toda a sua extensão
e está entre as maiores espécies de águias existentes no mundo.
*/

public final class Harpia extends Ave implements Voador, Predador {
    public Harpia(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("macacos e preguiças");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um grito agudo de rapina!");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando alto em busca de presas!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando na copa da floresta!");
    }
}
