import java.util.LinkedList;

public class Tugas1_FarhanMawardi {
    public static void main(String[] args) {
        
        //soal nomor 1
        int jumlahBaris;
        jumlahBaris=10;
        System.out.println("jumlahBaris = "+jumlahBaris);

        //soal nomor 2
        String kalimatBaru;
        kalimatBaru="Deklarasi tipe data String";
        System.out.println(kalimatBaru);

        //soal nomor 3
        int[] empatAngka=new int[4];
        empatAngka[0]=(07);
        empatAngka[1]=(10);
        empatAngka[2]=(20);
        empatAngka[3]=(23);
        System.out.println("empatAngka = ");
        for (int i=0;i<empatAngka.length;i++) {
            System.out.print(empatAngka[i]+"\t");
        }
        System.out.println();

        //soal nomor 4
        String[][] alfabet= {
            {"p","s","n"},
            {"w","l","b"},
            {"f","r","e"},
        };
        System.out.println("alfabet = ");
            for(int x=0;x<alfabet.length;x++){
            for(int y=0;y<alfabet.length;y++){
        System.out.print(alfabet [x][y]+"\t");
            }
            System.out.println();
            }

            //soal nomor 5
        LinkedList <Integer> list = new LinkedList<>();
        list.add(26);
        list.add(8);
        list.add(23);
        list.add(24);
        list.add(16);
    System.out.println("Linkedlist = "+list);
        }
    }