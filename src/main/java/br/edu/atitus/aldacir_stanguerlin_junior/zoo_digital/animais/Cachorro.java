package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;
//import br.edu.atitus.interfaces.Nadador;

public final class Cachorro extends Mamifero implements Corredor, Nadador{
    public Cachorro(String nome, Integer idade) {
        super(nome, idade, true);
        
        
    }

    @Override
    public void comer() {
        this.comer("ração");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está latindo!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando estilo cachorrinho!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo por todo o pátio!");
    }
    
}
