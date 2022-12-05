/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Font;


/**
 *
 * @author George
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        decorateTableTasks();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEmptyTitle = new javax.swing.JLabel();
        jLabelEmptyListSubtitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JLabolToobar = new javax.swing.JPanel();
        jLabelTBtitle = new javax.swing.JLabel();
        jLabelsubtitle = new javax.swing.JLabel();
        jLabelimg = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        jLabelProjectTitle = new javax.swing.JLabel();
        jLabelProjectImg = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTasksTitlke = new javax.swing.JLabel();
        jLabelTasksImg = new javax.swing.JLabel();
        jPanelList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        jPanelEmptyList.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEmptyTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmptyTitle.setForeground(new java.awt.Color(0, 0, 204));
        jLabelEmptyTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyTitle.setText("Nenhuma Tarefa por aqui :)");

        jLabelEmptyListSubtitle.setForeground(new java.awt.Color(0, 0, 204));
        jLabelEmptyListSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubtitle.setText("Clique no bot�o '+' para adicionar nova tarefa!");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmptyTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabelEmptyTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmptyListSubtitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));

        JLabolToobar.setBackground(new java.awt.Color(0, 0, 204));

        jLabelTBtitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTBtitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTBtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTBtitle.setText("Lista Tarefas App");

        jLabelsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelsubtitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelsubtitle.setText("Organiza��o em sua m�o");

        jLabelimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check (2).png"))); // NOI18N

        javax.swing.GroupLayout JLabolToobarLayout = new javax.swing.GroupLayout(JLabolToobar);
        JLabolToobar.setLayout(JLabolToobarLayout);
        JLabolToobarLayout.setHorizontalGroup(
            JLabolToobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JLabolToobarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelimg, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTBtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(86, 86, 86))
            .addGroup(JLabolToobarLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelsubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JLabolToobarLayout.setVerticalGroup(
            JLabolToobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JLabolToobarLayout.createSequentialGroup()
                .addGroup(JLabolToobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JLabolToobarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelimg, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(JLabolToobarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTBtitle)
                        .addGap(55, 55, 55)))
                .addComponent(jLabelsubtitle)
                .addGap(19, 19, 19))
        );

        jPanelProjects.setBackground(new java.awt.Color(255, 255, 255));

        jLabelProjectTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProjectTitle.setForeground(new java.awt.Color(0, 0, 204));
        jLabelProjectTitle.setText("Projetos");

        jLabelProjectImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProjectImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelProjectImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectImgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelProjectImg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProjectImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelTasks.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTasksTitlke.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTasksTitlke.setForeground(new java.awt.Color(0, 0, 204));
        jLabelTasksTitlke.setText("Tarefas");

        jLabelTasksImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTasksImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTasksTitlke, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTasksImg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTasksImg, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jLabelTasksTitlke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelList.setBackground(new java.awt.Color(255, 255, 255));

        jList1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 0, 204));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setFixedCellHeight(40);
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanelListLayout = new javax.swing.GroupLayout(jPanelList);
        jPanelList.setLayout(jPanelListLayout);
        jPanelListLayout.setHorizontalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelListLayout.setVerticalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri��o", "Prazo", "Tarefa Conclu�da"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(40);
        jTableTasks.setSelectionBackground(new java.awt.Color(0, 0, 204));
        jTableTasks.setShowHorizontalLines(true);
        jScrollPane2.setViewportView(jTableTasks);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabolToobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JLabolToobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjectImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectImgMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
    }//GEN-LAST:event_jLabelProjectImgMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JLabolToobar;
    private javax.swing.JLabel jLabelEmptyListSubtitle;
    private javax.swing.JLabel jLabelEmptyTitle;
    private javax.swing.JLabel jLabelProjectImg;
    private javax.swing.JLabel jLabelProjectTitle;
    private javax.swing.JLabel jLabelTBtitle;
    private javax.swing.JLabel jLabelTasksImg;
    private javax.swing.JLabel jLabelTasksTitlke;
    private javax.swing.JLabel jLabelimg;
    private javax.swing.JLabel jLabelsubtitle;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTasks;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables


   public void decorateTableTasks(){ 
       jTableTasks.getTableHeader().setFont(new Font("Segou UI",Font.BOLD,14));
       jTableTasks.getTableHeader().setBackground(new Color(0,0,204));
       jTableTasks.getTableHeader().setForeground(new Color(255,255,255));

       jTableTasks.setAutoCreateRowSorter(true);
   }
}
