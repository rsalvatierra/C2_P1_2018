/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2.ast;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ROBIN SALVATIERRA
 */
public class Nodo {

    private String valor;
   // private String valor2;
    private String operador;
    private int linea;
    private int columna;
    private String tipo;
    private int subrol;
    private int rol;
    //Nodo izq,der,raiz;
    private int padre;
    private Nodo raiz, val;
    private List<Nodo> hijos= new ArrayList<Nodo>();
    
   /* public Nodo(List<Nodo> padre, List<Nodo> hijos,String valor) //nodo padre
    { 
      this.valor= valor;
      this.padre=padre;
      this.hijos=hijos;
    }*/
    
     public Nodo(Nodo val1, String valor) 
    {
        this.hijos.add(val1);
        this.valor=valor;     
    }
   
    public Nodo(String valor,String tipo) //nodo hojas
    {
        this.valor= valor;
        this.tipo=tipo;
      //  this.hijos.add(valor);
    }
    
    public Nodo(Nodo izq, Nodo der, String valor, String tipo) //nodo para expresiones
    {
        this.valor= valor;
        this.tipo= tipo;
        this.hijos.add(izq);
        this.hijos.add(der);
    } 
    
    public Nodo(Nodo izq, Nodo der, String valor) //nodo para declaracion de funciones
    {
        this.valor=valor;
        this.hijos.add(izq);
        this.hijos.add(der);
    }
   
    public Nodo(Nodo nod1, Nodo nod2, Nodo nod3, String valor) //nodo de sentencias
    {
       this.valor=valor;
       this.hijos.add(nod1);
       this.hijos.add(nod2);
       this.hijos.add(nod3);
    }
    
    
    
   /* public void setValor(String valor)
    {
        this.valor= valor;
    }
    public String getValor()
    {
        return this.valor;
    } */   
    
    public void setHijo(Nodo hijo){
        this.hijos.add(hijo);
    }
    
    public String getValor()
    {
        return this.valor;
    }
    
    public List<Nodo> getHijos()
    {
        return this.hijos;
    }
    
    
   
    
}
