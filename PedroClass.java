public class PedroClass {
    public static void main(String[] args){

        float pedro = 1.5f;
        float lucas = 1.1f;
        float mesPedro = 0.16f;
        float mesLucas = 0.25f;
        float count = 0f;

        //usamos += para fazer uma adição com ele mesmo e outro valor
        do{
            pedro += mesPedro;
            lucas += mesLucas;
            count++;

        } while (lucas < pedro);

        float anos = count / 12.0f;
        System.out.println("Levou " + anos + " anos para que a altura dos dois se igualasem");
        System.out.println("Levou " + ((count+1)/12.0f) + " anos para que Lucas fosse maior quue Pedro");

    }
}
