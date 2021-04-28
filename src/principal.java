import javax.swing.JOptionPane;
public class principal {
    public static void main (String args[]){
        contador_digitos p = new contador_digitos();
        int nu=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Nro."));
        p.cdigi(nu);

}
}
