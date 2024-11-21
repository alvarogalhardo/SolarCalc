import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<PainelSolar> paineisSolares = new ArrayList<>();
    private static List<Medidor> medidores = new ArrayList<>();
    private static List<Simulador> simuladores = new ArrayList<>();
    private static List<Relatorio> relatorios = new ArrayList<>();

    public static void main(String[] args) {
        seedData();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Área do Cliente");
            System.out.println("2. Área do Painel Solar");
            System.out.println("3. Área do Medidor");
            System.out.println("4. Área do Simulador");
            System.out.println("5. Área do Relatório");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    menuCliente();
                    break;
                case 2:
                    menuPainelSolar();
                    break;
                case 3:
                    menuMedidor();
                    break;
                case 4:
                    menuSimulador();
                    break;
                case 5:
                    menuRelatorio();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void seedData() {
        Cliente cliente = new Cliente();
        cliente.setCodIdentificador(1);
        cliente.setNome("João Silva");
        cliente.setEmail("joao.silva@example.com");
        cliente.setEndereco("Rua A, 123");
        cliente.setTelefone("123456789");
        cliente.setConsumoMensal(350.0);
        clientes.add(cliente);

        PainelSolar painel = new PainelSolar();
        painel.setCodPainel(1);
        painel.setCodMedidorPainel(1);
        painel.setCodCadastro(1);
        painel.setModelo("Modelo A");
        painel.setPotencia(250.0f);
        painel.setEnergiaProduzida(500.0f);
        painel.setEficiencia(0.85f);
        paineisSolares.add(painel);

        Medidor medidor = new Medidor();
        medidor.setCodMedidor(1);
        medidor.setCodCadastroMedidor(new Cliente_Cadastrado());
        medidor.getCodCadastroMedidor().setCodCadastro(1);
        medidor.setModelo("Medidor X");
        medidor.setUltimaLeitura(12345.67);
        medidor.setDataLeitura(new Date());
        medidores.add(medidor);

        Simulador simulador = new Simulador();
        simulador.setCodSimulador(1);
        simulador.setPotenciaSugerida(300.0);
        simulador.setEstimativaEconomia(150.0);
        simulador.setCustoEstimado(2000.0);
        simulador.setCodIdentificadorSimulador(1);
        simuladores.add(simulador);

        Relatorio relatorio = new Relatorio();
        relatorio.setCodRelatorio(1);
        relatorio.setCodIdentificadorRelatorioFK(1);
        relatorio.setCodMedidorRelatorioFK(1);
        relatorio.setDataRelatorio(new Date());
        relatorio.setConsumoRelatorio(400);
        relatorio.setEconomiaRelatorio(100);
        relatorio.setCodCadastroRelatorio(new Cliente_Cadastrado());
        relatorio.getCodCadastroRelatorio().setCodCadastro(1);
        relatorio.setCodMedidorRelatorio(new Medidor());
        relatorio.getCodMedidorRelatorio().setCodMedidor(1);
        relatorios.add(relatorio);
    }

    private static void menuCliente() {
        while (true) {
            System.out.println("Área do Cliente:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Visualizar Clientes");
            System.out.println("3. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    criarCliente();
                    break;
                case 2:
                    visualizarClientes();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuPainelSolar() {
        while (true) {
            System.out.println("Área do Painel Solar:");
            System.out.println("1. Cadastrar Painel Solar");
            System.out.println("2. Visualizar Painéis Solares");
            System.out.println("3. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    criarPainelSolar();
                    break;
                case 2:
                    visualizarPaineisSolares();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuMedidor() {
        while (true) {
            System.out.println("Área do Medidor:");
            System.out.println("1. Cadastrar Medidor");
            System.out.println("2. Visualizar Medidores");
            System.out.println("3. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    criarMedidor();
                    break;
                case 2:
                    visualizarMedidores();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuSimulador() {
        while (true) {
            System.out.println("Área do Simulador:");
            System.out.println("1. Cadastrar Simulador");
            System.out.println("2. Visualizar Simuladores");
            System.out.println("3. Calcular Quantidade de Painéis");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    criarSimulador();
                    break;
                case 2:
                    visualizarSimuladores();
                    break;
                case 3:
                    calcularQuantidadePaineis();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuRelatorio() {
        while (true) {
            System.out.println("Área do Relatório:");
            System.out.println("1. Cadastrar Relatório");
            System.out.println("2. Visualizar Relatórios");
            System.out.println("3. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    criarRelatorio();
                    break;
                case 2:
                    visualizarRelatorios();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void criarCliente() {
        Cliente cliente = new Cliente();
        System.out.print("Nome: ");
        cliente.setNome(sc.nextLine());
        System.out.print("Email: ");
        cliente.setEmail(sc.nextLine());
        System.out.print("Consumo Mensal: ");
        cliente.setConsumoMensal(sc.nextDouble());
        sc.nextLine(); // Consumir a nova linha
        clientes.add(cliente);
        System.out.println("Cliente criado com sucesso!");
    }

    private static void visualizarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("Consumo Mensal: " + cliente.getConsumoMensal());
                System.out.println("-----------------------------");
            }
        }
    }

    private static void criarPainelSolar() {
        PainelSolar painel = new PainelSolar();
        System.out.print("Modelo: ");
        painel.setModelo(sc.nextLine());
        System.out.print("Potência: ");
        painel.setPotencia(sc.nextFloat());
        System.out.print("Energia Produzida: ");
        painel.setEnergiaProduzida(sc.nextFloat());
        System.out.print("Eficiência: ");
        painel.setEficiencia(sc.nextFloat());
        sc.nextLine(); // Consumir a nova linha
        paineisSolares.add(painel);
        System.out.println("Painel Solar criado com sucesso!");
    }

    private static void visualizarPaineisSolares() {
        if (paineisSolares.isEmpty()) {
            System.out.println("Nenhum painel solar cadastrado.");
        } else {
            for (PainelSolar painel : paineisSolares) {
                System.out.println("Modelo: " + painel.getModelo());
                System.out.println("Potência: " + painel.getPotencia());
                System.out.println("Energia Produzida: " + painel.getEnergiaProduzida());
                System.out.println("Eficiência: " + painel.getEficiencia());
                System.out.println("-----------------------------");
            }
        }
    }

    private static void criarMedidor() {
        Medidor medidor = new Medidor();
        System.out.print("Modelo: ");
        medidor.setModelo(sc.nextLine());
        System.out.print("Última Leitura: ");
        medidor.setUltimaLeitura(sc.nextDouble());
        System.out.print("Data de Leitura (timestamp): ");
        medidor.setDataLeitura(new Date(sc.nextLong()));
        sc.nextLine(); // Consumir a nova linha
        medidores.add(medidor);
        System.out.println("Medidor criado com sucesso!");
    }

    private static void visualizarMedidores() {
        if (medidores.isEmpty()) {
            System.out.println("Nenhum medidor cadastrado.");
        } else {
            for (Medidor medidor : medidores) {
                System.out.println("Modelo: " + medidor.getModelo());
                System.out.println("Última Leitura: " + medidor.getUltimaLeitura());
                System.out.println("Data de Leitura: " + medidor.getDataLeitura());
                System.out.println("-----------------------------");
            }
        }
    }

    private static void criarSimulador() {
        Simulador simulador = new Simulador();
        System.out.print("Potência Sugerida: ");
        simulador.setPotenciaSugerida(sc.nextDouble());
        System.out.print("Estimativa de Economia: ");
        simulador.setEstimativaEconomia(sc.nextDouble());
        System.out.print("Custo Estimado: ");
        simulador.setCustoEstimado(sc.nextDouble());
        sc.nextLine(); // Consumir a nova linha
        simuladores.add(simulador);
        System.out.println("Simulador criado com sucesso!");
    }

    private static void visualizarSimuladores() {
        if (simuladores.isEmpty()) {
            System.out.println("Nenhum simulador cadastrado.");
        } else {
            for (Simulador simulador : simuladores) {
                System.out.println("Potência Sugerida: " + simulador.getPotenciaSugerida());
                System.out.println("Estimativa de Economia: " + simulador.getEstimativaEconomia());
                System.out.println("Custo Estimado: " + simulador.getCustoEstimado());
                System.out.println("-----------------------------");
            }
        }
    }



    private static void calcularQuantidadePaineis() {
        if (simuladores.isEmpty() || paineisSolares.isEmpty()) {
            System.out.println("Nenhum simulador ou painel solar cadastrado.");
            return;
        }

        System.out.print("Digite o índice do painel solar: ");
        int indicePainel = sc.nextInt();
        if (indicePainel < 0 || indicePainel >= paineisSolares.size()) {
            System.out.println("Índice de painel solar inválido.");
            return;
        }

        System.out.print("Digite o custo mensal: ");
        double custoMensal = sc.nextDouble();

        Simulador simulador = simuladores.getFirst();
        PainelSolar painelSolar = paineisSolares.get(indicePainel);

        int quantidadePaineis = simulador.calcularQuantidadePaineis(painelSolar, custoMensal);
        System.out.println("Quantidade de painéis necessários: " + quantidadePaineis);
    }

    private static void criarRelatorio() {
        Relatorio relatorio = new Relatorio();
        System.out.print("Consumo Relatório: ");
        relatorio.setConsumoRelatorio(sc.nextInt());
        System.out.print("Economia Relatório: ");
        relatorio.setEconomiaRelatorio(sc.nextInt());
        System.out.print("Data do Relatório (timestamp): ");
        relatorio.setDataRelatorio(new Date(sc.nextLong()));
        sc.nextLine(); // Consumir a nova linha
        relatorios.add(relatorio);
        System.out.println("Relatório criado com sucesso!");
    }

    private static void visualizarRelatorios() {
        if (relatorios.isEmpty()) {
            System.out.println("Nenhum relatório cadastrado.");
        } else {
            for (Relatorio relatorio : relatorios) {
                System.out.println("Consumo Relatório: " + relatorio.getConsumoRelatorio());
                System.out.println("Economia Relatório: " + relatorio.getEconomiaRelatorio());
                System.out.println("Data do Relatório: " + relatorio.getDataRelatorio());
                System.out.println("-----------------------------");
            }
        }
    }
}