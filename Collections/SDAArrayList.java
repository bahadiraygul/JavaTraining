package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class SDAArrayList<E> extends ArrayList<E> {

    private static final int INITIAL_CAPACITY = 5;
    private E[] elementArray;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public SDAArrayList() {
        elementArray = (E[]) new Object[INITIAL_CAPACITY]; // Generik diziyi başlatma
    }

    // Add
    @Override
    public boolean add(E e) {
        if (size == elementArray.length) {
            increaseArraySize(); // Dizi dolduğunda kapasiteyi artır
        }
        elementArray[size++] = e; // Elemanı ekle ve boyutu artır
        return true; // Başarıyla eklendiğinde true dön
    }

    // Get
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds. Please provide a valid index");
        }
        return elementArray[index]; // İstenilen index'teki elemanı döndür
    }

    // Remove
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds. Please provide a valid index");
        }
        E removedElement = elementArray[index]; // Silinecek elemanı sakla
        for (int i = index; i < size - 1; i++) {
            elementArray[i] = elementArray[i + 1]; // Elemanları kaydır
        }
        size--; // Boyutu küçült
        // Decrease size fonksiyonunu performans kaygılarından dolayı devre dışı bırakıyorum
        return removedElement;
    }

    // Display
    public void display() {
        for (int i = 0; i < size; i++) { // Boyuta göre ekrana yazdır
            System.out.println(elementArray[i]);
        }
    }

    // Dizi kapasitesini artır
    private void increaseArraySize() {
        int newIncreasedCapacity = elementArray.length * 2;
        elementArray = Arrays.copyOf(elementArray, newIncreasedCapacity);
    }

    // Dizi kapasitesini küçültmek verimsiz olabilir
    private void decreaseArraySize() {
        // Bu fonksiyonu kullanmak performans açısından maliyetli olabilir.
    }
}
