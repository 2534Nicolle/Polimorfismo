package Heranca;

public class Medico extends ProfissionalSaude {
	
	private String crm;  

   
    public Medico(String nome, String especialidade, int valorConsulta, String crm) {
        super(nome, especialidade, valorConsulta);
        this.crm = crm; 
    }

    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public void agendarConsulta() {
        System.out.println("Consulta com o médico " + getNome() + " (CRM: " + crm + ") foi agendada, pelo valor de " + getValorConsulta());
    }
}
