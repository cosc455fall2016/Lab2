grammar phone;

/* TERMINAL SYMBOLS / LEXICAL TOKENS */
COUNTRYCODE	: '+1';
NUMBER 		: '0' .. '9' ;
DASH		: '-';

/* SYNTAX */
phone_number	: COUNTRYCODE DASH area_code DASH prefix DASH line_number;
area_code	: NUMBER NUMBER NUMBER;
prefix		: NUMBER NUMBER NUMBER;
line_number	: NUMBER NUMBER NUMBER NUMBER;


