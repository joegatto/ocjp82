package br.com.gatto.chapter8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamExample {
	public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
		List<Animal> animals = new ArrayList<Animal>();

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(dataFile))) {
			while (true) {
				Object object = in.readObject();
				if (object instanceof Animal)
					animals.add((Animal) object);
			}
		} catch (EOFException e) {
		}
		return animals;
	}

	public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dataFile))) {
			for (Animal animal : animals) {
				out.writeObject(animal);
			}
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Tommy Tiger", 5, 'T'));
		animals.add(new Animal("Peter Penguin", 8, 'P'));
		File dataFile = new File("animal.data");
		createAnimalsFile(animals, dataFile);
		System.out.println(getAnimals(dataFile));
	}
}
