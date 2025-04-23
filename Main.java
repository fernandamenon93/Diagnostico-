import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os sintomas do paciente (separados por vírgula):");
        String entrada = scanner.nextLine();
        String[] sintomasInformados = entrada.toLowerCase().split(",");

        Diagnostico gripe = new DiagnosticoGripe();
        Diagnostico covid = new DiagnosticoCovid();

        System.out.println("\n--- Diagnóstico Gripe ---");
        gripe.exibirSintomasComuns();
        System.out.println(gripe.avaliarPaciente(sintomasInformados));

        System.out.println("\n--- Diagnóstico Covid ---");
        covid.exibirSintomasComuns();
        System.out.println(covid.avaliarPaciente(sintomasInformados));

        scanner.close();
    }
}
