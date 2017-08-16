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
public class Mgestion_peligro {
    
            // variables de entrada base de datos anexo
 private static String path;
 private static int id;
 private int longitud;
 private String nombre;
 private FileInputStream fi11121;
 
// Item 41    
    private String i411;
    private String a411;
    private String v411;
    private String v412;
    private String j411;
   
   
    
                  
// Item 42   
    private String i421;
    private String a421;
    private String v421;
    private String v422;
    private String j421;
   
    
// Item 43
    private String i431;
    private String a431;
    private String v431;
    private String v432;
    private String v433;
    private String j431;

    
 // Item 44
    private String i441;
    private String a441;
    private String v441;
    private String j441;
     
    
   // Item 45
    private String i451;
    private String a451;
    private String v451;
    private String v452;
    private String v453;
    private String j451;
   
   
   // Item 46
    private String i461;
    private String a461;
    private String v461;
    private String v462;
    private String j461;
    
    
     // Item 47
    private String i471;
    private String a471;
    private String v471;
    private String j471;
    
   
   // Item 48
    private String i481;
    private String a481;
    private String v481;
    private String j481;
  
    
      // Item 49
    private String i491;
    private String a491;
    private String v491;
    private String j491;
   
   
   // Item 50
    private String i501;
    private String a501;
    private String v501;
    private String v502;
    private String v503;
    private String v504;  
    private String j501;

    public Mgestion_peligro(int longitud, String nombre, FileInputStream fi11121, String i411, String a411, String v411, String v412, String j411, String i421, String a421, String v421, String v422, String j421, String i431, String a431, String v431, String v432, String v433, String j431, String i441, String a441, String v441, String j441, String i451, String a451, String v451, String v452, String v453, String j451, String i461, String a461, String v461, String v462, String j461, String i471, String a471, String v471, String j471, String i481, String a481, String v481, String j481, String i491, String a491, String v491, String j491, String i501, String a501, String v501, String v502, String v503, String v504, String j501) {
        this.longitud = longitud;
        this.nombre = nombre;
        this.fi11121 = fi11121;
        this.i411 = i411;
        this.a411 = a411;
        this.v411 = v411;
        this.v412 = v412;
        this.j411 = j411;
        this.i421 = i421;
        this.a421 = a421;
        this.v421 = v421;
        this.v422 = v422;
        this.j421 = j421;
        this.i431 = i431;
        this.a431 = a431;
        this.v431 = v431;
        this.v432 = v432;
        this.v433 = v433;
        this.j431 = j431;
        this.i441 = i441;
        this.a441 = a441;
        this.v441 = v441;
        this.j441 = j441;
        this.i451 = i451;
        this.a451 = a451;
        this.v451 = v451;
        this.v452 = v452;
        this.v453 = v453;
        this.j451 = j451;
        this.i461 = i461;
        this.a461 = a461;
        this.v461 = v461;
        this.v462 = v462;
        this.j461 = j461;
        this.i471 = i471;
        this.a471 = a471;
        this.v471 = v471;
        this.j471 = j471;
        this.i481 = i481;
        this.a481 = a481;
        this.v481 = v481;
        this.j481 = j481;
        this.i491 = i491;
        this.a491 = a491;
        this.v491 = v491;
        this.j491 = j491;
        this.i501 = i501;
        this.a501 = a501;
        this.v501 = v501;
        this.v502 = v502;
        this.v503 = v503;
        this.v504 = v504;
        this.j501 = j501;
    }

    public Mgestion_peligro() {
    }

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        Mgestion_peligro.path = path;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Mgestion_peligro.id = id;
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

    public String getI411() {
        return i411;
    }

    public void setI411(String i411) {
        this.i411 = i411;
    }

    public String getA411() {
        return a411;
    }

    public void setA411(String a411) {
        this.a411 = a411;
    }

    public String getV411() {
        return v411;
    }

    public void setV411(String v411) {
        this.v411 = v411;
    }

    public String getV412() {
        return v412;
    }

    public void setV412(String v412) {
        this.v412 = v412;
    }

    public String getJ411() {
        return j411;
    }

    public void setJ411(String j411) {
        this.j411 = j411;
    }

    public String getI421() {
        return i421;
    }

    public void setI421(String i421) {
        this.i421 = i421;
    }

    public String getA421() {
        return a421;
    }

    public void setA421(String a421) {
        this.a421 = a421;
    }

    public String getV421() {
        return v421;
    }

    public void setV421(String v421) {
        this.v421 = v421;
    }

    public String getV422() {
        return v422;
    }

    public void setV422(String v422) {
        this.v422 = v422;
    }

    public String getJ421() {
        return j421;
    }

