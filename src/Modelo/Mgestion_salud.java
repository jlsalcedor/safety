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
public class Mgestion_salud {
    
           // variables de entrada base de datos anexo
 private static String path;
 private static int id;
 private int longitud;
 private String nombre;
 private FileInputStream fi11121;
 
// Item 23    
    private String i231="";
    private String a231;
    private String v231;
    private String j231;
   
   
    
                  
// Item 24    
    private String i241="";
    private String a241;
    private String v241;
    private String v242;
    private String j241;
   
    
// Item 25
    private String i251="";
     private String a251;
    private String v251;
    private String j251;

    
 // Item 26
    private String i261="";
    private String a261;
    private String v261;
    private String v262;
    private String v263;
    private String j261;
     
    
   // Item 27
    private String i271="";
    private String a271;
    private String v271;
    private String j271;
   
   
   // Item 28
    private String i281="";
    private String a281;
    private String v281;
    private String v282;
    private String j281;
    
    
     // Item 29
    private String i291="";
    private String a291;
    private String v291;
    private String j291;
    
   
   // Item 30
    private String i301="";
    private String a301;
    private String v301;
    private String j301;
  
    
      // Item 31
    private String i311="";
    private String a311;
    private String v311;
    private String j311;
   
   
   // Item 32
    private String i321="";
     private String a321;
    private String v321;
    private String j321;
 
    
     // Item 33
    private String i331="";
     private String a331;
    private String v331;
    private String v332;
    private String v333;
    private String j331;
    
      // Item 34
    private String i341="";
    private String a341;
    private String v341;
    private String j341;
    
    
     // Item 35
    private String i351="";
    private String a351;
    private String v351;
    private String j351;
    
   
   // Item 36
    private String i361="";
    private String a361;
    private String v361;
    private String j361;
  
    
      // Item 37
    private String i371="";
    private String a371;
    private String v371;
    private String j371;
   
   
   // Item 38
    private String i381="";
     private String a381;
    private String v381;
    private String j381;
 
    
     // Item 39
    private String i391="";
     private String a391;
    private String v391;
    private String j391;
    
     // Item 40
    private String i401="";
     private String a401;
    private String v401;
    private String j401;

    public Mgestion_salud(int longitud, String nombre, FileInputStream fi11121, String i231, String a231, String v231, String j231, String i241, String a241, String v241, String v242, String j241, String i251, String a251, String v251, String j251, String i261, String a261, String v261, String v262, String v263, String j261, String i271, String a271, String v271, String j271, String i281, String a281, String v281, String v282, String j281, String i291, String a291, String v291, String j291, String i301, String a301, String v301, String j301, String i311, String a311, String v311, String j311, String i321, String a321, String v321, String j321, String i331, String a331, String v331, String v332, String v333, String j331, String i341, String a341, String v341, String j341, String i351, String a351, String v351, String j351, String i361, String a361, String v361, String j361, String i371, String a371, String v371, String j371, String i381, String a381, String v381, String j381, String i391, String a391, String v391, String j391, String i401, String a401, String v401, String j401) {
        this.longitud = longitud;
        this.nombre = nombre;
        this.fi11121 = fi11121;
        this.i231 = i231;
        this.a231 = a231;
        this.v231 = v231;
        this.j231 = j231;
        this.i241 = i241;
        this.a241 = a241;
        this.v241 = v241;
        this.v242 = v242;
        this.j241 = j241;
        this.i251 = i251;
        this.a251 = a251;
        this.v251 = v251;
        this.j251 = j251;
        this.i261 = i261;
        this.a261 = a261;
        this.v261 = v261;
        this.v262 = v262;
        this.v263 = v263;
        this.j261 = j261;
        this.i271 = i271;
        this.a271 = a271;
        this.v271 = v271;
        this.j271 = j271;
        this.i281 = i281;
        this.a281 = a281;
        this.v281 = v281;
        this.v282 = v282;
        this.j281 = j281;
        this.i291 = i291;
        this.a291 = a291;
        this.v291 = v291;
        this.j291 = j291;
        this.i301 = i301;
        this.a301 = a301;
        this.v301 = v301;
        this.j301 = j301;
        this.i311 = i311;
        this.a311 = a311;
        this.v311 = v311;
        this.j311 = j311;
        this.i321 = i321;
        this.a321 = a321;
        this.v321 = v321;
        this.j321 = j321;
        this.i331 = i331;
        this.a331 = a331;
        this.v331 = v331;
        this.v332 = v332;
        this.v333 = v333;
        this.j331 = j331;
        this.i341 = i341;
        this.a341 = a341;
        this.v341 = v341;
        this.j341 = j341;
        this.i351 = i351;
        this.a351 = a351;
        this.v351 = v351;
        this.j351 = j351;
        this.i361 = i361;
        this.a361 = a361;
        this.v361 = v361;
        this.j361 = j361;
        this.i371 = i371;
        this.a371 = a371;
        this.v371 = v371;
        this.j371 = j371;
        this.i381 = i381;
        this.a381 = a381;
        this.v381 = v381;
        this.j381 = j381;
        this.i391 = i391;
        this.a391 = a391;
        this.v391 = v391;
        this.j391 = j391;
        this.i401 = i401;
        this.a401 = a401;
        this.v401 = v401;
        this.j401 = j401;
    }

