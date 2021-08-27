package com.noveli.cursojava.aulaenum4;

public class Pessoa {

    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

    public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public Pessoa() {
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return tipoDocumento.toString() + " - " + numeroDocumento;
    }
}
