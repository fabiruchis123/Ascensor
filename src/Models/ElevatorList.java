package Models;

import java.util.LinkedList;
import java.util.Queue;

public class ElevatorList {
    private int pisoactual;
    private String dirrecion;
    private Queue<Solicitud> requestQueue;
    
     public ElevatorList() {
        pisoactual = 1;
        dirrecion = "";
        requestQueue = new LinkedList<>();
    }
       public void addRequest(int piso, String Direction) {
        requestQueue.add(new Solicitud(piso, Direction));
        //sortRequests();
    }
     public void move(){
           if(requestQueue.isEmpty()){
               return;
           }
        Solicitud nuevasolicitud = requestQueue.poll();
       int pisodestino = nuevasolicitud.getPiso();
       if(pisodestino > pisoactual){
           dirrecion = "Sube";
           while (pisoactual < pisodestino){
               pisoactual++;
         }
       
        }else if(pisodestino < pisoactual){
            dirrecion = "baja";
            while (pisoactual > pisodestino) {
                pisoactual--;
            }
        }   
     }
}
