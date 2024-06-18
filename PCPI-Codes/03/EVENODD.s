;Program to check how many odd and even numbers are in the array
	AREA EVENODD, CODE, READONLY
ENTRY
START
	LDR R0,=ARR
	LDR	R9,=EVEN
	LDR R10,=ODD
	MOV R1,#05
	MOV R2,#00
	MOV R3,#00
LOOP
	LDR R4, [R0],#04
	MOVS R4, R4, LSR #1
	BCS odd
	ADD	R2, R2,#1
	B even
odd 
	ADD R3, R3,#1
even 
	SUBS R1, R1,#1
	CMP R1,#0
	BNE LOOP
	STR R2, [R9]
	STR R3, [R10]
stop 
	B stop
ARR DCD 0x1,0x3,0x44,0x8,0x22
	AREA DATA1,DATA,READWRITE

EVEN DCD 0X0
ODD DCD 0X0
	END