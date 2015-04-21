//策略模式定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化。
public class DuckTest {
	public static void main(String[] args) {
		Duck mallarDuck = new MallardDuck();
		mallarDuck.setFlyBehavior(new FlyWithWings());//策略模式
		mallarDuck.setQuackBehavior(new Quacked());
		mallarDuck.performFly();
		mallarDuck.performQuack();
		mallarDuck.display();
	}
}
