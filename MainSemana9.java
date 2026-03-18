/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainsemana9;
import javax.swing.JOptionPane;3
/**
 *
 * @author sophi
 */
public class MainSemana9 {

    /**
     * @param args the command line arguments
     */
   

// aca yo quise pedir los nombres de los productos, aca tambien se crea el reporte y me muestra los resultados, me siento inteligente jajaajaj}
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos desea ingresar?"));

        String[] nombres = new String[n];
        for (int i = 0; i < n; i++) {
            nombres[i] = JOptionPane.showInputDialog("Nombre del producto " + (i + 1) + ":");
        }

        ReporteVentas ventas = new ReporteVentas(nombres);
        ventas.mostrarTotalesPorProducto();
        ventas.mostrarDiaConMasVentas();
        ventas.mostrarProductoMasVendido();
    }
}