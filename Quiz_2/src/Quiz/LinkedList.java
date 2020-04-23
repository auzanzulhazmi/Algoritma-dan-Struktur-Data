package Quiz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG STRIX
 */
public class LinkedList {
    Years2018 head18;
    Years2019 head19;
    Years2020 head20;
    int size;

    public LinkedList() {
        head18 = null;
        head19 = null;
        head20 = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head18 == null && head19 == null && head20 == null;
    }

    public void addFirst(int item1, int item2, int item3) {
        head18 = new Years2018(item1, head18);
        head19 = new Years2019(item2, head19);
        head20 = new Years2020(item3, head20);
        size++;
    }

    public void add(int OneItem, int TwoItem, int ThreeItem, int bln) throws Exception {
        int month = bln - 1;
        if (month < 0 || month > size) {
            throw new Exception("Nilai Index di Luar Batas!");
        }
        if (isEmpty() || month == 0) {
            addFirst(OneItem, TwoItem, ThreeItem);
        } else {
            Years2018 tmp1 = head18;
            Years2019 tmp2 = head19;
            Years2020 tmp3 = head20;
            for (int i = 1; i < month; i++) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
            }
            Years2018 next1 = (tmp1 == null) ? null : tmp1.next;
            Years2019 next2 = (tmp2 == null) ? null : tmp2.next;
            Years2020 next3 = (tmp3 == null) ? null : tmp3.next;
            tmp1.next = new Years2018(OneItem, next1);
            tmp2.next = new Years2019(TwoItem, next2);
            tmp3.next = new Years2020(ThreeItem, next3);
            size++;
        }
    }

    public void addLast(int item1, int item2, int item3) {
        if (isEmpty()) {
            addFirst(item1, item2, item3);
        } else {
            Years2018 tmp1 = head18;
            Years2019 tmp2 = head19;
            Years2020 tmp3 = head20;
            while (tmp1.next != null) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
            }
            tmp1.next = new Years2018(item1, null);
            tmp2.next = new Years2019(item2, null);
            tmp3.next = new Years2020(item3, null);
            size++;
        }
    }

    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List 'Empty'!");
        }
        System.out.println("Pada Bulan ke- 2018\t2019\t2020");
        System.out.println("1" + "\t" + head18.data + " " + head19.data + " " + head20.data);
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List 'Empty'!");
        }
        Years2018 tmp1 = head18;
        Years2019 tmp2 = head19;
        Years2020 tmp3 = head20;
        int bulan = 1;
        while (tmp1.next != null) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
            tmp3 = tmp3.next;
            bulan++;
        }
        System.out.println("Bulan ke- 2018\t2019\t2020");
        System.out.println(bulan + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
    }

    public void get(int bln) throws Exception {
        int month = bln - 1;
        if (isEmpty() || month >= size) {
            throw new Exception("Tidak ada pada bulan tersebut!!");
        }
        Years2018 tmp1 = head18;
        Years2019 tmp2 = head19;
        Years2020 tmp3 = head20;
        for (int i = 0; i < month; i++) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
            tmp3 = tmp3.next;
        }
        System.out.println("Bulan ke- 2018\t2019\t2020");
        System.out.println(bln + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
    }

    public void clear() {
        head18 = null;
        head19 = null;
        head20 = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Years2018 tmp1 = head18;
            Years2019 tmp2 = head19;
            Years2020 tmp3 = head20;
            int bulan = 1;
            System.out.println("Bulan ke- 2018\t2019\t2020");
            while (tmp1 != null) {
                System.out.println(bulan + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
                bulan++;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Empty!");
        }
    }
}
