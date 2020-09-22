package Unidad1;

public class prueba {
    public static void main(String[] args) {
        Model m = new Model();
        vista v = new vista();
        Controller c = new Controller(m,v);
        c.run();
    }
}