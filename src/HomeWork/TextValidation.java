package HomeWork;

public class TextValidation {
    private static boolean chekForLetter(String text){
        for (char c : text.toCharArray()){
            if (!Character.isLetter(c)){
                return false;
            }
        }
    return true;
    }

    private static boolean  checkFirstCharUpperCase(String text){
        return Character.isUpperCase(text.toCharArray()[0]);
    }
    private static boolean checkWordUpperCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 1; i < chars.length; i++){
            char aChar = chars[1];
            if (Character.isUpperCase(aChar)){
                return false;
            }
        }
        return true;
    }
    public static boolean checkFIO(String text){
        if (!chekForLetter(text) || text.isBlank()) {
            System.out.println("Возможно в тексте содежатся пробелы или цыфры");
            return false;
        }
        if (!checkFirstCharUpperCase(text)){
            System.out.println("С заглавной буквы пожалуйста");
            return false;
        }
        if (!checkWordUpperCase(text)) {
            System.out.println(" В слове больше чем одна заглавная буква");
            return false;
        }
        return true;
        }
    }

