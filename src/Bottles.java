public class Bottles {
    int numBottles = 99;

    public void drunk(){
        while (numBottles > 0){
            String outText = String.format("%d bottles of beer on the wall", this.numBottles);
            System.out.println(outText);
            this.numBottles--;
        }
    }

    public void word_list(){
        String[] myName = {"Daniel", "Eduardo", "Fernandez", "Perez"};
        String[] loveofMyLifeName = {"Alejandra", "Morales", "Gonzales"};
        String[] nameOfMyDog = {"Ambar", "Fernandez", "Perez"};

        int firts_list_length = myName.length;
        int second_list_length = loveofMyLifeName.length;
        int three_list_length = nameOfMyDog.length;

        int rand1 = (int) (Math.random() * firts_list_length);
        int rand2 = (int) (Math.random() * second_list_length);
        int rand3 = (int) (Math.random() * three_list_length);

        String phrase = myName[rand1] + " " + loveofMyLifeName[rand2] + " " + nameOfMyDog[rand3];

        System.out.println("first list length: "  + firts_list_length + "and first random number: " + rand1);
    }

    public void order_data(){
        int x = 3;

        while (x > 0){

            if (x > 2){
                System.out.print("a");
                System.out.print("-");
            }
            if (x == 2){
                System.out.print("b c");
                System.out.print("-");
            }
            if (x == 1){
                System.out.print("d");
            }
            x = x - 1;


        }
    }

}
