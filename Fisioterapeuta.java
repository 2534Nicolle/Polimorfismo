package Heranca;

public class Fisioterapeuta extends ProfissionalSaude {
	
	private String crefito;  
	
	
	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
        super(nome, especialidade, valorConsulta);
        this.crefito = crefito; 
    }

    public String getCrefito() {
        return crefito;
    }

    public void setCrefito(String crefito) {
        this.crefito = crefito;
    }

    @Override
    public void agendarConsulta() {
        System.out.println("Consulta com o fisioterapeuta " + getNome() + " (CREFITO: " + crefito + ") foi agendada, pelo valor de " + getValorConsulta());
    }
}
