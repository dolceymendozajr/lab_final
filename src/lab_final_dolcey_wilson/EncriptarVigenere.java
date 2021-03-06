package lab_final_dolcey_wilson;

public class EncriptarVigenere {

    public static char dicc[] = new char[32]; // ALFABETO ESPAÑOL (Ñ)
    public static char pal1[] = new char[100];
    public static char pal2[] = new char[100];
    public static char clave[] = new char[100];

    static void GenerarVect(String texto, String pass) {
        // BLOQUE 1: GENERAR EL ALFABETO ESPAÑOL :)
        int letra = (int) 'a';
        for (int i = 0; i < 27; i++) {
            if (i < 14)
                dicc[i] = (char) (letra);
            else if (i == 14)
                dicc[i] = 'ñ';
            else if (i > 14)
                dicc[i] = (char) (letra - 1);
            letra++;
        }
        
        // AGREGAR LAS VOCALES CON TILDE :)
        dicc[27] = 'á'; 
        dicc[28] = 'é';
        dicc[29] = 'í';
        dicc[30] = 'ó';
        dicc[31] = 'ú';
        
        // BLOQUE 2: GENERAR LOS VECTORES CON LA PALABRA Y LA CLAVE :)
        int pos = 0, j;
        for (j = 0; j < pass.length(); j++) // TOMA CADA CARÀCTER DE LA CLAVE Y LA LLEVA A UN VECTOR
            clave[j] = pass.charAt(j);
        int pos_fin = j;

        for (int i = 0; i < texto.length(); i++) {
            char temp = texto.charAt(i);
            if (pos == pos_fin)
                pos = 0;
            
            pal1[i] = temp;
            pal2[i] = clave[pos];
            pos++;
        }
    }

    static String Encript(String texto, String pass) {
        GenerarVect(texto, pass);
        String encriptado = "";
        int sum = 0;
        int xi = 0, ci = 0;

        for (int i = 0; i < texto.length(); i++) {
            int j = 0;
            boolean sw = true;

            do { // BUSCAR VALOR DE Xi               
                if (Character.toString(dicc[j]).equalsIgnoreCase(Character.toString(pal1[i]))) {
                    sw = false;
                    xi = j;
                } else
                    j++;
            } while (sw == true && j < 32);

            j = 0;
            sw = true;
            do {
                if (Character.toString(dicc[j]).equalsIgnoreCase(Character.toString(pal2[i]))) {
                    sw = false;
                    ci = j;
                } else
                    j++;
            } while (sw == true && j < 32);

            int pos_encript = (xi + ci) % 32;

            encriptado = encriptado + dicc[pos_encript];
        }

        return encriptado;
    }

    static String Desencript(String texto, String pass) {
        String desencriptado = "";
        GenerarVect(texto, pass);

        int xi = 0, ci = 0;

        for (int i = 0; i < texto.length(); i++) {
            int j = 0;
            boolean sw = true;

            do { // BUSCAR Ci ->  CLAVE               
                if (Character.toString(dicc[j]).equalsIgnoreCase(Character.toString(pal2[i]))) {
                    ci = j;
                    sw = false;
                } else
                    j++;
            } while (sw && j < 27);

            j = 0;
            sw = true;
            do { // BUSCAR Xi ->  FRASE
                if (Character.toString(dicc[j]).equalsIgnoreCase(Character.toString(pal1[i]))) {
                    xi = j;
                    sw = false;
                } else
                    j++;
            } while (sw && j < 27);

            if (xi - ci >= 0) {
                int a = (xi - ci) % 27;
                desencriptado = desencriptado + dicc[a];
            } else if (xi - ci < 0) {
                int b = (xi - ci + 27) % 27;
                desencriptado = desencriptado + dicc[b];
            }
        }

        return desencriptado;
    }
}
