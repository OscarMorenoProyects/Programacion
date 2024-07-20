package co;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private String nombre;
    private Contacto contacto;

public static void main(String[] args) {
    
    ArrayList <Contacto> contactos =new ArrayList<>();

    Contacto contacto1=new Contacto("Oscar", "os", "oscar@mo", "3145678");
    Contacto contacto2=new Contacto("andres", "avf", "andres@gmail.com", "31156789");
    Contacto contacto3=new Contacto("juan", "juachi", "juan@gmail.com", "345678934");


    contactos.add(contacto1);
    contactos.add(contacto2);
    contactos.add(contacto3);
    contactos.add(new Contacto("ernesto", "er", "ernesto@gmail.com", "2345678"));

    System.out.println(contactos);

    contactos=devolver(contactos, contacto3);

    
    do {
        System.out.println("ingrese el numero :");
        Scanner
        
        switch (num) {
            case 1:
                //agrega contacto
            
                break;
            case 2:
               // lista nombres
            break;

            case 3: 
            //listar toda la informacion de contactos y salir.
             
            default:
                break;
        }
        
    } while (true);

} 

    public static ArrayList<Contacto> devolver(ArrayList<Contacto> listaContactos, Contacto cont){
        for (int i = 0; i <listaContactos.size(); i++) {
            if (cont.getNombre().equals(listaContactos.get(i).getNombre())) {
                if (cont.getTelefono().equals(listaContactos.get(i).getTelefono())) {
                    System.out.println("Error , ya esta agregado en la lista !!!");
                }else {
                    listaContactos.add(cont);
                    System.out.println("contacto agregado exitosamente");
                }

                
            }
        }
        return listaContactos;

    }
}
