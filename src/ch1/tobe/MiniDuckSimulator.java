package ch1.tobe;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        // 실행 중 오리의 행동을 바꾸고 싶다면 원하는 행동에 해당하는 Duck의 세터 메서드를 호출
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
