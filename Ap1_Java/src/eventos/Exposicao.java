package eventos;
import Ingressos.TipoIngresso;

public class Exposicao extends Evento {
    private int faixaEtaria, duracaoEmDias;
    private boolean descontoSocial;

    protected Exposicao(int faixaEtaria, int duracaoEmDias, boolean descontoSocial, String nomeEvento, String data, String local, int ingressoInteira, int ingressoMeia, double precoCheio){
        super(local, data, local, ingressoInteira, ingressoMeia, precoCheio);
        this.descontoSocial = descontoSocial;
        this.duracaoEmDias = duracaoEmDias;
        this.faixaEtaria = faixaEtaria;

    }

    public int getDuracaoEmDias() {
        return duracaoEmDias;
    }
    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setDescontoSocial(boolean descontoSocial) {
        this.descontoSocial = descontoSocial;
    }
    public void setDuracaoEmDias(int duracaoEmDias) {
        this.duracaoEmDias = duracaoEmDias;
    }
    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    


}
