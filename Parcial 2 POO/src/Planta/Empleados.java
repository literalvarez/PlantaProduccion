package Planta;

public abstract class Empleados
{	
	int Cedula;	
	String Nombre;	
	String Direccion;
	int Celular;
	String Email;
	int Salario;
	String FechaIngreso;
	String Cumple;
	boolean Operativo;			


	public void ConsultarLiquidacionNomina()
	{
		System.out.println("Esta es su liquidacion de Nomina");
	}
	public void ConsultarLiquidacionVacaciones()
	{
		System.out.println("Esta es su liquidacion de Vacaciones");
	}
	public void ConsultarDatosPersonales()
	{
		System.out.println("Estos son sus datos personales");
	}
	public void ActualizarDatosPersonales()
	{
		System.out.println("Usted ha actualizado sus datos");
	}
}