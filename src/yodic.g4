grammar yodic;

/* TERMINAL SYMBOLS / LEXICAL TOKENS */
OBJECT		:	'math' | 'science' | 'turtles' |'computing';
SUBJECT		: 	'he' | 'she' | 'i' | 'it';
VERB		:	'avoid' | 'like' | 'hate' | 'know';

/* SYNTAX */
yodic		:	OBJECT SUBJECT VERB;
