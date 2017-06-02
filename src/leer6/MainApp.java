/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer6;

import javax.swing.JOptionPane;

/**
 *
 * @author RandyLee
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String itemName;
        double price;
        int qty;

        itemName = JOptionPane.showInputDialog("Name of purchase item:");
        price = Double.parseDouble(
                JOptionPane.showInputDialog("Price of one item"));
        qty = Integer.parseInt(
                JOptionPane.showInputDialog("Quantity: "));
        JOptionPane.showMessageDialog(null,
                "PURCHASE ORDER:\n\n"
                + "Item: " + itemName + "\nQuantity: " + qty
                + "\nTotal price: $" + price * qty);
    }

}
