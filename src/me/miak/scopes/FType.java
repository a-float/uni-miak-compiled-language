package me.miak.scopes;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FType {
    public Type type;   // used by regular variables
    // the rest is used by lambdas and functions
    public List<FType> argFTypes;
    public FType returnType;
    public Integer startAddr;

    public FType(Type type) {
        this.type = type;
    }

    public FType(List<FType> argFTypes, FType returnFType, int startAddr) {
        this.type = Type.FUNC;
        this.argFTypes = argFTypes;
        this.returnType = returnFType;
        this.startAddr = startAddr;
    }

    @Override
    public String toString() {
        if (this.type != Type.FUNC) return type.toString();
        else {
            String args = this.argFTypes.stream().map(FType::toString).collect(Collectors.joining(", "));
            return "(" + args + ") -> " + this.returnType;
        }
    }

    // Warning! startAddr is not taken into consideration
    @Override
    public boolean equals(Object other) {
        // self check
        if (this == other)
            return true;
        // null check
        if (other == null)
            return false;
        // type check and cast
        if (getClass() != other.getClass())
            return false;
        FType ftype = (FType) other;
        // field comparison
        return type == ftype.type &&
                Objects.equals(this.argFTypes, ftype.argFTypes) &&
                Objects.equals(this.returnType, ftype.returnType);
    }

}