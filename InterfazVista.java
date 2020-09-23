
package programa1;
public interface  InterfazVista {
void setControlador ( Controlador c) ; // Conecta la interfaz con el Controlador
public String getFileName () ; // Obtener el nombre del archivo
public String getText () ; // Obtener el texto
public void setText ( String s) ; // Establecer el texto
// Constantes que definen las posibles operaciones :
static final String ABRIR =" Abrir ";
static final String ENCRYPT =" encrypt ";
static final String DECRYPT =" decrypt ";
static final String GUARDAR =" Guardar ";
}
