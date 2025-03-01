package Main;

import Instructions.*;
import Registers.*;
import static Main.Memory.*;
import java.util.List;

/**
 * @author arthur souza
 * @author hector fernandes
 * @author rafael grimmler
 * @author willian do espirito santo
 * @author matheus cardoso
 * @author leonardo marotta
 */
public class VirtualMachine extends javax.swing.JFrame {

    public VirtualMachine() {
        initComponents();
        setInitValues();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        btnRun = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnDebug = new javax.swing.JButton();
        btnRunCicle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMemory = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        outCod = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        inCod = new javax.swing.JTextPane();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        accValue = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        pcValue = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        spValue = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        mopValue = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        reValue = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        riValue = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRun.setText("Executar");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });
        btnRun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRunKeyPressed(evt);
            }
        });

        btnHelp.setText("Ajuda");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnDebug.setText("Debug");

        btnRunCicle.setText("Executar Passo");

        tMemory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Address", "Content"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tMemory);

        jScrollPane2.setViewportView(outCod);

        jScrollPane3.setViewportView(inCod);

        label1.setText("Entrada de código");

        label2.setText("Saída de código");

        label3.setText("Memória");

        jLabel1.setText("Registradores");

        jScrollPane5.setAutoscrolls(true);
        jScrollPane5.setWheelScrollingEnabled(false);

        accValue.setColumns(20);
        accValue.setRows(1);
        accValue.setTabSize(1);
        accValue.setAutoscrolls(false);
        jScrollPane5.setViewportView(accValue);

        jScrollPane6.setAutoscrolls(true);
        jScrollPane6.setWheelScrollingEnabled(false);

        pcValue.setColumns(20);
        pcValue.setRows(1);
        pcValue.setTabSize(1);
        pcValue.setAutoscrolls(false);
        jScrollPane6.setViewportView(pcValue);

        jScrollPane7.setAutoscrolls(true);
        jScrollPane7.setWheelScrollingEnabled(false);

        spValue.setColumns(20);
        spValue.setRows(1);
        spValue.setTabSize(1);
        spValue.setAutoscrolls(false);
        jScrollPane7.setViewportView(spValue);

        jScrollPane8.setAutoscrolls(true);
        jScrollPane8.setWheelScrollingEnabled(false);

        mopValue.setColumns(20);
        mopValue.setRows(1);
        mopValue.setTabSize(1);
        mopValue.setAutoscrolls(false);
        jScrollPane8.setViewportView(mopValue);

        jScrollPane9.setAutoscrolls(true);
        jScrollPane9.setWheelScrollingEnabled(false);

        reValue.setColumns(20);
        reValue.setRows(1);
        reValue.setTabSize(1);
        reValue.setAutoscrolls(false);
        jScrollPane9.setViewportView(reValue);

        jScrollPane10.setAutoscrolls(true);
        jScrollPane10.setWheelScrollingEnabled(false);

        riValue.setColumns(20);
        riValue.setRows(1);
        riValue.setTabSize(1);
        riValue.setAutoscrolls(false);
        jScrollPane10.setViewportView(riValue);

        jLabel2.setText("ACC");

        jLabel3.setText("PC");

        jLabel4.setText("SP");

        jLabel5.setText("MOP");

        jLabel6.setText("RI");

        jLabel7.setText("RE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHelp)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2))
                                .addGap(0, 28, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRun)
                                .addGap(295, 295, 295))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRunCicle)
                                .addGap(282, 282, 282))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDebug)
                                .addGap(300, 300, 300))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1)
                            .addComponent(label2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(btnRun)
                        .addGap(18, 18, 18)
                        .addComponent(btnRunCicle)
                        .addGap(18, 18, 18)
                        .addComponent(btnDebug)))
                .addGap(109, 109, 109))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        //EXECUTAR A INSTRUÇÃO OLHANDO O ENDEREÇAMENTO
        Instruction instruction;
        Integer position = 12;
        PC.setValue(toBin(position));
        SP.setValue(toBin(2));
        
        String opcode = null, opd1 = null, opd2 = null;
        String cod = inCod.getText();
        
        readContent(cod, position);

        while(PC.getValue()!= null){
            attScreen();
            instruction = decodeInstruction(Memory.memoryGet(toInt(PC.getValue())));
            
            if(Memory.memoryGet(toInt(PC.getValue()))!=null){
                RI.setValue(PC.getValue());
                PC.setValue(toBin(toInt(PC.getValue())+instruction.numberOpd()+1));
            }
            else{
                PC.setValue(null);
            }
  
            if(instruction instanceof RET  || instruction instanceof BR    || 
               instruction instanceof BRNEG|| instruction instanceof BRPOS || 
            instruction instanceof BRZERO){
                opd1 = Memory.memoryGet(toInt(RI.getValue())+1);
                instruction.runInstruction(outCod, opd1, null);
            }
            else if(instruction instanceof ADD || instruction instanceof DIV  ||
                    instruction instanceof LOAD|| instruction instanceof MULT ||
                    instruction instanceof SUB){
                opd1 = Memory.memoryGet(toInt(RI.getValue())+1);
                instruction.runInstruction(outCod, opd1, null);

            }
            else if (instruction instanceof COPY){
                opd1 = Memory.memoryGet(toInt(RI.getValue())+1);
                opd2 = Memory.memoryGet(toInt(RI.getValue())+2);
                instruction.runInstruction(outCod, opd1, opd2);
            }
        
        } 
        
        /*
        register = defineRegister(instruction);
        if(instruction == null || register == null){
            Error.showError("instrução não identificada");
        }
        else if(instruction instanceof RET || instruction instanceof BRZERO || instruction instanceof BRPOS || instruction instanceof BRNEG || BR){
            register = new PC();
            instruction.runInstruction(inCod, register, opd1, opd2);
        }
        register = new ACC();
        instruction.runInstruction(inCod, register, opd1, opd2);    
        instruction.runInstructionPrint(outCod, opd1);
        */
    }//GEN-LAST:event_btnRunActionPerformed
    
    private void readContent(String cod, Integer position) {
         if(cod.length()>0 && cod.length()%16==0){
            for(int i=0;i<cod.length();i+=16){
                Memory.memorySet(position, cod.substring(i,i+16));
                position++;
            }
        }
    }
    
    public Integer toInt(String cod){
        if(cod!=null)
            return Integer.parseInt(cod,2);
        return null;
    }
    
    public String toBin(Integer number){
        if(number != null){
            String bin = Integer.toBinaryString(number);
            String complete = "";
            Integer left = 16 - bin.length();
            for(int i = 0; i < left; i++){
               complete+="0";
            }
            return complete + bin;
        }
        return null;
    }
  
    private Instruction decodeInstruction(String command) {
        Instruction instruction = null;
        String end, opcode;
        if(command!=null){
            end = command.substring(9, 12);
            opcode = command.substring(12, 16);
        }
        else 
            return instruction;
        switch(opcode){
            case "0000": //BR: PC <- opd1
                instruction = new BR();
                break;
            case "0001": //BRPOS: PC <- opd1, se ACC > 0
                instruction = new BRPOS();
                break;
            case "0010": //ADD: ACC <- ACC + opd1
                instruction = new ADD();
                break;
            case "0011": //LOAD: ACC <- opd1
                instruction = new LOAD();
                break;
            case "0100": //BRZERO: PC <- opd1, se ACC = 0
                instruction = new BRZERO();
                break;
            case "0101": //BRNEG: PC <- opd1, se ACC < 0
                instruction = new BRNEG();
                break;
            case "0110": //SUB: ACC <- ACC - opd1
                instruction = new SUB();
                break;
            case "0111": //STORE: opd1 <- ACC
                instruction = new STORE();
                break;
            case "1000": //WRITE: output <- opd1
                instruction = new WRITE();
                break;
            case "1001": //RET: PC <- [SP]
                instruction = new RET();
                break;
            case "1010": //DIV: ACC <- ACC / opd1
                instruction = new DIV();
                break;
            case "1011": //STOP: fim do programa
                instruction = new STOP();
                break;
            case "1100": //READ: opd1 <- input stream
                instruction = new READ();
                break;
            case "1101": //COPY: opd1 <- opd2
                instruction = new COPY();
                break;
            case "1110": //MULT: ACC <- ACC * opd1
                instruction = new MULT();
                break;
            case "1111": //CALL: [SP] <- PC; PC <- opd1
                instruction = new CALL();
                break;
            default:
                System.out.println("ERRO DE OPCODE");
        }
        
        /*if(end != null)
            switch (end) {
                case "000":
                    instruction.setEndType(EndType.D);
                    break;
                case "001":
                    instruction.setEndType(EndType.IN1);
                    break;
                case "010":
                    instruction.setEndType(EndType.IN2);
                    break;
                case "100":
                    instruction.setEndType(EndType.IM);
                    break;
                default:
                    System.out.println("ERRO DE ENDEREÇAMENTO");
                    break;
            }
        */
        return instruction;
    }
    
    public void attScreen(){
        for(int i=0;i<100;i++){
            tMemory.setValueAt(Memory.memoryGet(i), i, 1);
        }
        accValue.setText(ACC.getValue());
        pcValue.setText(PC.getValue());
        spValue.setText(SP.getValue());
        mopValue.setText(MOP.getValue());
        riValue.setText(RI.getValue());
        reValue.setText(RE.getValue());
    }
    
    public void outMessage(String message){
        outCod.setText(message);
    }
    
    public void setInitValues(){
        memoryInit();
        List<String> memory = Memory.memoryGetAll();
        for(int i=0;i<memory.size();i++){
            tMemory.setValueAt(i, i, 0);
            tMemory.setValueAt(memory.get(i), i, 1);
        }
    }
    
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // abrir pop up com infos das instruções
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnRunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRunKeyPressed

    }//GEN-LAST:event_btnRunKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VirtualMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea accValue;
    private javax.swing.JButton btnDebug;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnRunCicle;
    private javax.swing.JTextPane inCod;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTextArea mopValue;
    private javax.swing.JTextPane outCod;
    private javax.swing.JTextArea pcValue;
    private javax.swing.JTextArea reValue;
    private javax.swing.JTextArea riValue;
    private javax.swing.JTextArea spValue;
    private javax.swing.JTable tMemory;
    // End of variables declaration//GEN-END:variables
}
