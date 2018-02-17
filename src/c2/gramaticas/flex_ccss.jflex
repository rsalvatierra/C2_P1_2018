package compi.proy.gramaticas;
import java_cup.runtime.Symbol;


%%

%{
    public void imprimir(String lqv)
{
    System.out.println("token leído\t"+lqv);
}
%}

%public
%cupsym Simbolos_ccss
%class Scanner_ccss
%cup
%full
%line
%char
%unicode
%ignorecase
%caseless

 letra      = [a-zA-ZñÑ]+
numero     = [0-9]+ "."? [0-9]*
id         = {letra}({numero}|{letra}|"_")*
cadena     = [\"] [^\"]* [\"]
//
letra_unica = ['][a-zA-ZñÑ][']



%%



    <YYINITIAL>{

//reservadas
"ID[" 			{imprimir("ID["); return new Symbol(Simbolos_ccss.idr,yychar,yyline,yytext());}


//simbolos
"]" 			{imprimir("]"); return new Symbol(Simbolos_ccss.corchetec,yychar,yyline,yytext());}


"+" 			{return new Symbol(Simbolos_cons.mas,yychar,yyline,yytext());}
"-" 			{return new Symbol(Simbolos_cons.menos,yychar,yyline,yytext());}
"*" 			{return new Symbol(Simbolos_cons.mult,yychar,yyline,yytext());}
"/" 			{return new Symbol(Simbolos_cons.div,yychar,yyline,yytext());}
"'mod'" 			{return new Symbol(Simbolos_cons.mod,yychar,yyline,yytext());}
"'sqrt'" 			{return new Symbol(Simbolos_cons.sqrt,yychar,yyline,yytext());}
"'pot'" 			{return new Symbol(Simbolos_cons.pot,yychar,yyline,yytext());}
"$"			{return new Symbol(Simbolos_cons.dollar,yychar,yyline,yytext());}
"("			{return new Symbol(Simbolos_cons.para,yychar,yyline,yytext());}
")"			{return new Symbol(Simbolos_cons.parc,yychar,yyline,yytext());}
"let"			{return new Symbol(Simbolos_cons.let,yychar,yyline,yytext());}
","			{return new Symbol(Simbolos_cons.coma,yychar,yyline,yytext());}
"="			{return new Symbol(Simbolos_cons.igual,yychar,yyline,yytext());}
"["			{return new Symbol(Simbolos_cons.corch_a,yychar,yyline,yytext());}
"]"			{return new Symbol(Simbolos_cons.corch_c,yychar,yyline,yytext());}
"%"			{return new Symbol(Simbolos_cons.porcent,yychar,yyline,yytext());}
"++"			{return new Symbol(Simbolos_cons.concat,yychar,yyline,yytext());}
"!!"                                                  {return new Symbol(Simbolos_cons.indice,yychar,yyline,yytext());}
"{"			{return new Symbol(Simbolos_cons.llavea,yychar,yyline,yytext());}
"}"			{return new Symbol(Simbolos_cons.llavec,yychar,yyline,yytext());}

"Calcular" 		{return new Symbol(Simbolos_cons.calcular,yychar,yyline,yytext());}
"Succ" 		{return new Symbol(Simbolos_cons.succ,yychar,yyline,yytext());}
"Decc" 		{return new Symbol(Simbolos_cons.decc,yychar,yyline,yytext());}
"Min" 		{return new Symbol(Simbolos_cons.min,yychar,yyline,yytext());}
"Max" 		{return new Symbol(Simbolos_cons.max,yychar,yyline,yytext());}
"sum"		{return new Symbol(Simbolos_cons.sum,yychar,yyline,yytext());}
"product"		{return new Symbol(Simbolos_cons.product,yychar,yyline,yytext());}
"revers"		{return new Symbol(Simbolos_cons.revers,yychar,yyline,yytext());}
"impr"		{return new Symbol(Simbolos_cons.impr,yychar,yyline,yytext());}
"par"		{return new Symbol(Simbolos_cons.par,yychar,yyline,yytext());}
"asc"		{return new Symbol(Simbolos_cons.asc,yychar,yyline,yytext());}
"desc"		{return new Symbol(Simbolos_cons.desc,yychar,yyline,yytext());}
"length"		{return new Symbol(Simbolos_cons.length,yychar,yyline,yytext());}


{id}		{return new Symbol(Simbolos_cons.id,yychar,yyline,yytext());}
{numero}		{return new Symbol(Simbolos_cons.numero,yychar,yyline,yytext());}
{cadena}		{return new Symbol(Simbolos_cons.cadena,yychar,yyline,yytext());}
//{caracter}		{return new Symbol(Simbolos_cons.caracter,yychar,yyline,yytext());}
{letra_unica}                  {return new Symbol(Simbolos_cons.letra,yychar,yyline,yytext());} 

" " {}

.                           {System.err.println("Carácter no válido\t"+yytext());}

}