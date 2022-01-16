package me.miak.scopes;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FType {
    public Type type;   // used by regular variables
    // the rest is used by lambdas, functions and arrays
    public List<FType> argFTypes;
    public FType returnType;    // array element type is stored here as well
    public Integer arrSize;

    public FType(Type type) {
        this.type = type;
    }

    /*
    Constructor for functions
     */
    public FType(List<FType> argFTypes, FType returnFType) {
        this.type = Type.FUNC;
        this.argFTypes = argFTypes;
        this.returnType = returnFType;
    }

    @Override
    public String toString() {
        if (this.type == Type.FUNC) {
            String args = this.argFTypes.stream().map(FType::toString).collect(Collectors.joining(", "));
            return "(" + args + ") -> " + this.returnType;
        } else if (this.type == Type.ARRAY) {
            return this.returnType.toString() + "[]";
        } else {
            return type.toString();
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
