package listadepersonas;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class VentanaPrincipal extends javax.swing.JFrame {
    int xmouse, ymouse;
    private listaPersonas lista;
       DefaultListModel modelo = new DefaultListModel();
       
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        modelo = new DefaultListModel();
        
        lista_menu.setModel(modelo);
        lista = new listaPersonas();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pnl_barra = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_titlte = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        pnl_agregar = new javax.swing.JPanel();
        lbl_agregar = new javax.swing.JLabel();
        pnl_eliminar = new javax.swing.JPanel();
        lbl_eliminar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        pnl_eliminarLista = new javax.swing.JPanel();
        lbl_eliminarLista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_menu = new javax.swing.JList<>();
        pnl_borrar = new javax.swing.JPanel();
        lbl_borrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(222, 220, 220));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_barra.setBackground(new java.awt.Color(204, 204, 255));
        pnl_barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_barraMouseDragged(evt);
            }
        });
        pnl_barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_barraMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 204, 255));
        exit.setForeground(new java.awt.Color(0, 153, 255));

        lbl_exit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_exit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("X");
        lbl_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbl_titlte.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lbl_titlte.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titlte.setText("Personas");

        javax.swing.GroupLayout pnl_barraLayout = new javax.swing.GroupLayout(pnl_barra);
        pnl_barra.setLayout(pnl_barraLayout);
        pnl_barraLayout.setHorizontalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_barraLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_titlte, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        pnl_barraLayout.setVerticalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_titlte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(pnl_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 30));

        txt_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombreMousePressed(evt);
            }
        });
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        background.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, 20));

        txt_apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_apellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_apellidoMouseClicked(evt);
            }
        });
        background.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, 20));

        txt_direccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        background.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 200, 20));

        txt_telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        background.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 200, 20));

        pnl_agregar.setBackground(new java.awt.Color(204, 204, 255));

        lbl_agregar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lbl_agregar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_agregar.setText("Agregar");
        lbl_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_agregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_agregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_agregarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_agregarLayout = new javax.swing.GroupLayout(pnl_agregar);
        pnl_agregar.setLayout(pnl_agregarLayout);
        pnl_agregarLayout.setHorizontalGroup(
            pnl_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_agregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pnl_agregarLayout.setVerticalGroup(
            pnl_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_agregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(pnl_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 90, 30));

        pnl_eliminar.setBackground(new java.awt.Color(204, 204, 255));

        lbl_eliminar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lbl_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_eliminar.setText("Eliminar");
        lbl_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_eliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_eliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_eliminarLayout = new javax.swing.GroupLayout(pnl_eliminar);
        pnl_eliminar.setLayout(pnl_eliminarLayout);
        pnl_eliminarLayout.setHorizontalGroup(
            pnl_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_eliminarLayout.setVerticalGroup(
            pnl_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_eliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(pnl_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 90, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 340));

        lbl_nombres.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_nombres.setText("Nombres:");
        background.add(lbl_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 60, 20));

        lbl_apellidos.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_apellidos.setText("Apellidos:");
        background.add(lbl_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 20));

        lbl_direccion.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_direccion.setText("Dirección:");
        background.add(lbl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 20));

        lbl_telefono.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_telefono.setText("Teléfono:");
        background.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, 20));

        pnl_eliminarLista.setBackground(new java.awt.Color(204, 204, 255));

        lbl_eliminarLista.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lbl_eliminarLista.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eliminarLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_eliminarLista.setText("Eliminar lista");
        lbl_eliminarLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_eliminarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_eliminarListaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_eliminarListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_eliminarListaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_eliminarListaLayout = new javax.swing.GroupLayout(pnl_eliminarLista);
        pnl_eliminarLista.setLayout(pnl_eliminarListaLayout);
        pnl_eliminarListaLayout.setHorizontalGroup(
            pnl_eliminarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_eliminarListaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_eliminarLista)
                .addContainerGap())
        );
        pnl_eliminarListaLayout.setVerticalGroup(
            pnl_eliminarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_eliminarListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_eliminarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(pnl_eliminarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 90, 40));

        jScrollPane1.setViewportView(lista_menu);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 360, 190));

        pnl_borrar.setBackground(new java.awt.Color(204, 204, 255));

        lbl_borrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lbl_borrar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_borrar.setText("Borrar");
        lbl_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_borrarLayout = new javax.swing.GroupLayout(pnl_borrar);
        pnl_borrar.setLayout(pnl_borrarLayout);
        pnl_borrarLayout.setHorizontalGroup(
            pnl_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_borrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_borrarLayout.setVerticalGroup(
            pnl_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_borrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(pnl_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void lbl_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_agregarMouseClicked
        
        String Nom =txt_nombre.getText();
        String Apll = txt_apellido.getText();
        String Tele = txt_telefono.getText();
        String Dire = txt_direccion.getText();
        
        persona p = new persona(Nom,Apll,Tele, Dire);
            
        
        String elemento = Nom + " | " + Apll + " | " + Tele + " | " + Dire;
       
        lista.añadirPersona(p);
        modelo.addElement(elemento);

            
        System.out.println(lista.personas);
        
            
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        
    }//GEN-LAST:event_lbl_agregarMouseClicked

    private void pnl_barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barraMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_pnl_barraMousePressed

    private void pnl_barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_pnl_barraMouseDragged

    private void txt_apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellidoMouseClicked
    }//GEN-LAST:event_txt_apellidoMouseClicked

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMousePressed
    }//GEN-LAST:event_txt_nombreMousePressed

    private void lbl_eliminarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarListaMouseClicked
        int eliminar_todo = lista_menu.getSelectedIndex();
        modelo.removeAllElements();
        //elimina todo los item del array de listaPersonas
        lista.borrarLista();
    }//GEN-LAST:event_lbl_eliminarListaMouseClicked

    private void lbl_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseClicked
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
    }//GEN-LAST:event_lbl_borrarMouseClicked

    private void lbl_agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_agregarMouseEntered
        pnl_agregar.setBackground(new Color(204,204,255));
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_agregarMouseEntered

    private void lbl_agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_agregarMouseExited
        pnl_agregar.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_lbl_agregarMouseExited

    private void lbl_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseEntered
        pnl_borrar.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_lbl_borrarMouseEntered

    private void lbl_borrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseExited
        pnl_borrar.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_lbl_borrarMouseExited

    private void lbl_eliminarListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarListaMouseEntered
        pnl_eliminarLista.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_lbl_eliminarListaMouseEntered

    private void lbl_eliminarListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarListaMouseExited
        pnl_eliminarLista.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_lbl_eliminarListaMouseExited

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        exit.setBackground(new Color(204,204,255));
        // lbl_exit.setForeground(Color.black);
    }//GEN-LAST:event_lbl_exitMouseExited

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        exit.setBackground(new Color(204,204,255));
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarMouseExited
        pnl_eliminar.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_lbl_eliminarMouseExited

    private void lbl_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarMouseEntered
        pnl_eliminar.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_lbl_eliminarMouseEntered

    private void lbl_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarMouseClicked
        //elimina el item seleccionado de la lista
        int i = lista_menu.getSelectedIndex();
        System.out.println(i);
        modelo.remove(i);
        lista.eliminarPersona(i);
        System.out.println(lista.personas);
    }//GEN-LAST:event_lbl_eliminarMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_agregar;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_eliminar;
    private javax.swing.JLabel lbl_eliminarLista;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titlte;
    private javax.swing.JList<String> lista_menu;
    private javax.swing.JPanel pnl_agregar;
    private javax.swing.JPanel pnl_barra;
    private javax.swing.JPanel pnl_borrar;
    private javax.swing.JPanel pnl_eliminar;
    private javax.swing.JPanel pnl_eliminarLista;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
