public class  stirngbuilder {
    public static void main(String[] args) {
        //strings are immutable in java
        StringBuilder sb = new StringBuilder("thakur");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));
        //set char at index
        sb.setCharAt(0, 'p');

        System.out.println(sb);
        //insert char at any index
        sb.insert(2, 's');
        System.out.println(sb);
        // delet char or sub string
        sb.delete(2,3);
        System.out.println(sb);
        //append
        sb.append("e") ;// we can do :str=str+"e"; but their is new string is creat take more memory and space

        sb.append("l");
        System.out.println(sb);
        //to print lenght
        System.out.println(sb.length());
        //reverse a string
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
    System.out.println(sb);
    }
}
