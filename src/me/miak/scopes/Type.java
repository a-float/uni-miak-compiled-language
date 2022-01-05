package me.miak.scopes;

public enum Type {
    NULL,
    INT,
    BOOL,
    STRING,
    FUNC,
    VOID,
    ITERABLE;

    public static Type typeFromString(String typeName) {
        return switch (typeName) {
            case "null" -> NULL;
            case "int" -> INT;
            case "bool" -> BOOL;
            case "void" -> VOID;
            case "string" -> STRING;
            default -> FUNC;
        };
    }
}
