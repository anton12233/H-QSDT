package anti_aa;

//"Надо реализовать метод, который принимает на вход String, удаляет рядом стоящие парные буквы и возвращает остаток. Примеры ожидаемого поведения программы:
//        ""aab"" -> ""b"", ""aabb"" -> """", ""abfbaf"" -> ""abfbaf”, ""abccbaf"" -> ""f""
//Количество баллов за реализацию зависит от вычислительной сложности алгоритма: O(n^2) = 2 балла, O(n) = 10 баллов, O(log(n)) = 20 баллов.
//В решении укажите вычислительную сложность вашего алгоритма. Напишите junit-тесты."

public class Main {
    public static void main(String[] args) {

        String delString = "1qdfvrrvfdvrrvf";

        System.out.println(delAA(delString));
    }

    static String delAA(String toDel){

        for(int i = 1; i < toDel.length() - 1; i++)
        {
            if(toDel.charAt(i)==toDel.charAt(i+1)){
                toDel = toDel.substring(0,i)+toDel.substring(i+2);
                i = i - 2;
            }
        }
        return toDel;
    }
}
