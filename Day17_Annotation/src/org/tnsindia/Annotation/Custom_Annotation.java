package org.tnsindia.Annotation;


@interface CustomAnnotation{
	//We can only use string ,primitive data-type,array,classes
	String display();
	String show();
}

 class Retension_Annotation {
	@CustomAnnotation(display="Display Something",show="Show something");
}





public class Custom_Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
