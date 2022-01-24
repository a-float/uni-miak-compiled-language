package me.miak.scopes;

import java.util.List;
import java.util.Stack;


public class ScopeManager {
    private final Stack<Scope> scopeStack;
    private int functionDepth = 0;

    public ScopeManager() {
        this.scopeStack = new Stack<>();
        this.scopeStack.push(new Scope(0, false));
    }

    public Scope global() {
        return this.scopeStack.elementAt(0);
    }

    public Scope top() {
        return this.scopeStack.peek();
    }

    /*
    Searches for the variable in the scopes until the first function scope encountered.
    If variable was not found, check if it's in the global scope, if not, it's undefined
     */
    public VariableInfo getVariableInfo(String id) {
        VariableInfo ret;
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            Scope scope = this.scopeStack.elementAt(i);
            ret = scope.getVariableInfo(id);
            if (ret != null) {
                return ret;
            }
            if (scope.isFunctionScope) {
                ret = this.global().getVariableInfo(id);
                if (ret != null) return ret;
                break;
            }
        }
        throw new RuntimeException("Variable " + id + " is not defined");
    }

    /**
     * creates an empty scope on the top of the stack
     */
    public void pushScope() {
        int startAddr = this.top().getEndAddr();
        this.scopeStack.push(new Scope(startAddr, false));
    }

    /**
     * pops the topmost scope
     */
    public void popScope() {
        if(this.top().isFunctionScope)this.functionDepth -= 1;
        this.scopeStack.pop();
    }

    public void pushFunctionScope(List<FType> argTypes, List<String> argIDs) {
        this.scopeStack.push(new Scope(0, true));
        this.top().declareFunctionArgs(argTypes, argIDs);
        this.functionDepth += 1;
    }

    public boolean isInFunction(){
        return this.functionDepth != 0;
    }
}
