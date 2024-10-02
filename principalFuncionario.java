package Heranca;

public class principalFuncionario {

    public static void main(String[] args) {
    	
    	Funcionario fun = new Funcionario(13514,"Rodrigo Alino","9978254867",1,"Rua mano");
    	System.out.println(fun.getNome());
    	System.out.println(fun.calcularSalario(10000.00, 1000));
        
        Horista horista = new Horista(56565, "Marcos", "998765443", 2, "Rua Oswaldo");
        System.out.println(horista.getNome());
    	System.out.println(horista.calcularSalario(10.00, 100));

        Jornada jornada = new Jornada(95478, "Melany", "923443556", 3, "Rua Freire");
        System.out.println(jornada.getNome());
    	System.out.println(jornada.calcularSalario(1000.00, 10));

        ConsultorPj consultorpj = new ConsultorPj(23654, "Mattew", "99865268", 4, "Rua Fernandes");
        System.out.println(consultorpj.getNome());
    	System.out.println(consultorpj.calcularSalario(100.00, 10000));	
    }
}

