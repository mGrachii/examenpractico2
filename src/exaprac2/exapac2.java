/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class exapac2 {
    
        public static void main(String[] args) {
        // TODO code application logic here
       String opt= "";
       double total = 0;
       String nombres[] = new String[100];
       double salario[] = new double[100];
       double horas[] = new double[100];
       int cont = 0;
       int k = 0;
        JOptionPane.showMessageDialog(null,"Si logre ver el proyecto en GitHub!!");
      do {
        
        opt= JOptionPane.showInputDialog("Digite su opcion: \n1.Agregar Empleados\n2.Calcular Planilla\n3.Salir");
 
        switch(opt) {
          case "1":
            k = Integer.parseInt(JOptionPane.showInputDialog("Total de empleados a ingresar:"));
            for(int i=0;i<=(k-1);i++){
                nombres[i] = JOptionPane.showInputDialog("Nombre del Empleado "+(i+1)+":");
                salario[i] = Double.parseDouble(JOptionPane.showInputDialog("Salario por hora del empleado "+(i+1)+":"));
                horas[i] = Double.parseDouble(JOptionPane.showInputDialog("Horas trabajadas del empleado "+(i+1)+":"));
            }
            JOptionPane.showMessageDialog(null,"Se ingresaron "+k+" empleados correctamente!");

            cont =1;
            break;
          case "2":
              if(k==0){
                JOptionPane.showMessageDialog(null,"No se ha ingresado ningun empleado");

              } else {
                  
              String mimensaje ="EMPLEADOS DE PLANILLA:\n";              
              for(int i=0;i<=(k-1);i++){
mimensaje += ("Empleado: "+nombres[i]+". Salario: $"+(salario[i]*horas[i])+", Descuento (10%): $"+String.format("%.02f",((salario[i]*horas[i])*.1))+", Neto: $"+String.format("%.02f",((salario[i]*horas[i])*.9)))+"\n";
               total += (salario[i]*horas[i]);
               
              }
              mimensaje +="---------------------------------------";
              mimensaje +="\nTotal de planilla: $"+total;
              mimensaje +="\nTotal Renta: $"+String.format("%.02f",(total*.1));
              mimensaje +="\n---------------------------------------";

              JOptionPane.showMessageDialog(null,mimensaje);

              }
             
            cont =1;

             break;
          case "3":
            JOptionPane.showMessageDialog(null,"El programa se cerrara!");
            cont =0;                        
            break;
          default:
            JOptionPane.showMessageDialog(null,"Opcion incorrecta!");
            cont =1;

      }
      } while (cont == 1);
      

    }
    
}
