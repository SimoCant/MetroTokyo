import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // Swing Elements
    private JFrame GraphicalInterface;
    private JTextArea TAResults;
    private JTextField textTiempo;
    private JTextField textDistancia;

    // Custom Elements
    private AStar a = new AStar();	
    private ArrayList<String> stationsList = a.getStations();
    private MetroMap image=new MetroMap();   

    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            try {
                Main window = new Main();
                //window.Main.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Main() {
        Collections.sort(stationsList);
        initialize();
    }

    private void initialize() {
    	//----- Main JFrame -----
        GraphicalInterface = new JFrame();
        GraphicalInterface.getContentPane().setFont(new Font("Calibri", Font.BOLD, 15));
        GraphicalInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicalInterface.setFont(new Font("Calibri", Font.BOLD, 15));
        GraphicalInterface.setTitle("Metro de Tokyo");
        GraphicalInterface.setBounds(0, 0, 800, 655);
        GraphicalInterface.getContentPane().setLayout(null);
        GraphicalInterface.setResizable(false);

        //----- JPanel Origen -----
        JPanel panelOrigin = new JPanel();
        panelOrigin.setLayout(null);
        panelOrigin.setBounds(0, 10, 217, 76);         

        final JComboBox CBOrigin = new JComboBox(stationsList.toArray());
        CBOrigin.setEditable(true);
        CBOrigin.setBackground(Color.white);
        CBOrigin.setForeground(Color.black);
        CBOrigin.setFont(new Font("Calibri", Font.BOLD, 15));
        CBOrigin.setBounds(25, 37, 182, 28);
        panelOrigin.add(CBOrigin);

        JLabel labelOrigin = new JLabel("Origen:");
        labelOrigin.setFont(new Font("Calibri", Font.BOLD, 16));
        labelOrigin.setForeground(Color.BLACK);
        labelOrigin.setBounds(25, 11, 104, 15);
        panelOrigin.add(labelOrigin);

        GraphicalInterface.getContentPane().add(panelOrigin);
        
        //----- JPanel Destino -----
        JPanel panelDestino = new JPanel();
        panelDestino.setLayout(null);
        panelDestino.setBounds(215, 10, 217, 76);        

        final JComboBox CBDestino = new JComboBox(stationsList.toArray());
        CBDestino.setEditable(true);
        CBDestino.setBackground(Color.white);
        CBDestino.setForeground(Color.black);
        CBDestino.setFont(new Font("Calibri", Font.BOLD, 15));                
        CBDestino.setBounds(10, 37, 197, 28);
        panelDestino.add(CBDestino);        

        JLabel labelDestino = new JLabel("Destino:");
        labelDestino.setFont(new Font("Calibri", Font.BOLD, 16));
        labelDestino.setForeground(Color.BLACK);
        labelDestino.setBounds(10, 11, 77, 19);
        panelDestino.add(labelDestino);
        
        GraphicalInterface.getContentPane().add(panelDestino);

        //----- JButton 'Hallar ruta' -----
        JButton buttonHallarRuta = new JButton("Hallar Ruta");
        buttonHallarRuta.setFont(new Font("Calibri", Font.BOLD, 16));
        Color myCol = new Color(104, 157, 246);
        buttonHallarRuta.setBackground(myCol);
        buttonHallarRuta.setBounds(440, 47, 150, 28);
        buttonHallarRuta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	double totalDistance;		
        		ArrayList<String> path;        		
        		path = a.findPath(CBOrigin.getSelectedItem().toString(), CBDestino.getSelectedItem().toString());

                if (path == null){
                    System.out.println("Empty estacionesOptimas");
                    return;
                }
                
                double dist=a.getTotalDistance(path);
                double tiempoTotal = (dist/30)*60;
                totalDistance = dist;

                String msg ="";
                for(int i=0; i<path.size(); i++) {
                	msg+=path.get(i);
                	msg+="\n";
                }

                TAResults.setText(msg);
                textTiempo.setText(String.format("%.2f minutos", tiempoTotal));
                textDistancia.setText(String.format("%.2f km", totalDistance));
            }
        });

        GraphicalInterface.getContentPane().add(buttonHallarRuta);

        

        //----- Metro Map Image -----
        image.setBounds(25, 97, 565, 500);
        image.setBackground(Color.WHITE);
        GraphicalInterface.getContentPane().add(image);
        
        //----- JPanel stations ------
        JPanel panelParadas = new JPanel();
        panelParadas.setLayout(null);
        panelParadas.setBounds(600, 78, 175, 380);        

        JLabel labelParadas = new JLabel("Paradas:");
        labelParadas.setFont(new Font("Calibri", Font.BOLD, 16));
        labelParadas.setBounds(10, 15, 200, 20);
        panelParadas.add(labelParadas);

        TAResults = new JTextArea();
        TAResults.setForeground(Color.black);
        TAResults.setBackground(Color.white);
        TAResults.setFont(new Font("Calibri", Font.BOLD, 15));
        
        JScrollPane scrollPaneParadas = new JScrollPane(TAResults);
        scrollPaneParadas.setEnabled(false);
        scrollPaneParadas.setBounds(10, 50, 160, 330);
        panelParadas.add(scrollPaneParadas);
        
        GraphicalInterface.getContentPane().add(panelParadas);
        
        //----- JPanel results -----
        JPanel panelResults = new JPanel();
        panelResults.setLayout(null);
        panelResults.setBounds(600, 468, 250, 300);
        
        JLabel lblTiempoEstimado = new JLabel("Tiempo estimado:");
        lblTiempoEstimado.setForeground(Color.BLACK);
        lblTiempoEstimado.setFont(new Font("Calibri", Font.BOLD, 16));
        lblTiempoEstimado.setBounds(10, 11, 162, 15);
        panelResults.add(lblTiempoEstimado);               

        textTiempo = new JTextField();
        textTiempo.setBackground(Color.white);
        textTiempo.setForeground(Color.black);
        textTiempo.setFont(new Font("Calibri", Font.BOLD, 15));
        textTiempo.setBounds(10, 40, 160, 21);        
        textTiempo.setColumns(10);
        panelResults.add(textTiempo);

        JLabel lblDistanciaRecorrido = new JLabel("Distancia recorrida:");
        lblDistanciaRecorrido.setForeground(Color.BLACK);
        lblDistanciaRecorrido.setFont(new Font("Calibri", Font.BOLD, 16));
        lblDistanciaRecorrido.setBounds(10, 80, 162, 15);
        panelResults.add(lblDistanciaRecorrido);
        
        textDistancia = new JTextField();
        textDistancia.setBackground(Color.white);
        textDistancia.setForeground(Color.black);
        textDistancia.setFont(new Font("Calibri", Font.BOLD, 15));
        textDistancia.setBounds(10, 109, 160, 21);
        textDistancia.setColumns(10);        
        panelResults.add(textDistancia);        
        
        GraphicalInterface.getContentPane().add(panelResults); 
        
        
        
        GraphicalInterface.setVisible(true);
    }
}
