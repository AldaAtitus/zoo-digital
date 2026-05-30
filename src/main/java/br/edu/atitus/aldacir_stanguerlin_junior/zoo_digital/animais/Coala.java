package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public final class Coala extends Mamifero implements Corredor {
    public Coala(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("folhas de eucalipto");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grunhindo!");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo devagar pelos galhos!");
    }
}