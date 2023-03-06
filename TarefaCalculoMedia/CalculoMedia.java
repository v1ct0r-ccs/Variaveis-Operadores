package TarefaCalculoMedia;

import java.util.function.Function;

public class CalculoMedia {
    public static void main (String args[]) {
        notaMedia();
    }

    /**
     * 
     */
    private static void notaMedia() {
        System.out.println("**** Nota Media ****");
        int trimestre1 = 5;
        int trimestre2 = 7;
        int trimestre3 = 9;
        int trimestre4 = 6;
        int notaFinal = (trimestre1 + trimestre2 + trimestre3 + trimestre4)/4;
        System.out.println("Media final: " + notaFinal);
        boolean isMedia = notaFinal >= 6;
        System.out.println("Aprovado: " + isMedia);
    }

}
