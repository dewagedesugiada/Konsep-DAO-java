package com.bootcamp.presentasion;

import java.util.Scanner;

import com.bootcamp.application.Mahasiswa;
import com.bootcamp.controller.MahasiswaDao;
import com.bootcamp.controller.MahasiswaDaoImpl;

public class UI {
	
	public void show() throws Exception {
		
		Scanner sn = new Scanner(System.in) ;
		System.out.print("Input ID : ");
		String id = sn.nextLine();
		System.out.print("Input Name : ");
		String name = sn.nextLine();
		System.out.print("Input Address : ");
		String address = sn.nextLine();
//		setter ke mahasiswa
		Mahasiswa mhs = new Mahasiswa(id,name, address);
//		membuat objek baru dari interface ke implement 
		MahasiswaDao mhsdao = new MahasiswaDaoImpl() ;
//		lakukan insert data yang di kirim oleh inputan ke implemen
		String notif = mhsdao.insert(mhs);
		System.out.println(notif);
		
	}
}
