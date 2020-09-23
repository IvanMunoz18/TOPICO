
package programa1;

import javax . swing . JFrame ;
public class cipherDemo
{
public static void main ( String [] args ){
Modelo m = new Modelo () ;
Vista v = new Vista () ;
Controlador c = new Controlador (m, v) ;
c. arrancar () ; // Arranca la interfaz ( vista )
}
}
