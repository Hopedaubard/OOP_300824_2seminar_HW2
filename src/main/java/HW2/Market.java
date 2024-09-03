package HW2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Actor> queue;
    private List<Actor> releaseQueue;

    public Market() {
        this.queue = new ArrayList<>();
    }
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        //добавить актора в очередь вызовом метода для добавления в очередь
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor:actorList) {
            queue.remove(actor);
            System.out.println(actor.getName() + " покинул магазин.");
        }
        //удаляем посетителей из списка в переменной (из магазина)
    }

    @Override
    public void update() {
        //тейк ордерс
        takeOrders();
        //гив ордерс
        giveOrders();
        //выйти из очереди
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        //добавить посетителя в очередь
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor:queue) {
            if (!actor.isTakeOrder){
                actor.setTakeOrder(true);
                System.out.println("Заказ " + actor.getName() + " принят!");
            }
        }
        //пройти по всему списку очереди
        //проверять методом измайкодрер тех, кто заказ не сделал
        //проставлять флаг с помощью метода сет ордерс
    }

    @Override
    public void giveOrders() {
        for (Actor actor:queue) {
            if (!actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println("Заказ " + actor.getName() + " исполнен! Клиент получил свой заказ.");
            }
        }
        //пробегаемся по всему списку наших заказчиков
        //проверяем тех у кого флак измейкордерс ТРУ
        // Ставим изтейкордер ТРУ
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseQueue = new ArrayList<>();
        for (Actor actor:queue) {
            if (actor.isTakeOrder()){
                releaseQueue.add(actor);
                System.out.println(actor.getName() + " покинул очередь.");
            }
        }
        releaseFromMarket(releaseQueue);
        //составить список акторов, которые готовы выходить из магазина
    }
}
