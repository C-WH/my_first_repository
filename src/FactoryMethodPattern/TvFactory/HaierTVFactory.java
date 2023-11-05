package FactoryMethodPattern.TvFactory;

public class HaierTVFactory implements TVFactory {
    @Override
    public TV produce() {
        System.out.println("海尔电视机工厂生产海尔电视机。");
        return new HaierTV();
    }
}
