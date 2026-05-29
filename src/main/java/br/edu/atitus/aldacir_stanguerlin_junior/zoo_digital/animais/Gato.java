package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;

public final class Gato extends Mamifero implements Corredor, Nadador {
    public Gato(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() +  " está miando!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando apavorado!");
    }
    
    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo pelo telhado!");
    }
}
