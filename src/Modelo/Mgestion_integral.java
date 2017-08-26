/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;

/**
 *
 * @author LENOVO
 */
public class Mgestion_integral {
    
        // variables de entrada base de datos anexo
 private static String path;
 private static int id;
 private int longitud;
 private String nombre;
 private FileInputStream fi11121;
 
// Item 12    
    private String i121="";
    private String a121="";
    private String v121="";
    private String v122="";
    private String v123="";
    private String j121="";
   
   
    
                  
// Item 13    
    private String i131="";
    private String a131="";
    private String v131="";
    private String j131="";
   
    
// Item 14
    private String i141="";
     private String a141;
    private String v141;
    private String j141;

    
 // Item 15
    private String i151="";
    private String a151;
    private String v151;
    private String j151;
     
    
   // Item 16
    private String i161="";
    private String a161;
    private String v161;
    private String v162;
    private String j161;
   
   
   // Item 17
    private String i171="";
    private String a171;
    private String v171;
    private String v172;
    private String v173;
    private String j171;
    
    
     // Item 18
    private String i181="";
    private String a181;
    private String v181;
    private String v182;
    private String j181;
    
   
   // Item 19
    private String i191="";
    private String a191;
    private String v191;
    private String j191;
  
    
      // Item 20
    private String i201="";
    private String a201;
    private String v201;
    private String v202;
    private String j201;
   
   
   // Item 21
    private String i211="";
     private String a211;
    private String v211;
    private String j211;
 
    
     // Item 22
    private String i221="";
     private String a221;
    private String v221;
    private String j221;

    public Mgestion_integral(int longitud, String nombre, FileInputStream fi11121, String i121, String a121, String v121, String v122, String v123, String j121, String i131, String a131, String v131, String j131, String i141, String a141, String v141, String j141, String i151, String a151, String v151, String j151, String i161, String a161, String v161, String v162, String j161, String i171, String a171, String v171, String v172, String v173, String j171, String i181, String a181, String v181, String v182, String j181, String i191, String a191, String v191, String j191, String i201, String a201, String v201, String v202, String j201, String i211, String a211, String v211, String j211, String i221, String a221, String v221, String j221) {
        this.longitud = longitud;
        this.nombre = nombre;
        this.fi11121 = fi11121;
        this.i121 = i121;
        this.a121 = a121;
        this.v121 = v121;
        this.v122 = v122;
        this.v123 = v123;
        this.j121 = j121;
        this.i131 = i131;
        this.a131 = a131;
        this.v131 = v131;
        this.j131 = j131;
        this.i141 = i141;
        this.a141 = a141;
        this.v141 = v141;
        this.j141 = j141;
        this.i151 = i151;
        this.a151 = a151;
        this.v151 = v151;
        this.j151 = j151;
        this.i161 = i161;
        this.a161 = a161;
        this.v161 = v161;
        this.v162 = v162;
        this.j161 = j161;
        this.i171 = i171;
        this.a171 = a171;
        this.v171 = v171;
        this.v172 = v172;
        this.v173 = v173;
        this.j171 = j171;
        this.i181 = i181;
        this.a181 = a181;
        this.v181 = v181;
        this.v182 = v182;
        this.j181 = j181;
        this.i191 = i191;
        this.a191 = a191;
        this.v191 = v191;
        this.j191 = j191;
        this.i201 = i201;
        this.a201 = a201;
        this.v201 = v201;
        this.v202 = v202;
        this.j201 = j201;
        this.i211 = i211;
        this.a211 = a211;
        this.v211 = v211;
        this.j211 = j211;
        this.i221 = i221;
        this.a221 = a221;
        this.v221 = v221;
        this.j221 = j221;
    }

    public Mgestion_integral() {
    }

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        Mgestion_integral.path = path;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Mgestion_integral.id = id;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FileInputStream getFi11121() {
        return fi11121;
    }

    public void setFi11121(FileInputStream fi11121) {
        this.fi11121 = fi11121;
    }

    public String getI121() {
        return i121;
    }

    public void setI121(String i121) {
        this.i121 = i121;
    }

    public String getA121() {
        return a121;
    }

    public void setA121(String a121) {
        this.a121 = a121;
    }

    public String getV121() {
        return v121;
    }

    public void setV121(String v121) {
        this.v121 = v121;
    }

    public String getV122() {
        return v122;
    }

    public void setV122(String v122) {
        this.v122 = v122;
    }

    public String getV123() {
        return v123;
    }

    public void setV123(String v123) {
        this.v123 = v123;
    }

    public String getJ121() {
        return j121;
    }

    public void setJ121(String j121) {
        this.j121 = j121;
    }

    public String getI131() {
        return i131;
    }

    public void setI131(String i131) {
        this.i131 = i131;
    }

    public String getA131() {
        return a131;
    }

    public void setA131(String a131) {
        this.a131 = a131;
    }

    public String getV131() {
        return v131;
    }

