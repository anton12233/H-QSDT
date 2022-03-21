package anti_aa;

//"Надо реализовать метод, который принимает на вход String, удаляет рядом стоящие парные буквы и возвращает остаток. Примеры ожидаемого поведения программы:
//        ""aab"" -> ""b"", ""aabb"" -> """", ""abfbaf"" -> ""abfbaf”, ""abccbaf"" -> ""f""
//Количество баллов за реализацию зависит от вычислительной сложности алгоритма: O(n^2) = 2 балла, O(n) = 10 баллов, O(log(n)) = 20 баллов.
//В решении укажите вычислительную сложность вашего алгоритма. Напишите junit-тесты."


//использовать стек

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String delString = "1aaabbff11a";
        String delString_1 = "aabb";

        //System.out.println(delAA(delString));

        System.out.println(delAAStack(delString_1));
        System.out.println(delAAStack_new(delString_1));

    }

    static String delAA(String toDel){

        for(int i = 0; i < toDel.length() - 1; i++)
        {
            if(toDel.charAt(i)==toDel.charAt(i+1)){
                toDel = namnam(toDel, i);
                i = toDel.length();
            }

        }
        return toDel;
    }

    static String namnam(String toDel, int i){

        toDel = toDel.substring(0,i)+toDel.substring(i+2);

        if(toDel.length()>1) {
            if ((toDel.charAt(0) == toDel.charAt(1)) && (toDel.length() == 2))
                return "";
        }else{
            return toDel;
        }

        i--;

        if(toDel.charAt(i)==toDel.charAt(i+1)){
            toDel = namnam(toDel, i);
        }

        for(; i < toDel.length() - 1; i++)
        {
            if(toDel.charAt(i)==toDel.charAt(i+1)){
                toDel = namnam(toDel, i);
            }
        }
        return toDel;
    }

    static String delAAStack(String delAA){

        Stack<Character> toDel = new Stack<>();
        Stack<Character> toOut = new Stack<>();

        for (int i = 0; i<delAA.length(); i++){
            toDel.push(delAA.charAt(i));
        }

        toOut.push(toDel.pop());

        while (!toDel.isEmpty()){

            if(toDel.peek()==toOut.peek()){
                toDel.pop();
                toOut.pop();
            }else{
                toOut.push(toDel.pop());
            }
            if(toOut.isEmpty()&&!toDel.isEmpty()) {
                toOut.push(toDel.pop());
            }
        }
        return toOut.toString();
    }

    static String delAAStack_new(String delAA){

        Stack<Character> toOut = new Stack<>();

        toOut.push(delAA.charAt(0));
        for (int i = 1; i<delAA.length(); i++){

            if(toOut.peek()==delAA.charAt(i)){
                toOut.pop();
            }else{
                toOut.push(delAA.charAt(i));
            }
            if(toOut.isEmpty()&&(i+1<delAA.length())) {
                toOut.push(delAA.charAt(i+1));
            }

        }


        return toOut.toString();
    }


}
