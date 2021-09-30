/*
 * Clase claseanonima utilizada como exemplo para o
 * apartado 5.12 "Converter anónimo en membro"
 * do documento "Reestruturar código Java con NetBeans"
 */
package claseanonima;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame{

    JLabel lbl ;
    JTextField txt1;
    JTextField txt2;
    JTextField txt3;
    JButton btnSumar;
    JButton btnRestar;

    Main()
    {
        super("Clases anónimas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        lbl = new JLabel(" Introduce dous valores enteiros nas duas primeiras caixas:");
        txt1 = new JTextField(15);
        txt2 = new JTextField(15);
        txt3 = new JTextField(15);
        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");

        container.add(lbl);
        container.add(txt1);
        container.add(txt2);
        container.add(txt3);
        container.add(btnSumar);
        container.add(btnRestar);

        /*
         * Clase anónima de tipo ActionListener pero co método actionPermormed
         * sobrecargado para responder ó evento clic sobre o botón Sumar
         * Iliminando ActionListener e indo a opción de menú
         * "Reestructurar / Convertir anónimo en miembro" desaparece a clase
         * anónima e aparece no seu lugar unha clase interna de nome ActionListenerImpl
         * que sigue facendo a mesma función, responder o evento clic do botón
        */
        btnSumar.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txt1.getText());
                int b = Integer.parseInt(txt2.getText());

                int c = a+b;

                txt3.setText(c+"");

            }
        }
        );

        btnRestar.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txt1.getText());
                int b = Integer.parseInt(txt2.getText());

                int c = a-b;

                txt3.setText(c+"");

            }
        }
        );

        setVisible(true);
        pack();
    }


    public static void main(String[] args) {
            Main frame = new Main();

    }

}
