	AREA SUMM,CODE,READONLY
ENTRY
START
	LDR R0,=NUM1
	LDR R0,[R0]
	LDR R1,=NUM2
	LDR R1,[R1]
	
	ADD R3,R0,R1
	LDR R5,=RESULT
	STR R3,[R5]
	
	NOP
	NOP
NUM1 DCD 0X12341111
NUM2 DCD 0X11111111
	AREA DATA1,DATA,READWRITE
RESULT DCD 0X0
	END
	