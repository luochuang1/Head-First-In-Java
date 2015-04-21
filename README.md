# Head-First-In-Java
head-first 设计模式一书中的实例代码

第一章：策略模式

		mallarDuck.setFlyBehavior(new FlyWithWings());//策略模式
		
		mallarDuck.setQuackBehavior(new Quacked());
		
第二章：观察者模式

	@Override
	public void update(float temperature, float humidity, float pressure) {
	
		this.temperature = temperature;
		
		this.humidity = humidity;
		
		this.pressure = pressure;
		
		display();
		
	}
	

