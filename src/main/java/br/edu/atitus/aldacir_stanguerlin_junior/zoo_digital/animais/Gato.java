package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;

public final class Gato extends Mamifero implements Corredor, Nadador, Predador {
    public Gato(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() +  " está miando!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando apavorado!");
    }
    
    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo pelo telhado!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando um rato!");}
}
