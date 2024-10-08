package Atividade04;


public class Ingresso {
    private String tipoIngresso;
    private double valor;

    public Ingresso(int tipoIngresso, Integer tipoCamarote) {
        if (tipoIngresso == 1) {
            this.tipoIngresso = "Normal";
            this.valor = 50.0; // Valor do ingresso normal
        } else if (tipoIngresso == 2) {
            this.tipoIngresso = "VIP";
            if (tipoCamarote != null) {
                if (tipoCamarote == 1) {
                    this.tipoIngresso += " - Camarote Superior";
                    this.valor = 150.0; // Valor do camarote superior
                } else if (tipoCamarote == 2) {
                    this.tipoIngresso += " - Camarote Inferior";
                    this.valor = 100.0; // Valor do camarote inferior
                } else {
                    this.tipoIngresso = "Opção de camarote inválida";
                    this.valor = 0.0;
                }
            } else {
                this.tipoIngresso = "Tipo de camarote não especificado";
                this.valor = 0.0;
            }
        } else {
            this.tipoIngresso = "Tipo de ingresso inválido";
            this.valor = 0.0;
        }
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public double getValor() {
        return valor;
    }
}
