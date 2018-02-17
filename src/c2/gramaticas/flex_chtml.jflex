package c2.gramaticas;
import java_cup.runtime.Symbol;


%%

%{
    public void imprimir(String lqv)
{
    System.out.println("token leído\t"+lqv);
}
%}

%public
%class Scanner_chtml
%cupsym Simbolos_chtml
%cup
%full
%line
%char
%unicode
%ignorecase

 cadena = "\""[^\"\n]*"\""
 //comentarioLinea = "#" {[^\r\n]}*{\r|\n|\r\n}
 //comentarioMulti = "#/" [^/] ~"/#" | "#/" "/"+ "#"  


%%

<YYINITIAL>{

"<CHTML>"                        {imprimir("<CHTML>");return new Symbol(Simbolos_chtml.chtmlo, yychar, yyline, yytext());}
"<FIN-CHTML>"                {imprimir("<FIN-CHTML>");return new Symbol(Simbolos_chtml.chtmlc, yychar, yyline, yytext());}
"<ENCABEZADO>"                        {imprimir("<ENCABEZADO>");return new Symbol(Simbolos_chtml.heado, yychar, yyline, yytext());}
"<FIN-ENCABEZADO>"                {imprimir("<FIN-ENCABEZADO>");return new Symbol(Simbolos_chtml.headc, yychar, yyline, yytext());}
"<TITULO>"                        {imprimir("<TITULO>");return new Symbol(Simbolos_chtml.tituloo, yychar, yyline, yytext());}
"<FIN-TITULO>"                {imprimir("<FIN-TITULO>");return new Symbol(Simbolos_chtml.tituloc, yychar, yyline, yytext());}
"<PANEL>"                        {imprimir("<PANEL>");return new Symbol(Simbolos_chtml.panelo, yychar, yyline, yytext());}
"<FIN-PANEL>"                {imprimir("<FIN-PANEL>");return new Symbol(Simbolos_chtml.panelc, yychar, yyline, yytext());}

//etiquetas con elementos
"<CUERPO"                {imprimir("<CUERPO");return new Symbol(Simbolos_chtml.bodyo, yychar, yyline, yytext());}
"<FIN-CUERPOO>"                {imprimir("<FIN-CUERPO>");return new Symbol(Simbolos_chtml.bodyc, yychar, yyline, yytext());}
"<CJS"                {imprimir("<CJS");return new Symbol(Simbolos_chtml.cjso, yychar, yyline, yytext());}
"<FIN-CJS"                {imprimir("<FIN-CJS");return new Symbol(Simbolos_chtml.cjsc, yychar, yyline, yytext());}
"<CCSS"                {imprimir("<CCSS");return new Symbol(Simbolos_chtml.ccsso, yychar, yyline, yytext());}
"<FIN-CCSS"                {imprimir("<FIN-CCSS");return new Symbol(Simbolos_chtml.ccssc, yychar, yyline, yytext());}


//elementos
"fondo="                      {imprimir("fondo");return new Symbol(Simbolos_chtml.fondo, yychar, yyline, yytext());}
"ruta="                      {imprimir("ruta");return new Symbol(Simbolos_chtml.ruta, yychar, yyline, yytext());}
"id="               {imprimir("id");return new Symbol(Simbolos_chtml.id, yychar, yyline, yytext());}
"grupo="                      {imprimir("grupo");return new Symbol(Simbolos_chtml.grupo, yychar, yyline, yytext());}
"alto="                      {imprimir("alto");return new Symbol(Simbolos_chtml.alto, yychar, yyline, yytext());}
"ancho="                      {imprimir("ancho");return new Symbol(Simbolos_chtml.ancho, yychar, yyline, yytext());}
"alineado="                      {imprimir("alineado");return new Symbol(Simbolos_chtml.alineado, yychar, yyline, yytext());}
//"ccss="                      {imprimir("css");return new Symbol(Simbolos_chtml.ccss, yychar, yyline, yytext());}




[a-zA-Z][a-zA-Z0-9]*        {imprimir("id");return new Symbol(Simbolos_chtml.id2, yychar, yyline, yytext());}
[0-9.]?[0-9]+               {imprimir("num");return new Symbol(Simbolos_chtml.num, yychar, yyline, yytext());}

(["\'"][a-zA-Z]{1}["\'"]|["\'"][" "]["\'"])      {imprimir("caracter");return new Symbol(Simbolos_chtml.caracter, yychar, yyline, yytext());}
{cadena}                     {imprimir("cadena");return new Symbol(Simbolos_chtml.cadena, yychar, yyline, yytext());}
//{comentarioLinea}           {}
//{comentarioMulti}           {}
[ \t\r\f\n]+                {}
.                           {}

}