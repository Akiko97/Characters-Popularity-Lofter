package team.cplgroup.cpl;
@SuppressWarnings("serial")
public class DataMissingWarning extends javax.swing.JFrame {

    /**
     * Creates new form DataMissingWarning
     */
    public DataMissingWarning() {
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
        this.setTitle("可能缺少Data文件夹");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("  警告！");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("    警告：\n"
        		+ "    未检测到有效的data文件！程序可能无法正常运行，您现\n"
        		+ "    在看到的数据应为预置的数据，结果可能与真实情况有较\n"
        		+ "    大不同。\n    \n"
        		+ "    程序未检测到有效的data文件夹，您可能未下载或未正确\n"
        		+ "    配置data文件。\n    \n"
        		+ "    如您未下载data文件，请使用此链接下载data.zip文件：\n"
        		+ "    http://nlp.hankcs.com/download.php?file=data\n"
        		+ "    并将data文件夹解压缩至与CPL.jar同级目录。\n    \n"
        		+ "    如您已经下载了data.zip文件，请将data文件夹解压缩至\n"
        		+ "    与CPL.jar同级目录。");
        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
