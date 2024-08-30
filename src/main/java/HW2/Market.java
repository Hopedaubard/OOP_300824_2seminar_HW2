package HW2;

import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private List<Actor> queue;
    @Override
    public void acceptToMarket(Actor actor) {

//актор пришел в магазин
        // добавить актора в очередь
        //вызов метода для добавления в очередь
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
//удаляем посетителей из списка в переменной (из магазина)
    }

    @Override
    public void update() {
//тейк ордерс
        //гив ордерс
        // выйти из очереди
    }

    @Override
    public void takeInQueue(Actor actor) {
//добавить посетителя в очередь
    }

    @Override
    public void takeOrders() {
//пройти по всему списку очереди
        //проверять методом измайкодрер тех, кто заказ не сделал
        //проставлять флаг с помолью метода гет ордерс
    }

    @Override
    public void giveOrders() {
//пробегаемся по всему списку нашших заказчиков
        //проверяем тех у кого флак измейкордерс ТРУ
        // Ставим изтейкордер ТРУ
    }

    @Override
    public void releaseFromQueue() {
//составить список акторов, которые готовы выходить из магазина
    }
}
