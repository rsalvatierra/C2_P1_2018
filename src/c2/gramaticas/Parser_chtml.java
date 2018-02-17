
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package c2.gramaticas;

import java_cup.runtime.Symbol;
import java.io.*;
import c2.ast.Nodo;
import java_cup.runtime.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser_chtml extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos_chtml.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser_chtml() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser_chtml(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser_chtml(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\002\000\002\002\004\000\002\003\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\005\000\004\004\004\001\002\000\004\005\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\005\000\004\003\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser_chtml$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser_chtml$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser_chtml$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}





    // public static tablaErrores tablaE;
     public Nodo raiz;
    // public static List<tablaErrores> tablaErr= new ArrayList<tablaErrores>(); //tabla de errores

     public void syntax_error(Symbol s){

         /**Metodo al que se llama automaticamente ante algun error sintactico.*/

         System.out.println("Error Sintactico en la Linea " + (s.right+1) +" Columna "+s.left+ ". Identificador " +s.value + " no reconocido.\n" );

         

         report_error("Error de sintaxis. Linea: " + (s.right + 1) +

             " Columna: " + s.left + ". Texto: \"" + s.value + "\"\n", null);

        // tablaE= new tablaErrores(s.value.toString(), s.left, s.right+1,"Error Sintactico");
        // tablaErr.add(tablaE);

     }            

     public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{

         /**Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores.*/

         System.out.println("Error Sintactico en la Linea " + (s.right+1)+ "Columna "+s.left+". Identificador " + s.value + " no reconocido.\n");

     

         report_error("Error de sintaxis. Linea: " + (s.right + 1) +

             " Columna: " + s.left + ". Texto: \"" + s.value + "\"\n", null);


         //Errors error = new Errors(s.right+1, s.left, s.value.toString(),"Error Sintactico!");

         //Sintactic_Errors.add(error);
     }



 

/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser_chtml$actions {
  private final Parser_chtml parser;

  /** Constructor */
  CUP$Parser_chtml$actions(Parser_chtml parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser_chtml$do_action_part00000000(
    int                        CUP$Parser_chtml$act_num,
    java_cup.runtime.lr_parser CUP$Parser_chtml$parser,
    java.util.Stack            CUP$Parser_chtml$stack,
    int                        CUP$Parser_chtml$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser_chtml$result;

      /* select the action based on the action number */
      switch (CUP$Parser_chtml$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser_chtml$stack.elementAt(CUP$Parser_chtml$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser_chtml$stack.elementAt(CUP$Parser_chtml$top-1)).right;
		Nodo start_val = (Nodo)((java_cup.runtime.Symbol) CUP$Parser_chtml$stack.elementAt(CUP$Parser_chtml$top-1)).value;
		RESULT = start_val;
              CUP$Parser_chtml$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser_chtml$stack.elementAt(CUP$Parser_chtml$top-1)), ((java_cup.runtime.Symbol)CUP$Parser_chtml$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser_chtml$parser.done_parsing();
          return CUP$Parser_chtml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= chtmlo chtmlc 
            {
              Nodo RESULT =null;

              CUP$Parser_chtml$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$Parser_chtml$stack.elementAt(CUP$Parser_chtml$top-1)), ((java_cup.runtime.Symbol)CUP$Parser_chtml$stack.peek()), RESULT);
            }
          return CUP$Parser_chtml$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser_chtml$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser_chtml$do_action(
    int                        CUP$Parser_chtml$act_num,
    java_cup.runtime.lr_parser CUP$Parser_chtml$parser,
    java.util.Stack            CUP$Parser_chtml$stack,
    int                        CUP$Parser_chtml$top)
    throws java.lang.Exception
    {
              return CUP$Parser_chtml$do_action_part00000000(
                               CUP$Parser_chtml$act_num,
                               CUP$Parser_chtml$parser,
                               CUP$Parser_chtml$stack,
                               CUP$Parser_chtml$top);
    }
}

}