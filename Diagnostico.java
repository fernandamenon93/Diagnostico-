public abstract class Diagnostico {
    protected String[] sintomasComuns;

    public Diagnostico(String[] sintomasComuns) {
        this.sintomasComuns = sintomasComuns;
    }

    public void exibirSintomasComuns() {
        System.out.println("Sintomas comuns:");
        for (String sintoma : sintomasComuns) {
            System.out.println("- " + sintoma);
        }
    }

    public abstract String avaliarPaciente(String[] sintomasInformados);
}