    public void setV131(String v131) {
        this.v131 = v131;
    }

    public String getJ131() {
        return j131;
    }

    public void setJ131(String j131) {
        this.j131 = j131;
    }

    public String getI141() {
        return i141;
    }

    public void setI141(String i141) {
        this.i141 = i141;
    }

    public String getA141() {
        return a141;
    }

    public void setA141(String a141) {
        this.a141 = a141;
    }

    public String getV141() {
        return v141;
    }

    public void setV141(String v141) {
        this.v141 = v141;
    }

    public String getJ141() {
        return j141;
    }

    public void setJ141(String j141) {
        this.j141 = j141;
    }

    public String getI151() {
        return i151;
    }

    public void setI151(String i151) {
        this.i151 = i151;
    }

    public String getA151() {
        return a151;
    }

    public void setA151(String a151) {
        this.a151 = a151;
    }

    public String getV151() {
        return v151;
    }

    public void setV151(String v151) {
        this.v151 = v151;
    }

    public String getJ151() {
        return j151;
    }

    public void setJ151(String j151) {
        this.j151 = j151;
    }

    public String getI161() {
        return i161;
    }

    public void setI161(String i161) {
        this.i161 = i161;
    }

    public String getA161() {
        return a161;
    }

    public void setA161(String a161) {
        this.a161 = a161;
    }

    public String getV161() {
        return v161;
    }

    public void setV161(String v161) {
        this.v161 = v161;
    }

    public String getV162() {
        return v162;
    }

    public void setV162(String v162) {
        this.v162 = v162;
    }

    public String getJ161() {
        return j161;
    }

    public void setJ161(String j161) {
        this.j161 = j161;
    }

    public String getI171() {
        return i171;
    }

    public void setI171(String i171) {
        this.i171 = i171;
    }

    public String getA171() {
        return a171;
    }

    public void setA171(String a171) {
        this.a171 = a171;
    }

    public String getV171() {
        return v171;
    }

    public void setV171(String v171) {
        this.v171 = v171;
    }

    public String getV172() {
        return v172;
    }

    public void setV172(String v172) {
        this.v172 = v172;
    }

    public String getV173() {
        return v173;
    }

    public void setV173(String v173) {
        this.v173 = v173;
    }

    public String getJ171() {
        return j171;
    }

    public void setJ171(String j171) {
        this.j171 = j171;
    }

    public String getI181() {
        return i181;
    }

    public void setI181(String i181) {
        this.i181 = i181;
    }

    public String getA181() {
        return a181;
    }

    public void setA181(String a181) {
        this.a181 = a181;
    }

    public String getV181() {
        return v181;
    }

    public void setV181(String v181) {
        this.v181 = v181;
    }

    public String getV182() {
        return v182;
    }

    public void setV182(String v182) {
        this.v182 = v182;
    }

    public String getJ181() {
        return j181;
    }

    public void setJ181(String j181) {
        this.j181 = j181;
    }

    public String getI191() {
        return i191;
    }

    public void setI191(String i191) {
        this.i191 = i191;
    }

    public String getA191() {
        return a191;
    }

    public void setA191(String a191) {
        this.a191 = a191;
    }

    public String getV191() {
        return v191;
    }

    public void setV191(String v191) {
        this.v191 = v191;
    }

    public String getJ191() {
        return j191;
    }

    public void setJ191(String j191) {
        this.j191 = j191;
    }

    public String getI201() {
        return i201;
    }

    public void setI201(String i201) {
        this.i201 = i201;
    }

    public String getA201() {
        return a201;
    }

    public void setA201(String a201) {
        this.a201 = a201;
    }

    public String getV201() {
        return v201;
    }

    public void setV201(String v201) {
        this.v201 = v201;
    }

    public String getV202() {
        return v202;
    }

    public void setV202(String v202) {
        this.v202 = v202;
    }

    public String getJ201() {
        return j201;
    }

    public void setJ201(String j201) {
        this.j201 = j201;
    }

    public String getI211() {
        return i211;
    }

    public void setI211(String i211) {
        this.i211 = i211;
    }

    public String getA211() {
        return a211;
    }

    public void setA211(String a211) {
        this.a211 = a211;
    }

    public String getV211() {
        return v211;
    }

    public void setV211(String v211) {
        this.v211 = v211;
    }

    public String getJ211() {
        return j211;
    }

    public void setJ211(String j211) {
        this.j211 = j211;
    }

    public String getI221() {
        return i221;
    }

    public void setI221(String i221) {
        this.i221 = i221;
    }

    public String getA221() {
        return a221;
    }

    public void setA221(String a221) {
        this.a221 = a221;
    }

    public String getV221() {
        return v221;
    }

    public void setV221(String v221) {
        this.v221 = v221;
    }

    public String getJ221() {
        return j221;
    }

    public void setJ221(String j221) {
        this.j221 = j221;
    }

   
    

    
}
