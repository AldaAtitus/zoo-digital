package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public final class Ema extends Ave implements Corredor {
    public Ema(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("frutas e insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo som grave!");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo muito rápido pela cerrado!");
    }
}