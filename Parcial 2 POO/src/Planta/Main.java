package Planta;
import java.util.Scanner;

 

public class Main
{
    static int OpcionUsuario = -1;                                     
    static Scanner scanner = new Scanner(System.in);    
    
    public static void main(String[] args) 
    {
    	Administrativos ADMIN = new Administrativos();
    	OperativosTecnicos OPTEC = new OperativosTecnicos();
    	OperativosNoTecnicos OPNOTEC = new OperativosNoTecnicos();
    	
        while (OpcionUsuario != 0)
        {
            try{
                System.out.println("***   PLANTA DE PRODUCCION   *** \n");
                System.out.println("     .:: MENU PRINCIPAL ::.      \n");
                System.out.println("1. Administrativos.                ");
                System.out.println("2. Operativos Tecnicos.            ");            
                System.out.println("3. Operativos No Tecnicos.         ");
                System.out.println("0. Salir                         \n");
                System.out.print  ("Señor usuario, elige opción: ");
                OpcionUsuario = Integer.parseInt(scanner.nextLine()); 
                
                switch(OpcionUsuario)
                {
                    case 1:            
                    	ADMIN.ConsultarLiquidacionNomina();
                    	ADMIN.ConsultarDatosPersonales();
                    	ADMIN.ConsultarLiquidacionVacaciones();
                    	ADMIN.ActualizarDatosPersonales();
                    	ADMIN.GenerarInformePlanta();
                    	ADMIN.ConsultarTitulosProfesionales();
                    	ADMIN.ActualizarTitulosProfesionales();
                        break;
                    case 2: 
                    	OPTEC.ConsultarLiquidacionNomina();
                    	OPTEC.ConsultarDatosPersonales();
                    	OPTEC.ConsultarLiquidacionVacaciones();
                    	OPTEC.ActualizarDatosPersonales();
                    	OPTEC.ConsultarCursosRealizados();
                    	OPTEC.ActualizarCursosRealizados();
                    	OPTEC.ConsultarDescripcionLabores();
                    	OPTEC.ActualizarDescripcionLabores();
                        break;
                    case 3: 
                    	OPNOTEC.ConsultarLiquidacionNomina();
                    	OPNOTEC.ConsultarDatosPersonales();
                    	OPNOTEC.ConsultarLiquidacionVacaciones();
                    	OPNOTEC.ActualizarDatosPersonales();
                    	OPNOTEC.ConsultarCursosRealizados();
                    	OPNOTEC.ActualizarCursosRealizados();
                    	OPNOTEC.ConsultarDescripcionLabores();
                    	OPNOTEC.ActualizarDescripcionLabores();
                        break;
                    case 0: 
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Opción no reconocida");break;
                }
                System.out.println("\n"); 
            }
            catch(Exception e){
                System.out.println("Uoop! Error!");
            }
        }
    }    
} 