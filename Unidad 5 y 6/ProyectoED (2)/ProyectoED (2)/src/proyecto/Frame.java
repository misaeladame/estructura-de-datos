/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 18131273, 18131252,18131222,18131209,18130566,18131277,18131212
 */
public class Frame extends javax.swing.JFrame {
    QuickSort qs = new QuickSort();
    InsSimple is = new InsSimple();
    ShellSort ss = new ShellSort();
    Hashing hash = new Hashing();
    Binaria bi = new Binaria();
    BinariaRecursiva bire = new BinariaRecursiva();
    Secuencial sec = new Secuencial();
    BusqHash bh = new BusqHash();
    SecuencialRecursiva sr = new SecuencialRecursiva();
    ArrayList<TipoElem> alumnos = new ArrayList<>();
    Lista [] tablaHash;
    String[] nombresM = { "JOSE", "JUAN", "LUIS", "MANUEL", "ANTONIO", "JESUS", "CARLOS", "FRANCISCO", "ALBERTO", "JORGE", "MIGUEL", "ANGEL",
                         "JAVIER", "ALEJANDRO", "ENRIQUE", "VICTOR", "ARTURO", "CESAR", "FERNANDO", "PEDRO", "MARTIN", "ROBERTO", "EDUARDO", 
                         "MARIO", "ARMANDO", "SERGIO", "RAUL", "ALFREDO", "RAFAEL", "RICARDO", "HECTOR", "OSCAR", "GERARDO", "DAVID", "DANIEL",
                         "HUGO", "JAIME", "JULIO", "RUBEN", "RAMON", "MARCO", "GABRIEL", "EDGAR", "GUADALUPE", "ALFONSO", "GUILLERMO", "SALVADOR", 
                         "OMAR", "IVAN", "HUMBERTO", "FELIPE", "ERNESTO", "PABLO", "IGNACIO", "GUSTAVO", "ANDRES", "ADRIAN", "JOEL", "AGUSTIN", 
                         "RODOLFO", "GILBERTO", "ROGELIO", "RENE", "TOMAS", "SAUL", "ISRAEL", "OCTAVIO", "VICENTE", "NOE", "GREGORIO", "ISMAEL", 
                         "NICOLAS", "BENJAMIN", "MOISES", "SANTIAGO", "EFRAIN", "ALONSO", "ABEL", "JOSE", "ALVARO", "FELIX", "MARCOS", "ADOLFO",
                         "RODRIGO", "RAMIRO", "SAMUEL", "JOAQUIN", "ABRAHAM", "ESTEBAN", "ULISES", "RAYMUNDO", "FIDEL", "LORENZO", "GERMAN", "MAURICIO",
                         "LEONARDO", "JOSUE", "EMMANUEL", "JULIAN", "SANTOS", "ROMAN", "CRUZ", "DOMINGO", "BERNARDO", "EMILIO", "ISIDRO", "FELIPE",
                         "AURELIO", "DIEGO", "FEDERICO", "GONZALO", "RIGOBERTO", "BENITO", "MARIA", "ISAAC", "ADAN", "GENARO", "ELIAS", "AARON", 
                         "ORLANDO", "LEONEL", "EFREN", "ISAIAS", "HERIBERTO", "ROLANDO", "HORACIO", "FABIAN", "REYNALDO", "EUGENIO", "TRINIDAD", 
                         "MARCELINO", "URIEL", "AUGUSTO", "ELEAZAR", "EDMUNDO", "ERICK", "ERIK", "EZEQUIEL", "REYES", "FERMIN", "CHRISTIAN", "MARGARITO", 
                         "NESTOR", "VALENTIN", "LEOPOLDO", "ELOY", "CUAUHTEMOC", "EVERARDO", "ARNULFO", "LUCIO", "ARIEL", "DARIO", "DELFINO", 
                         "FLORENCIO", "EUSEBIO", "FAUSTINO", "ELISEO", "OSWALDO", "AMADO", "LEOBARDO", "ARTEMIO", "MISAEL", "NORBERTO", "MANUEL", 
                         "ADALBERTO", "MARIANO", "HILARIO", "CRISTOBAL", "FILIBERTO", "SALOMON", "NOEL", "ALDO", "LAZARO", "PASCUAL", "MAURO",
                         "EDGARDO", "MARCELO", "FAUSTO", "HOMERO", "JONATHAN", "ERIC", "CARMEN", "SIMON", "VLADIMIR", "ABELARDO", "ERASMO", "CLEMENTE", 
                         "SEBASTIAN", "MAXIMINO", "OSVALDO", "PORFIRIO", "FELICIANO", "ISABEL", "FLORENTINO", "CLAUDIO", "SILVESTRE", "HIPOLITO", 
                         "JACINTO", "LUCIANO", "DEMETRIO" };
    String[] nombresF = { "MARIA", "GUADALUPE", "ROSA", "MARTHA", "ANA", "PATRICIA", "LETICIA", "ELENA", "LAURA", "ELIZABETH", "ISABEL", "ALICIA", 
                         "MARGARITA", "LUZ", "ANGELICA", "CLAUDIA", "SILVIA", "NORMA", "JUANA", "GABRIELA", "ADRIANA", "VERONICA", "TERESA", "ALEJANDRA",
                         "ALMA", "BEATRIZ", "MARIA", "YOLANDA", "BLANCA", "SANDRA", "ARACELI", "IRMA", "GLORIA", "CARMEN", "LUISA", "ROCIO", "CONCEPCION",
                         "CRISTINA", "EDITH", "ESTHER", "LILIA", "LORENA", "MAGDALENA", "CECILIA", "JOSEFINA", "DOLORES", "KARINA", "LUCIA", "ESTELA",
                         "SUSANA", "MARIBEL", "MARIA", "LOURDES", "ERIKA", "MONICA", "MARIA", "DIANA", "EUGENIA", "MARIA", "MARIA", "FRANCISCA", "VIRGINIA", 
                         "LILIANA", "GRACIELA", "BERTHA", "OLGA", "MIRIAM", "FABIOLA", "DELIA", "CAROLINA", "KARLA", "HILDA", "ANTONIA", "MARICELA", "SONIA",
                         "NANCY", "BERENICE", "YADIRA", "MAYRA", "JUDITH", "MARISOL", "ROSARIO", "REYNA", "AURORA", "OLIVIA", "RAQUEL", "IRENE", "ELVIRA", 
                         "CATALINA", "LIDIA", "VICTORIA", "DULCE", "ISELA", "SARA", "MARCELA", "ELVIA", "ESPERANZA", "GUILLERMINA", "DORA", "EVA", "JULIA",
                         "ELSA", "ESMERALDA", "BRENDA", "SOCORRO", "GEORGINA", "MERCEDES", "SOFIA", "NOEMI", "CELIA", "MARIA", "MARIA", "MINERVA", "NORA", 
                         "GRISELDA", "ELIA", "ROSALBA", "IMELDA", "IVONNE", "MARINA", "RUTH", "LIZBETH", "MIREYA", "SOLEDAD", "CLARA", "OFELIA", "INES", 
                         "AIDA", "XOCHITL", "REBECA", "ELISA", "MIRNA", "CRUZ", "JESUS", "LIZETH", "PERLA", "YAZMIN", "JULIETA", "ANGELA", "ELVA", "FLOR", 
                         "AZUCENA", "SELENE", "MARIA", "EMMA", "ADELA", "YESENIA", "MARIA", "ANDREA", "MARIANA", "ROSALIA", "JAZMIN", "ANGELES", "PAOLA", 
                         "NOHEMI", "NATIVIDAD", "MARISELA", "TRINIDAD", "NELLY", "TERESA", "LEONOR", "CONSUELO", "AMPARO", "PAULA", "ANABEL", "ALBA", 
                         "JESSICA", "MARTINA", "MARLENE", "TANIA", "PETRA", "LUCILA", "JANET", "CANDELARIA", "AMALIA", "VANESSA", "ELOISA", "NADIA",
                         "HORTENCIA", "NAYELI", "EVANGELINA", "ORALIA", "DALIA", "ANTONIETA", "JANETH", "HERMELINDA", "EMILIA", "ANGELINA", "KAREN",
                         "MICAELA", "ARACELY", "EVELIA", "MARIA", "ABIGAIL", "AMELIA", "LUCERO", "RUBI", "IVETTE", "RITA", "ELDA" };
    String[] apellidos = {"HERNANDEZ", "GARCIA", "MARTINEZ", "LOPEZ", "GONZALEZ", "RODRIGUEZ", "PEREZ", "SANCHEZ", "RAMIREZ", "FLORES", "CRUZ", "GOMEZ", 
                          "MORALES", "VAZQUEZ", "JIMENEZ", "REYES", "DIAZ", "TORRES", "GUTIERREZ", "RUIZ", "AGUILAR", "MENDOZA", "CASTILLO", "ORTIZ", 
                          "MORENO", "RIVERA", "RAMOS", "ROMERO", "JUAREZ", "ALVAREZ", "MENDEZ", "CHAVEZ", "HERRERA", "MEDINA", "DOMINGUEZ", "CASTRO", 
                          "GUZMAN", "VARGAS", "VELAZQUEZ", "SALAZAR", "ROJAS", "ORTEGA", "CORTES", "SANTIAGO", "GUERRERO", "CONTRERAS", "BAUTISTA", 
                          "ESTRADA", "LUNA", "LARA", "RIOS", "AVILA", "ALVARADO", "DE", "SILVA", "DELGADO", "CARRILLO", "SOLIS", "SOTO", "LEON", 
                          "FERNANDEZ", "CERVANTES", "MARQUEZ", "ESPINOSA", "MEJIA", "VEGA", "SANDOVAL", "CAMPOS", "NAVA", "CABRERA", "IBARRA", "ESPINOZA", 
                          "SANTOS", "ACOSTA", "CAMACHO", "VALDEZ", "FUENTES", "MUÑOZ", "MIRANDA", "MALDONADO", "ROBLES", "ROSAS", "MEZA", "MOLINA", "TREJO",
                          "ROSALES", "PACHECO", "NAVARRO", "SALGADO", "AGUIRRE", "SALAS", "VELASCO", "CARDENAS", "PINEDA", "OROZCO", "SERRANO", "RANGEL", 
                          "VALENCIA", "SOSA", "VASQUEZ", "VALENZUELA", "TAPIA", "BARRERA", "ARELLANO", "FIGUEROA", "PADILLA", "AYALA", "HUERTA", "DURAN", 
                          "SALINAS", "MONTES", "MORA", "CALDERON", "MARIN", "CUEVAS", "VILLANUEVA", "PALACIOS", "OLVERA", "ESCOBAR", "SUAREZ", "BENITEZ", 
                          "GALLEGOS", "FRANCO", "OCHOA", "CANO", "ZAMORA", "BELTRAN", "VILLEGAS", "MACIAS", "ZAVALA", "LOZANO", "ALONSO", "GALVAN", "OSORIO",
                          "PEÑA", "ROMAN", "TRUJILLO", "GARZA", "PONCE", "PERALTA", "GALINDO", "LEYVA", "NUÑEZ", "CORONA", "ZARATE", "ANDRADE", "BERNAL", 
                          "TOLEDO", "RUBIO", "ARIAS", "BRAVO", "MATA", "PARRA", "CASTAÑEDA", "ANTONIO", "ENRIQUEZ", "VERA", "CISNEROS", "RIVAS", "MONTOYA",
                          "OLIVARES", "ROCHA", "CASTELLANOS", "ZUÑIGA", "ARROYO", "ESQUIVEL", "QUIROZ", "NAVARRETE", "VILLALOBOS", "VILLA", "GUEVARA", 
                          "ANGELES", "TOVAR", "CORDOVA", "VILLARREAL", "CARMONA", "QUINTERO", "GALLARDO", "DE", "OCAMPO", "TELLEZ", "ZAPATA", "CABALLERO", 
                          "ESPARZA", "MONTIEL", "BECERRA", "LUGO", "DAVILA", "SANTANA", "DE", "REYNA", "GALICIA", "PAREDES", "MUNOZ", "ALARCON", "NAJERA", 
                          "ACEVEDO", "OJEDA", "MERCADO", "GUERRA", "GUILLEN", "MURILLO", "AVALOS", "BARRIOS", "FELIX", "BELLO", "SOLANO", "CHAN", "RENDON",
                          "ESCAMILLA", "ESCOBEDO", "SAUCEDO", "AMADOR", "LEAL", "CORTEZ", "SEGURA", "PALMA", "URIBE", "BLANCO", "ALTAMIRANO", "NIETO", 
                          "RESENDIZ", "SIERRA", "ISLAS", "MONROY", "BONILLA", "ALFARO", "VALLE", "GRANADOS", "AVILES", "BARRON", "BARAJAS", "ESCALANTE", 
                          "CARRASCO", "ARTEAGA", "GIL", "DUARTE", "MELENDEZ", "VALDES", "VENTURA", "AQUINO", "BARRAGAN", "ARRIAGA", "ARENAS", "BAEZ", 
                          "MONTERO", "PECH", "MENESES", "DEL", "ARMENTA", "GODINEZ", "BALDERAS", "VIDAL", "CARBAJAL", "JAIMES", "QUEZADA", "CORONADO",
                          "MAY", "CANTU", "ARREDONDO", "VARELA", "AGUILERA", "SORIANO", "SANTIZ", "GALVEZ", "ZEPEDA", "SOTELO", "ARCE", "ROMO", "CHI", 
                          "CARRANZA", "HIDALGO", "GAYTAN", "COVARRUBIAS", "MORAN", "ALCANTARA", "MEDRANO", "RICO", "UC", "COTA", "GAMEZ", "ROBLEDO", 
                          "ANAYA", "ARREOLA", "BARRIENTOS", "CARRERA", "CEBALLOS", "GAMBOA", "DE", "JARAMILLO", "PORTILLO", "GUADARRAMA", "ARANDA", 
                          "APARICIO", "DE", "OLGUIN", "CERON", "MARTIN", "RENTERIA", "ROQUE" };
    /**
     * Creates new form OrdenacionBusquedaApp
     */
    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabInfo = new javax.swing.JTable();
        btnVisuaSinOrdenar = new javax.swing.JButton();
        JbutCargar = new javax.swing.JButton();
        JbutOrdenar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtabDatos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jButBuscar = new javax.swing.JButton();
        jButGenerar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabBusq = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioBinaria = new javax.swing.JRadioButton();
        jRadioBinariaRecursiva = new javax.swing.JRadioButton();
        jRadioSecuencial = new javax.swing.JRadioButton();
        jRadioHashing = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbQuickSort = new javax.swing.JRadioButton();
        rbShellSort = new javax.swing.JRadioButton();
        rbHashing = new javax.swing.JRadioButton();
        rbInsSimple = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        RbSR = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTabInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO. CTROL", "NOMBRE", "CALIF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTabInfo);
        if (JTabInfo.getColumnModel().getColumnCount() > 0) {
            JTabInfo.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        btnVisuaSinOrdenar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVisuaSinOrdenar.setText("VISUALIZAR");
        btnVisuaSinOrdenar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVisuaSinOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisuaSinOrdenarActionPerformed(evt);
            }
        });

        JbutCargar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JbutCargar.setText("CARGAR");
        JbutCargar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JbutCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbutCargarActionPerformed(evt);
            }
        });

        JbutOrdenar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JbutOrdenar.setText("ORDENAR");
        JbutOrdenar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JbutOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbutOrdenarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TIEMPO DE ORDENACIÓN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        JtabDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO. CTROL", "NOMBRE", "CALIF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JtabDatos);
        if (JtabDatos.getColumnModel().getColumnCount() > 0) {
            JtabDatos.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jButBuscar.setText("BUSCAR");
        jButBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButBuscarActionPerformed(evt);
            }
        });

        jButGenerar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButGenerar.setText("GENERAR ARCHIVO");
        jButGenerar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGenerarActionPerformed(evt);
            }
        });

        jLabBusq.setBackground(new java.awt.Color(153, 153, 153));
        jLabBusq.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TIEMPO DE BUSQUEDA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
            .addComponent(jLabBusq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        buttonGroup2.add(jRadioBinaria);
        jRadioBinaria.setSelected(true);
        jRadioBinaria.setText("Binaria");

        buttonGroup2.add(jRadioBinariaRecursiva);
        jRadioBinariaRecursiva.setText("Binaria Recursiva");

        buttonGroup2.add(jRadioSecuencial);
        jRadioSecuencial.setText("Secuencial");
        jRadioSecuencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSecuencialActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioHashing);
        jRadioHashing.setText("Hashing");
        jRadioHashing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioHashingActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Usar :");

        buttonGroup1.add(rbQuickSort);
        rbQuickSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbQuickSort.setSelected(true);
        rbQuickSort.setText("QUICK SORT");

        buttonGroup1.add(rbShellSort);
        rbShellSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbShellSort.setText("SHELL SORT");
        rbShellSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbShellSortActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbHashing);
        rbHashing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbHashing.setText("HASHING");

        buttonGroup1.add(rbInsSimple);
        rbInsSimple.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbInsSimple.setText("INSERCIÓN SIMPLE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ordenacion");

        buttonGroup2.add(RbSR);
        RbSR.setText("Secuencial Recursivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(JbutCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVisuaSinOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioSecuencial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RbSR)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButBuscar)))
                            .addComponent(jLabel7)
                            .addComponent(rbQuickSort)
                            .addComponent(rbInsSimple)
                            .addComponent(JbutOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbShellSort)
                            .addComponent(rbHashing)
                            .addComponent(jRadioBinariaRecursiva)
                            .addComponent(jRadioHashing)
                            .addComponent(jRadioBinaria))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioBinaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioBinariaRecursiva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioSecuencial)
                    .addComponent(RbSR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioHashing)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(rbQuickSort)
                .addGap(18, 18, 18)
                .addComponent(rbInsSimple)
                .addGap(18, 18, 18)
                .addComponent(rbShellSort)
                .addGap(18, 18, 18)
                .addComponent(rbHashing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbutOrdenar)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JbutCargar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVisuaSinOrdenar)
                            .addComponent(jButGenerar)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbutCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbutCargarActionPerformed
        
        try {
            JFileChooser jfch = new JFileChooser();
            JLabel jLabel1 = new JLabel();
            if(jfch.showOpenDialog(jLabel1) != 0)
                return;
            File archivo = jfch.getSelectedFile(); 

            if(archivo != null){
                FileReader fr;
                fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr); 
            
                for(int i = 0;i<500000;i++){
                    String [] arr = br.readLine().split(",");
                    alumnos.add(new TipoElem());
                    alumnos.get(i).NoCtrl(Integer.parseInt(arr[0]));
                    alumnos.get(i).Nombre(arr[1]);
                    alumnos.get(i).Calif(Integer.parseInt(arr[2]));
            }
            br.close();
            fr.close();
            
            JOptionPane.showMessageDialog(this, "Archivo cargado");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JbutCargarActionPerformed

    private void btnVisuaSinOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisuaSinOrdenarActionPerformed
       DefaultTableModel modelo = (DefaultTableModel) JTabInfo.getModel();
       modelo.setRowCount(0);
          for(TipoElem alu : alumnos){
              Visualizar(alu,modelo);
          } 
    }//GEN-LAST:event_btnVisuaSinOrdenarActionPerformed

    public void Visualizar(TipoElem a, DefaultTableModel mo){
        Object[] o = new Object[3];
           o[0] = a.NoCtrl();
           o[1] = a.Nombre();
           o[2] = a.Calif();
           mo.addRow(o);
    }
    private void JbutOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbutOrdenarActionPerformed
        IOrdenacion ifce = null;
        if (rbQuickSort.isSelected())
            ifce = qs;
        else if (rbInsSimple.isSelected())
            ifce = is;
        else if (rbShellSort.isSelected())
            ifce = ss;
        else 
            ifce = hash;
        
        long startTime = System.currentTimeMillis();
        ifce.Ordenar(alumnos, 0, 499999);
        long endTime = System.currentTimeMillis();
        float segundos = (endTime - startTime)/1000f;
        double minutos = 0, horas = 0;
        while (segundos > 59){
            segundos -= 60;
            minutos++;
        }
        while (minutos > 59){
            minutos -= 60;
            horas++;
        }
            
        jLabel2.setText(horas+"h "+minutos+"m "+segundos+"s");
        
            
    }//GEN-LAST:event_JbutOrdenarActionPerformed

    private void jButGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGenerarActionPerformed
        Random azar = new Random();
        try {
            JFileChooser jfch = new JFileChooser();
            JLabel jLabel1 = new JLabel();
            if(jfch.showSaveDialog(jLabel1) != 0)
                return;
            File archivo = jfch.getSelectedFile();
        
            if(archivo != null){
              FileWriter fw;
              fw = new FileWriter(archivo+".txt");
              PrintWriter pw = new PrintWriter(fw);
         
              int sex;
              for(int i = 0;i<500000;i++){
                   sex = azar.nextInt(2);
                   pw.print((i+18000000)+",");
                   pw.print((sex==1?nombresM[azar.nextInt(nombresM.length)]:nombresF[azar.nextInt(nombresF.length)])+" "+
                               apellidos[azar.nextInt(apellidos.length)]+" "+apellidos[azar.nextInt(apellidos.length)]+",");
                   pw.println(azar.nextInt(101));
              }
            pw.close();
            fw.close();
            JOptionPane.showMessageDialog(this, "Archivo grabado con exito");
            }  
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButGenerarActionPerformed
    
    private void jButBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButBuscarActionPerformed
        TipoElem a = new TipoElem(jTextNombre.getText());
        DefaultTableModel modelo = (DefaultTableModel) JtabDatos.getModel();
        IBusqueda buscar  = null;
        if(jRadioBinaria.isSelected())
            buscar = bi;
        else if(jRadioBinariaRecursiva.isSelected())
            buscar = bire;
        else if(jRadioSecuencial.isSelected())
            buscar  = sec;
        else if(RbSR.isSelected())
            buscar = sr;
        if (jRadioHashing.isSelected()){
            
            long startTime = System.currentTimeMillis();
 
            a = bh.Buscar(hash.Tabla(), a);
            
            long endTime = System.currentTimeMillis();
            float segundos = (endTime - startTime)/1000f;
            double minutos = 0, horas = 0;
            while (segundos > 59){
                segundos -= 60;
                minutos++;
            }
            while (minutos > 59){
            minutos -= 60;
            horas++;
            }
            
        jLabBusq.setText(horas+"h "+minutos+"m "+segundos+"s");
        }
        else{
            long startTime = System.nanoTime();
            a = buscar.Buscar(alumnos, 0, 499999, a);
            long endTime = System.nanoTime();
            
            jLabBusq.setText((endTime-startTime)+"ns");  
            
        }
        modelo.setRowCount(0);
        Visualizar(a,modelo);
    }//GEN-LAST:event_jButBuscarActionPerformed

    private void jRadioHashingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioHashingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioHashingActionPerformed

    private void jRadioSecuencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSecuencialActionPerformed

    }//GEN-LAST:event_jRadioSecuencialActionPerformed

    private void rbShellSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbShellSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbShellSortActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTabInfo;
    private javax.swing.JButton JbutCargar;
    private javax.swing.JButton JbutOrdenar;
    private javax.swing.JTable JtabDatos;
    private javax.swing.JRadioButton RbSR;
    private javax.swing.JButton btnVisuaSinOrdenar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButBuscar;
    private javax.swing.JButton jButGenerar;
    private javax.swing.JLabel jLabBusq;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioBinaria;
    private javax.swing.JRadioButton jRadioBinariaRecursiva;
    private javax.swing.JRadioButton jRadioHashing;
    private javax.swing.JRadioButton jRadioSecuencial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JRadioButton rbHashing;
    private javax.swing.JRadioButton rbInsSimple;
    private javax.swing.JRadioButton rbQuickSort;
    private javax.swing.JRadioButton rbShellSort;
    // End of variables declaration//GEN-END:variables
}
