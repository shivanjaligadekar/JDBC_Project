package example.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import desserts.IceCream;
import desserts.brownies.WalnutBrownie;
import juices.OrangeJuice;
import milkshakes.MangoMilkShake;

public class PureAnnotationBasedConfigurationExampleMain {

	public static void main(String[] args) {
		Class<SpringConfig3> configClass=SpringConfig3.class;
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(configClass);
		
		Class<MyComponent> componentType=MyComponent.class;
		MyComponent myCompRef=context.getBean(componentType);
		myCompRef.testMyComponent();
		
		Class<OrangeJuice> juiceComp=OrangeJuice.class;
		OrangeJuice juiceRef=context.getBean(juiceComp);
		juiceRef.testOrangeJuice();
		
		Class<MangoMilkShake> shakeComp=MangoMilkShake.class;
		MangoMilkShake shakeRef=context.getBean(shakeComp);
		shakeRef.testMangoMilkShake();
		
		Class<IceCream> creamComp=IceCream.class;
		IceCream creamRef=context.getBean(creamComp);
		creamRef.testIceCream();
		
		Class<WalnutBrownie> brownieComp=WalnutBrownie.class;
		WalnutBrownie brownieRef=context.getBean(brownieComp);
		brownieRef.testWalnutBrownie();
	}

}
