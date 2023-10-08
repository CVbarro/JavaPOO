import CLI;
import TipoIngresso;

package eventos;
public abstract class Evento implements CLI{
    private String nomeEvento, data, local;
    private int ingressoInteira, ingressoMeia;
    private double precoCheio;

    protected Evento(String nomeEvento, String data, String local, int ingressoInteira, int ingressoMeia, double precoCheio){
        this.data = data;
        this.local = local;
        this.nomeEvento = nomeEvento;
        this.ingressoInteira = ingressoInteira;
        this.ingressoMeia = ingressoMeia;
        this.precoCheio = precoCheio;

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
    public void setNomeEvento(String nome) {
        this.nomeEvento = nomeEvento;
    }
    public void setPrecoCheio(double precoCheio) {
        this.precoCheio = precoCheio;
    }

    public abstract boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade);
    public abstract double venderIngresso(TipoIngresso tipo, int quantidade);

}