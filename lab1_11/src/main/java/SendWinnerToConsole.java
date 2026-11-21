public class SendWinnerToConsole implements ISendWinner {
    @Override
    public void send(Animal animal) {
        System.out.println("Отправили победителя: " + animal.getName());
    }
}
