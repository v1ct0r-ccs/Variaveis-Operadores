package src;

public class Exemplos {
    private int codigo = 1;
    private long codigoMaior = 1204050;
    private double valorDecimal1 = 10.1;
    private boolean status = false;
    private String texto = "aasdads2434344334";
    private float valorDecimal = 10.0f;
    private short shor;
    private byte bi;
    public  Exemplos() {

    }
    public Exemplos(int val) {
        this.codigo = val;
    }

    public String retornarTexto() {
        this.codigo = 0;
        return "Zerãozão";
    }

    public int retornarInteiro() {
        int val = 10;
        String texto = "texto";
        this.texto = null;
        return val;
    }

    public long retornarLong(long num) {
        this.texto = "asds";
        return num;
    }
}
