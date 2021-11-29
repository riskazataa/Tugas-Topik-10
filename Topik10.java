package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Topik10 {
    static ArrayList<Driver> a = new ArrayList<>();
    static ArrayList<Customer> b = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int opsi;
        do {
            System.out.println("1.Masukkan Driver");
            System.out.println("2.Masukkan Customer");
            System.out.println("3.Info Driver");
            System.out.println("4.Info Customer");
            System.out.println("5.Top up saldo");
            System.out.println("6.Pembayaran jasa pengantaran");
            System.out.println("7.Out");
            System.out.println("Masukkan Pilihan");
            opsi = in.nextInt();

            switch (opsi) {
                case 1:
                    masukkanDriver();
                    break;
                case 2:
                    masukkanCustomer();
                    break;
                case 3:
                    infoDriver();
                    break;
                case 4:
                    infoCustomer();
                    break;
                case 5:
                    topupSaldo();
                    break;
                case 6:
                    bayarDriver();
                    break;
                case 7:
                    System.out.println("Program Telah Selesai");
                    break;
                default:
                    System.out.println("!! Tidak Ada Opsi, Silahkan Diulang Kembali!!\n");
                    break;
            }
        } while (opsi != 7);
    }

    static void masukkanDriver() {
        String nik, name, nomerTelepon, platKendaraan, jenisKendaraan;
        double saldo;

        System.out.println("NIK :");
        nik = in.next();
        System.out.println("Nama :");
        name = in.next();
        System.out.println("Nomor Telepon :");
        nomerTelepon = in.next();
        System.out.println("Saldo :");
        saldo = in.nextDouble();
        System.out.println("Plat Kendaraan");
        platKendaraan = in.next();
        System.out.println("Jenis Kendaraan");
        jenisKendaraan = in.next();

        a.add(new Driver(nik, name, nomerTelepon, saldo, platKendaraan, jenisKendaraan));
        System.out.println();
    }

    static void masukkanCustomer() {
        String nik, name, nomerTelepon;
        double saldo;

        System.out.println("NIK :");
        nik = in.next();
        System.out.println("Nama :");
        name = in.next();
        System.out.println("Nomor Telepon :");
        nomerTelepon = in.next();
        System.out.println("Saldo :");
        saldo = in.nextDouble();
        b.add(new Customer(nik, name, nomerTelepon, saldo));
        System.out.println();
    }

    static void infoDriver() {
        for (Driver driver : a) {
            System.out.println("NIK :" + driver.getNik()
                    + "\nNama : " + driver.getName()
                    + "\nNomer Telepon :" + driver.getNomerTelepon()
                    + "\nSaldo :" + driver.getSaldo()
                    + "\nNomor Plat Kendaraan:" + driver.getPlatKendaraan()
                    + "\nJenis Kendaraan :" + driver.getJenisKendaraan());
        }
        System.out.println();
    }

    static void infoCustomer() {
        for (Customer customer : b) {
            System.out.println("NIK :" + customer.getNik()
                    + "\nNama :" + customer.getName()
                    + "\nNomer Telepon :" + customer.getNomerTelepon()
                    + "\nSaldo :" + customer.getSaldo() + "\n");
        }
        System.out.println();
    }

    static void topupSaldo() {
        int indexCustomer, indexDriver;
        double topUp;

        System.out.println("Masukkan index customer :");
        indexCustomer = in.nextInt();
        System.out.println("Masukkan index driver :");
        indexDriver = in.nextInt();
        System.out.println("Total saldo yang akan ditop up :");
        topUp = in.nextDouble();

        a.get(indexDriver).saldo -= topUp;
        b.get(indexCustomer).saldo += topUp;

        System.out.println("Transaksi berhasil yeahh. \n");
    }

    static void bayarDriver() {
        int indexCustomer, indexDriver;
        double bayar;

        System.out.println("Masukkan index driver :");
        indexDriver = in.nextInt();
        System.out.println("Masukkan index customer :");
        indexCustomer = in.nextInt();
        System.out.println("Total saldo yang akan ditop up :");
        bayar = in.nextDouble();

        a.get(indexDriver).saldo += bayar;
        b.get(indexCustomer).saldo -= bayar;

        System.out.println("Transaksi berhasil yeahh. \n");
    }
}


