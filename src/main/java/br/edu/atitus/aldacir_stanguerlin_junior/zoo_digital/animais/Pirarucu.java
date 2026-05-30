package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public final class Pirarucu extends Peixe implements Nadador, Predador {
    public Pirarucu(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("outros peixes");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo barulho ao respirar!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando majestosamente!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando peixes menores!");
    }
}