
package lojadecarros.pi;


import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LojaDeCarrosPI {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int f;
        int v;
        int c;
        int ven;
        int funcionarioEscolha;
        int veiculoEscolha;
        int clienteEscolha = 0;
        Funcionario funcionario = null; // variavel funcionario inicializa com null
        Veiculo veiculo = null; // variavel veiculo inicializa com null
        Cliente cliente = null; // variavel cliente inicializa com null
        
        // Cria a lista para cadastro de véiculos
        List<Veiculo> veiculoLista = new ArrayList<>();
        // Cria a lista para cadastro de funcionarios
        List<Funcionario> funcionarioLista = new ArrayList<>();
        // cria a lista para cadastro de clientes
        List<Cliente> clienteLista = new ArrayList<>();
        // cria a lista para Registro de veículos
        List<RegistroVeiculo> registroVeiculoLista = new ArrayList<>();
        // cria a lista para Registro de vendas
        List<RegistroVenda> registroVendaLista = new ArrayList<>();
        
        //loop com as opções que o usuario pode escolher
        do {
            System.out.println("----------------------------Bem-vindo à AutoNexus!----------------------------------------");
            System.out.println("|      Selecione uma opção abaixo para gerenciar os cadastros da loja                    |");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("|1 - Cadastrar Veículos                                                                  |");
            System.out.println("|     * Adicione novos veículos ao estoque                                               |");
            System.out.println("|     Obs: Você precisa ter pelos menos um funcionário cadastrado.                       |");
            System.out.println("|                                                                                        |");
            System.out.println("|2 - Cadastrar Funcionários                                                              |");
            System.out.println("|     * Inclua novos membros na equipe para melhor atendimento.                          |");
            System.out.println("|                                                                                        |");
            System.out.println("|3 - Cadastrar Clientes                                                                  |");
            System.out.println("|     * Registre novos clientes para facilitar suas compras.                             |");
            System.out.println("|                                                                                        |");
            System.out.println("|4 - Mostrar lista de veículos cadastrados                                               |");
            System.out.println("|     * Irá mostrar a lista de veículos cadastrados.                                     |");
            System.out.println("|                                                                                        |");
            System.out.println("|5 - Mostrar lista funcionários cadastrados                                              |");
            System.out.println("|     * Irá mostrar a lista de funcionário cadastrados.                                  |");
            System.out.println("|                                                                                        |");
            System.out.println("|6 - Mostrar lista de Clientes cadastrados                                               |");
            System.out.println("|     * Irá mostrar todos os clientes cadastrados.                                       |");
            System.out.println("|                                                                                        |");
            System.out.println("|7 - Cadastrar Venda                                                                     |");
            System.out.println("|     * Registra vendas no sistema.                                                      |");
            System.out.println("|     OBS: você precisa ter pelo menos 1 funcionário, veículo e um cliente cadastrado.   |");
            System.out.println("|                                                                                        |");
            System.out.println("|8 - Mostrar Lista de vendas registradas                                                 |");
            System.out.println("|     * Irá mostrar todas as vendas registradas.                                         |");
            System.out.println("|                                                                                        |");
            System.out.println("|9 - Sair do sistema                                                                     |");
            System.out.println("|     * Irá fechar e finalizar o sistema.                                                |");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.print("| Digite a opção aqui: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
                //
                switch(opcao) {
                    case 1: 
                        // Irá pedir para o usuário colocar as informações para o cadastro do veículo
                        if(funcionarioLista.isEmpty() == false) {
                            System.out.println();
                            System.out.print("Informe a marca do veículo: ");
                            String marcaVeiculo = entrada.nextLine();
                            System.out.print("Informe o modelo do veículo: ");
                            String modeloVeiculo = entrada.nextLine();
                            System.out.print("Informe a cor do veículo: ");
                            String corVeiculo = entrada.nextLine();
                            System.out.print("Informe o cambio do veículo: ");
                            String cambioVeiculo = entrada.nextLine();
                            System.out.print("Informe o ano do veículo: ");
                            String anoVeiculo = entrada.nextLine();
                            Year anoveiculo = Year.parse(anoVeiculo); // converte o anoVeiculo de String para Year
                            System.out.print("Informe os acessorios do veículo: ");
                            String acessorio = entrada.nextLine();
                            System.out.print("Informe a quilometragem do veículo: ");
                            float quilometragem = entrada.nextFloat();
                            entrada.nextLine();
                            System.out.print("Informe a condição do veículo: ");
                            String condicaoVeiculo = entrada.nextLine();
                            System.out.print("Informe como está a manutenção do veículo: ");
                            String statusManutencao = entrada.nextLine();
                            System.out.print("Informe o valor do veículo: ");
                            float precoVeiculo = entrada.nextFloat();
                            entrada.nextLine();
                            System.out.print("Informe qual a garantia do veículo(garantia da fabricante ou da loja): ");
                            String garantia = entrada.nextLine();
                            System.out.println();
                            System.out.println("----------------------------------------------------------");
                            System.out.println("|Escolha qual funcionario ira fazer o cadastro do veículo|");
                            System.out.println("----------------------------------------------------------");
                                for( f = 0; f < funcionarioLista.size(); f++){
                                   System.out.println(f + 1 + "º Funcionario\n" + funcionarioLista.get(f));
                                }
                            System.out.print("Digite a opção aqui: ");
                            funcionarioEscolha = entrada.nextInt() - 1;
                            entrada.nextLine();
                            System.out.print("Informe o dia em que o veículo foi registrado: ");
                            String dataRegistro = entrada.nextLine();
                            LocalDate dataregistro = LocalDate.parse(dataRegistro);
                            
                            // Obtém o funcionário selecionado da lista com base na escolha do usuário.
                            funcionario = funcionarioLista.get(funcionarioEscolha);
                           
                            // // Instanciamento da classe RegistroVeiculo, sem veículo associoado;
                            RegistroVeiculo registroveiculo = new RegistroVeiculo(funcionario, null, dataregistro);
                             
                            // Instanciamento da classe Veiculo;
                            veiculo = new Veiculo(marcaVeiculo, modeloVeiculo, corVeiculo, cambioVeiculo, anoveiculo, acessorio, 
                            quilometragem, condicaoVeiculo, statusManutencao, precoVeiculo, garantia, funcionario, registroveiculo);

                            // Adiciona os veículos cadastrados na list
                            veiculoLista.add(veiculo);
                            registroVeiculoLista.add(registroveiculo);
                            
                            System.out.println();
                            System.out.println("Veículo cadastrado!");
                        }
                        else if(funcionarioLista.isEmpty() == true){
                            System.out.println("Você não tem nenhum funcionario cadastrado.");
                            System.out.println();
                        }
                        break;
                        
                    case 2:
                        // Aqui irá pedir informações do funcionário para cadastro
                        System.out.println();
                        System.out.print("Informe o nome do funcionário: ");
                        String nome = entrada.nextLine();
                        System.out.print("Informe o Telefone do funcionário: ");
                        String telefone = entrada.nextLine();
                        System.out.print("Informe o CPF do funcionário: ");
                        String CPF = entrada.nextLine();
                        System.out.println();
                        System.out.println("-----------Qual sera o cargo funcionario?-------------");
                        System.out.println("|1 - Dono: salario: R$55.000, comissao: 5%           |");
                        System.out.println("|2 - Gerente: salario: R$20.000, comissao: 5%        |");
                        System.out.println("|3 - vendedor: R$3.000, comissao: 3%                 |");
                        System.out.println("|4 - Mecânico: R$4.500, comissao: não tem comissão   |");
                        System.out.println("|5 - Consultor de vendas: R$5.000, comissao: 4%      |");
                        System.out.println("------------------------------------------------------");
                        System.out.print("Digite a opção aqui: ");
                        opcao = entrada.nextInt();
                        TipoCargo tipocargo = null; // Inicia a variavel com o valor null
                            switch(opcao){
                                case 1:
                                    tipocargo = new TipoCargo("Dono", 55000.00f, 5.0f);
                                    break;
                                
                                case 2:
                                    tipocargo = new TipoCargo("Gerente", 20000.00f, 3.0f);
                                    break;
                                
                                case 3: 
                                    tipocargo = new TipoCargo("Vendedor", 3000.00f, 5.0f);
                                    break;
                                    
                                case 4:
                                    tipocargo = new TipoCargo("Mecânico", 4500.00f, 0.0f);
                                    break;
                                
                                case 5: 
                                    tipocargo = new TipoCargo("Consultor de vendas", 5000.00f, 2.0f);
                                    break;
                                default:
                                    System.out.println("Opcao inválida");
                                    break;
                            }
                            entrada.nextLine();
                            System.out.println();
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("|Agora irá cadastrar o login e senha do funcionário para conseguir utilizar o programa|");
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.print("Informe qual será o login do funcionário: ");
                        String login = entrada.nextLine();
                        System.out.print("Informe qual serÁ a senha do funcionário: ");
                        String senha = entrada.nextLine();
                        
                        // Instanciamento da classe LoginFuncionario
                        LoginFuncionario loginfuncionario = new LoginFuncionario(login, senha);
                        
                        // Instanciamento da classe Funcionario
                         funcionario = new Funcionario(loginfuncionario,tipocargo, nome, telefone, CPF);
                        
                        // adiciona os funcionários cadastrados na lista
                        funcionarioLista.add(funcionario);
                        
                        System.out.println();
                        System.out.println("Funcionário Cadastrado!");
                        break;
                        
                    case 3: 
                        // aqui irá pedir informações do cliente para o cadastro do cliente
                        System.out.println();
                        System.out.print("Informe o nome do cliente: ");
                        nome = entrada.nextLine();
                        System.out.print("Digite o telefone do usuario: ");
                        telefone = entrada.nextLine();
                        System.out.print("Informe o CPF do cliente: ");
                        CPF = entrada.nextLine();
                        
                        // Instanciamento da classe Cliente
                        cliente = new Cliente(nome, telefone, CPF);
                        
                        //Adiciona os cliente cadastrados na lista
                        clienteLista.add(cliente);
                        break;
                        
                    case 4:
                        System.out.println();
                        // Aqui irá mostrar todos os veículos cadastrados
                        System.out.println("-------------------------------");
                        System.out.println("|Lista de veículos cadastrados|");
                        System.out.println("-------------------------------");
                        for (v = 0; v < veiculoLista.size(); v++){
                        System.out.println(v + 1 + "º Veículo\n" + veiculoLista.get(v)); 
                        }
                        if(veiculoLista.isEmpty() == true) {
                            System.out.println("Não há nenhum veículo cadastrado.");
                        }
                        System.out.println();
                        break;
                    
                    case 5:    
                        System.out.println();
                        System.out.println("-----------------------------------");
                        System.out.println("|Lista de funcionarios cadastrados|");
                        System.out.println("-----------------------------------");
                        for(f = 0; f < funcionarioLista.size(); f++){
                            System.out.println(f + 1 + "º Funcionario\n" + funcionarioLista.get(f));
                        }
                        if(funcionarioLista.isEmpty() == true){
                            System.out.println("Não há nenhum funcionario cadastrado.");
                        }
                        System.out.println();
                        break;
                        
                    case 6:
                        System.out.println();
                        System.out.println("-------------------------------");
                        System.out.println("|Lista de clientes cadastrados|");
                        System.out.println("-------------------------------");
                        for(c = 0; c < clienteLista.size(); c++){
                            System.out.println(c + 1 + "º Cliente\n" + clienteLista.get(c));
                        }
                        if(clienteLista.isEmpty() == true) {
                            System.out.println("Não há nenhum cliente cadastrado.");
                        }
                        System.out.println();
                        break;
                        
                    case 7:
                        System.out.println();
                        if(veiculoLista.isEmpty() == false && funcionarioLista.isEmpty() == false && clienteLista.isEmpty() == false){
                            System.out.println("---------------------");
                            System.out.println("|Véiculo cadastrados|");
                            System.out.println("---------------------");
                            for(v = 0; v < veiculoLista.size(); v++){
                                System.out.println(v + 1 + "º Veículo\n" + veiculoLista.get(v));
                            }
                            System.out.print("Digite a o numero do veículo: ");
                            veiculoEscolha = entrada.nextInt() - 1;
                            System.out.println();
                            entrada.nextLine();
                            
                            System.out.println();
                            System.out.println("---------------------");
                            System.out.println("|Cliente Cadastrados|");
                            System.out.println("---------------------");
                            for(c = 0; c < clienteLista.size(); c++){
                                System.out.println(c + 1 + "º Cliente\n" + clienteLista.get(c));
                            }
                            System.out.print("Digite a o numero do cliente: ");
                            clienteEscolha = entrada.nextInt() - 1;
                            System.out.println();
                            entrada.nextLine();
                             
                            System.out.println();
                            for(f = 0; f < funcionarioLista.size(); f++){
                                System.out.println(f + 1 + "º Funcionário\n" + funcionarioLista.get(f));
                            }
                            System.out.print("Digite a o numero do funcionário: ");
                            funcionarioEscolha = entrada.nextInt() - 1;
                            System.out.println();
                            entrada.nextLine();
                            
                            System.out.print("Informe a data da venda: ");
                            String dataRegistro = entrada.nextLine();
                            LocalDate dataregistro = LocalDate.parse(dataRegistro);
                            
                            
                            RegistroVeiculo registroveiculo = registroVeiculoLista.get(veiculoEscolha);
                            RegistroVenda registrovenda = new RegistroVenda(funcionario, registroveiculo, veiculo, cliente, dataregistro);
                            
                            registroVendaLista.add(registrovenda);
                            
                            System.out.println();
                            System.out.println("Venda registrada!");
                        }   
                        else if(veiculoLista.isEmpty() == true && funcionarioLista.isEmpty() == true && clienteLista.isEmpty() == true){
                            System.out.println("Você precisa ter pelo menos 1 veículo, funcionário e cliente cadastrado");
                        }
                        break;
                     
                    case 8:
                        for(ven = 0; ven < registroVendaLista.size(); ven++){
                            System.out.println(ven + 1 + "º venda\n" + registroVendaLista.get(ven));
                        }
                        break;
                    default:
                        System.out.println("Opção inválida, escolha umas das opções disponiveis no menu.");
                        break;
                    }
            }while(opcao != 9);
        entrada.close();
    }
    
}
