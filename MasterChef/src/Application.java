
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Колко тигана има в кухнята?" ); //Функционалност 1
        int fryingPanCount = scanner.nextInt();

        System.out.println("Колко тенджери има в кухнята?" );
        int saucepanCount = scanner.nextInt();

        System.out.println("Колко сантиметра е широка кухнята?" );
        double kitchenWidth = scanner.nextDouble();

        System.out.println("Колко сантиметра е дълга кухнята?" );
        double kitchenLength = scanner.nextDouble();

        System.out.println("Колко сантиметра е висока кухнята?" );
        double kitchenHeight = scanner.nextDouble();

        System.out.println("Как се казва главният готвач?");
        String chefName = scanner.next();

        System.out.println("Колко готвачи работят в кухнята?");
        int numberOfChefs = scanner.nextInt();

        System.out.println("Колко сервитьори работят в ресторанта?");
        int numberOfWaiters = scanner.nextInt();

        System.out.println("Как се казва отговорника на сосовете ?");
        String sauceMaster = scanner.next();

        System.out.println("Каква е минималната температура в кухнята?");
        int kitchenMinTemperature = scanner.nextInt();

        System.out.println("Каква е максималната температура в кухнята?");
        int kitchenMaxTemperature = scanner.nextInt();

        System.out.println("Колко парички имате в банковата си сметка?");
        double amountOfMoneyInTheBankAccount = scanner.nextDouble();

        System.out.println("Колко парички е дневният оборот на ресторанта ви?");
        int dailyProfit = scanner.nextInt();

        System.out.println("В колко часа отваряте?");
        int openTime = scanner.nextInt();

        System.out.println("В колко часа затваряте?");
        int closeTime = scanner.nextInt();

        System.out.println("Желаете ли да отговаряте на опционални въпроси? (Y/N)");
        String optionalYesNoQuestions = scanner.next();

        switch (optionalYesNoQuestions) {
            case "Y":                                               // Ако отговорът е "да" питаме
                System.out.println("Разполагате ли с хладилник?");
                String additionalQuestionFridge = scanner.next();
                System.out.println("Разполагате ли с газов котлон?");
                String additionalQuestionGasStove = scanner.next();
                System.out.println("Разполагате ли с конвектомат?");
                String additionalQuestionCombiOven = scanner.next();
                System.out.println("Разполагате ли с електрическа скара?");
                String additionalQuestionElectricGrill = scanner.next();
                System.out.println("Разполагате ли с аспиратор?");
                String additionalQuestionAspirator = scanner.next();
                System.out.println("Всички въпроси са зададени.");
                     break;
            case "N":                                               //Ако "не"... итс дан
                System.out.println("Всички въпроси са зададени");
                break;

            default:
                System.out.println("Please answer with Y - for yes and N - for No");

        }
        System.out.println("Какво ще хапвате?");       // FUNCTIONALITY 2
        System.out.println(" 1) Месно ястие");
        System.out.println(" 2) Вегетарианско ястие");
        System.out.println(" 3) Десерт");

        int orderNumber = scanner.nextInt();
        String orderItem = (orderNumber == 1)
                ? "Месно ястие"
                : (orderNumber == 2)
                ? "Вегетарианско ястие"
                : (orderNumber == 3)
                ? "Десерт"
                : "опитайте отново";
        System.out.println(orderItem);

       switch (orderNumber) {
           case 1:                                                 // FUNCTIONALITY 2.1 MEAT MEAL
               System.out.println("Моля изберете порция(L/M/S)");
               System.out.println(" S - малка порция (450 грама)");
               System.out.println(" M - средна порция (750 грама)");
               System.out.println(" L -  голяма порция (950 грама)");
               String orderSize = scanner.next();
               String orderPortion = (orderSize.equals("S"))
                       ? "малка порция (450 грама)"
                       : (orderSize.equals("M"))
                       ? "средна порция (750 грама)"
                       : (orderSize.equals("L"))
                       ? "голяма порция (950 грама)"
                       : "опитайте отново";
               System.out.println(orderPortion);

               System.out.println("Изберете си начин на приготвяне");
               System.out.println("(1) RARE");
               System.out.println("(2) MEDIUM");
               System.out.println("(3) WELL DONE");

               int orderPreparationType = scanner.nextInt();
               String orderCookedType = (orderPreparationType == 1)
                       ? " RARE"
                       : (orderPreparationType == 2)
                       ? " MEDIUM"
                       : (orderPreparationType == 3)
                       ? " WELL DONE"
                       : "опитайте отново";
               System.out.println(orderCookedType);

               if(orderPreparationType == 1) {
                   System.out.println("Имате ли газов котлон?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionAboutGasStove = scanner.next();
                   String answerGasStove = (questionAboutGasStove.equals("Y"))
                           ? " YES"
                           : (questionAboutGasStove.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerGasStove);

                   System.out.println("В кухнята има ли електрическа скара?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionAboutElectricGrill = scanner.next();
                   String answerElectricGrill = (questionAboutElectricGrill.equals("Y"))
                           ? " YES"
                           : (questionAboutElectricGrill.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerElectricGrill);

                   System.out.println("В кухнята има ли аспиратор?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionAboutAspirator = scanner.next();
                   String answerAspirator = (questionAboutAspirator.equals("Y"))
                           ? " YES"
                           : (questionAboutAspirator.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerAspirator);

                   if (kitchenMinTemperature >= 36 && kitchenMinTemperature <= 47 && kitchenMaxTemperature > 37
                           && kitchenMaxTemperature < 48 && orderSize.equals("S")
                           && questionAboutGasStove.equals("N") && questionAboutElectricGrill.equals("Y")
                           && questionAboutAspirator.equals("Y")) {

                       System.out.println("Вашата поръчка е изпълнена успешно\n" +
                               "Благодаря ви, че хапнахте при нас");
                   } else
                       System.out.println("Ресторантът не може да изпълни вашата поръчка, започваме процедура по самоунищожение.\n" +
                               "Благодаря ви, че хапнахте при нас.");
               }

               if(orderPreparationType == 2){
                   System.out.println("Имате ли газов конвектомат?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionCombiOven = scanner.next();
                   String answerCombiOven = (questionCombiOven.equals("Y"))
                           ? " YES"
                           : (questionCombiOven.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerCombiOven);
                   if(questionCombiOven.equals("Y") || numberOfWaiters == 5
                   || orderSize.equals("M") || chefName.equals("Иван") ){
                       System.out.println("Вашата поръчка е изпълнена успешно\n" +
                               "Благодаря ви, че хапнахте при нас");
                   } else
                       System.out.println("Ресторантът не може да изпълни вашата поръчка, започваме процедура по самоунищожение.\n" +
                           "Благодаря ви, че хапнахте при нас.");
               }

               if(orderPreparationType == 3) {
                   if ((closeTime == 22  ||
                           sauceMaster.equals("Петър") || sauceMaster.equals("Радо"))
                   && (fryingPanCount == 3 && saucepanCount == 2)){
                       System.out.println("Вашата поръчка е изпълнена успешно\n" +
                               "Благодаря ви, че хапнахте при нас");

                   }
                   else
                       System.out.println("Ресторантът не може да изпълни вашата поръчка, започваме процедура по самоунищожение.\\n\" +\n" +
                               "\"Благодаря ви, че хапнахте при нас.");
               }

               break;
           case 2:                                                             // FUNCTIONALITY 2.2 MEAT FREE + FUNC 3
               System.out.println("Какъв вид вегетарианско ястие желаете?");
               System.out.println("1 - ВЕГЕТАРИАНСКО");
               System.out.println("2 - ВЕГАНСКО");
               System.out.println("3 - ПЕСКАТЕРИАНСКО");

               int orderNumberMeatFree = scanner.nextInt();
               String orderItemMeatFree = (orderNumberMeatFree == 1)
                       ? "ВЕГЕТАРИАНСКО"
                       : (orderNumberMeatFree == 2)
                       ? "ВЕГАНСКО ястие"
                       : (orderNumberMeatFree == 3)
                       ? "ПЕСКАТЕРИАНСКО"
                       : "опитайте отново";
               System.out.println(orderItemMeatFree);

               if(orderNumberMeatFree == 1){
                   System.out.println("Имате ли газов конвектомат?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionCombiOven = scanner.next();
                   String answerCombiOven = (questionCombiOven.equals("Y"))
                           ? " YES"
                           : (questionCombiOven.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerCombiOven);

                   System.out.println("В кухнята има ли електрическа скара?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionAboutElectricGrill = scanner.next();
                   String answerElectricGrill = (questionAboutElectricGrill.equals("Y"))
                           ? " YES"
                           : (questionAboutElectricGrill.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerElectricGrill);

                   System.out.println("В кухнята има ли аспиратор?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionAboutAspirator = scanner.next();
                   String answerAspirator = (questionAboutAspirator.equals("Y"))
                           ? " YES"
                           : (questionAboutAspirator.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerAspirator);

                   if(answerCombiOven.equals("N") || answerElectricGrill.equals("N")
                   || answerAspirator.equals("N") && optionalYesNoQuestions.equals("N")){

                       System.out.println("Вашата поръчка е изпълнена успешно\n" +
                               "Благодаря ви, че хапнахте при нас");

                   } else
                       System.out.println("Ресторантът не може да изпълни вашата поръчка, започваме процедура по самоунищожение.\n" +
                               "Благодаря ви, че хапнахте при нас.");
               }

               if(orderNumberMeatFree == 2) {
                   System.out.println("В кухнята има ли хладилник?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionAboutFridge = scanner.next();
                   String answerFridge = (questionAboutFridge.equals("Y"))
                           ? " YES"
                           : (questionAboutFridge.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerFridge);

                   if(questionAboutFridge.equals("Y") &&
                   chefName.equals("Манол") &&
                           numberOfChefs >= 3 && numberOfChefs < 11
                   && numberOfWaiters != 7){

                       System.out.println("Вашата поръчка е изпълнена успешно\n" +
                               "Благодаря ви, че хапнахте при нас");

                   } else
                       System.out.println("Ресторантът не може да изпълни вашата поръчка, започваме процедура по самоунищожение.\n" +
                               "Благодаря ви, че хапнахте при нас.");
               }
               if(orderNumberMeatFree == 3) {

                   System.out.println("В кухнята има ли скара?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionAboutElectricGrill = scanner.next();
                   String answerElectricGrill = (questionAboutElectricGrill.equals("Y"))
                           ? " YES"
                           : (questionAboutElectricGrill.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerElectricGrill);

                   if((optionalYesNoQuestions.equals("Y") ||
                           questionAboutElectricGrill.equals("Y"))
                   && (amountOfMoneyInTheBankAccount < 158_000 &&
                           dailyProfit < 158_000)){

                       System.out.println("Вашата поръчка е изпълнена успешно\n" +
                               "Благодаря ви, че хапнахте при нас");

                   }
                   else
                       System.out.println("Ресторантът не може да изпълни вашата поръчка, започваме процедура по самоунищожение.\n" +
                               "Благодаря ви, че хапнахте при нас.");

               }
               break;
           case 3:                                    // FUNCTIONALITY 2.3  Cake and Ice cream, delicious + FUNC 3
               System.out.println("За десерт какво ще хапвате?");
               System.out.println("1 - Торта");
               System.out.println("2 - Сладолед");
              int dessert = scanner.nextInt();
               String orderItemDessert = (dessert == 1)
                       ? "Торта"
                       : (dessert == 2)
                       ? "Сладолед"
                       : "опитайте отново";
               System.out.println(orderItemDessert);
               if(dessert == 1){
                   System.out.println("В кухнята има ли хладилник?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionAboutFridge = scanner.next();
                   String answerFridge = (questionAboutFridge.equals("Y"))
                           ? " YES"
                           : (questionAboutFridge.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerFridge);

                   System.out.println("В кухнята има ли аспиратор?");
                   System.out.println("Y - YES");
                   System.out.println("N - FOR NO");
                   String questionAboutAspirator = scanner.next();
                   String answerAspirator = (questionAboutAspirator.equals("Y"))
                           ? " YES"
                           : (questionAboutAspirator.equals("N"))
                           ? " No"
                           : "Try again";
                   System.out.println(answerAspirator);

                   if(( closeTime == 19 && answerFridge.equals("Y")
                           && answerAspirator.equals("N") &&
                           amountOfMoneyInTheBankAccount >= 15000
                   && amountOfMoneyInTheBankAccount <= 50000) ||
                           (chefName == "Румен")){

                       System.out.println("Вашата поръчка е изпълнена успешно\n" +
                               "Благодаря ви, че хапнахте при нас");

                   } else
                       System.out.println("Ресторантът не може да изпълни вашата поръчка, започваме процедура по самоунищожение\n" +
                               " Благодаря ви, че хапнахте при нас.");
               }

               if(dessert == 2){
                   System.out.println("Изберете си вкус на сладоледа?");
                   System.out.println("1 - ягода");
                   System.out.println("2 - банан");
                   System.out.println("3 - ванилия");
                   int flavourNumber = scanner.nextInt();
                   String flavour = (flavourNumber == 1 )
                           ? "ягода"
                           : (flavourNumber == 2)
                           ? "банан"
                           : (flavourNumber == 3)
                           ? "ванилия"
                           : "опитайте отново";
                   System.out.println(flavour);

                   System.out.println("Пристрастени ли сте към захарта?");
                   String Sugar = scanner.next();
                   if(Sugar == "No" || flavourNumber == 1){
                       System.out.println("Вашата поръчка е изпълнена успешно\n" +
                               "Благодаря ви, че хапнахте при нас");

                   } else{
                       System.out.println("Ресторантът не може да изпълни вашата поръчка, започваме процедура по самоунищожение\n" +
                               " Благодаря ви, че хапнахте при нас.");
                   }
               }
       }
    }
    }

