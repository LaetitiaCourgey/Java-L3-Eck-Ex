
public class EE34 {
    public static void main (String[] args) {

        char[] line;
        char[] word;

        int i,i2=0;

        line = TextIO.getline();

        for(i=0;line[i]!='\n';i++){

        if(Character.isLetter(line[i])){

             word[i2]=line[i];

             i2++;

       }

       else{

            if((line[i]=='\'')&&(Character.isLetter(line[i+1]))){

                word[i2]=line[i];

                i2++;

           }

           else{

                 word[i2]='\n';

                 System.out.println(word());

                 i2=0;

           }

       } 

   }
}
}
