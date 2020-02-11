package com.fitrasalam;

public class TestEmployee {

    public static void main(String[] args) {

        Employee karyawan = new Employee(123,"Alam","Naga",500000);
        System.out.println("Gaji perbulan "+karyawan.getName()+ " adalah "+ karyawan.getSalary());
        karyawan.setSalary(600000);
        System.out.println("Karena anda ganteng dan bekerja dengan baik maka gaji perbulan anda dinaikan menjadi "+karyawan.getSalary());
        System.out.println("Sehingga dalam satu tahun "+karyawan.getName()+ " mendapatkan gaji sebesar "+karyawan.getAnnualSalary());
        System.out.println("Dan ditambah 10% dari gaji ,maka total gaji adalah "+karyawan.raiseSalary((float)0.1));
        System.out.println(karyawan.toString()+ karyawan.raiseSalary((float)0.1)+" ]");
    }
}
