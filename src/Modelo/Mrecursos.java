/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;



/**
 *
 * @author leandro
 */
public class Mrecursos {
 
    // variables de entrada base de datos anexo
private static String path;
 private static int id;
 private int longitud;
 private String nombre;
// Item 1    
    private String i1111="";
    private String a1111="";
    private String v1111="";
    private String v1112="";
    private String v1113="";
    private String v1114="";
    private String j1111="";
    private FileInputStream fi1111;
   
    
                  
// Item 2    
    private String i1121="";
     private String a1121="";
    private String v1121="";
    private String j1121="";
    private FileInputStream fi1121;
    
// Item 3
    private String i1131="";
     private String a1131="";
    private String v1131="";
    private String j1131="";
    private FileInputStream fi1131;
    
 // Item 4
    private String i1141="";
     private String a1141="";
    private String v1141="";
    private String v1142="";
    private String j1141="";
    private FileInputStream fi1141;    
    
   // Item 5
    private String i1151="";
     private String a1151="";
    private String v1151="";
    private String j1151="";
    private FileInputStream fi1151; 
   
   // Item 6
    private String i1161="";
     private String a1161="";
    private String v1161="";
    private String v1162="";
    private String j1161="";
    private FileInputStream fi1161;
    
     // Item 7
    private String i1171="";
     private String a1171="";
    private String v1171="";
    private String j1171="";
    private FileInputStream fi1171; 
   
   // Item 8
    private String i1181="";
     private String a1181="";
    private String v1181="";
    private String v1182="";
    private String j1181="";
    private FileInputStream fi1181;
    
      // Item 9
    private String i1191="";
     private String a1191="";
    private String v1191="";
    private String v1192="";
    private String j1191="";
    private FileInputStream fi1191;
   
   // Item 10
    private String i11101="";
     private String a11101="";
    private String v11101="";
    private String j11101="";
    private FileInputStream fi11101; 
    
     // Item 11
    private String i11111="";
     private String a11111="";
    private String v11111="";
    private String j11111="";
    private FileInputStream fi11111; 

    public Mrecursos(String path, int id, int longitud, String nombre, String i1111, String a1111, String v1111, String v1112, String v1113, String v1114, String j1111, FileInputStream fi1111, String i1121, String a1121, String v1121, String j1121, FileInputStream fi1121, String i1131, String a1131, String v1131, String j1131, FileInputStream fi1131, String i1141, String a1141, String v1141, String v1142, String j1141, FileInputStream fi1141, String i1151, String a1151, String v1151, String j1151, FileInputStream fi1151, String i1161, String a1161, String v1161, String v1162, String j1161, FileInputStream fi1161, String i1171, String a1171, String v1171, String j1171, FileInputStream fi1171, String i1181, String a1181, String v1181, String v1182, String j1181, FileInputStream fi1181, String i1191, String a1191, String v1191, String v1192, String j1191, FileInputStream fi1191, String i11101, String a11101, String v11101, String j11101, FileInputStream fi11101, String i11111, String a11111, String v11111, String j11111, FileInputStream fi11111) {
        this.path = path;
        this.id = id;
        this.longitud = longitud;
        this.nombre = nombre;
        this.i1111 = i1111;
        this.a1111 = a1111;
        this.v1111 = v1111;
        this.v1112 = v1112;
        this.v1113 = v1113;
        this.v1114 = v1114;
        this.j1111 = j1111;
        this.fi1111 = fi1111;
        this.i1121 = i1121;
        this.a1121 = a1121;
        this.v1121 = v1121;
        this.j1121 = j1121;
        this.fi1121 = fi1121;
        this.i1131 = i1131;
        this.a1131 = a1131;
        this.v1131 = v1131;
        this.j1131 = j1131;
        this.fi1131 = fi1131;
        this.i1141 = i1141;
        this.a1141 = a1141;
        this.v1141 = v1141;
        this.v1142 = v1142;
        this.j1141 = j1141;
        this.fi1141 = fi1141;
        this.i1151 = i1151;
        this.a1151 = a1151;
        this.v1151 = v1151;
        this.j1151 = j1151;
        this.fi1151 = fi1151;
        this.i1161 = i1161;
        this.a1161 = a1161;
        this.v1161 = v1161;
        this.v1162 = v1162;
        this.j1161 = j1161;
        this.fi1161 = fi1161;
        this.i1171 = i1171;
        this.a1171 = a1171;
        this.v1171 = v1171;
        this.j1171 = j1171;
        this.fi1171 = fi1171;
        this.i1181 = i1181;
        this.a1181 = a1181;
        this.v1181 = v1181;
        this.v1182 = v1182;
        this.j1181 = j1181;
        this.fi1181 = fi1181;
        this.i1191 = i1191;
        this.a1191 = a1191;
        this.v1191 = v1191;
        this.v1192 = v1192;
        this.j1191 = j1191;
        this.fi1191 = fi1191;
        this.i11101 = i11101;
        this.a11101 = a11101;
        this.v11101 = v11101;
        this.j11101 = j11101;
        this.fi11101 = fi11101;
        this.i11111 = i11111;
        this.a11111 = a11111;
        this.v11111 = v11111;
        this.j11111 = j11111;
        this.fi11111 = fi11111;
    }

