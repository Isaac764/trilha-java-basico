package src.Comportamentos;

public interface AparelhoTelefonico {
    public void ligar(String numero);
    public void atender(String numero);
    public void iniciarCorreioVoz(String mensagem, String destinatario);
}