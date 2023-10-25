package eventos;
import Ingressos.TipoIngresso;

public class Jogo extends Evento{
    private String esporte, equipes;
    private double descontoTorcedor;

    protected Jogo(String esporte, String equipes, double descontoTorcedor, String nomeEvento, String data, String local, int ingressoInteira, int ingressoMeia, double precoCheio){
        super(equipes, data, local, ingressoInteira, ingressoMeia, precoCheio);
        this.descontoTorcedor = descontoTorcedor;
        this.equipes = equipes;
        this.esporte = esporte;

    }
    public double getDescontoTorcedor() {
        return descontoTorcedor;
    }
    public String getEquipes() {
        return equipes;
    }
    public String getEsporte() {
        return esporte;
    }
    public void setDescontoTorcedor(double descontoTorcedor) {
        this.descontoTorcedor = descontoTorcedor;
    }
    public void setEquipes(String equipes) {
        this.equipes = equipes;
    }
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }


    

}
