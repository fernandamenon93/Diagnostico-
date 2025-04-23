import java.util.Arrays;

public class DiagnosticoCovid extends Diagnostico {

    public DiagnosticoCovid() {
        super(new String[]{"febre", "tosse", "falta de ar", "perda de olfato"});
    }

    @Override
    public String avaliarPaciente(String[] sintomasInformados) {
        int coincidencias = 0;
        for (String sintoma : sintomasInformados) {
            if (Arrays.asList(sintomasComuns).contains(sintoma.toLowerCase())) {
                coincidencias++;
            }
        }

        if (coincidencias >= 2) {
            return "Possível infecção por Covid-19. Isolamento e teste recomendados.";
        } else {
            return "Poucos sintomas compatíveis com Covid-19.";
        }
    }
}
