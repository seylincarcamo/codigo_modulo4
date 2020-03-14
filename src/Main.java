public class Main {

    public static void main(String [] args) {
        System.out.println("\n\n");
        //PARTE 1
        //Creacion de casting y seteo de Datos
        Ciudadano ciudadano1 = new Ciudadano();
        ciudadano1.setNombre("Jennifer");
        ciudadano1.setEdad(28);
        ciudadano1.setAnios_exp(5);

        //Impresion por consola de Datos utilizando GETs        
        System.out.println("################   PARTE 1  ################ ");

        System.out.println("Regsitro Ciudadano");
        System.out.println("---------------------------");
        System.out.println("Nombre: " + ciudadano1.getNombre());
        System.out.println("Edad: " + ciudadano1.getEdad());
        System.out.println("Años de Experiencia: " + ciudadano1.getAnios_exp());
        
        System.out.println("\n\n");
        
        //PARTE 2   
        //Creacion de casting y seteo de Datos     
        PaisHonduras paisHonduras = new PaisHonduras();
        PaisEl_Salvador paisElSalvador = new PaisEl_Salvador();
        PaisCostaRica paisCostaRica = new PaisCostaRica();
        
        //Impresion por consola de Datos utilizando GETs        
        System.out.println("################   PARTE 2  ################ ");

        System.out.println("Pais: " + paisHonduras.getPais() + " - Presidente: " + paisHonduras.getPresidente());
        System.out.println("Pais: " + paisElSalvador.getPais() + " - Presidente: " + paisElSalvador.getPresidente());
        System.out.println("Pais: " + paisCostaRica.getPais() + " - Presidente: " + paisCostaRica.getPresidente());
    
        System.out.println("\n\n");
    
    }
}