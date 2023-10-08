package eventos;
import TipoIngresso;

public class Show extends Evento {
    private String nomeArtista, generoMusica, localizacaoIngresso;

    protected Show(String nomeArtista, String generoMusica, String localizacaoIngresso, String nomeEvento, String data, String local, int ingressoInteira, int ingressoMeia, double precoCheio){
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
    public boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade){

    }
    @Override
    public double venderIngresso(TipoIngresso tipo, int quantidade){

    }





}
