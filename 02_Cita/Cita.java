import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class Cita extends JFrame{
	private JPanel pnlCabecera;
	private JPanel pnlImagen;
	private JPanel pnlFormulario;
	private JPanel pnlBotones;
	//pnlCabecera
	private JLabel lblTitulo;
	private JLabel lblLogo;
	//pnlImagen
	private JLabel lblCalendario;
	//pnlFormulario
	private JLabel lblSeguro;
	private JTextField txtSeguro;
	private JLabel lblPaciente;
	private JTextField txtPaciente;
	private JLabel lblFecha;
	private JTextField txtFecha;
	private JLabel lblSintoma;
	private JTextField txtSintoma;
	private JLabel lblEspe;
	private JTextField txtEspe;
	//pnlBotones
	private JButton btnAgendar;
	private JButton btnCancelar;
	private JButton btnSalir;

	public Cita(){
		super("Cita IMSS");
		pnlCabecera = new JPanel();
		pnlImagen = new JPanel();
		pnlFormulario = new JPanel();
		pnlBotones = new JPanel();

		setLayout(new BorderLayout());
		pnlCabecera.setLayout(new FlowLayout());
		pnlImagen.setLayout(new FlowLayout());
		pnlFormulario.setLayout(new GridLayout(5,2));
		pnlBotones.setLayout(new FlowLayout());

		//Componentes
		lblTitulo = new JLabel("Registro IMSS");
		lblLogo = new JLabel();
		lblLogo.setIcon(new ImageIcon("logof.png"));

		lblCalendario = new JLabel();
		lblCalendario.setIcon(new ImageIcon("calendario.png"));

		lblSeguro = new JLabel("Seguro");
		txtSeguro = new JTextField();
		lblPaciente = new JLabel("Paciente");
		txtPaciente = new JTextField();
		lblFecha = new JLabel("Fecha");
		txtFecha = new JTextField();
		lblSintoma = new JLabel("Sintoma");
		txtSintoma = new JTextField();
		lblEspe = new JLabel("Especialidad");
		txtEspe = new JTextField();

		btnAgendar = new JButton("AGENDAR");
		btnCancelar = new JButton("CANCELAR");
		btnSalir = new JButton("SALIR");

		add(pnlCabecera, BorderLayout.NORTH);
		add(pnlImagen, BorderLayout.WEST);
		add(pnlFormulario, BorderLayout.CENTER);
		add(pnlBotones,BorderLayout.SOUTH);

		
		pnlCabecera.add(lblLogo);
		pnlCabecera.add(lblTitulo);

		pnlImagen.add(lblCalendario);

		pnlFormulario.add(lblSeguro);
		pnlFormulario.add(txtSeguro);
		pnlFormulario.add(lblPaciente);
		pnlFormulario.add(txtPaciente);
		pnlFormulario.add(lblFecha);
		pnlFormulario.add(txtFecha);
		pnlFormulario.add(lblSintoma);
		pnlFormulario.add(txtSintoma);

		
		pnlFormulario.add(lblEspe);
		pnlFormulario.add(txtEspe);

		pnlBotones.add(btnAgendar);
		pnlBotones.add(btnCancelar);
		pnlBotones.add(btnSalir);

		//setSize(400,500);
		pnlFormulario.setSize(100,50);
		setLocationRelativeTo(null);
		pack();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String []ar){
		new Cita();
	}
}