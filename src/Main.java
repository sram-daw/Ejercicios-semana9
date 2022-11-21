/**
 * Ejercicio semana 9: Programación
 *
 * @author Sara Ramilo
 * @version 21/11/2022
 **/
public class Main {
    public static void main(String[] args) {
//Ejercicio 2
        Perro perro_1 = new Perro();
        perro_1.pelo = "largo";
        perro_1.color = "gris";
        perro_1.chip = 35174;
/*Ejercicio 3: Al hacer los atributos private, el Main da un error avisando de que tienen
el acceso privado en la clase Perro, por lo que solo serían accesibles dentro de la propia clase o creando un setter.*/

//Ejercicio 4
        perro_1.setPelo("largo");
        perro_1.setColor("gris");
        perro_1.setChip(35174);
        System.out.println("El perro_1 tiene el pelo " + perro_1.getPelo() + ", de color " + perro_1.getColor() + " y su chip es " + perro_1.getChip());

//Ejercicio 7
        Perro perro_2 = new Perro();
        Perro perro_3 = new Perro();
        Perro perro_4 = new Perro();

        perro_2.setPelo("corto");
        perro_2.setColor("marrón");
        perro_2.setChip(48124);
        perro_2.setAltura(15);
        perro_2.setPeso(7);

        perro_3.setPelo("corto");
        perro_3.setColor("negro");
        perro_3.setChip(68264);
        perro_3.setAltura(40);
        perro_3.setPeso(25);

        perro_4.setPelo("largo");
        perro_4.setColor("blanco");
        perro_4.setChip(93802);
        perro_4.setAltura(65);
        perro_4.setPeso(38);

        Perro[] arrayPerros = new Perro[3];
        arrayPerros[0] = perro_2;
        arrayPerros[1] = perro_3;
        arrayPerros[2] = perro_4;

        //Ejercicio 8
        for (int i = 0; i < arrayPerros.length; i++) {
            System.out.println("El ladrido del perro en la " + i + " posición es " + Perro.ladrar(arrayPerros[i].getPeso(), arrayPerros[i].getAltura()));

        }


    }
}