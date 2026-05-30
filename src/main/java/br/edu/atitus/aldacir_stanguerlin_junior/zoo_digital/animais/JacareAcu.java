package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public final class JacareAcu extends Reptil implements Corredor, Nadador, Predador {
    public JacareAcu(String nome, Integer idade) {
        super(nome, idade, "Escamas duras", false);
    }

    @Override
    public void comer() {
        this.comer("peixes e aves");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está roncando no rio!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio Paraná!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo todo atrapalhado na beira do rio!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando na beira do rio!");
    }
}