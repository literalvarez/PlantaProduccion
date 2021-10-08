package Planta;

public abstract class Operativos extends Empleados
{

	String CursosRealizados; 
	String UbicacionZonaDeTrabajo;
	String OficioPlanta;
	String DescripcionLabores;
	
	public void ConsultarCursosRealizados()
	{	
		System.out.println("Estos son sus cursos realizados");
	}
	public void ActualizarCursosRealizados()
	{	
		System.out.println("Sus cursos fueron actualizados");
	}
	public void ConsultarDescripcionLabores()
	{	
		System.out.println("Esta es la descripcion de sus labores");
	}
	public void ActualizarDescripcionLabores()
	{	
		System.out.println("la descripcion de sus labores fueron actualizadas");
	}

}
