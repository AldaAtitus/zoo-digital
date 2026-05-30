package br.edu.atitus.aldacir_stanguerlin_junior.zoo_digital.especies;

public abstract class Reptil extends Animal {
    private String tipoEscama;
    private boolean venenoso;

    public Reptil(String nome, Integer idade, String tipoEscama, boolean venenoso) {
        super(nome, "Réptil", idade);
        this.tipoEscama = tipoEscama;
        this.venenoso = venenoso;
    }

    public String getTipoEscama() {
        return tipoEscama;
    }

    public void setTipoEscama(String tipoEscama) {
        this.tipoEscama = tipoEscama;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public void rastejar() {
        IO.println(this.getNome() + " está rastejando pelo chão.");
    }
}