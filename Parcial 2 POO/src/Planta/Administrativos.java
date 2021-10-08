package Planta;

public class Administrativos extends Empleados 
{
	String TitulosProfesionales;
	
	int AñosExperiencia;
	int PersonasACargo;
	int NumeroExtension;
	
	
	
	public void Administrativo() 
	{		
		this.Cedula = 69420360;				
		this.Nombre = "Pepe Perez";
		this.Direccion = "Calle 10 #62b - 13";
		this.Celular = 2104192969;
		this.Email = "PepeTabaja@gmail.com";
		this.Salario = 3500000;
		this.FechaIngreso = "20/06/2011";
		this.Cumple = "01/02/1980";		
		AñosExperiencia = 15;
		PersonasACargo = 5;
		NumeroExtension = 1001;
		TitulosProfesionales = "Admistrador De Mangos - Domador de Micos";
	}
	
	public void GenerarInformePlanta()
	{
		System.out.println("Informe de planta generado");
	}
	public void ConsultarTitulosProfesionales()
	{
		System.out.println("Estos son sus titulos profesionales");
	}
	public void ActualizarTitulosProfesionales()
	{
		System.out.println("Sus titulos profesionales fueron actualizados");
	}


}
