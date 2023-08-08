/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaCRUD;

/**
 *
 * @author alisson_formento
 */
public class Product {
    
    String nome;
    Double custoUnitario;
    int quantidade;
    int reservado;

    public Product(String name, Double unitCost, int quantity, int qReserved) {
        
        this.nome = name;
        this.custoUnitario = unitCost;
        this.quantidade = quantity;
        this.reservado = qReserved;
    }
    
    public void entradaDoProduto(int quantidadeEntrada) {
        this.quantidade += quantidadeEntrada;
    }
    
    public void SaidaDoProduto(int quantidadeDeSaida) {
        if (this.reservado > 0) {
            this.reservado -= quantidadeDeSaida;
        }

        if (this.reservado < 0) {
            this.quantidade += this.reservado;
        }

        if (this.reservado == 0) {
            this.quantidade -= quantidadeDeSaida;
        }
    }
    
    public String toString() {
        return this.nome
                + " R$: " + this.custoUnitario
                + " Quantidade: " + this.quantidade
                + " Reservados: " + this.reservado;
    }

    Object getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
