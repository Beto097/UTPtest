package Semestral;
import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class Examen_Semestral extends JFrame implements ActionListener{
	 JLabel label1,label2,label3;
	 JTextField txtNombre, txtCedula;
	 JButton boton1,boton2;
	 JPanel panel;

	public Examen_Semestral() {
		//setLayout(null);
		//Etiquetas o labels
		label1 = new JLabel("ESCRIBA LOS DATOS DEL ASPIRANTE");
		label1.setBounds(10,30,400,30);
		label1.setFont(new Font("Helvetica", Font.BOLD, 20));
		label1.setForeground(Color.BLUE);
		//add(label1);
		
		label2 = new JLabel("Nombre");
		label2.setBounds(40,80,180,30);
		label2.setFont(new Font("Helvetica", Font.PLAIN, 16));
		label2.setForeground(Color.BLACK);
		//add(label2);
		
		label3 = new JLabel("Cedula");
		label3.setBounds(40,120,180,30);
		label3.setFont(new Font("Helvetica", Font.PLAIN, 16));
		label3.setForeground(Color.BLACK);
		//add(label3);
		
		//Construccion de JTextFields
		txtNombre = new JTextField();
		txtNombre.setForeground(new Color(0,0,205));
		txtNombre.setBounds(100,80,180,30);
		//add(txtNombre);
		
		txtCedula = new JTextField();
		txtCedula.setForeground(new Color(0,0,205));
		txtCedula.setBounds(100,120,140,30);
		//add(txtCedula);
		
		//Botones
		boton1= new JButton("Evaluar");
		boton1.setBounds(80, 180, 100, 30);
		//add(boton1);
		boton1.addActionListener(this);
		
		boton2= new JButton("Cancelar");
		boton2.setBounds(200, 180, 100, 30);
		//add(boton2);
		boton2.addActionListener(this);
		
		panel = new JPanel();
		panel.setLayout(null);
		 
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(txtNombre);
		panel.add(txtCedula);
		panel.add(boton1);
		panel.add(boton2);
		
		add(panel);
		setSize(500, 300);
		setVisible(true);
	}
	//cierra formulario
	//public void Resultados() {	
	//}
	
	public static void main(String[] args) {
		
		Examen_Semestral Form = new Examen_Semestral();
		Form.setVisible(true);
		

	}//cierra main
	public void actionPerformed(ActionEvent e) {
		String nombre[] = new String[5];
        String cedula[] = new String[5];
        int score[] = new int[5];
        int correct=0, acum=0;
		
		for(int i=0;i<=nombre.length;i++) {
			Examen_Semestral Form = new Examen_Semestral();
			if(e.getSource()==boton1) {
				nombre[i] = txtNombre.getText();
				cedula[i] = txtCedula.getText();
				txtNombre.setText("");
				txtCedula.setText("");
				
				int resp1 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que es CPU? \n1.Control de Unidad de Procesos \n2.Unidad de Control de Procesos \n3.Unidad Central de Procesos*", "Tema: Tecnologia", JOptionPane.QUESTION_MESSAGE));
					if(resp1==3) {
						correct++;
						acum=acum+6;
					}else {
						correct--;
						acum=acum+0;
					}
				int resp2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es un hardware? \n1.Internet \n2.Teclado* \n3.Microsoft", "Tema: Tecnologia", JOptionPane.QUESTION_MESSAGE));
					if(resp2==2) {
						correct++;
						acum=acum+6;
					}else {
						correct--;
						acum=acum+0;
					}
				int resp3 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es el Sistema operative mas popular en el mercado? \n1.GNU Linux \n2.MacOs \3.Microsoft Windows*", "Tema: Tecnologia", JOptionPane.QUESTION_MESSAGE));	
					if(resp3==3) {
						correct++;
						acum=acum+6;
					}else {
						correct--;
						acum=acum+0;
					}
				int resp4 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que es un software? \n1.Software es todo equipo o soporte lógico (intangible) de un sistema informático* \n2.Conjunto de órdenes y programas que controlan los procesos básicos de una computadora \n3.Es una herramienta que permite modificar diversos parámetros en la configuración de un software o de un hardware", "Tema:Tecnologia", JOptionPane.QUESTION_MESSAGE));	
					if(resp4==1) {
						correct++;
						acum=acum+6;
					}else {
						correct--;
						acum=acum+0;
					}
				
				
				
			}
		}
	}
	}