    public Mrecursos() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getI1111() {
        return i1111;
    }

    public void setI1111(String i1111) {
        this.i1111 = i1111;
    }

    public String getA1111() {
        return a1111;
    }

    public void setA1111(String a1111) {
        this.a1111 = a1111;
    }

    public String getV1111() {
        return v1111;
    }

    public void setV1111(String v1111) {
        this.v1111 = v1111;
    }

    public String getV1112() {
        return v1112;
    }

    public void setV1112(String v1112) {
        this.v1112 = v1112;
    }

    public String getV1113() {
        return v1113;
    }

    public void setV1113(String v1113) {
        this.v1113 = v1113;
    }

    public String getV1114() {
        return v1114;
    }

    public void setV1114(String v1114) {
        this.v1114 = v1114;
    }

    public String getJ1111() {
        return j1111;
    }

    public void setJ1111(String j1111) {
        this.j1111 = j1111;
    }

    public FileInputStream getFi1111() {
        return fi1111;
    }

    public void setFi1111(FileInputStream fi1111) {
        this.fi1111 = fi1111;
    }

    public String getI1121() {
        return i1121;
    }

    public void setI1121(String i1121) {
        this.i1121 = i1121;
    }

    public String getA1121() {
        return a1121;
    }

    public void setA1121(String a1121) {
        this.a1121 = a1121;
    }

    public String getV1121() {
        return v1121;
    }

    public void setV1121(String v1121) {
        this.v1121 = v1121;
    }

    public String getJ1121() {
        return j1121;
    }

    public void setJ1121(String j1121) {
        this.j1121 = j1121;
    }

    public FileInputStream getFi1121() {
        return fi1121;
    }

    public void setFi1121(FileInputStream fi1121) {
        this.fi1121 = fi1121;
    }

    public String getI1131() {
        return i1131;
    }

    public void setI1131(String i1131) {
        this.i1131 = i1131;
    }

    public String getA1131() {
        return a1131;
    }

    public void setA1131(String a1131) {
        this.a1131 = a1131;
    }

    public String getV1131() {
        return v1131;
    }

    public void setV1131(String v1131) {
        this.v1131 = v1131;
    }

    public String getJ1131() {
        return j1131;
    }

    public void setJ1131(String j1131) {
        this.j1131 = j1131;
    }

    public FileInputStream getFi1131() {
        return fi1131;
    }

    public void setFi1131(FileInputStream fi1131) {
        this.fi1131 = fi1131;
    }

    public String getI1141() {
        return i1141;
    }

    public void setI1141(String i1141) {
        this.i1141 = i1141;
    }

    public String getA1141() {
        return a1141;
    }

    public void setA1141(String a1141) {
        this.a1141 = a1141;
    }

    public String getV1141() {
        return v1141;
    }

    public void setV1141(String v1141) {
        this.v1141 = v1141;
    }

    public String getV1142() {
        return v1142;
    }

    public void setV1142(String v1142) {
        this.v1142 = v1142;
    }

    public String getJ1141() {
        return j1141;
    }

    public void setJ1141(String j1141) {
        this.j1141 = j1141;
    }

    public FileInputStream getFi1141() {
        return fi1141;
    }

    public void setFi1141(FileInputStream fi1141) {
        this.fi1141 = fi1141;
    }

    public String getI1151() {
        return i1151;
    }

    public void setI1151(String i1151) {
        this.i1151 = i1151;
    }

    public String getA1151() {
        return a1151;
    }

    public void setA1151(String a1151) {
        this.a1151 = a1151;
    }

    public String getV1151() {
        return v1151;
    }

    public void setV1151(String v1151) {
        this.v1151 = v1151;
    }

    public String getJ1151() {
        return j1151;
    }

    public void setJ1151(String j1151) {
        this.j1151 = j1151;
    }

    public FileInputStream getFi1151() {
        return fi1151;
    }

    public void setFi1151(FileInputStream fi1151) {
        this.fi1151 = fi1151;
    }

