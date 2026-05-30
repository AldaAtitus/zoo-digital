package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;

public final class Pinguim extends Ave implements Nadador, Predador {

    public Pinguim(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("peixes e krill");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando no gelo!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando atrás de krill no gelo!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando peixes no oceano gelado!");
    }
}