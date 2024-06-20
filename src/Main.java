public class Main {
    public static void main(String[] args) {
//Задание №1
        System.out.println(" ");
        System.out.println("Задание №1");
        var dog= 8.0;
        var cat= 3.6;
        var paper= 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задание №2
        System.out.println(" ");
        System.out.println("Задание №2");
        dog= dog + 4;
        System.out.println(dog);
        cat= cat + 4;
        System.out.println(cat);
        paper= paper + 4;
        System.out.println(paper);
//Задание №3
        System.out.println(" ");
        System.out.println("Задание №3");
        dog= dog + 3.5;
        cat= cat - 1.6;
        paper= paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задание №4
        System.out.println(" ");
        System.out.println("Задание №4");
        var friend= 19;
        System.out.println(friend);
        friend= friend + 2;
        System.out.println(friend);
        friend= friend / 7;
        System.out.println(friend);
//Задание №5
        System.out.println(" ");
        System.out.println("Задание №5");
        var frog = 3.5;
        System.out.println(frog);
        frog= frog * 10;
        System.out.println(frog);
        frog= frog / 3.5;
        System.out.println(frog);
        frog= frog + 4;
        System.out.println(frog);
//Задание №6
        System.out.println(" ");
        System.out.println("Задание №6");
        var boxerWeight1= 78.2;
        var boxerWeight2= 82.7;
        var totalWeight= boxerWeight1 + boxerWeight2;
        var differenceWeight= boxerWeight2 - boxerWeight1;
        System.out.println(totalWeight);
        System.out.println(differenceWeight);
//Задание №7
        System.out.println(" ");
        System.out.println("Задание №7");
        var remainderWeight= boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе боксеров " + remainderWeight + " кг");
//Задание №8
        System.out.println(" ");
        System.out.println("Задание №8 часть 1");
        var totalHourCompany1= 640;
        var workerHour= 8;
        var totalWorker= totalHourCompany1 / workerHour; //80 человек
        System.out.println("Всего работников в компании " + totalWorker + " человек");

        System.out.println(" ");
        System.out.println("Задание №8 часть 2");
        totalWorker= totalWorker + 94;
        var totalHourCompany2= totalWorker * 8;
        System.out.println("Если в компании работает " + totalWorker + " человек, то всего " + totalHourCompany2 + " часов работы может быть поделено между сотрудниками" );


    }
}