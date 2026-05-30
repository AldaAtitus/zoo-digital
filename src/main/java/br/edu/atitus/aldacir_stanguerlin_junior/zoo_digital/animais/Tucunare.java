package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public final class Tucunare extends Peixe implements Nadador, Predador {
    public Tucunare(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("pequenos peixes");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando rapidamente!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando em cardume!");
    }
}