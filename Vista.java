/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;
import java .awt. BorderLayout ;
import java .awt. FlowLayout ;
import java .awt. GridLayout ;
import javax . swing . JFrame ;
import javax . swing . JTextField ;
import javax . swing . JTextArea ;
import javax . swing . JComboBox ;
import javax . swing . JButton ;
import javax . swing . JLabel ;
import javax . swing . JScrollPane ;
import javax . swing . JPanel ;
public class Vista extends JFrame implements InterfazVista
{
private final JTextArea text ; // displays file
private final JButton encryptJButton ;
private final JButton decryptJButton ;
private final JButton saveJButton ;
private final JButton openJButton ;
private final JTextField fileName ; // file name
public Vista () {
JPanel fileJPanel ;
JLabel lblFile ;
JPanel buttonJPanel ;
BorderLayout layout ;
//super (" Testing cipher ") ;
layout = new BorderLayout (20 , 10) ;
setLayout ( layout ) ;
fileJPanel = new JPanel () ;
fileJPanel . setLayout (new FlowLayout () ) ;
lblFile = new JLabel ( " Archivo de texto / cifrado :" ) ;
lblFile . setToolTipText ( " Archivo a abrir " ) ;
fileJPanel .add( lblFile ) ;
fileName = new JTextField (20) ;
fileJPanel .add( fileName ) ;
add ( fileJPanel , BorderLayout . NORTH ) ;
text = new JTextArea (10 ,15) ;
add (new JScrollPane ( text ) , BorderLayout . CENTER ) ;
buttonJPanel = new JPanel () ;
buttonJPanel . setLayout ( new GridLayout (4 , 1) ) ;
openJButton = new JButton ( ABRIR ) ;
buttonJPanel .add( openJButton ) ;
encryptJButton = new JButton ( ENCRYPT ) ;
buttonJPanel .add( encryptJButton ) ;
decryptJButton = new JButton ( DECRYPT ) ;
buttonJPanel .add( decryptJButton ) ;
saveJButton = new JButton ( GUARDAR ) ;

buttonJPanel .add( saveJButton ) ;
add ( buttonJPanel , BorderLayout . EAST ) ;
}
public String getFileName () { return fileName . getText () ; }
public String getText () { return text . getText () ; }
public void setText ( String s) { text . setText (s) ; }
public void setControlador ( Controlador c) {
openJButton . addActionListener (c) ;
saveJButton . addActionListener (c) ;
encryptJButton . addActionListener (c) ;
decryptJButton . addActionListener (c) ;
}
}