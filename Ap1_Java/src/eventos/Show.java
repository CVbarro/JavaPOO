package eventos;

import Ingressos.TipoIngresso;

public class Show extends Evento {
    private String nomeArtista, generoMusica, localizacaoIngresso;

    protected Show(String nomeArtista, String generoMusica, String localizacaoIngresso, String nomeEvento, String data, String local, int ingressoInteira, int ingressoMeia, double precoCheio) {
        super(nomeEvento, data, local, ingressoInteira, ingressoMeia, precoCheio);
        this.generoMusica = generoMusica;
        this.localizacaoIngresso = localizacaoIngresso;
        this.nomeArtista = nomeArtista;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    @Override
    public double getPrecoIngresso(TipoIngresso tipo) {
        return super.getPrecoCheio() * (tipo == TipoIngresso.Inteira ? 1.0 : 0.5);
    }


    public String informacoesEvento() {
        return toString() + "Show: " + getNomeEvento()  + "\nArtista: " + getNomeArtista() + "\nGênero: " + getGeneroMusica();
    }

    public int ingressoRestante(int quantidade) {
        if (quantidade > 0) {
            System.out.println("O restante de ingressos é " + quantidade);
        } else {
            System.out.println("Os ingressos estão esgotados");
        }
        return quantidade;
    }


}
