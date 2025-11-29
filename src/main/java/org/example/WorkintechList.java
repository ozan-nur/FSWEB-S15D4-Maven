package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<E> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        if (!this.contains(e)) {
            return super.add(e);
        }
        return false; // Tekrarlı eleman eklenmez
    }

    /**
     * Listede bulunan tüm değerleri sıralar
     */
    public void sort() {
        if (this.isEmpty()) return;

        // Numeric veya String sıralaması
        if (this.get(0) instanceof Comparable) {
            Collections.sort((ArrayList) this);
        }
    }

    /**
     * Verilen objeyi listeden siler ve listeyi sıralar
     */
    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        sort();
        return removed;
    }
}