    public void setJ421(String j421) {
        this.j421 = j421;
    }

    public String getI431() {
        return i431;
    }

    public void setI431(String i431) {
        this.i431 = i431;
    }

    public String getA431() {
        return a431;
    }

    public void setA431(String a431) {
        this.a431 = a431;
    }

    public String getV431() {
        return v431;
    }

    public void setV431(String v431) {
        this.v431 = v431;
    }

    public String getV432() {
        return v432;
    }

    public void setV432(String v432) {
        this.v432 = v432;
    }

    public String getV433() {
        return v433;
    }

    public void setV433(String v433) {
        this.v433 = v433;
    }

    public String getJ431() {
        return j431;
    }

    public void setJ431(String j431) {
        this.j431 = j431;
    }

    public String getI441() {
        return i441;
    }

    public void setI441(String i441) {
        this.i441 = i441;
    }

    public String getA441() {
        return a441;
    }

    public void setA441(String a441) {
        this.a441 = a441;
    }

    public String getV441() {
        return v441;
    }

    public void setV441(String v441) {
        this.v441 = v441;
    }

    public String getJ441() {
        return j441;
    }

    public void setJ441(String j441) {
        this.j441 = j441;
    }

    public String getI451() {
        return i451;
    }

    public void setI451(String i451) {
        this.i451 = i451;
    }

    public String getA451() {
        return a451;
    }

    public void setA451(String a451) {
        this.a451 = a451;
    }

    public String getV451() {
        return v451;
    }

    public void setV451(String v451) {
        this.v451 = v451;
    }

    public String getV452() {
        return v452;
    }

    public void setV452(String v452) {
        this.v452 = v452;
    }

    public String getV453() {
        return v453;
    }

    public void setV453(String v453) {
        this.v453 = v453;
    }

    public String getJ451() {
        return j451;
    }

    public void setJ451(String j451) {
        this.j451 = j451;
    }

    public String getI461() {
        return i461;
    }

    public void setI461(String i461) {
        this.i461 = i461;
    }

    public String getA461() {
        return a461;
    }

    public void setA461(String a461) {
        this.a461 = a461;
    }

    public String getV461() {
        return v461;
    }

    public void setV461(String v461) {
        this.v461 = v461;
    }

    public String getV462() {
        return v462;
    }

    public void setV462(String v462) {
        this.v462 = v462;
    }

    public String getJ461() {
        return j461;
    }

    public void setJ461(String j461) {
        this.j461 = j461;
    }

    public String getI471() {
        return i471;
    }

    public void setI471(String i471) {
        this.i471 = i471;
    }

    public String getA471() {
        return a471;
    }

    public void setA471(String a471) {
        this.a471 = a471;
    }

    public String getV471() {
        return v471;
    }

    public void setV471(String v471) {
        this.v471 = v471;
    }

    public String getJ471() {
        return j471;
    }

    public void setJ471(String j471) {
        this.j471 = j471;
    }

    public String getI481() {
        return i481;
    }

    public void setI481(String i481) {
        this.i481 = i481;
    }

    public String getA481() {
        return a481;
    }

    public void setA481(String a481) {
        this.a481 = a481;
    }

    public String getV481() {
        return v481;
    }

    public void setV481(String v481) {
        this.v481 = v481;
    }

    public String getJ481() {
        return j481;
    }

    public void setJ481(String j481) {
        this.j481 = j481;
    }

    public String getI491() {
        return i491;
    }

    public void setI491(String i491) {
        this.i491 = i491;
    }

    public String getA491() {
        return a491;
    }

    public void setA491(String a491) {
        this.a491 = a491;
    }

    public String getV491() {
        return v491;
    }

    public void setV491(String v491) {
        this.v491 = v491;
    }

    public String getJ491() {
        return j491;
    }

    public void setJ491(String j491) {
        this.j491 = j491;
    }

    public String getI501() {
        return i501;
    }

    public void setI501(String i501) {
        this.i501 = i501;
    }

    public String getA501() {
        return a501;
    }

    public void setA501(String a501) {
        this.a501 = a501;
    }

    public String getV501() {
        return v501;
    }

    public void setV501(String v501) {
        this.v501 = v501;
    }

    public String getV502() {
        return v502;
    }

    public void setV502(String v502) {
        this.v502 = v502;
    }

    public String getV503() {
        return v503;
    }

    public void setV503(String v503) {
        this.v503 = v503;
    }

    public String getV504() {
        return v504;
    }

    public void setV504(String v504) {
        this.v504 = v504;
    }

    public String getJ501() {
        return j501;
    }

    public void setJ501(String j501) {
        this.j501 = j501;
    }
    
    
 
    
   
    
}
