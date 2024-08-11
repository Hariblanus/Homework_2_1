public class Main {
    public static void main(String[] args) {
        int TicketPrice = 69420; // Стоимость билета
        int RubPerMile = 20; // Количество рублей для начисления одной бонусной мили
        int TotalMiles = TicketPrice / RubPerMile; // Общее количество начисленных бонусных миль
        System.out.println("За билет стоимостью " + TicketPrice + " рублей" + " вы получили " + TotalMiles + " бонусных миль.");
    }
}