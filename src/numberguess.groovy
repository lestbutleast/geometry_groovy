class numberguess {


    static void main(String[] args) {
        println("Welcome to Number Guesser! \n" + "Type START for a new game.")// verkürzen mit /X?
        // println("Type START for a new game.")
        String input
        int number_to_guess = new Random().nextInt(100 - 1)

        input = System.in.newReader().readLine()
        if (input.contains("START")){println("Ok, lets start! Start by suggesting numbers you think was found by our Randomizer!")}
        for(int penalties = 0; true; penalties++){
            def tmp = numberGuess(Integer.parseInt(System.in.newReader().readLine()), number_to_guess);
            if(tmp == 0) {
                break;
            } else {
                if(penalties == 2){
                    println("The real number was "+number_to_guess+ ". Too bad. GAME OVER!")
                    break;
                }
            }
        }
    }
    public static int numberGuess(int input, int number_to_guess) {
            if (input > number_to_guess) {
                println("Your number is too big! You've been penalized!")
                return 1;
            } else if (input < number_to_guess) {
                println("Your number is too small! You've been penalized!")
                return 1;
            } else if (input == number_to_guess) {
                println("Correct! You have found the number!")
                return 0;
            }
    }

}