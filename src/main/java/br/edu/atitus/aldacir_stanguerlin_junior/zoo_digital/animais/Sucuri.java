package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public final class Sucuri extends Reptil implements Nadador, Predador {
    public Sucuri(String nome, Integer idade) {
        super(nome, idade, "Escamas lisas", false);
    }

    @Override
    public void comer() {
        this.comer("roedores e capivaras");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando alto!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no pantanal!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está constrictando sua presa!");
    }
}