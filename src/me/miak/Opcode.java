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
    PRINTCH(19),
    POP(20),
    POPN(21),
    CALL(22),
    RET(23),
    SCALL(24),
    SLOAD(25),
    SSTORE(26),
    FILLZ(27),
    VRET(28),
    HALT(29);

    private final int code;

    private Opcode(int code) {
        this.code = code;
    }

    final int getCode() {
        return this.code;
    }
}
