package eventos;

import Ingressos.TipoIngresso;

public abstract class Evento implements CLI {
    private String nomeEvento, data, local;
    private int ingressoInteira, ingressoMeia;
    protected double precoCheio;
    protected int ingressosMeia;
    protected int ingressosInteira;

    protected Evento(String nomeEvento, String data, String local, int ingressoInteira, int ingressoMeia, double precoCheio) {
        this.data = data;
        this.local = local;
        this.nomeEvento = nomeEvento;
        this.ingressoInteira = ingressoInteira;
        this.ingressoMeia = ingressoMeia;
        this.precoCheio = precoCheio;
        this.ingressosMeia = 0; // Inicializa a quantidade de ingressos meia
        this.ingressosInteira = 0; // Inicializa a quantidade de ingressos inteira
    }

    public String getData() {
        return data;
    }

    public int getIngressoInteira() {
        return ingressoInteira;
    }

    public int getIngressoMeia() {
        return ingressoMeia;
    }

    public String getLocal() {
        return local;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public double getPrecoCheio() {
        return precoCheio;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setIngressoInteira(int ingressoInteira) {
        this.ingressoInteira = ingressoInteira;
    }

    public void setIngressoMeia(int ingressoMeia) {
        this.ingressoMeia = ingressoMeia;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setPrecoCheio(double precoCheio) {
        this.precoCheio = precoCheio;
    }

    public abstract double getPrecoIngresso(TipoIngresso tipo);

    public abstract String informacoesEvento();

    public boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade) {
        if (tipo == TipoIngresso.Inteira) {
            return ingressosInteira >= quantidade;
        } else if (tipo == TipoIngresso.Meia) {
            return ingressosMeia >= quantidade;
        } else {
            return false;
        }
    }

    public double venderIngresso(TipoIngresso tipo, int quantidade) {
        if (isIngressoDisponivel(tipo, quantidade)) {
            if (tipo == TipoIngresso.Inteira) {
                ingressosInteira -= quantidade;
                return precoCheio * quantidade;
            } else if (tipo == TipoIngresso.Meia) {
                ingressosMeia -= quantidade;
                return (precoCheio / 2) * quantidade;
            }
        }
        return 0;
    }

    public int ingressoRestante(int quantidade) {
        if (quantidade > 0) {
            System.out.println("O restante de ingressos é " + quantidade);
        } else {
            System.out.println("Os ingressos estão esgotados");
        }
        return quantidade;
    }
    @Override
    public String toString() {
        return "Nome do Evento: " + getNomeEvento() + "\n" +
               "Data: " + getData() + "\n" +
               "Local do Evento: " + getLocal() + "\n" +
               "Total de Ingressos Inteira: " + getIngressoInteira() + "\n" +
               "Total de Ingressos Meia: " + getIngressoMeia() + "\n" +
               "Valor do Ingresso: " + getPrecoCheio() + "\n";
    }
}

