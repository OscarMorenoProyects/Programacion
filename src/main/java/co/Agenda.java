package co;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private String nombre;
    private Contacto contacto;



public Agenda(){}

public Agenda(String nombre, Contacto contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    ArrayList <Contacto> contactos =new ArrayList<>();


    Categoria cc=Categoria.AMIGOS;
    Categoria cd=Categoria.FAMILIA;
    Grupo miGrupo=new Grupo("amigos",cc);
    Grupo grupo=new Grupo("family", cd);

    Contacto contacto1 = new Contacto("Oscar", "os", "oscar@uqvirtual.edu.co", "3117756359",miGrupo,18);
    Contacto contacto2=new Contacto("juan","ju", "jua@gmail.com", "3122680703", grupo,30);
    Contacto contacto3=new Contacto("luis","lucho", "lua@gmail.com", "3136650713", grupo,14);


    contactos.add(contacto1);
    contactos.add(contacto2);
    contactos.add(contacto3);

    


    do {

        System.out.println("""
                1. agregar contactos
                2. mostrar nombres de la lista
                3. mostrar toda la información de los contactos 
                4.mostrar lista mayores de edad y salir 
                """);
        System.out.println("ingrese el numero :");
         int num = scanner.nextInt();
        scanner.nextLine();
        
        switch (num) {
            case 1:
                System.out.println("ingrese el nombre: ");
                String nombre=scanner.nextLine();
                

                System.out.println("ingrese el alias ");
                String alias=scanner.nextLine();
                
                System.out.println("ingrese el email: ");
                String email= scanner.nextLine();

                System.out.println("ingrese el Telefono: ");
                String tel= scanner.nextLine();

                System.out.println("ingrese l grupo :");
                String grupi= scanner.nextLine();

                System.out.println("ingrese el tipo de categoria seleccione 1. oficina 2.fiesta 3.amigos 4.familia :");
                int cate= scanner.nextInt();
                Categoria core=null;


                switch (cate) {
                    case 1:
                     core= Categoria.OFICINA;
                        break;
                    case 2:
                        core= Categoria.FIESTA;
                        break;
                    case 3:
                        core= Categoria.AMIGOS;
                        break;
                    case 4:
                       core= Categoria.FAMILIA;
                           break;
                    default:
                    System.out.println("Error, opcion invalida");
                        break;
                }
             
                Grupo bin = new Grupo(grupi, core);
             
              
                System.out.println("ingrese la edad : ");
                int edad=scanner.nextInt();
                    

                Contacto contI =new Contacto(nombre, alias, email, tel,bin,edad);
                System.out.println(contI);
            
                if (guardarContacto(contactos, contI)) {
                    System.out.println(" contacto agregado correctamente");
                    
                } else{
                    System.out.println(" el contacto ya esta agregado");
                }

                 break;
            case 2:
               for (Contacto conti : contactos) {
                System.out.println(conti.getNombre());
               }

            break;

            case 3: 
            for (Contacto contacte : contactos) {
                System.out.println(contacte);
            }
        
                break;

            case 4:
            edadMayores(contactos);
            break;

            default:
            break;
        }

        if (num==4) {
            break;
        }
        
    } while (true);

} 
public static  boolean  guardarContacto( ArrayList <Contacto> listaContactos, Contacto Prueba){
    for (Contacto contacti : listaContactos) {
        if (contacti.getNombre().equals(Prueba.getNombre())&& contacti.getTelefono().equals(Prueba.getTelefono())) {
            return false;
        }
    }
    listaContactos.add(Prueba);
    return true;
        
   
}

public static ArrayList <Contacto> edadMayores( ArrayList <Contacto>listaContactos){
    ArrayList <Contacto> listaMayoresEdad =new ArrayList<>();

    for (Contacto contacto : listaContactos) {
        if (contacto.getEdad()>=18) {
            listaMayoresEdad.add(contacto);
            
        }
    }
    System.out.println(listaMayoresEdad);
    return listaMayoresEdad;
}






}     

    
        
   
   


