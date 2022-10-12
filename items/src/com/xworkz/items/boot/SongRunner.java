package com.xworkz.items.boot;

import com.xworkz.items.Song;

public class SongRunner {

	public static void main(String[] args) {

	Song music = new Song();
	System.out.println(music.name);
	System.out.println(music.language);
	System.out.println(music.singer);
	System.out.println(music.lyricst);
	System.out.println(music.type);
	
	System.out.println("------updated details------");
	music.name = "Notanki";
	music.language = "Telugu";
	music.singer = "Raviteja";
	music.lyricst = "SS Taman";
	music.type = "Mass";
	System.out.println("Song Name :"+music.name);
	System.out.println("Language :"+music.language);
	System.out.println("Artist :"+music.singer);
	System.out.println("Song lyricst :"+music.lyricst);
	System.out.println("Song Type :"+music.type);
	}

}
