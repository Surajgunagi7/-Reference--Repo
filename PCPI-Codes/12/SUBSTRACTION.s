    AREA SUBTRACT, CODE, READONLY
    ENTRY
START
    ; Load NUM1 low and high parts
    LDR R0, =NUM1_LOW
    LDR R0, [R0]
    LDR R1, =NUM1_HIGH
    LDR R1, [R1]

    ; Load NUM2 low and high parts
    LDR R2, =NUM2_LOW
    LDR R2, [R2]
    LDR R3, =NUM2_HIGH
    LDR R3, [R3]

    ; Subtract low parts
    SUBS R4, R0, R2

    ; Subtract high parts with borrow
    SBCS R5, R1, R3

    ; Store the results
    LDR R6, =RES_LOW
    STR R4, [R6]
    LDR R7, =RES_HIGH
    STR R5, [R7]

    ; End of program
    NOP
    NOP

NUM1_LOW DCD 0x12345678
NUM1_HIGH DCD 0x9ABCD2F0
NUM2_LOW DCD 0x11111111
NUM2_HIGH DCD 0x22221111

    AREA DATA1, DATA, READWRITE
RES_LOW DCD 0x0
RES_HIGH DCD 0x0
    END
