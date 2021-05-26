package lesson3.revers;

public class Revers {

    public static void reversWords (String text){
        char[] ch = text.toCharArray();
        StringBuilder summaryLine = new StringBuilder();
        Stack stack =  new StackImpl(ch.length);
        for (int i = 0; i < ch.length; i ++){
            if (ch[i] != ' '){
                stack.push(ch[i]);
            }
            int stackLength = stack.size();
//            if (stack.isEmpty()) continue;
            if (ch[i] == ' ' || i == ch.length - 1) {

                for (int j = 0; j < stackLength; j ++){
                    summaryLine.append(stack.pop());
                }
                summaryLine.append(' ');
            }
        }
        System.out.println(summaryLine);
    }

    public static void main(String[] args) {
        Revers.reversWords("съешь ещё этих мягких французских булок, да выпей чаю");
    }
}
