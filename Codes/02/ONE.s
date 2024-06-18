	AREA ONE, CODE, READONLY
ENTRY
START
    LDR R0, =NUMI       ; Load address of NUMI into R0
    LDR R1, [R0]        ; Load the value of NUMI into R1
    MOV R2, #32       ; Assuming a 32-bit number for the loop counter
    MOV R3, #0          ; Initialize zero count
    MOV R4, #0          ; Initialize one count
    LDR R9, =NUMZEROS   ; Load address of NUMZEROS into R9
    LDR R10, =NUMONES   ; Load address of NUMONES into R10

nextbit
    MOVS R1, R1, LSR #1 ; Shift right R1, setting flags
    BCS updateone       ; If carry set, increment one count
    ADD R3, R3, #1      ; Otherwise, increment zero count
    B updatezero

updateone
    ADD R4, R4, #1      ; Increment one count

updatezero
    SUBS R2, R2, #1     ; Decrement loop counter
    BNE nextbit         ; If not zero, repeat

    STR R3, [R9]        ; Store zero count in NUMZEROS
    STR R4, [R10]       ; Store one count in NUMONES
    NOP                 ; No operation
    NOP                 ; No operation
NUMI DCD 0x5  
	AREA datal, DATA, READWRITE
         ; Input number (to be replaced with the actual number)
NUMZEROS DCD 0x0       ; Placeholder for zero count
NUMONES DCD 0x0        ; Placeholder for one count
	END
