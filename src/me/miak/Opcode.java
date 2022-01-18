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
    SGLOAD(15),
    STORE(16),
    SGSTORE(17),
    PRINT(18),
    POPN(19),
    RET(20),
    SCALL(21),
    SLOAD(22),
    SSTORE(23),
    FILLZ(24),
    VRET(25),
    HALT(26);

    private final int code;

    Opcode(int code) {
        this.code = code;
    }

    final int getCode() {
        return this.code;
    }
}
