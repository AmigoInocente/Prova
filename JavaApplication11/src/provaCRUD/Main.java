/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaCRUD;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        
        // CRIA LISTA
        List<Product>listaDeProduto = new ArrayList<>();
        
            // MOSTRA O MENU PRINCIPAL
            String menuPrincipal =  "Menu da lanchonete do Zeca:\n"+
                                    "1 - Adicionar produtos\n"+ //1 PRODUTO POR VEZ
                                    "2 - Consultar produtos\n"+ //1 PRODUTO POR VEZ(mostra 1 de cada vez)
                                    "3 - Excluir produto\n"+ //1 PRODUTO POR VEZ
                                    "4 - Atualizar produto\n"+ //1 PRODUTO POR VEZ
                                    "5 - Fazer reserva\n"+ //Aumentar quantidade de reserva e diminuir quantidade do produto 
                                    "6 - Cancelar reserva\n"+
                                    "7 - Saída de produto\n"+
                                    "8 - Sair do menu";
                
        
            int respostaMenuPrincipal = 0;           
        while (respostaMenuPrincipal != 8){

            respostaMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
            switch (respostaMenuPrincipal){                
                    
                case 1:// INSERE UM PRODUTO
                            
                    adicionarProduto(listaDeProduto);                    
                    break;
                case 2:// MOSTRA OS PRODUTOS INSERIDOS
                    
                    exibirMenuProdutos(listaDeProduto);
                    break;
                case 3:// ATUALIZA UM PRODUTO DO ESTOQUE
                    
                    remocaoProduto(listaDeProduto);
                    break;                  
                case 4:// REMOVE UM PRODUTO DO ESTOQUE
                                        
                    atualizacaoProduto(listaDeProduto);
                    break;
                case 5:// FAZ A RESERVA DE UM PRODUTO
                    
                    saidaDeEstoque(listaDeProduto);
                    break;
                case 6:// CANCELA A RESERVA DE UM PRODUTO
                    
                    
                    break;
                case 7:
                    
                    break;
                case 8:// ENCERRA A PROGRAMAÇÃO
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nosso serviço...\n"+
                                                        "Até logo!");                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }

        
        
    }
      
    public static void adicionarProduto(List<Product> listaDeProdutos) {
        String name = JOptionPane.showInputDialog("Por favor, digite o nome do produto que você deseja cadastrar:");
        Double cost = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite o valor do custo unitário:"));
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o valor de Quantidade disponível:"));
        int res = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o valor da Quantidade reservada:"));

        Product p = new Product(name, cost, qtd, res);

        listaDeProdutos.add(p);
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
    }
    
    public static void exibirMenuProdutos(List<Product>listaDeProduto){// 
        
        if (listaDeProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Estoque sem produtos cadastrados!");
        } else {
            String productsToPrint = "Lista de Produtos (nome, custo, quantidade, reserva)\n";
            for (int i = 0; i < listaDeProduto.size(); i++) {
                productsToPrint += "\n" + listaDeProduto.get(i).toString();
                if (i == listaDeProduto.size() - 1) {
                    JOptionPane.showMessageDialog(null, productsToPrint);
                    productsToPrint = "Lista de Produtos (nome, custo, quantidade, reserva)\n";
                }
            }
        }
                     
    }

    public static void remocaoProduto(List<Product>listaDeProduto) {
        String perguntaRemocao = JOptionPane.showInputDialog("O que você quer remover do nosso estoque?");
        
        for(int i = 0; i < listaDeProduto.size(); i++){
        Product p = listaDeProduto.get(i);

            if(p.getNome().equals(perguntaRemocao)){
            
            listaDeProduto.remove(p);

            }else{
            JOptionPane.showMessageDialog(null, "Desculpe, não temos este produto na nossa loja...");
            }
        }            
    }

    public static void atualizacaoProduto(List<Product>listaDeProduto) {
        String perguntaAtualizacao = JOptionPane.showInputDialog("Qual produto você deseja atualizar de nosso estoque?");
        for(int i = 0; i < listaDeProduto.size(); i++)
    {
        Product p = listaDeProduto.get(i);

        if(p.getNome().equals(perguntaAtualizacao)){
            String menuAtualizacao = JOptionPane.showInputDialog("O que você quer atualizar de nosso estoque?\n"+
                    "1 - Nome\n"+
                    "2 - Custo\n"+
                    "3 - Quantidade em estoque\n"+
                    "4 - Quantidade Reservada\n"+
                    "5 - Sair do menu");

            int respostaAtualizacao = 0;
            while (respostaAtualizacao != 5){
            respostaAtualizacao = Integer.parseInt(JOptionPane.showInputDialog(menuAtualizacao));
                int indiceProduto = listaDeProduto.indexOf(respostaAtualizacao);
                switch(respostaAtualizacao) {
                case 1:
                    
                    String respostaAtualizacaoNome = JOptionPane.showInputDialog("Por favor, digite o novo nome que o produto deverá ser chamado:");
                    listaDeProduto.get(indiceProduto).nome = respostaAtualizacaoNome;
                    break;
                case 2:
                    
                    double respostaAtualizacaoCusto = Double.valueOf(JOptionPane.showInputDialog("Por favor, digite o novo custo que o produto terá:"));
                    listaDeProduto.get(indiceProduto).custoUnitario = respostaAtualizacaoCusto;
                    break;
                case 3:
                    int respostaAtualizacaoQuantidadeEmEstoque = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite a nova quantidade que o produto terá:"));
                    listaDeProduto.get(indiceProduto).quantidade = respostaAtualizacaoQuantidadeEmEstoque;
                    break;
                case 4:
                    int respostaAtualizacaoQuantidadeReservada = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite a nova quantidade reservada que o produto terá:"));
                    listaDeProduto.get(indiceProduto).reservado = respostaAtualizacaoQuantidadeReservada;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
                    
                }
            
            }
        
        }else{
            JOptionPane.showMessageDialog(null, "Desculpe, não temos este produto na nossa loja...");
        }}
        
    }

    public static void saidaDeEstoque(List<Product>listaDeProduto) {
        
    
        String perguntaSaida = JOptionPane.showInputDialog("Qual produto você deseja retirar de nosso estoque?");
        
        for(int i = 0; i < listaDeProduto.size(); i++){
        Product p = listaDeProduto.get(i);
        int indiceProduto = listaDeProduto.indexOf(perguntaSaida);
        if(p.getNome().equals(perguntaSaida)){
            int menuSaida = Integer.parseInt(JOptionPane.showInputDialog("Qual quantidade você deseja retirar deste produto?"));
            
            if(menuSaida > listaDeProduto.reservado){
            
            }else if(menuSaida == listaDeProduto.reservado){
            listaDeProduto.get(indiceProduto).reservado = 0;
            
            }else if(){
            
            }

            
                    
        }else{
            JOptionPane.showMessageDialog(null, "Desculpe, não temos este produto na nossa loja...");
        }
           
        }
    }
    
}


/* REQUISITOS:
Desenvolva um sistema em Java com persistência de dados em memória, famoso CRUD.(show input dialog)switch case
O sistema deve apresentar um menu ao usuário, refletindo a situação de um estoque do e-comerce da Joana, da loja Jôjoias
No menu deve ser possivel adicionar produto, excluir, consultar e atualizar
Quando for comprado mais produtos ela precisa aumentar quantidade de produtos disponivel.
Quando o usuário consultar a lista de produtos da loja, sendo mostrado valor unitário, quantidade disponivel e quantidade reservada
O usuário pode pedir para reservar um produto 
O sistema não controla pedidos, mas deve ser possível cancelar uma reserva.
Saída do estoque reserva para venda.

Produto1
Produto2
Produto3
Produto4

*/
