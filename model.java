package Unidad1;

class Model {

    void setFile(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String read() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setContenido(String text) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String encript() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String decript() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setFileName(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void write() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public String encriptar(char in[]){
        String e = "";
        for (int i = 0; i < in.length; i++) {
            if((in[i] >= 65 && in[i]<=90) || (in[i] >= 97 && in[i]<=122)){
            in [i] += 3;
            }   
        }
        in = invertir(in);
        int partido = Math.round(in.length/2);
        for (int i = partido; i < in.length; i++) {
            if((in[i] >= 65 && in[i]<=90) || (in[i] >= 97 && in[i]<=122)){
            in [i] -= 1;
            }   
        }
        for (int i = 0; i < in.length; i++) {
            e = e + "" + in[i];
        }
        return e;
    }
       public String desencriptar (char in2[]){
        String salida = "";
        int partido = Math.round(in2.length/2);
        for (int i = partido; i < in2.length; i++) {
            if((in2[i] >= 65 && in2[i]<=90) || (in2[i] >= 97 && in2[i]<=122)){
            in2 [i] += 1;
            }   
        }
        in2 = invertir(in2);
        for (int i = 0; i < in2.length; i++) {
            if((in2[i] >= 65 && in2[i]<=90) || (in2[i] >= 97 && in2[i]<=122)){
            in2 [i] -= 3;
            }   
        }
        for (int i = 0; i < in2.length; i++) {
            salida = salida + "" + in2[i];
        }
        return salida;
    } 
    public char [] invertir(char in3[]){
        char [] invertido = new char[in3.length];
        for(int i = 0; i < in3.length; i++){
            invertido[i] = in3[in3.length-1-i];
        }
        return invertido;
    }  
    char [] chars(String a){
        char [] temporal = new char[a.length()]; 
        for (int i = 0; i < a.length(); i++) {
            temporal [i] = a.charAt(i);
        }
        return temporal;
    }
}
