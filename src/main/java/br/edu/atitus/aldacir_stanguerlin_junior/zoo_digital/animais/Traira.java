package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public class Traira extends Peixe implements Nadador, Predador {

    public Traira(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("lambaris e outros peixes pequenos");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está espreitando atrás das pedras para atacar sua presa!");
    }
}