    public Mgestion_salud() {
    }

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        Mgestion_salud.path = path;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Mgestion_salud.id = id;
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

    public String getI231() {
        return i231;
    }

    public void setI231(String i231) {
        this.i231 = i231;
    }

    public String getA231() {
        return a231;
    }

    public void setA231(String a231) {
        this.a231 = a231;
    }

    public String getV231() {
        return v231;
    }

    public void setV231(String v231) {
        this.v231 = v231;
    }

    public String getJ231() {
        return j231;
    }

    public void setJ231(String j231) {
        this.j231 = j231;
    }

    public String getI241() {
        return i241;
    }

    public void setI241(String i241) {
        this.i241 = i241;
    }

    public String getA241() {
        return a241;
    }

    public void setA241(String a241) {
        this.a241 = a241;
    }

    public String getV241() {
        return v241;
    }

    public void setV241(String v241) {
        this.v241 = v241;
    }

    public String getV242() {
        return v242;
    }

    public void setV242(String v242) {
        this.v242 = v242;
    }

    public String getJ241() {
        return j241;
    }

    public void setJ241(String j241) {
        this.j241 = j241;
    }

    public String getI251() {
        return i251;
    }

    public void setI251(String i251) {
        this.i251 = i251;
    }

    public String getA251() {
        return a251;
    }

    public void setA251(String a251) {
        this.a251 = a251;
    }

    public String getV251() {
        return v251;
    }

    public void setV251(String v251) {
        this.v251 = v251;
    }

    public String getJ251() {
        return j251;
    }

    public void setJ251(String j251) {
        this.j251 = j251;
    }

    public String getI261() {
        return i261;
    }

    public void setI261(String i261) {
        this.i261 = i261;
    }

    public String getA261() {
        return a261;
    }

    public void setA261(String a261) {
        this.a261 = a261;
    }

    public String getV261() {
        return v261;
    }

    public void setV261(String v261) {
        this.v261 = v261;
    }

    public String getV262() {
        return v262;
    }

    public void setV262(String v262) {
        this.v262 = v262;
    }

    public String getV263() {
        return v263;
    }

    public void setV263(String v263) {
        this.v263 = v263;
    }

    public String getJ261() {
        return j261;
    }

    public void setJ261(String j261) {
        this.j261 = j261;
    }

    public String getI271() {
        return i271;
    }

    public void setI271(String i271) {
        this.i271 = i271;
    }

    public String getA271() {
        return a271;
    }

    public void setA271(String a271) {
        this.a271 = a271;
    }

    public String getV271() {
        return v271;
    }

    public void setV271(String v271) {
        this.v271 = v271;
    }

    public String getJ271() {
        return j271;
    }

    public void setJ271(String j271) {
        this.j271 = j271;
    }

    public String getI281() {
        return i281;
    }

    public void setI281(String i281) {
        this.i281 = i281;
    }

    public String getA281() {
        return a281;
    }

    public void setA281(String a281) {
        this.a281 = a281;
    }

    public String getV281() {
        return v281;
    }

    public void setV281(String v281) {
        this.v281 = v281;
    }

    public String getV282() {
        return v282;
    }

    public void setV282(String v282) {
        this.v282 = v282;
    }

    public String getJ281() {
        return j281;
    }

    public void setJ281(String j281) {
        this.j281 = j281;
    }

    public String getI291() {
        return i291;
    }

    public void setI291(String i291) {
        this.i291 = i291;
    }

    public String getA291() {
        return a291;
    }

    public void setA291(String a291) {
        this.a291 = a291;
    }

    public String getV291() {
        return v291;
    }

    public void setV291(String v291) {
        this.v291 = v291;
    }

    public String getJ291() {
        return j291;
    }

    public void setJ291(String j291) {
        this.j291 = j291;
    }

    public String getI301() {
        return i301;
    }

    public void setI301(String i301) {
        this.i301 = i301;
    }

    public String getA301() {
        return a301;
    }

    public void setA301(String a301) {
        this.a301 = a301;
    }

    public String getV301() {
        return v301;
    }

    public void setV301(String v301) {
        this.v301 = v301;
    }

    public String getJ301() {
        return j301;
    }

    public void setJ301(String j301) {
        this.j301 = j301;
    }

    public String getI311() {
        return i311;
    }

