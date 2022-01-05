package me.miak.scopes;

public class VariableInfo {
    public final boolean isConstant;
    public final FType ftype;
    public final int size;
    public int addr;     // absolute address counting from the start of the stack


    public VariableInfo(FType ftype, boolean isConstant, int size, int addr) {
        this.ftype = ftype;
        this.isConstant = isConstant;
        this.size = size;
        this.addr = addr;
    }

    public void assign(String id, FType rightSideType) {
        if (this.isConstant) {
            throw new RuntimeException("Can not assign to a constant variable " + id);
        }
        System.out.println(this.ftype + " " + rightSideType);
        if (this.ftype.type != rightSideType.type) {
            throw new RuntimeException("Can not assign " + rightSideType + " to variable " + id);
        }
        if (this.ftype.type == Type.FUNC) {
            if (this.ftype.equals(rightSideType)) {
                this.ftype.startAddr = rightSideType.startAddr;
            } else {
                throw new RuntimeException("Can not assign lambda " + rightSideType + " to name " + id);

            }
        }
    }
}