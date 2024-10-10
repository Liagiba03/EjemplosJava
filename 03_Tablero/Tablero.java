import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseAdapter;

public class Tablero extends JFrame {
	JPanel pnlPrincipal;
	JPanel pnlEtiqueta;
	JLabel txtCoor;
	JLabel lblNomCoor;
	JPanel cua[][];
	int i,j;

	public Tablero(){
		super("Tablero Agedrez");
		//Paneles
		pnlPrincipal= new JPanel();
		txtCoor = new JLabel();
		lblNomCoor = new JLabel("POSICION");
		pnlEtiqueta= new JPanel();
		cua = new JPanel [8][8];
		
		//Gestor de esquemas
		setLayout(new BorderLayout());
		pnlEtiqueta.setLayout(new FlowLayout());
		pnlPrincipal.setLayout(new GridLayout(8,8));

		//Añadir componentes
		add(pnlPrincipal,BorderLayout.CENTER);
		add(pnlEtiqueta,BorderLayout.SOUTH);
		pnlEtiqueta.add(lblNomCoor);
		pnlEtiqueta.add(txtCoor);
		
		//CREAR CUADROS
		for(i=0; i<8;i++){
			for(j=0; j<8 ;j++){
				cua[i][j]= new JPanel();
				pnlPrincipal.add(cua[i][j]);
				//LLAMAR MÉTODO pintarCuadros
				pintarCuadros(i,j,cua);

				cua[i][j].addMouseListener(new MouseAdapter(){
					public void mouseEntered(MouseEvent evt){
						JPanel evento = (JPanel)evt.getSource();
						evento.setBackground(Color.CYAN);
					}
				});
				cua[i][j].addMouseListener(new MouseAdapter(){
					public void mouseExited(MouseEvent evt){
						for(i=0; i<8;i++){
							for(j=0; j<8 ;j++){
								pintarCuadros(i,j,cua);
							}
						}
					}
				});
				cua[i][j].addMouseMotionListener(new MouseMotionAdapter(){
					public void mouseMoved(MouseEvent evt){
						JPanel evento = (JPanel)evt.getSource();
							//txtCoor.setText(evt.getX()+" , "+evt.getY());
						for(i=0; i<8;i++){
							for(j=0; j<8 ;j++){
								if(evento == cua[i][j]){
									txtCoor.setText((j+1)+" , "+ (i+1));
								}
							}
						}
					}
				});
			}
		}
		//FIN CREAR CUADROS
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}

	public void pintarCuadros(int i, int y, JPanel[][]pan){
		if(i%2==0){//Para elejir columna par
			if(j%2!=0) //Para elejir celda impar
				{pan[i][j].setBackground(Color.BLACK);
			}else{pan[i][j].setBackground(Color.WHITE);}//Para elejir celda par
		}else if(j%2==0){pan[i][j].setBackground(Color.BLACK);}
			else{pan[i][j].setBackground(Color.WHITE);}
	}

	public static void main (String []er){
		new Tablero();
	}
}