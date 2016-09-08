grammar usps;

/* TERMINAL SYMBOLS / LEXICAL TOKENS */
LETTER		:	'A' .. 'Z' ;
NUMBER 		:	'0' .. '9' ;
COUNTRYCODE	:	'CA' |'US' | 'ZH' ;

/* SYNTAX */

trackingnumber	:	letter_part number_part COUNTRYCODE;
letter_part	:	LETTER LETTER ;
number_part	:	NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER ;
