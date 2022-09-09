package EnumsP;

public class Enums {
    enum Elementos {
        FICHAS("Ensamble, A1"), PIEZAS_METAL("Ensamble, B1"), ESFERAS("Movimiento, C1"),RUEDAS("Movimiento, C1");
        private String accionP;

        public String getAccion() {
            return accionP;
        }

        public void setAccion(String accionP) {
            this.accionP = accionP;
        }

        public String getAccionP() {
            return accionP;
        }

        public void setAccionP(String accionP) {
            this.accionP = accionP;
        }

        Elementos(String accionP) {
            this.accionP = accionP;
        }
    }
    public static void main(String[] args) {
        Elementos[] elementoss = Elementos.values();
        for (Elementos elemento : elementoss) {
            System.out.println("Elemento nombre : " + elemento.name() +" == " + elemento.getAccionP());
        }
    }
}
