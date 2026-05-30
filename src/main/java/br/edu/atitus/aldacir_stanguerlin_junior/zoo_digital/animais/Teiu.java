package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public final class Teiu extends Reptil implements Corredor, Predador {
    public Teiu(String nome, Integer idade) {
        super(nome, idade, "Escamas pequenas", false);
    }

    @Override
    public void comer() {
        this.comer("frutas, ovos e pequenos animais");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está assobiando!");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo rapidamente no cerrado!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos insetos, roedores e lagartos!");
    }
}