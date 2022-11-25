//muitas vezes as sobrcargas de metodos é batizadade polimorfismo estatico, 
//sendo que estatico signifoca feito pelo compilador, ou em tempo de compilação
public class Calculadora{

    public int somar (int a, int b, int c){
        return a +b +c;
    }

    public int somar(int a, int b){
        return a +b; 
    }

    public float 
    somarFloats (float a, float b){
        return a + b;
    }

    public int somar(String s1, String s2){
        return Integer.parseInt(s1) +
        Integer.parseInt(s2);
    }

    public int somar (String s, int i){
        return Integer.parseInt(s) + i;
    }

    public int somar (int i, String s){
        return somar (i, Integer.parseInt(s), 0);
        //return (int) somar ((float)i, Float.parseFloat(s));
        //return somar (Integer.toString(i), s);
        //return somar( s, i);
    }

}