    public String getI1161() {
        return i1161;
    }

    public void setI1161(String i1161) {
        this.i1161 = i1161;
    }

    public String getA1161() {
        return a1161;
    }

    public void setA1161(String a1161) {
        this.a1161 = a1161;
    }

    public String getV1161() {
        return v1161;
    }

    public void setV1161(String v1161) {
        this.v1161 = v1161;
    }

    public String getV1162() {
        return v1162;
    }

    public void setV1162(String v1162) {
        this.v1162 = v1162;
    }

    public String getJ1161() {
        return j1161;
    }

    public void setJ1161(String j1161) {
        this.j1161 = j1161;
    }

    public FileInputStream getFi1161() {
        return fi1161;
    }

    public void setFi1161(FileInputStream fi1161) {
        this.fi1161 = fi1161;
    }

    public String getI1171() {
        return i1171;
    }

    public void setI1171(String i1171) {
        this.i1171 = i1171;
    }

    public String getA1171() {
        return a1171;
    }

    public void setA1171(String a1171) {
        this.a1171 = a1171;
    }

    public String getV1171() {
        return v1171;
    }

    public void setV1171(String v1171) {
        this.v1171 = v1171;
    }

    public String getJ1171() {
        return j1171;
    }

    public void setJ1171(String j1171) {
        this.j1171 = j1171;
    }

    public FileInputStream getFi1171() {
        return fi1171;
    }

    public void setFi1171(FileInputStream fi1171) {
        this.fi1171 = fi1171;
    }

    public String getI1181() {
        return i1181;
    }

    public void setI1181(String i1181) {
        this.i1181 = i1181;
    }

    public String getA1181() {
        return a1181;
    }

    public void setA1181(String a1181) {
        this.a1181 = a1181;
    }

    public String getV1181() {
        return v1181;
    }

    public void setV1181(String v1181) {
        this.v1181 = v1181;
    }

    public String getV1182() {
        return v1182;
    }

    public void setV1182(String v1182) {
        this.v1182 = v1182;
    }

    public String getJ1181() {
        return j1181;
    }

    public void setJ1181(String j1181) {
        this.j1181 = j1181;
    }

    public FileInputStream getFi1181() {
        return fi1181;
    }

    public void setFi1181(FileInputStream fi1181) {
        this.fi1181 = fi1181;
    }

    public String getI1191() {
        return i1191;
    }

    public void setI1191(String i1191) {
        this.i1191 = i1191;
    }

    public String getA1191() {
        return a1191;
    }

    public void setA1191(String a1191) {
        this.a1191 = a1191;
    }

    public String getV1191() {
        return v1191;
    }

    public void setV1191(String v1191) {
        this.v1191 = v1191;
    }

    public String getV1192() {
        return v1192;
    }

    public void setV1192(String v1192) {
        this.v1192 = v1192;
    }

    public String getJ1191() {
        return j1191;
    }

    public void setJ1191(String j1191) {
        this.j1191 = j1191;
    }

    public FileInputStream getFi1191() {
        return fi1191;
    }

    public void setFi1191(FileInputStream fi1191) {
        this.fi1191 = fi1191;
    }

    public String getI11101() {
        return i11101;
    }

    public void setI11101(String i11101) {
        this.i11101 = i11101;
    }

    public String getA11101() {
        return a11101;
    }

    public void setA11101(String a11101) {
        this.a11101 = a11101;
    }

    public String getV11101() {
        return v11101;
    }

    public void setV11101(String v11101) {
        this.v11101 = v11101;
    }

    public String getJ11101() {
        return j11101;
    }

    public void setJ11101(String j11101) {
        this.j11101 = j11101;
    }

    public FileInputStream getFi11101() {
        return fi11101;
    }

    public void setFi11101(FileInputStream fi11101) {
        this.fi11101 = fi11101;
    }

    public String getI11111() {
        return i11111;
    }

    public void setI11111(String i11111) {
        this.i11111 = i11111;
    }

    public String getA11111() {
        return a11111;
    }

    public void setA11111(String a11111) {
        this.a11111 = a11111;
    }

    public String getV11111() {
        return v11111;
    }

    public void setV11111(String v11111) {
        this.v11111 = v11111;
    }

    public String getJ11111() {
        return j11111;
    }

    public void setJ11111(String j11111) {
        this.j11111 = j11111;
    }

    public FileInputStream getFi11111() {
        return fi11111;
    }

    public void setFi11111(FileInputStream fi11111) {
        this.fi11111 = fi11111;
    }

    
    

    
    
    
    
    
    
}
