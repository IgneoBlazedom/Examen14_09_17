package convertidor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Examen extends JFrame implements ActionListener{
    /*    
     * Inicializamos los componentes que vamos a utilizar
     */
    private JButton bot1;
    private JButton bot2;
    private JButton bot3;
    private JButton bot4;
    private JButton bot5;
    private JButton bot6;
    private JButton bot7;
    private JButton bot8;
    private JButton bot9;
    private JButton bot0;
    private JButton botp;
    private JButton limpiar;
    private JButton convertir;
    private JTextField num;
    private double res;
    
    /*    
     * Constructor
     */
    public Examen (){
        super();
        configurarVentana();
        inicializarComponentes();
    }
    
    /*    
     * Definimos la configuración de la ventana
     */
    private void configurarVentana(){
        this.setTitle("Pesos a Dólares");
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(190, 250);
    }
    
    /*    
     * Definimos los componentes
     */
    private void inicializarComponentes(){
        bot1 = new JButton();
        bot2 = new JButton();
        bot3 = new JButton();
        bot4 = new JButton();
        bot5 = new JButton();
        bot6 = new JButton();
        bot7 = new JButton();
        bot8 = new JButton();
        bot9 = new JButton();
        bot0 = new JButton();
        botp = new JButton();
        limpiar = new JButton();
        convertir = new JButton();
        num = new JTextField();
        
     /*    
     * Asignamos un texto a cada botón
     */
        bot1.setText("1");
        bot2.setText("2");
        bot3.setText("3");
        bot4.setText("4");
        bot5.setText("5");
        bot6.setText("6");
        bot7.setText("7");
        bot8.setText("8");
        bot9.setText("9");
        bot0.setText("0");
        botp.setText(".");
        limpiar.setText("CE");
        convertir.setText("=");
        
        bot1.setBounds(10, 10, 45, 30);
        bot2.setBounds(55, 10, 45, 30);
        bot3.setBounds(100, 10, 45, 30);
        bot4.setBounds(10, 40, 45, 30);
        bot5.setBounds(55, 40, 45, 30);
        bot6.setBounds(100, 40, 45, 30);
        bot7.setBounds(10, 70, 45, 30);
        bot8.setBounds(55, 70, 45, 30);
        bot9.setBounds(100, 70, 45, 30);
        bot0.setBounds(10, 100, 90, 30);
        botp.setBounds(100, 100, 45, 30);
        limpiar.setBounds(10, 145, 90, 30);
        convertir.setBounds(100, 145, 45, 30);
        num.setBounds(10, 178, 138, 30);

     /*    
     * Añadimos los botones
     */
        add(bot1);
        add(bot2);
        add(bot3);
        add(bot4);
        add(bot5);
        add(bot6);
        add(bot7);
        add(bot8);
        add(bot9);
        add(bot0);
        add(botp);
        add(limpiar);
        add(convertir);
        add(num);
        
    /*    
     * Añadimos el ActionListener de los botones
     */
        
        bot1.addActionListener(this);
        bot2.addActionListener(this);
        bot3.addActionListener(this);
        bot4.addActionListener(this);
        bot5.addActionListener(this);
        bot6.addActionListener(this);
        bot7.addActionListener(this);
        bot8.addActionListener(this);
        bot9.addActionListener(this);
        bot0.addActionListener(this);
        botp.addActionListener(this);
        convertir.addActionListener(this);
        limpiar.addActionListener(this);
    }
    
    
    /*    
     * Definimos las Acciones que va a tener cada botón
     */
    @Override
    public void actionPerformed(ActionEvent e) {        
        if (e.getSource()==bot1) {            
            num.setText(num.getText()+"1");
        }
        if (e.getSource()==bot2) {            
            num.setText(num.getText()+"2");
        }
        if (e.getSource()==bot3) {            
            num.setText(num.getText()+"3");
        }
        if (e.getSource()==bot4) {            
            num.setText(num.getText()+"4");
        }
        if (e.getSource()==bot5) {            
            num.setText(num.getText()+"5");
        }
        if (e.getSource()==bot6) {            
            num.setText(num.getText()+"6");
        }
        if (e.getSource()==bot7) {            
            num.setText(num.getText()+"7");
        }
        if (e.getSource()==bot8) {            
            num.setText(num.getText()+"8");
        }
        if (e.getSource()==bot9) {            
            num.setText(num.getText()+"9");
        }
        if (e.getSource()==bot0) {            
            num.setText(num.getText()+"0");
        }
        if (e.getSource()==botp) {             
            num.setText(num.getText()+".");
        }
        if (e.getSource()==convertir) {             
            res = (Double.parseDouble(num.getText())/17); /**Hacemos la conversión de pesos a Dólares**/
            num.setText(Double.toString(res));
            
        }
        if (e.getSource()==limpiar) {             
            num.setText(""); /**Al pulsar este botón el JTextField se limpia**/
        }
        res=0;
    }

}