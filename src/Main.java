import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int resultado;
        boolean bandera=true;
        Menu menu=new Menu();
        while (bandera){
            int opcP=menu.opc();
            try {
                int numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero uno"));
                int numeroDos=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero dos"));

                switch (opcP){
                    case 1:
                       resultado=numero+numeroDos;
                        JOptionPane.showMessageDialog(null,"la suma es: "+resultado);
                        break;
                    case 2:
                        try {
                            resultado=numero-numeroDos;
                            JOptionPane.showMessageDialog(null,"la resta es: "+resultado);
                        }catch (ArithmeticException e){
                            if (numeroDos>numero){
                                JOptionPane.showMessageDialog(null,"no se pueden operar numero negativos"+e);
                                break;
                            }
                        }
                        break;
                    case 3:
                        try {
                            resultado=numero/numeroDos;
                            JOptionPane.showMessageDialog(null,"Divison es: "+resultado);
                        }catch (ArithmeticException e){
                            JOptionPane.showMessageDialog(null, "error no se puede dividir por 0"+e);

                        }finally {
                            JOptionPane.showMessageDialog(null,"operacion concluida");
                        }
                        break;
                    case 4:
                        bandera=false;
                        break;
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error"+e);
            }




        }
    }
}