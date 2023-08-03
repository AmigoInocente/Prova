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
        
        //List<Produto> ListaProduto = new ArrayList<>();
       
        //LISTA DE PRODUTOS
        ArrayList<Integer> COLAR = new ArrayList<>(); //CRIOU UMA LISTA
        ArrayList<Integer> BRINCOS = new ArrayList<>(); //CRIOU UMA LISTA
        ArrayList<Integer> PULSEIRA = new ArrayList<>(); //CRIOU UMA LISTA
        ArrayList<Integer> ANEL = new ArrayList<>(); //CRIOU UMA LISTA
        

        
        int opcao;
        do {
            
            opcao = exibirMenu();// MOSTRA O MENU PRINCIPAL

            switch (opcao) {
                case 1:// ENTRA UM PRODUTO
                            
                    
                    exibirMenuAdicionar();// MOSTRA O MENU DE ADICIONAR PRODUTO
                    break;
                case 2:// CADASTRA UM PRODUTO
                    
                    cadastrarProduto();
                    break;
                case 3:// MOSTRA ATUALIZAÇÃO DE UM PRODUTO DO ESTOQUE
                    
                    atualizacaoProduto();
                    break;                  
                case 4:// MOSTRA REMOÇÃO DE UM PRODUTO DO ESTOQUE
                                        
                    remocaoProduto();
                    break;
                case 5:// MOSTRA SAÍDA DO ESTOQUE
                    
                    saidaEstoque();
                    break;
                case 6:// MOSTRA QUANTIDADE DE ESTOQUE
                    JOptionPane.showMessageDialog(null, 
                                            "ESTOQUE DE JOIAS:\n"+
                                            "QUANTIDADE DE COLARES: "+COLAR+"\n"+
                                            "QUANTIDADE DE BRINCOS: "+BRINCOS+"\n"+
                                            "QUANTIDADE DE PULSEIRAS: "+PULSEIRA+"\n"+
                                            "QUANTIDADE DE ANEIS: "+ANEL);        
                       
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                }
        } while (opcao != 7);
        
        
    }
    public static int exibirMenu() {// FUNÇÃO DO MENU PRINCIPAL
        String menu = "Selecione uma opção:\n" +
                      "1 - ENTRADA DE UM PRODUTO\n" +
                      "2 - CADASTRAR UM PRODUTO\n" +
                      "3 - ATUALIZAR UM UM PRODUTO DO ESTOQUE\n" +
                      "4 - REMOVER UM PRODUTO DO ESTOQUE\n" +
                      "5 - SAÍDA DE UM PRODUTO\n" +
                      "6 - QUANTIDADE EM ESTOQUE\n" +
                      "7 - SAIR";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
    
    public static void exibirMenuAdicionar(){// 
        
            String add = JOptionPane.showInputDialog("Digite:\n"+
                                                     "1 - para adicionar um colar. \n"+
                                                     "2 - para adicionar brincos. \n"+
                                                     "3 - para adicionar uma pulseira. \n"+
                                                     "4 - para adicionar um anel");
        
            int adicionarQuantidade = Integer.parseInt(JOptionPane.showInputDialog(add));
            menuAdicionar(adicionarQuantidade);           
    }
    
    public static int menuAdicionar(<Integer> COLAR,<Integer> PULSEIRA,<Integer> BRINCOS,<Integer> ANEL){// PERGUNTA QUAL PRODUTO ADICIONAR PUXANDO AS LISTAS E A ESPOSTA AO MENU
        switch(){
                    case 1:
                        String addColar = JOptionPane.showInputDialog("Quantos colares você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addColar));
                        COLAR.add(addColar);
                    case 2:
                        String addBrinco = JOptionPane.showInputDialog("Quantos brincos você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addBrinco));
                        BRINCOS.add(addBrinco);
                    case 3:
                        String addPulseira = JOptionPane.showInputDialog("Quantas pulseiras você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addPulseira));
                        PULSEIRA.add(addPulseira);
                    case 4:
                        String addAnel = JOptionPane.showInputDialog("Quantos aneis você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addAnel));
                        ANEL.add(addAnel);
                    default:
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
    }
    
    public static void cadastrarProduto(List<Integer> listaProdutos) {
        String nome = JOptionPane.showInputDialog("DIGITE O NOME DO PRODUTO QUE VOCÊ DESEJA ADICIONAR:");
        

        Produto produto = new Produto(nome);
        listaProdutos.add(produto);

        JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO COM SUCESSO!");
    }

    private static void remocaoProduto() {
        String nome = JOptionPane.showInputDialog("QUANTOS PRODUTOS FORAM REMOVIDOS DO ESTOQUE?\n"+
                                                     "1 - COLAR \n"+
                                                     "2 - BRINCOS \n"+
                                                     "3 - PULSEIRA \n"+
                                                     "4 - ANEL");
        int numeroInteiro = Integer.parseInt(nome);
    
        switch(numeroInteiro){
                    case 1:
                        String addColar = JOptionPane.showInputDialog("Quantos colares você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addColar));
                        COLAR.add(addColar);
                    case 2:
                        String addBrinco = JOptionPane.showInputDialog("Quantos brincos você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addBrinco));
                        BRINCOS.add(addBrinco);
                    case 3:
                        String addPulseira = JOptionPane.showInputDialog("Quantas pulseiras você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addPulseira));
                        PULSEIRA.add(addPulseira);
                    case 4:
                        String addAnel = JOptionPane.showInputDialog("Quantos aneis você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addAnel));
                        ANEL.add(addAnel);
                    default:
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
    }

    private static void atualizacaoProduto() {
        String nome = JOptionPane.showInputDialog("QUAL PRODUTO PRECISA SER ATUALIZADO?\n"+
                                                     "1 - COLAR \n"+
                                                     "2 - BRINCOS \n"+
                                                     "3 - PULSEIRA \n"+
                                                     "4 - ANEL");
        int numeroInteiro = Integer.parseInt(nome);

        switch(numeroInteiro){
                    case 1:
                        String addColar = JOptionPane.showInputDialog("Qual é a quantidade de colares atual?");
                        Integer.parseInt(JOptionPane.showInputDialog(addColar));
                        
                    case 2:
                        String addBrinco = JOptionPane.showInputDialog("Qual é a quantidade de brincos atual?");
                        Integer.parseInt(JOptionPane.showInputDialog(addBrinco));
                        
                    case 3:
                        String addPulseira = JOptionPane.showInputDialog("Qual é a quantidade de pulseiras atual?");
                        Integer.parseInt(JOptionPane.showInputDialog(addPulseira));
                        
                    case 4:
                        String addAnel = JOptionPane.showInputDialog("Qual é a quantidade de aneis atual?");
                        Integer.parseInt(JOptionPane.showInputDialog(addAnel));
                        
                    default:
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
        
    }

    private static void saidaEstoque() {
        String nome = JOptionPane.showInputDialog("QUAIS PRODUTOS SAÍRAM DO ESTOQUE?\n"+
                                                     "1 - COLAR \n"+
                                                     "2 - BRINCOS \n"+
                                                     "3 - PULSEIRA \n"+
                                                     "4 - ANEL");
        int numeroInteiro = Integer.parseInt(nome);
        switch(numeroInteiro){
                    case 1:
                        String addColar = JOptionPane.showInputDialog("Quantos colares você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addColar));
                        COLAR.add(addColar);
                    case 2:
                        String addBrinco = JOptionPane.showInputDialog("Quantos brincos você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addBrinco));
                        BRINCOS.add(addBrinco);
                    case 3:
                        String addPulseira = JOptionPane.showInputDialog("Quantas pulseiras você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addPulseira));
                        PULSEIRA.add(addPulseira);
                    case 4:
                        String addAnel = JOptionPane.showInputDialog("Quantos aneis você quer adicionar?");
                        Integer.parseInt(JOptionPane.showInputDialog(addAnel));
                        ANEL.add(addAnel);
                    default:
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
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
