grammar lolspeak;

/* TERMINAL SYMBOLS / LEXICAL TOKENS */
VERB		:	'ates' | 'lovez' | 'hatez';
ARTICLE		:	'a'	| 'teh';
NOUN		:	'kat'	| 'dawg' | 'rat';

/* SYNTAX */
lolspeak	:	noun_phrase VERB noun_phrase;
noun_phrase	:	ARTICLE NOUN;
