package Unidad1;
import java.awt.event.*;
import javax.swing.*;
import java.io.*; 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Controller implements ActionListener{
    private Model modelo;
    private vista vista;
    
    public Controller(Model m,vista v){
        modelo = m;
        vista = v;
        vista.setController(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        switch(event.getActionCommand()){
            
                case InterfaceView.Encrypt:
                char[] ch = new char[100];
  
                // convertir el texto a un array de chars 
                for (int i = 0; i < vista.getFileName().length(); i++) { 
                    ch[i] = vista.getFileName().charAt(i); 
                } 
        
               //modelo.encriptar(ch);
               vista.setText(modelo.encriptar(ch));
              
                break;
            case InterfaceView.Decrypt:
                char[] chs = new char[100];
                // convertir el texto a un array de chars 
                for (int i = 0; i < vista.getFileName().length(); i++) { 
                    chs[i] = vista.getFileName().charAt(i); 
                 }
                
                vista.setText(modelo.desencriptar(chs));
                break;
            case InterfaceView.Save:
                saveFile();
                break;
            default:
                System.err.println("Comando no definido");
                break;
        }
    }
    
    void saveFile(){
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            
            String textToPrint = vista.getFileName();
            
            bufferedWriter.write(textToPrint);
            bufferedWriter.close();
            
            System.out.println("Guardado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    void readFile() throws FileNotFoundException, IOException{
        String text = "";
        File file = new File("C:\\Users\\LENOVO\\Documents\\Project\\MyFile."); 

        BufferedReader br = new BufferedReader(new FileReader(file)); 

        String st; 
        while ((st = br.readLine()) != null){
            text += st + "\n";
          
        }
         
      vista.setText(text);
    }
    
    public void run(){
        vista.setLocationRelativeTo(null);
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setSize(500,250);
        vista.setVisible(true);
    }
}