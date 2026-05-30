package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public final class Cachorro extends Mamifero implements Corredor, Nadador, Predador{
    public Cachorro(String nome, Integer idade) {
        super(nome, idade, true);


    }

    @Override
    public void comer() {
        this.comer("ração");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está latindo!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando estilo cachorrinho!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo por todo o pátio!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está farejando e caçando um osso escondido!");}
}
