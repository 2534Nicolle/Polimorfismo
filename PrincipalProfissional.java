package Heranca;

public class PrincipalProfissional {
	
	    public static void main(String[] args) {
	        
	        Medico medico = new Medico("Dr. Carlos", "Cardiologia", 3000, "123456");
	        medico.agendarConsulta();
	        
	        
	        Dentista dentista = new Dentista("Dra. Ana", "Odontologia", 1500, "654321");
	        dentista.agendarConsulta();
	        
	        
	        Fisioterapeuta fisioterapeuta = new Fisioterapeuta("José", "Reabilitação", 1000, "789012");
	        fisioterapeuta.agendarConsulta();
	    }
	}



