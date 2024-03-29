package Transportadora;


public class Cotacao {
    private Endereco cepOrigem,cepDestino;
    private int quantidadeCaixa;
    private Caixa dimensaoCaixa;

    public Cotacao() {
    }
    
    public Cotacao(Endereco cepOrigem, Endereco cepDestino, int quantidadeCaixa, Caixa dimensaoCaixa) {
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.quantidadeCaixa = quantidadeCaixa;
        this.dimensaoCaixa = dimensaoCaixa;
    }

    public Endereco getCepOrigem() {
        return cepOrigem;
    }

    public void setCepOrigem(Endereco cepOrigem) {
        this.cepOrigem = cepOrigem;
    }

    public Endereco getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(Endereco cepDestino) {
        this.cepDestino = cepDestino;
    }

    public int getQuantidadeCaixa() {
        return quantidadeCaixa;
    }

    public void setQuantidadeCaixa(int quantidadeCaixa) {
        this.quantidadeCaixa = quantidadeCaixa;
    }

    public Caixa getDimensaoCaixa() {
        return dimensaoCaixa;
    }

    public void setDimensaoCaixa(Caixa dimensaoCaixa) {
        this.dimensaoCaixa = dimensaoCaixa;
    }
    
    
    public double CalculoPrecoBase(){
        return 0;
    }
    
    
}
