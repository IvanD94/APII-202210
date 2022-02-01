package model;

public class Lista {

	private int[] objects;
	public static final int MAX_CAPACITY = 10;

	public Lista() {
		objects = new int[MAX_CAPACITY];
		for (int i = 0; i < MAX_CAPACITY; i++) {
			objects[i] = -1;
		}
	}

	public void addElementPreventivo(int element) throws ListaLlenaException {
		int idx = 0;
		while (idx < MAX_CAPACITY && objects[idx] != -1) {
			idx++;
		}
		if (idx >= MAX_CAPACITY) {
			throw new ListaLlenaException(element);
		}
		objects[idx] = element;
	}

	public void addElement(int element) throws ListaLlenaException {
		try {
			int idx = 0;
			while (idx < MAX_CAPACITY && objects[idx] != -1) {
				idx++;
			}
			objects[idx] = element;
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ListaLlenaException(element, e);
		}
	}

	public boolean searchElement(int element) {
		boolean found = false;
		if (element != -1) {
			for (int i = 0; i < MAX_CAPACITY && !found; i++) {
				if (objects[i] == element) {
					found = true;
				}
			}
		}
		return found;
	}
	
	public int countElements() {
		int count = 0;
		for (int i = 0; i < MAX_CAPACITY; i++) {
			if (objects[i] != -1) {
				count++;
			}
		}
		return count;
	}

	public int[] getElements() {
		return objects;
	}

}
