package geometriksifreleme;

public class GeometrikSifreleme {

    public static void main(String[] args) {
        String text = "gaziuniv";
        String yeni = "";

        for (int i = 0; i < text.length() / 2; i += 1) {

            System.out.print(text.charAt(i));
            System.out.println(text.charAt((text.length() / 2) + i));

        }

    }

}
