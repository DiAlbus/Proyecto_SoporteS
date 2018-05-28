package sistema;
//http://puntocomnoesunlenguaje.blogspot.mx/2013/07/ejemplos-expresiones-regulares-java-split.html
import catalogos.Area_Conocimiento;
import catalogos.Carrera_Tecnica;
import catalogos.Ciudad;
import catalogos.Entidad;
import catalogos.Plantel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;


public class Validacion 
{
    public boolean soloLetras( String texto )
    {
		Pattern patron = Pattern.compile("[^A-Za-zñÑáéíóúÁÉÍÓÚ ]");
        Matcher encaja = patron.matcher(texto);
        
        if( !encaja.find() )
        {
            
            return true;
        }
            
        return false;
    }
    
    public boolean soloNumeros( String texto )
    {
        Pattern patron = Pattern.compile("[^0-9]");
        Matcher encaja = patron.matcher(texto);
        
        if( !encaja.find() )
        {
            
            return true;
        }
            
		return false;
    }
    
    public boolean soloLetrasYnumeros( String texto )
    {
        Pattern patron = Pattern.compile("[^0-9A-Za-zñÑáéíóúÁÉÍÓÚ ]");
        Matcher encaja = patron.matcher(texto);
        
        if( !encaja.find() )
        {
            
            return true;
        }
            
        return false;
    }
    
    public boolean esPassword( String texto )
    {
        Pattern patron = Pattern.compile("[^0-9A-Za-zñÑáéíóúÁÉÍÓÚ]");
        Matcher encaja = patron.matcher(texto);
        
        if( !encaja.find() )
        {
            
            return true;
        }
            
        return false;
    }
    
    public boolean esBoleta( int entrada )
    {
        boolean ret = false;
        String sent = String.valueOf( entrada );
        
        try
        {
            int year = Integer.parseInt(sent.substring( 0, 4 ));
            int escuela = Integer.parseInt( sent.substring( 4, 6 ) );
            int pers = Integer.parseInt( sent.substring( 6 ) );

            Calendar c = new GregorianCalendar();
            
            if( ( year <= c.get( Calendar.YEAR )  ) && ( year >= 1950 ) )
            {
                if( (escuela <= 18 ) && ( escuela != 0 ) )
                {
                    if( pers > 0 )
                    {
                        ret = true;
                    }
                }
            }
            
        }
        catch( Exception e )
        {
            ret = false;
        }
        return ret;
    }
    
    public boolean esFecha( String fecha )
    {
        try 
        {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyy-MM-dd");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } 
        catch ( Exception e )  
        {
            System.out.println("No es fecha: " + e.getMessage());
            return false;
        }
        
        return true;
    }
    
    public boolean fechaCorrecta( String fecha )
    {
        boolean ret = false;
        return ret;
    }
    
    public boolean existeEstado( int id )
    {
        boolean ret = false;
        return ret;
    }
    
    public boolean entidadCorrecta( int idEdo, int idCiu )
    {
        boolean ret = false;
        return ret;
    }
    
    public boolean areaCorrecta(int idArea)
    {
        boolean ret = false;
        return ret;
    }
    
    public boolean plantelCorrecto(int idP, int idArea)
    {
        boolean ret = false;
        return ret;
    }
    
    public boolean ctCorrecta(int idP, int idCT)
    {
        boolean ret = false;
        return ret;
    }
    
    public boolean matriculaRegistrada( int boL )
    {
        
        return false;
    }
    
    public boolean correoRegistrado( String mail )
    {
        return false;
    }
}
