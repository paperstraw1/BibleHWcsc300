package biblehw;

public class Bible {
	public static void main(String[] args) {
        System.out.println("It takes " + Training(13, 2) + " years to get everyone in the world to be a disciples.");
        peopleNeeded();
        NumberToTrain();
    }

    public static int Training(long expo, int disciples) {
        long totalPeople = 7700000000L;
        int yearCount = 0;

        do {
            long temp;
            temp = (expo * disciples) + expo;
            expo = temp;
            yearCount++;
        }
        while(expo < totalPeople);

        int totalYears1 = yearCount * 3;

          return totalYears1;
    }

    public static void peopleNeeded() {
        long num = 1;
        while(Training(num, 2) > 50) {
            num++;

        }
    }

    public static void NumberToTrain() {
        int num = 2;

        while (Training(13, num) > 50) {
            num++;
        }

        System.out.println("Each disciple needs to train " + num + " students at a time to train the world in 50 years.");

    }
}