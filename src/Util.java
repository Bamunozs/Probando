
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author el_ma
 */
public class Util {
    
    public final static ArrayList<Cliente> lista = new ArrayList<Cliente>();
    
    public static int rutsesion = 0;
    public static boolean firstTime=false;
    
    public static int usuarioConectado(){
        int rutAux = -1;
        for (int i = 0; i < Util.lista.size(); i++) {
            if (Util.lista.get(i).getRut() == Util.rutsesion) {
                rutAux = i;
                break;
            }
        }
        return rutAux;
    
    }
    
    
}
