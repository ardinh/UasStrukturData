/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasstrukturdata;

import java.util.*;

/**
 *
 * @author ardin
 */
public class UasStrukturData {

    /**
     * @param args the command line arguments
     */
    public static void firstTask() {
        int noSoal = 0;
        Scanner masukanSoal = new Scanner(System.in);
        String soal = "1. Stack\n" + "2. Queue\n";
        System.out.println(soal);
        System.out.print("Masukan Pilihan : ");
        noSoal = masukanSoal.nextInt();
        switch (noSoal) {
            case 1:
                ArrayStack stack = new ArrayStack(5);

                System.out.println("Is Stack empty => " + stack.isEmpty() + "\n");

                System.out.println("Adding Data to Stack");
                System.out.println("=============================================================================================================================================");
                stack.push(new Employee("Ardi Naufan", "Hadian", 1));
                stack.push(new Employee("Nando", "Nandi", 2));
                stack.push(new Employee("Ente", "Anna", 3));
                stack.push(new Employee("Dian", "Silva", 4));
                stack.push(new Employee("Alvin", "Salvina", 5));
                stack.printStack();
                System.out.println("Size of Stack => " + stack.size());
                System.out.println("=============================================================================================================================================");
                System.out.println("See First Data From Stack => " + stack.peek());
                System.out.println("Remove Data From Stack => " + stack.pop());

                System.out.println("=============================================================================================================================================");
                System.out.println("Last After All Remove");
                stack.printStack();
                System.out.println("=============================================================================================================================================");
                System.out.println("\n\n");
                break;
            case 2:
                Employee janeJones = new Employee("ardi", "naufan", 123);
                Employee johnDoe = new Employee("lala", "lili", 4567);
                Employee marySmith = new Employee("lulu", "lele", 22);
                Employee mikeWilson = new Employee("mama", "mia", 3245);
                Employee billEnd = new Employee("Bill", "gunawan", 78);

                Queue<Employee> queue = new PriorityQueue<Employee>();
                queue.add(janeJones);
                queue.add(johnDoe);
                queue.add(marySmith);
                queue.add(mikeWilson);
                queue.add(billEnd);
                System.out.println("First init Queue");
                for (Employee employee : queue) {
                    System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
                }
                System.out.println("\n");
                System.out.println("Head Of Queue");
                System.out.println(queue.element() + "--->> Using Element Method");
                System.out.println(queue.peek() + "--->> Using Peek Method");

                System.out.println("\n");
                System.out.println("Remove Head Of Queue");
                System.out.println(queue.remove(queue.element()));
                for (Employee employee : queue) {
                    System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
                }

                System.out.println("\n");
                System.out.println("Head Of Queue After Remove");
                System.out.println(queue.element() + "--->> Using Element Method");
                System.out.println(queue.peek() + "--->> Using Peek Method");

                System.out.println("\n");
                System.out.println("Add data to Queue via offer");
                System.out.println(queue.offer(marySmith));
                for (Employee employee : queue) {
                    System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
                }

                System.out.println("\n");
                System.out.println("Get all data Queue");
                Iterator<Employee> itr2 = queue.iterator();
                while (itr2.hasNext()) {
                    System.out.println(itr2.next());
                }

                System.out.println("\n\n");
                break;
            default:
                firstTask();
        }
    }

    public static int linearSearch(String arr[], String x) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i].equalsIgnoreCase(x)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(String arr[], String x) {

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void secondTask() {
        int noSoal = 0;
        String arr[] = {"ardi", "naufan", "hadian", "lidia", "gunawan"};
        Scanner masukanSoal = new Scanner(System.in);
        String soal = "1. Linear Search\n" + "2. Binary Search\n";
        System.out.println(soal);
        System.out.print("Masukan Pilihan : ");
        noSoal = masukanSoal.nextInt();

        switch (noSoal) {
            case 1:
                System.out.println(Arrays.toString(arr));
                System.out.print("pilih nama : ");
                Scanner s = new Scanner(System.in);
                String x = s.nextLine();

                // Function call
                int result = linearSearch(arr, x);
                if (result == -1) {
                    System.out.print(
                            "Nama Tidak Ditemukan!!");
                } else {
                    System.out.println("Nama Berada Pada Urutan array "
                            + result + "(atau Pada Urutan ke " + (result + 1) + ")");
                }
                System.out.println("\n\n");
                break;
            case 2:
                System.out.println(Arrays.toString(arr));
                System.out.print("pilih nama : ");
                Scanner bs = new Scanner(System.in);
                String bx = bs.nextLine();

                // Function call
                Arrays.sort(arr);
                int bresult = binarySearch(arr, bx);
                if (bresult == -1) {
                    System.out.print(
                            "Nama Tidak Ditemukan!!");
                } else {
                    System.out.println("Nama Berada Pada Urutan array "
                            + bresult + "(atau Pada Urutan ke " + (bresult + 1) + ")");
                }
                System.out.println("\n\n");
                break;
            default:
                secondTask();
        }
    }

    public static void thirdTask() {
        Tree intTree = new Tree();

        intTree.insert(30);
        intTree.insert(23);
        intTree.insert(19);
        intTree.insert(24);
        intTree.insert(44);
        intTree.insert(87);
        intTree.insert(54);
        intTree.insert(41);
        intTree.insert(52);
        intTree.insert(7);
        intTree.insert(3);
        intTree.insert(8);

        intTree.traverseInOrder();
        System.out.println("\nSize of Binary Tree => "+ intTree.size());

        System.out.println(intTree.get(24));
        System.out.println(intTree.get(52));

        System.out.println("Max Data Of Binary Tree => " + intTree.max());
        System.out.println("Min Data Of Binary Tree => " + intTree.min());
        System.out.println("\n\n");
    }

    public static void soal() {
        int noSoal = 0;
        Scanner masukanSoal = new Scanner(System.in);
        String soal = "1.	Buat contoh implementasi stack dan queue pada coding program (lakukan show, insert, deletion pada stack dan queue) ?\n"
                + "2.	Buat search program untuk array of string menggunakan (urutan ganjil iterative, urutan genap recursive function) untuk melakukan search pada array of string menggunakan linier search dan binary search\n"
                + "3.	Buat contoh coding binary tree lakukan insert, traversalOrder, max, min dan menghitung element size dari binary tree?";
        System.out.println(soal);
        System.out.print("Masukan No Soal UAS : ");
        noSoal = masukanSoal.nextInt();
        switch (noSoal) {
            case 1:
                firstTask();
                next();
                break;
            case 2:
                secondTask();
                next();
                break;
            case 3:
                thirdTask();
                next();
                break;
            case 4:
                next();
                break;
            default:
                soal();
        }
    }

    static void next() {
        Scanner lanjut = new Scanner(System.in);
        System.out.println("Lanjut Atau Tidak?");
        System.out.println("1. Yes\n" + "2. No");
        System.out.print("Masukan Pilihan Anda : ");
        int next = lanjut.nextInt();
        if (next == 1) {
            System.out.println("\n\n\n\n\n");
            soal();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        soal();
    }

}
