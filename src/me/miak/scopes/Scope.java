package me.miak.scopes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scope {
    private int startAddr;
    private final Map<String, VariableInfo> map = new HashMap<>();
    private int totalSize = 0;
    public boolean isFunctionScope;

    public Scope(int startAddr, boolean isFunctionScope) {
        this.startAddr = startAddr;
        this.isFunctionScope = isFunctionScope;
    }

    public int getStartAddr() {
        return this.startAddr;
    }

    public int getTotalSize() {
        return this.totalSize;
    }

    /*
    Used by the for loop. A little hacky
     */
    public void modifyStartAddr(int diff){
        this.startAddr += diff;
    }

    public int getEndAddr() {
        return this.startAddr + this.totalSize;
    }

    public void declare(FType type, String id, Boolean isConstant, int size) {
        if (this.map.containsKey(id)) {
            throw new IllegalArgumentException("Name " + id + " already exists in the current scope");
        }
//        System.out.println("Putting " + id + " at addr " + this.startAddr + " + " + this.totalSize + " fp " + this.framePointer);
        this.map.put(id, new VariableInfo(type, isConstant, size, this.startAddr + this.totalSize));
        this.totalSize += size;
    }

    public void declareFunctionArgs(List<FType> argTypes, List<String> argIDs) {
        for (int i = 0; i < argIDs.size(); i++) {
            // TODO should args always be const?
            VariableInfo arg = new VariableInfo(argTypes.get(i), false, 1, -3 - argIDs.size() + i);
            this.map.put(argIDs.get(i), arg);
        }
    }

    public VariableInfo getVariableInfo(String id) {
        return this.map.getOrDefault(id, null);
    }
}
