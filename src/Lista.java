import java.util.Calendar;

public class Lista {
    private Object[] elementos = new Object[10];
    private int tamanho = 0;
    private boolean somenteLeitura;

    public void add(Object elemento){
        if(!somenteLeitura){

            if((tamanho + 1) > elementos.length){
                Object[] newElementos = new Object[elementos.length + 10];

                for(int i = 0; i < tamanho; i++){
                    newElementos[i] = elementos[i];
                    elementos = newElementos;
                }
                elementos[tamanho++] = elemento;
            }
        }
    }
}
