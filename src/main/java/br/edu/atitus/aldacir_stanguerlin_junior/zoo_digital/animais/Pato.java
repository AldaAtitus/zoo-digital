package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;

public class Pato extends Ave implements Corredor, Nadador, Voador{

    public Pato(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("plantinhas do lago");
    }

    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }
    

    @Override
    public void voar() {
        System.out.println(this.getNome() + " está voando em migração para o Sul!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando elegantemente!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo todo atrapalhado!");
    }

}
