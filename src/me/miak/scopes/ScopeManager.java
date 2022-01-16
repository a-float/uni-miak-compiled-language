package me.miak.scopes;

import java.util.List;
import java.util.Stack;


public class ScopeManager {
    private final Stack<Scope> scopeStack;
//    public final Scope globalScope = new Scope(0);

    public ScopeManager() {
        this.scopeStack = new Stack<>();
        this.scopeStack.push(new Scope(0, 0));
    }

    public Scope top() {
        return this.scopeStack.peek();
    }

    public VariableInfo getVariableInfo(String id) {
        VariableInfo ret = null;
        int scopeFP = 0;
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            ret = this.scopeStack.elementAt(i).getVariableInfo(id);
            if (ret != null){
                scopeFP = this.scopeStack.elementAt(i).getFramePointer();
                break;
            }
        }
        if(ret == null){
            throw new RuntimeException("Variable " + id + " is not defined");
        }
        // make variable address relative to the frame pointer
        return new VariableInfo(ret.ftype, ret.isConstant, ret.size, ret.addr - top().getFramePointer() + scopeFP);
    }

    public VariableInfo getRawVariableInfo(String id){
        VariableInfo ret = null;
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            ret = this.scopeStack.elementAt(i).getVariableInfo(id);
            if (ret != null){
                return ret;
            }
        }
        throw new RuntimeException("Variable " + id + " is not defined");
    }

    /**
     * creates an empty scope on the top of the stack
     */
    public void pushScope() {
        int startAddr = this.top().getEndAddr();
        int fp = this.top().getFramePointer();
        this.scopeStack.push(new Scope(startAddr, fp));
    }

    /**
     * pops the topmost scope
     */
    public void popScope() {
        this.scopeStack.pop();
    }

    public void pushFunctionScope(List<FType> argTypes, List<String> argIDs) {
        int fp = this.top().getEndAddr() + this.top().getFramePointer() + argTypes.size() + 3; // declared + args + argc + fp + sp
        this.scopeStack.push(new Scope(0, fp));
        this.top().declareFunctionArgs(argTypes, argIDs);
    }
}
