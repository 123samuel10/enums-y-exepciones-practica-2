import javax.swing.*;

public class Menu {
    public int opc() {

        int opciones = Integer.parseInt(JOptionPane.showInputDialog("MENU\n" +
                "1. Sumar\n" +
                "2. Restar\n" +
                "3. Dividir\n" +
                "4. Salir"));
        return opciones;

    }
}
