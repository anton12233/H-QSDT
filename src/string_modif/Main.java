package string_modif;

//Напишите и протестируйте функцию, проверяющую, можно ли из одной строки получить вторую изменением только одного символа. Под модификацией (изменением) понимается - замена символа другим, вставка символа, удаление символа. Примеры работы функции:
//        canModify("cat", "dog") -> false
//        canModify("cat", "acts") -> false
//        canModify("cat", "cats") -> true
//        canModify("cat", "cast") -> true
//        canModify("cat", "at") -> true
//        canModify("cat", "cut") -> true



//Правило! - первое слово проверяемое, второе - на что проверяется.

//удаление - первая строка на один символ больше второй, посимвольное сравнение, при первом false адресс в второй строке не сдвигается, при втором false - выход
//замена - две строки одного размера, посимвольное сравнение, допускается один false
//вставка - первая строка на один символ меньше второй, посимвольное сравнение, при первом false адресс в первой строке не сдвигается, при втором false - выход

public class Main {
    public static void main(String[] args) {
        System.out.println(isModif_FuncManager("aaa ","aa  "));
    }

    public static boolean isModif_FuncManager(String a, String b){
        return switch (a.length() - b.length()) {
            case 1 -> isModif_True_Delete(a, b);
            case 0 -> isModif_True_Change(a, b);
            case -1 -> isModif_True_Insert(a, b);
            default -> false;
        };
    }

    public static boolean isModif_True_Delete(String a, String b){
        int i = 0; // i - a
        int j = 0; // j - b
        int count = 0;

        if(a.length() - b.length() == 1) {
            while (j != b.length()) {
                if (a.charAt(i) == b.charAt(j)) {
                    i++;
                    j++;
                } else {
                    i++;
                    count++;
                }
                if (count > 1)
                    return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isModif_True_Change(String a, String b){
        int i = 0;
        int count = 0;
        if (a.length() - b.length() == 0){
            while (i != a.length()){
                if (a.charAt(i)!=b.charAt(i))
                    count++;
                if (count > 1)
                    return false;
                i++;
            }
            return true;
            }
        return false;
    }

    public static boolean isModif_True_Insert(String a, String b){
        int i = 0; // i - a
        int j = 0; // j - b
        int count = 0;

        if (a.length() - b.length() == -1) {
            while (i != a.length()) {
                if (a.charAt(i) == b.charAt(j)) {
                    i++;
                    j++;
                } else {
                    j++;
                    count++;
                }
                if (count > 1)
                    return false;
            }
            return true;
        }
        return false;
    }
}
