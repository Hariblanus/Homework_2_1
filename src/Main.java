public class Main {
    public static void main(String[] args) {
        int ticketPrice = 69420; // Стоимость билета
        int rubPerMile = 20; // Количество рублей для начисления одной бонусной мили
        int totalMiles = ticketPrice / rubPerMile; // Общее количество начисленных бонусных миль
        System.out.println("За билет стоимостью " + ticketPrice + " рублей" + " вы получили " + totalMiles + " бонусных миль.");
    }
}