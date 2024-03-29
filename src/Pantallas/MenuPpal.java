package Pantallas;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Timer;

import javax.swing.JProgressBar;
import javax.swing.JToolBar;
import javax.swing.JButton;

@SuppressWarnings("unused")
public class MenuPpal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static String titulo="Software de Gesti�n construido por y para profesionales IT";
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenuArchivo = null;
	private JMenuItem jMenuItemAltas = null;
	private JMenuItem jMenuItemBajas = null;
	private JMenuItem jMenuItemModif = null;
	private JMenu jMenuRepas = null;
	private JMenuItem jMenuItemEnviar = null;
	private JMenu jMenuInventario = null;
	private JMenuItem jMenuItemPc = null;
	private JMenuItem jMenuItemImpresoras = null;
	private JMenuItem jMenuItemHandheld = null;
	private JMenu jMenuABM2 = null;
	private JMenu jMenuAltas2 = null;
	private JMenu jMenuModificaciones = null;
	private JMenuItem jMenuItemPCyNTB = null;
	private JMenuItem jMenuItemImpresoras2 = null;
	private JMenuItem jMenuItemHandHelds = null;
	private JMenuItem jMenuItemBajas2 = null;
	private JMenuItem jMenuItemPcModif = null;
	private JMenuItem jMenuItemImpresorasModif = null;
	private JMenuItem jMenuItemHandHeldsModif = null;
	private JMenu jMenuArchivo1 = null;
	private JMenuItem jMenuItemSalir = null;
	private JMenu jMenuReasignaciones = null;
	private JMenu jMenuConsultas = null;
	private JMenuItem jMenuItemBAM = null;
	private JMenuItem jMenuItemChip = null;
	private JMenuItem jMenuItemModifBAM = null;
	private JMenuItem jMenuItemModifChip = null;
	private JMenuItem jMenuItemBam = null;
	private JMenuItem jMenuItemConsultaGral = null;
	private JMenu jMenuImpresora = null;
	private JMenuItem jMenuItemLocacion = null;
	private JMenuItem jMenuItemStockImpresora = null;
	private JMenu jMenuChip = null;
	private JMenuItem jMenuItemHandHeld = null;
	private JMenuItem jMenuItemABam = null;
	private JMenuItem jMenuItemStock = null;
	private JMenu jMenuPc = null;
	private JMenuItem jMenuItemUsuario = null;
	private JMenuItem jMenuItemNtbStock = null;
	private JMenu jMenuHandheld = null;
	private JMenuItem jMenuItemHandLocacion = null;
	private JMenuItem jMenuItemRepaVigente = null;
	/**
	 * This is the default constructor
	 */
	public MenuPpal() {
		super();
		initialize();
	}
	public  void alInicio(){
	      
		Inicio ini=new Inicio();
		
	   this.jContentPane.add(ini);
		jContentPane.updateUI();
		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		//this.setAlwaysOnTop(true);
		//this.setSize(722, 366);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle(titulo);
		this.setLocationRelativeTo(null); 
		Inicio ini=new Inicio();
		
		this.jContentPane.add(ini);
		jContentPane.updateUI();
		
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	public JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setName("PanelPpal");
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenuArchivo1());
			jJMenuBar.add(getJMenuABM2());
			jJMenuBar.add(getJMenuRepas());
			jJMenuBar.add(getJMenuInventario());
			jJMenuBar.add(getJMenuReasignaciones());
			jJMenuBar.add(getJMenuConsultas());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenuRepas	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuRepas() {
		if (jMenuRepas == null) {
			jMenuRepas = new JMenu();
			jMenuRepas.setText("Reparaciones");
			jMenuRepas.add(getJMenuItemEnviar());
			jMenuRepas.add(getJMenuItemRepaVigente());
		}
		return jMenuRepas;
	}

	/**
	 * This method initializes jMenuItemEnviar	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemEnviar() {
		if (jMenuItemEnviar == null) {
			jMenuItemEnviar = new JMenuItem();
			jMenuItemEnviar.setText("Enviar a Reparar");
			jMenuItemEnviar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Areparar repa = null;
					try {
						repa = new Areparar();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					jContentPane.removeAll();
					getContentPane().add(repa);
					jContentPane.updateUI(); // 
				}
			});
		}
		return jMenuItemEnviar;
	}

	/**
	 * This method initializes jMenuInventario	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuInventario() {
		if (jMenuInventario == null) {
			jMenuInventario = new JMenu();
			jMenuInventario.setText("Inventario");
			jMenuInventario.add(getJMenuItemPc());
			jMenuInventario.add(getJMenuItemImpresoras());
			jMenuInventario.add(getJMenuItemHandheld());
			jMenuInventario.add(getJMenuItemBam());
		}
		return jMenuInventario;
	}

	/**
	 * This method initializes jMenuItemPc	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemPc() {
		if (jMenuItemPc == null) {
			jMenuItemPc = new JMenuItem();
			jMenuItemPc.setText("Ver Pcs");
			jMenuItemPc.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					VerPcs pc=new VerPcs();
					jContentPane.removeAll();
					getContentPane().add(pc);
					jContentPane.updateUI(); // 
				}
			});
		}
		return jMenuItemPc;
	}

	/**
	 * This method initializes jMenuItemImpresoras	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemImpresoras() {
		if (jMenuItemImpresoras == null) {
			jMenuItemImpresoras = new JMenuItem();
			jMenuItemImpresoras.setText("Ver impresoras");
			jMenuItemImpresoras.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					VerImpresoras ver=new VerImpresoras();
					getContentPane().removeAll();
					getContentPane().add(ver);
					jContentPane.updateUI();
					
				}
			});
		}
		return jMenuItemImpresoras;
	}

	/**
	 * This method initializes jMenuItemHandheld	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHandheld() {
		if (jMenuItemHandheld == null) {
			jMenuItemHandheld = new JMenuItem();
			jMenuItemHandheld.setText("Ver HandHelds");
			jMenuItemHandheld.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jContentPane.removeAll();	
					VerHandHelds hheld=new VerHandHelds();
					jContentPane.add(hheld);
					jContentPane.updateUI();
				}
			});
		}
		return jMenuItemHandheld;
	}

	/**
	 * This method initializes jMenuABM2	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuABM2() {
		if (jMenuABM2 == null) {
			jMenuABM2 = new JMenu();
			jMenuABM2.setText("ABM");
			jMenuABM2.add(getJMenuAltas2());
			jMenuABM2.add(getJMenuModificaciones());
			jMenuABM2.add(getJMenuItemBajas2());
		}
		return jMenuABM2;
	}

	/**
	 * This method initializes jMenuAltas2	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuAltas2() {
		if (jMenuAltas2 == null) {
			jMenuAltas2 = new JMenu();
			jMenuAltas2.setText("Altas");
			jMenuAltas2.add(getJMenuItemPCyNTB());
			jMenuAltas2.add(getJMenuItemImpresoras2());
			jMenuAltas2.add(getJMenuItemHandHelds());
			jMenuAltas2.add(getJMenuItemBAM());
			jMenuAltas2.add(getJMenuItemChip());
		}
		return jMenuAltas2;
	}

	/**
	 * This method initializes jMenuModificaciones	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuModificaciones() {
		if (jMenuModificaciones == null) {
			jMenuModificaciones = new JMenu();
			jMenuModificaciones.setText("Modificaciones");
			jMenuModificaciones.add(getJMenuItemPcModif());
			jMenuModificaciones.add(getJMenuItemImpresorasModif());
			jMenuModificaciones.add(getJMenuItemHandHeldsModif());
			jMenuModificaciones.add(getJMenuItemModifBAM());
			jMenuModificaciones.add(getJMenuItemModifChip());
		}
		return jMenuModificaciones;
	}

	/**
	 * This method initializes jMenuItemPCyNTB	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemPCyNTB() {
		if (jMenuItemPCyNTB == null) {
			jMenuItemPCyNTB = new JMenuItem();
			jMenuItemPCyNTB.setText("PC y Notebooks");
			jMenuItemPCyNTB.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AltaPcNtb pc=new AltaPcNtb();
					jContentPane.removeAll();
					jContentPane.add(pc);
					jContentPane.updateUI(); // 
					
					
					
					
					
				}
			});
		}
		return jMenuItemPCyNTB;
	}

	/**
	 * This method initializes jMenuItemImpresoras2	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemImpresoras2() {
		if (jMenuItemImpresoras2 == null) {
			jMenuItemImpresoras2 = new JMenuItem();
			jMenuItemImpresoras2.setText("Impresoras");
			jMenuItemImpresoras2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AltaImpresora imp=new AltaImpresora();
					jContentPane.removeAll();
					getContentPane().add(imp);
					jContentPane.updateUI(); 
				}
			});
		}
		return jMenuItemImpresoras2;
	}

	/**
	 * This method initializes jMenuItemHandHelds	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHandHelds() {
		if (jMenuItemHandHelds == null) {
			jMenuItemHandHelds = new JMenuItem();
			jMenuItemHandHelds.setText("HandHelds");
			jMenuItemHandHelds.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AltaHanHeld hand=new AltaHanHeld();
					jContentPane.removeAll();
					getContentPane().add(hand);
					jContentPane.updateUI(); // 
				}
			});
		}
		return jMenuItemHandHelds;
	}

	/**
	 * This method initializes jMenuItemBajas2	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemBajas2() {
		if (jMenuItemBajas2 == null) {
			jMenuItemBajas2 = new JMenuItem();
			jMenuItemBajas2.setText("Bajas");
			jMenuItemBajas2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					BajaDeEquipos BE=new BajaDeEquipos();
					jContentPane.removeAll();
					getContentPane().add(BE);
					jContentPane.updateUI(); // 
					
					
					
					
					
				}
			});
		}
		return jMenuItemBajas2;
	}
public static void actualizarPantalla(){
	
}
	/**
	 * This method initializes jMenuItemPcModif	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemPcModif() {
		if (jMenuItemPcModif == null) {
			jMenuItemPcModif = new JMenuItem();
			jMenuItemPcModif.setText("PC y Notebooks");
			jMenuItemPcModif.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ModifPcNtb modifPc=new ModifPcNtb();
					jContentPane.removeAll();
					getContentPane().add(modifPc);
					jContentPane.updateUI(); // 
					
					
				
				}
			});
		}
		return jMenuItemPcModif;
	}

	/**
	 * This method initializes jMenuItemImpresorasModif	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemImpresorasModif() {
		if (jMenuItemImpresorasModif == null) {
			jMenuItemImpresorasModif = new JMenuItem();
			jMenuItemImpresorasModif.setText("Impresoras");
			jMenuItemImpresorasModif.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ModifImpresoras impresora=new ModifImpresoras();
					jContentPane.removeAll();
					getContentPane().add(impresora);
					jContentPane.updateUI(); // 
				}
			});
		}
		return jMenuItemImpresorasModif;
	}

	/**
	 * This method initializes jMenuItemHandHeldsModif	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHandHeldsModif() {
		if (jMenuItemHandHeldsModif == null) {
			jMenuItemHandHeldsModif = new JMenuItem();
			jMenuItemHandHeldsModif.setText("HandHelds");
			jMenuItemHandHeldsModif.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jContentPane.removeAll();
					ModifHheld modhand=new ModifHheld();
					jContentPane.add(modhand);
					jContentPane.updateUI();
				}
			});
		}
		return jMenuItemHandHeldsModif;
	}

	/**
	 * This method initializes jMenuArchivo1	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuArchivo1() {
		if (jMenuArchivo1 == null) {
			jMenuArchivo1 = new JMenu();
			jMenuArchivo1.setText("Archivo");
			jMenuArchivo1.add(getJMenuItemSalir());
		}
		return jMenuArchivo1;
	}

	/**
	 * This method initializes jMenuItemSalir	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemSalir() {
		if (jMenuItemSalir == null) {
			jMenuItemSalir = new JMenuItem();
			jMenuItemSalir.setText("Salir");
			jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
					
				}
			});
		}
		return jMenuItemSalir;
	}

	/**
	 * This method initializes jMenuReasignaciones	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuReasignaciones() {
		if (jMenuReasignaciones == null) {
			jMenuReasignaciones = new JMenu();
			jMenuReasignaciones.setText("Asignaciones");
			jMenuReasignaciones.add(getJMenuImpresora());
			jMenuReasignaciones.add(getJMenuChip());
			jMenuReasignaciones.add(getJMenuPc());
			jMenuReasignaciones.add(getJMenuHandheld());
		}
		return jMenuReasignaciones;
	}

	/**
	 * This method initializes jMenuConsultas	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuConsultas() {
		if (jMenuConsultas == null) {
			jMenuConsultas = new JMenu();
			jMenuConsultas.setText("Consultas");
			jMenuConsultas.add(getJMenuItemConsultaGral());
		}
		return jMenuConsultas;
	}

	/**
	 * This method initializes jMenuItemBAM	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemBAM() {
		if (jMenuItemBAM == null) {
			jMenuItemBAM = new JMenuItem();
			jMenuItemBAM.setText("Banda ancha movil");
			jMenuItemBAM.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AltaBam aBam=new AltaBam();
					jContentPane.removeAll();
					getContentPane().add(aBam);
					jContentPane.updateUI(); // 
					
				}
			});
		}
		return jMenuItemBAM;
	}

	/**
	 * This method initializes jMenuItemChip	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemChip() {
		if (jMenuItemChip == null) {
			jMenuItemChip = new JMenuItem();
			jMenuItemChip.setText("Chip");
			jMenuItemChip.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AltaChip chip=new AltaChip();
					getContentPane().removeAll();
					getContentPane().add(chip);
					jContentPane.updateUI();
					
				}
			});
		}
		return jMenuItemChip;
	}

	/**
	 * This method initializes jMenuItemModifBAM	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemModifBAM() {
		if (jMenuItemModifBAM == null) {
			jMenuItemModifBAM = new JMenuItem();
			jMenuItemModifBAM.setText("Banda ancha movil");
		}
		return jMenuItemModifBAM;
	}

	/**
	 * This method initializes jMenuItemModifChip	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemModifChip() {
		if (jMenuItemModifChip == null) {
			jMenuItemModifChip = new JMenuItem();
			jMenuItemModifChip.setText("Chip");
		}
		return jMenuItemModifChip;
	}

	/**
	 * This method initializes jMenuItemBam	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemBam() {
		if (jMenuItemBam == null) {
			jMenuItemBam = new JMenuItem();
			jMenuItemBam.setText("Banda ancha movil");
			jMenuItemBam.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				jContentPane.removeAll();
				VerBam vb=new VerBam();
				jContentPane.add(vb);
				jContentPane.updateUI();
				}
			});
		}
		return jMenuItemBam;
	}

	/**
	 * This method initializes jMenuItemConsultaGral	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemConsultaGral() {
		if (jMenuItemConsultaGral == null) {
			jMenuItemConsultaGral = new JMenuItem();
			jMenuItemConsultaGral.setText("Consulta SQL");
			jMenuItemConsultaGral.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					ConsultaSQL cons=new ConsultaSQL();
					jContentPane.removeAll();
					jContentPane.add(cons);
					jContentPane.updateUI(); 
				}
			});
		}
		return jMenuItemConsultaGral;
	}

	/**
	 * This method initializes jMenuImpresora	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuImpresora() {
		if (jMenuImpresora == null) {
			jMenuImpresora = new JMenu();
			jMenuImpresora.setText("Impresora");
			jMenuImpresora.add(getJMenuItemLocacion());
			jMenuImpresora.add(getJMenuItemStockImpresora());
		}
		return jMenuImpresora;
	}

	/**
	 * This method initializes jMenuItemLocacion	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemLocacion() {
		if (jMenuItemLocacion == null) {
			jMenuItemLocacion = new JMenuItem();
			jMenuItemLocacion.setText("A locaci�n");
			jMenuItemLocacion.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				
					JOptionPane.showMessageDialog(null,"En construccion");
				
				
				
				}
			});
		}
		return jMenuItemLocacion;
	}

	/**
	 * This method initializes jMenuItemStockImpresora	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemStockImpresora() {
		if (jMenuItemStockImpresora == null) {
			jMenuItemStockImpresora = new JMenuItem();
			jMenuItemStockImpresora.setText("A stock");
		}
		return jMenuItemStockImpresora;
	}

	/**
	 * This method initializes jMenuChip	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuChip() {
		if (jMenuChip == null) {
			jMenuChip = new JMenu();
			jMenuChip.setText("Chip");
			jMenuChip.add(getJMenuItemHandHeld());
			jMenuChip.add(getJMenuItemABam());
			jMenuChip.add(getJMenuItemStock());
		}
		return jMenuChip;
	}

	/**
	 * This method initializes jMenuItemHandHeld	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHandHeld() {
		if (jMenuItemHandHeld == null) {
			jMenuItemHandHeld = new JMenuItem();
			jMenuItemHandHeld.setText("A hand held");
			jMenuItemHandHeld.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AsigNacChipAHand chiphand=new AsigNacChipAHand();
					jContentPane.removeAll();
					jContentPane.add(chiphand);
					jContentPane.updateUI();
				}
			});
		}
		return jMenuItemHandHeld;
	}

	/**
	 * This method initializes jMenuItemABam	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemABam() {
		if (jMenuItemABam == null) {
			jMenuItemABam = new JMenuItem();
			jMenuItemABam.setText("A bam");
		}
		return jMenuItemABam;
	}

	/**
	 * This method initializes jMenuItemStock	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemStock() {
		if (jMenuItemStock == null) {
			jMenuItemStock = new JMenuItem();
			jMenuItemStock.setText("A stock");
		}
		return jMenuItemStock;
	}

	/**
	 * This method initializes jMenuPc	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuPc() {
		if (jMenuPc == null) {
			jMenuPc = new JMenu();
			jMenuPc.setText("Pc y Notebook");
			jMenuPc.add(getJMenuItemUsuario());
			jMenuPc.add(getJMenuItemNtbStock());
		}
		return jMenuPc;
	}

	/**
	 * This method initializes jMenuItemUsuario	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemUsuario() {
		if (jMenuItemUsuario == null) {
			jMenuItemUsuario = new JMenuItem();
			jMenuItemUsuario.setText("A usuario");
		}
		return jMenuItemUsuario;
	}

	/**
	 * This method initializes jMenuItemNtbStock	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemNtbStock() {
		if (jMenuItemNtbStock == null) {
			jMenuItemNtbStock = new JMenuItem();
			jMenuItemNtbStock.setText("A stock");
		}
		return jMenuItemNtbStock;
	}

	/**
	 * This method initializes jMenuHandheld	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuHandheld() {
		if (jMenuHandheld == null) {
			jMenuHandheld = new JMenu();
			jMenuHandheld.setText("Hand held");
			jMenuHandheld.add(getJMenuItemHandLocacion());
		}
		return jMenuHandheld;
	}

	/**
	 * This method initializes jMenuItemHandLocacion	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHandLocacion() {
		if (jMenuItemHandLocacion == null) {
			jMenuItemHandLocacion = new JMenuItem();
			jMenuItemHandLocacion.setText("A locaci�n");
			jMenuItemHandLocacion.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ReasignacionHandHeld re=new ReasignacionHandHeld();
					re.setVisible(true);
					re.setLocationRelativeTo(null);
				}
			});
		}
		return jMenuItemHandLocacion;
	}
	/**
	 * This method initializes jMenuItemRepaVigente	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemRepaVigente() {
		if (jMenuItemRepaVigente == null) {
			jMenuItemRepaVigente = new JMenuItem();
			jMenuItemRepaVigente.setText("Reparaciones, operaciones varias");
			jMenuItemRepaVigente.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					VerReparacionesVigentes ver=new VerReparacionesVigentes();
					getContentPane().removeAll();
					getContentPane().add(ver);
					jContentPane.updateUI();
				
				}
			});
		}
		return jMenuItemRepaVigente;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