    public void setI311(String i311) {
        this.i311 = i311;
    }

    public String getA311() {
        return a311;
    }

    public void setA311(String a311) {
        this.a311 = a311;
    }

    public String getV311() {
        return v311;
    }

    public void setV311(String v311) {
        this.v311 = v311;
    }

    public String getJ311() {
        return j311;
    }

    public void setJ311(String j311) {
        this.j311 = j311;
    }

    public String getI321() {
        return i321;
    }

    public void setI321(String i321) {
        this.i321 = i321;
    }

    public String getA321() {
        return a321;
    }

    public void setA321(String a321) {
        this.a321 = a321;
    }

    public String getV321() {
        return v321;
    }

    public void setV321(String v321) {
        this.v321 = v321;
    }

    public String getJ321() {
        return j321;
    }

    public void setJ321(String j321) {
        this.j321 = j321;
    }

    public String getI331() {
        return i331;
    }

    public void setI331(String i331) {
        this.i331 = i331;
    }

    public String getA331() {
        return a331;
    }

    public void setA331(String a331) {
        this.a331 = a331;
    }

    public String getV331() {
        return v331;
    }

    public void setV331(String v331) {
        this.v331 = v331;
    }

    public String getV332() {
        return v332;
    }

    public void setV332(String v332) {
        this.v332 = v332;
    }

    public String getV333() {
        return v333;
    }

    public void setV333(String v333) {
        this.v333 = v333;
    }

    public String getJ331() {
        return j331;
    }

    public void setJ331(String j331) {
        this.j331 = j331;
    }

    public String getI341() {
        return i341;
    }

    public void setI341(String i341) {
        this.i341 = i341;
    }

    public String getA341() {
        return a341;
    }

    public void setA341(String a341) {
        this.a341 = a341;
    }

    public String getV341() {
        return v341;
    }

    public void setV341(String v341) {
        this.v341 = v341;
    }

    public String getJ341() {
        return j341;
    }

    public void setJ341(String j341) {
        this.j341 = j341;
    }

    public String getI351() {
        return i351;
    }

    public void setI351(String i351) {
        this.i351 = i351;
    }

    public String getA351() {
        return a351;
    }

    public void setA351(String a351) {
        this.a351 = a351;
    }

    public String getV351() {
        return v351;
    }

    public void setV351(String v351) {
        this.v351 = v351;
    }

    public String getJ351() {
        return j351;
    }

    public void setJ351(String j351) {
        this.j351 = j351;
    }

    public String getI361() {
        return i361;
    }

    public void setI361(String i361) {
        this.i361 = i361;
    }

    public String getA361() {
        return a361;
    }

    public void setA361(String a361) {
        this.a361 = a361;
    }

    public String getV361() {
        return v361;
    }

    public void setV361(String v361) {
        this.v361 = v361;
    }

    public String getJ361() {
        return j361;
    }

    public void setJ361(String j361) {
        this.j361 = j361;
    }

    public String getI371() {
        return i371;
    }

    public void setI371(String i371) {
        this.i371 = i371;
    }

    public String getA371() {
        return a371;
    }

    public void setA371(String a371) {
        this.a371 = a371;
    }

    public String getV371() {
        return v371;
    }

    public void setV371(String v371) {
        this.v371 = v371;
    }

    public String getJ371() {
        return j371;
    }

    public void setJ371(String j371) {
        this.j371 = j371;
    }

    public String getI381() {
        return i381;
    }

    public void setI381(String i381) {
        this.i381 = i381;
    }

    public String getA381() {
        return a381;
    }

    public void setA381(String a381) {
        this.a381 = a381;
    }

    public String getV381() {
        return v381;
    }

    public void setV381(String v381) {
        this.v381 = v381;
    }

    public String getJ381() {
        return j381;
    }

    public void setJ381(String j381) {
        this.j381 = j381;
    }

    public String getI391() {
        return i391;
    }

    public void setI391(String i391) {
        this.i391 = i391;
    }

    public String getA391() {
        return a391;
    }

    public void setA391(String a391) {
        this.a391 = a391;
    }

    public String getV391() {
        return v391;
    }

    public void setV391(String v391) {
        this.v391 = v391;
    }

    public String getJ391() {
        return j391;
    }

    public void setJ391(String j391) {
        this.j391 = j391;
    }

    public String getI401() {
        return i401;
    }

    public void setI401(String i401) {
        this.i401 = i401;
    }

    public String getA401() {
        return a401;
    }

    public void setA401(String a401) {
        this.a401 = a401;
    }

    public String getV401() {
        return v401;
    }

    public void setV401(String v401) {
        this.v401 = v401;
    }

    public String getJ401() {
        return j401;
    }

    public void setJ401(String j401) {
        this.j401 = j401;
    }
    
    
    
}
