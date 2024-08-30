import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

    int[] meuArray = new int[5];

    meuArray[0] = 10;
    meuArray[1] = 20;
    meuArray[2] = 30;
    meuArray[3] = 40;
    meuArray[4] = 50;
    
    int element0 = meuArray[0];
    int element1 = meuArray[1];

    System.out.println(element0);
    System.out.println(element1);

    for (int i = 0; i < meuArray.length; i++){
        System.out.println("Elemento " + i +": " + meuArray[i]);
    }

    String[] listaAluno = new String[6];
    listaAluno[0] = "Wellington";
    listaAluno[1] = "Melissa";
    listaAluno[2] = "Ramon";
    listaAluno[3] = "Eddie";
    listaAluno[4] = "Higor";
    listaAluno[5] = "Davi";


    String[] listaCidades = {"Poá","Itaim","Suzano","Itú"};
    System.out.println(listaCidades[2]);

    for (int i = 0; i<listaCidades.length;i++){
        System.out.println("Elemento "+i+": "+listaCidades[i]);

    }

    int[] array = {10,20,30,40,50};
    System.out.println(Arrays.toString(array));
    System.out.println(Arrays.toString(listaCidades));

    System.out.println("O tamanho é: "+array.length);
    System.out.println("O tamanho é: "+listaCidades.length);

    int[] copia = array.clone();
    String[] copiaCidades = listaCidades;

    System.out.println(Arrays.toString(copia));
    System.out.println(Arrays.toString(copiaCidades));

    String[] copiaS1 = Arrays.copyOf(listaCidades, 2);
    System.out.println("Cópia s1= " + Arrays.toString(copiaS1));

    int[] arrayVazio = new int[5];
    System.out.println(": "+Arrays.toString(arrayVazio));
    Arrays.fill(arrayVazio, 10);
    System.out.println(": "+ Arrays.toString(arrayVazio));

    boolean resp = Arrays.equals(listaCidades, copiaCidades);
    System.out.println("São iguais "+resp);
    
    if(Arrays.equals(listaCidades, copiaCidades)){
        System.out.println("Elas são iguais");
    }else{
        System.out.println("Elas são diferentes.");
    }

    int posicao = Arrays.binarySearch(listaCidades,"Itu");
    System.out.println("Foi localizado em:" + posicao);
}
}
