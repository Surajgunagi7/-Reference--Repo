    AREA MEM, CODE, READONLY
ENTRY
START
    LDR R1, =NUM       ; Load the address of NUM into R1
    LDR R2, [R1] 	; Load the value at the address pointed by R1 into R2
	MOV R9,#3
    MUL R3, R2, R9; Multiply the value in R2 by 3 and store the result in R3

    LDR R5, =0x40000008; Load the memory address 0x40000008 into R5 0X9000 INVALID ADDRESSS
    STR R3, [R5]       ; Store the value of R3 into the memory location pointed by R5

    NOP
    NOP

NUM DCD 0X5            ; Define NUM as a word with value 5
    END
