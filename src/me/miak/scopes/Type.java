package me.miak.scopes;

public enum Type {
    NULL,   // returned when an error occurred
    INT,
    BOOL,
    STRING,
    FUNC,
    VOID,   // returned when there was nothing special to return e.g. assignment could return rvalue but now returns void
    ARRAY,  // always accessed using local addresses
    POINTER;    // always accessed using global addresses

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
