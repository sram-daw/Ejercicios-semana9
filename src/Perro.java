/**
 * Ejercicio semana 9: Programación
 *
 * @author Sara Ramilo
 * @version 21/11/2022
**/

public class Perro {
    //Ejercicio1
    public String pelo;
    public String color;
    public int chip;

    //Ejercicio 5
    private int peso;

    private int altura;

    /**
     * Getter
     * @return peso: peso del perro en kg
     **/
    public int getPeso() {
        return peso;
    }
    /**
     *Setter
     * @param peso
     **/
    public void setPeso(int peso) {
        this.peso = peso;
    }
    /**
     * Getter
     * @return altura: altura del perro en cm
     **/
    public int getAltura() {
        return altura;
    }
    /**
     *Setter
     * @param altura
     **/
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Getter
     * @return pelo: tipo de pelo (largo, corto)
     **/
    //Ejercicio 4
    public String getPelo() {
        return pelo;
    }
    /**
     *Setter
     * @param pelo
     **/
    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    /**
     * Getter
     * @return color: color del pelaje
     **/
    public String getColor() {
        return color;
    }
    /**
     *Setter
     * @param color
     **/
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Getter
     * @return chip: numero de chip
     **/
    public int getChip() {
        return chip;
    }
    /**
     *Setter
     * @param chip
     **/
    public void setChip(int chip) {
        this.chip = chip;
    }

    /**
     *Determina que tipo de ladrido tiene el perro en función de su peso y altura.
     * @param peso
     * @param altura
     * @return ladrido: tipo de ladrido.
     */
    //Ejercicio 6
    public static String ladrar(int peso, int altura) {
        String ladrido = "";

        if (peso <= 10 & altura <= 30) {
            ladrido = "agudo";
        }

        if (peso > 10 & peso <= 25 & altura > 30 & altura <= 60) {
            ladrido = "medio";
        }

        if (peso > 25 & altura > 60) {
            ladrido = "grave";
        }

        return ladrido;
    }

}
