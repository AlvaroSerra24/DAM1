package UT3_1;

public class Act_3_2 {
	private String nombre;
	private String mes;
	private int año;
	private int SalarioBruto;
	private int SalarioNeto;
	
	public Act_3_2(String nombre, String mes, int año, int salarioBruto, int salarioNeto) {
		this.nombre = nombre;
		this.mes = mes;
		this.año = año;
		this.SalarioBruto = salarioBruto;
		this.SalarioNeto = salarioNeto;
	}
	
	public Act_3_2() {
		this.nombre = "";
		this.mes = "";
		this.año = 0;
		this.SalarioBruto = 0;
		this.SalarioNeto = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getSalarioBruto() {
		return SalarioBruto;
	}

	public void setSalarioBruto(int salarioBruto) {
		SalarioBruto = salarioBruto;
	}

	public int getSalarioNeto() {
		return SalarioNeto;
	}

	public void setSalarioNeto(int salarioNeto) {
		SalarioNeto = salarioNeto;
	}
	
	public double calculaSalarioBruto(String TipoEmpleado, double ventasMes, int horasExtra) {
		if(TipoEmpleado.equalsIgnoreCase("vendedor")) {
			SalarioBruto=1000;
		}else {
			if(TipoEmpleado.equalsIgnoreCase("encargado"))
				SalarioBruto=1500;
			else
				System.out.println("No es correcto el tipo de empleado");
		}
		
		if(ventasMes>=1000) {
			SalarioBruto=SalarioBruto+100;
		} 
		if(ventasMes>=1500) {
			SalarioBruto=SalarioBruto+100;
		}
		
		
		for(int i=0;i<horasExtra;i++){
			SalarioBruto+=20;
		}
		return SalarioBruto;
	}
	
	public double calculaSalarioNeto(double salarioBruto) {
		if(salarioBruto<1000){
			return salarioBruto;
		}else {
			if(salarioBruto<1500) {
				salarioBruto=(salarioBruto*0.84);
			}else
				salarioBruto=(salarioBruto*0.82);
		}
		
		return salarioBruto;
	}
	
	public static void main(String[] args) {
		Act_3_2 a=new Act_3_2();
		System.out.println(a.calculaSalarioNeto(2000));
		System.out.println(a.calculaSalarioNeto(1500));
		System.out.println(a.calculaSalarioNeto(1499.99));
		System.out.println(a.calculaSalarioNeto(1250));
		System.out.println(a.calculaSalarioNeto(1000));
		System.out.println(a.calculaSalarioNeto(999.99));
		System.out.println(a.calculaSalarioNeto(500));
		System.out.println(a.calculaSalarioNeto(0));
		
		System.out.println("");
		
		System.out.println(a.calculaSalarioBruto("vendedor", 2000, 8));
		System.out.println(a.calculaSalarioBruto("vendedor", 1500, 3));
		System.out.println(a.calculaSalarioBruto("vendedor", 1499.99, 0));
		System.out.println(a.calculaSalarioBruto("encargado", 1250, 8));
		System.out.println(a.calculaSalarioBruto("encargado", 1000, 0));
		System.out.println(a.calculaSalarioBruto("encargado", 999.99, 3));
		System.out.println(a.calculaSalarioBruto("encargado", 500, 0));
		System.out.println(a.calculaSalarioBruto("encargado", 0, 8));
	}
}
