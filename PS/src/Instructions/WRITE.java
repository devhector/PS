package Instructions;
import Main.CompleteBinary;
import Main.Instruction;
import javax.swing.JTextPane;

public class WRITE extends CompleteBinary implements Instruction{
    String opcode;
    Integer numberOpd = 1;
    EndType end;

    public void WRITE(){
        this.opcode="0000000000001000";
    }
    @Override
    public void runInstruction(JTextPane outCode, String opd1, String opd2) {
        if(opd2!=null){
            Main.Error.showError("o write possui argumento a mais");
            return;
        }
        outCode.setText(opd1);
    }
    
    @Override
    public Integer numberOpd() {
        return numberOpd;
    }
    
    @Override
    public void setEndType(EndType end) {
        this.end = end;
    }

    @Override
    public String getEndType() {
        return this.end.toString();
    }
}