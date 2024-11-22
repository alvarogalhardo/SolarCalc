import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

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
            sc.nextLine();

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

        PainelSolar painel1 = new PainelSolar();
        painel1.setCodPainel(1);
        painel1.setCodMedidorPainel(1);
        painel1.setCodCadastro(1);
        painel1.setModelo("Modelo A: Casas ate 300 m²");
        painel1.setPotencia(400.0f);
        painel1.setEnergiaProduzida(60.0f);
        painel1.setEficiencia(0.20f);
        paineisSolares.add(painel1);

        PainelSolar painel2 = new PainelSolar();
        painel2.setCodPainel(2);
        painel2.setCodMedidorPainel(2);
        painel2.setCodCadastro(2);
        painel2.setModelo("Modelo B: Casas ate 500 m²");
        painel2.setPotencia(450.0f);
        painel2.setEnergiaProduzida(67.5f);
        painel2.setEficiencia(0.22f);
        paineisSolares.add(painel2);

        PainelSolar painel3 = new PainelSolar();
        painel3.setCodPainel(3);
        painel3.setCodMedidorPainel(3);
        painel3.setCodCadastro(3);
        painel3.setModelo("Modelo C: Condominios com media de ate 30 apartamentos: ");
        painel3.setPotencia(500.0f);
        painel3.setEnergiaProduzida(75.0f);
        painel3.setEficiencia(0.23f);
        paineisSolares.add(painel3);

        PainelSolar painel4 = new PainelSolar();
        painel4.setCodPainel(4);
        painel4.setCodMedidorPainel(4);
        painel4.setCodCadastro(4);
        painel4.setModelo("Modelo C: Condominios com media de ate 50 apartamentos: ");
        painel4.setPotencia(550.0f);
        painel4.setEnergiaProduzida(82.5f);
        painel4.setEficiencia(0.25f);
        paineisSolares.add(painel4);


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
            sc.nextLine();

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
            System.out.println("1. Cadastrar Novo Painel Solar");
            System.out.println("2. Visualizar Painéis Solares");
            System.out.println("3. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

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
            sc.nextLine();

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
            sc.nextLine();

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
        System.out.print("Consumo Mensal em kWh (Ex: 000,00): ");
        cliente.setConsumoMensal(sc.nextDouble());
        sc.nextLine();
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
                System.out.println("Consumo Mensal " + cliente.getConsumoMensal() + " kWh");
                System.out.println("-----------------------------");
            }
        }
    }

    private static void criarPainelSolar() {
        PainelSolar painel = new PainelSolar();
        System.out.print("Modelo: ");
        painel.setModelo(sc.nextLine());
        System.out.print("Potência em Watt (Ex: 000,00): ");
        painel.setPotencia(sc.nextFloat());
        System.out.print("Energia Produzida em kWh (Ex: 0,00): ");
        painel.setEnergiaProduzida(sc.nextFloat());
        System.out.print("Eficiência (Ex 0,00): ");
        painel.setEficiencia(sc.nextFloat());
        sc.nextLine();
        paineisSolares.add(painel);
        System.out.println("Painel Solar criado com sucesso!");
    }

    private static void visualizarPaineisSolares() {

        if (paineisSolares.isEmpty()) {
            System.out.println("Nenhum painel solar cadastrado.");
        } else {
            for (PainelSolar painel : paineisSolares) {
                System.out.println("\n");
                System.out.println("Modelo: " + painel.getModelo());
                System.out.println("\t•\t Potência: " + painel.getPotencia() + " W");
                System.out.println("\t•\t Energia Produzida: " + painel.getEnergiaProduzida() + " kWh");
                System.out.println("\t•\t Eficiência: " + painel.getEficiencia());
                System.out.println("-----------------------------");
            }
        }
    }

    private static void criarMedidor() {
        Medidor medidor = new Medidor();


        System.out.print("Modelo: ");
        medidor.setModelo(sc.nextLine());
        System.out.print("Última Leitura em kWh (Ex:0,000): ");
        medidor.setUltimaLeitura(sc.nextDouble());
        sc.nextLine();
        System.out.print("Data de Leitura (dd/MM/yyyy): ");
        String dataString = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        sdf.setLenient(false);
        try {
            medidor.setDataLeitura(sdf.parse(dataString));
        } catch (ParseException e) {
            System.out.println("Data inválida! Use o formato dd/MM/yyyy.");
            return;
        }
        medidores.add(medidor);
        System.out.println("Medidor criado com sucesso!");
    }


    private static void visualizarMedidores() {
        if (medidores.isEmpty()) {
            System.out.println("Nenhum medidor cadastrado.");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            for (Medidor medidor : medidores) {
                System.out.println("Modelo: " + medidor.getModelo());
                System.out.println("Última Leitura: " + medidor.getUltimaLeitura() + " kWh");
                System.out.println("Data de Leitura: " + sdf.format(medidor.getDataLeitura()));
                System.out.println("-----------------------------");
            }
        }
    }

    private static void criarSimulador() {
        Simulador simulador = new Simulador();
        System.out.print("Potência Sugerida em Watt: ");
        simulador.setPotenciaSugerida(sc.nextDouble());
        System.out.print("Estimativa de Economia: ");
        simulador.setEstimativaEconomia(sc.nextDouble());
        System.out.print("Custo Estimado: ");
        simulador.setCustoEstimado(sc.nextDouble());
        sc.nextLine();
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

    private static void criarRelatorio() {
        Relatorio relatorio = new Relatorio();


        System.out.print("Consumo Relatório em kWh (Ex:0,00): ");
        relatorio.setConsumoRelatorio(sc.nextDouble());
        System.out.print("Economia Relatório em kWh (Ex:0,00): ");
        relatorio.setEconomiaRelatorio(sc.nextDouble());
        sc.nextLine();
        System.out.print("Data do Relatório (dd/MM/yyyy): ");
        String dataString = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            relatorio.setDataRelatorio(sdf.parse(dataString));
        } catch (ParseException e) {
            System.out.println("Data inválida! Use o formato dd/MM/yyyy.");
            return;
        }
        relatorios.add(relatorio);
        System.out.println("Relatório criado com sucesso!");
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


    private static void visualizarRelatorios() {
        if (relatorios.isEmpty()) {
            System.out.println("Nenhum relatório cadastrado.");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            for (Relatorio relatorio : relatorios) {
                System.out.println("Consumo Relatório: " + relatorio.getConsumoRelatorio() + " kWh");
                System.out.println("Economia Relatório: " + relatorio.getEconomiaRelatorio() + " kWh");
                System.out.println("Data do Relatório: " + sdf.format(relatorio.getDataRelatorio()));
                System.out.println("-----------------------------");
            }
        }
    }


}