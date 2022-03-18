package model;

import java.util.Comparator;

//Clase comparator no anonima
public class ContacComparator implements Comparator<Contact>{

	//Criterio personalizado
	@Override
	public int compare(Contact o1, Contact o2) {
		return o1.getAge() - o2.getAge();
	}

}
