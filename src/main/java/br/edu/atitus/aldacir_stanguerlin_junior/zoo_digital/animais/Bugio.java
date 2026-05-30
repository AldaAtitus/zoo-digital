package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.animais;

import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.comportamentos.*;
import br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies.*;

public final class Bugio extends Mamifero implements Corredor {
    public Bugio(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("frutas e folhas");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está urrando: Uuuuu uuuuu!");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo entre as árvores!");
    }
}