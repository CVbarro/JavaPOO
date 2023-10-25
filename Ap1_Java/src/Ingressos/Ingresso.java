package Ingressos;
import eventos.Evento;

public abstract class Ingresso {
    private Evento evento;
    private TipoIngresso tipo;

    public Ingresso(Evento evento, TipoIngresso tipo) {
        this.evento = evento;
        this.tipo = tipo;
    }

    public Evento getEvento() {
        return evento;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setTipo(TipoIngresso tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        switch (tipo) {
            case Inteira:
                return evento.getPrecoCheio();
            case Meia:
                return evento.getPrecoCheio() / 2;
            default:
                return 0.0;
        }
    }
}

