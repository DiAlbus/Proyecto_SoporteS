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
        return false;
    }
    
    public boolean esPassword( String texto )
    {
        return false;
    }
    
    public boolean esBoleta( int entrada )
    {
        boolean ret = false;
        return ret;
    }
    
    public boolean esFecha( String fecha )
    {
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
