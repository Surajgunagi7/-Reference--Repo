    AREA SUMM, CODE, READONLY
    ENTRY
START
    MOV R0, #8       ; N = 8
    MOV R1, #0       ; Initialize sum to 0
    MOV R2, #1       ; Start counter from 1

LOOP
    CMP R2, R0       ; Compare counter with N
    BGT STOP         ; If counter > N, exit loop
    ADD R1, R1, R2   ; Add counter to sum
    ADD R2, R2, #1   ; Increment counter
    B LOOP           ; Repeat loop

STOP
    NOP
    NOP
    END
