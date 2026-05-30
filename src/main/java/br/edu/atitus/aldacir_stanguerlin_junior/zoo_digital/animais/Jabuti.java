package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public final class Jabuti extends Reptil implements Corredor {
    public Jabuti(String nome, Integer idade) {
        super(nome, idade, "Escamas com placas", false);
    }

    @Override
    public void comer() {
        this.comer("frutas, legumes e vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo barulho ao se recolher no casco!");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está se movimentando lentamente pelo terreno... (parece que está correndo, mas é devagar)");
    }
}