package org.uv.programa03;

/**
 *
 * @author ivan
 */
public class Programa03 {

    public static void main(String[] args) {
//        ClaseConcreta c=new ClaseConcreta();
//        c.imprimir();
//        ClaseAHija cah=new ClaseAHija();
//        cah.imprimir();
//          ClaseA ca=null;
//          ca=new ClaseAHija();
//          ca.imprimir();
//          
//          ca=new ClaseAHija2();
//          ca.imprimir();
//          
//          ca=new ClaseA() {
//              @Override
//              public void msg() {
//                  System.out.println("Otra clase anonima");
//              }
//          };
//          ca.imprimir();
          ClaseInterface eje=null;
          eje=new IClaseConcreta1();
          eje.msg();
          
          eje=new IClaseConcreta2();
          eje.msg();
          
          eje=new ClaseInterface() {
              @Override
              public void msg() {
                  System.out.println("otro");
              }
          };
          eje.msg();
//        System.out.println("Hello World!");
    }
}
