public class Perro {
    //Ejercicio1
    public String pelo;
    public String color;
    public int chip;

    //Ejercicio 5
    private int peso;

    private int altura;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    //Ejercicio 4
    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

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
