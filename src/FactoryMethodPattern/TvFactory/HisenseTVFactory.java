package FactoryMethodPattern.TvFactory;

public class HisenseTVFactory implements TVFactory {
    @Override
    public TV produce() {
        System.out.println("海信电视机工厂生产海信电视机。");
        TV tv = new HisenseTV();
        return tv;
    }
}
