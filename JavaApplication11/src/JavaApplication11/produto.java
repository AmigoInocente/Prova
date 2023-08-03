
package JavaApplication11;


public class produto {
    
    private String nome;
            
    private Double valorUnitario;
    
    private int quantidadeDisponivel;
            
    private int quantidadeReservada;
    
    public produto(String nome, Double valorUnitario, int qtdDisp, int qtdRes){
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidadeDisponivel = qtdDisp;
        this.quantidadeReservada = qtdRes;
    }
    
    produto.add("COLAR",3 ,3 ,2);
    produto.add("PULSEIRA",3 ,3 ,2);
    produto.add("BRINCOS",3 ,3 ,2);
    produto.add("ANEL",3 ,3 ,2);
    
    public void entradaProduto(int quantidadeEntrada){
        //TODO
    }
    
    public void saidaProduto(int quantidadeSaida){
        //TODO  
    }
    
    public String toString(){
        //TODO
        return "";
    }
}
