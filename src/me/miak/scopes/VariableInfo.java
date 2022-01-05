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

    public void assign(String id, FType rightSideFType) {
        if (this.isConstant) {
            throw new RuntimeException("Can not assign to a constant variable " + id);
        }
        if (this.ftype.type == Type.FUNC) {
            if (this.ftype.equals(rightSideFType)) {
                this.ftype.startAddr = rightSideFType.startAddr;
            } else {
                throw new RuntimeException("Can not assign lambda " + rightSideFType + " to name " + id);
            }
        }
        else if (this.ftype.type != rightSideFType.type) {
            throw new RuntimeException("Can not assign " + rightSideFType + " to variable " + id);
        }
    }

    public void assignToArray(String id, FType rightSideFType){
        if(this.ftype.type != Type.ARRAY){
            throw new RuntimeException(id + " is not indexable");
        }
        if (!this.ftype.returnType.equals(rightSideFType)) {
            throw new RuntimeException("Can not assign " + rightSideFType + " to element of array " + id);
        }
    }
}