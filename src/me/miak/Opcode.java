package me.miak;

public enum Opcode {
    ADD_I32(1),
    SUB_I32(2),
    MUL_I32(3),
    DIV_I32(4),
    POW(5),
    LT_I32(6),
    LTE_I32(7),
    NOT(8),
    EQ_I32(9),
    JMP(10),
    JMPT(11),
    JMPF(12),
    CONST_I32(13),
    LOAD(14),
    GLOAD(15),
    STORE(16),
    GSTORE(17),
    PRINT(18),
    POP(19),
    POPN(20),
    CALL(21),
    RET(22),
    SCALL(23),
    SLOAD(24),
    SSTORE(25),
    FILLZ(26),
    VRET(27),
    HALT(28);

    private final int code;

    private Opcode(int code) {
        this.code = code;
    }

    final int getCode() {
        return this.code;
    }
}
