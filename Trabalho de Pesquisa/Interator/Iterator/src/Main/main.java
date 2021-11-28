package Main;

import Classes.Iterator_Musicas;
import Classes.MusicasBoas;

public class main {

	public static void main(String[] args) {
		
		MusicasBoas minhasmusic = new MusicasBoas();
		Iterator_Musicas playlist = minhasmusic.novaBib();
		
		System.out.println(playlist.getMusica());
		playlist.proximaMusica();
		System.out.println(playlist.getMusica());
		playlist.proximaMusica();
		System.out.println(playlist.getMusica());
		playlist.proximaMusica();
		System.out.println(playlist.getMusica());
		playlist.proximaMusica();
		System.out.println(playlist.getMusica());
		playlist.proximaMusica();
		System.out.println(playlist.getMusica());
		playlist.voltarMusica();
		System.out.println(playlist.getMusica());
		playlist.voltarMusica();
		System.out.println(playlist.getMusica());
		playlist.voltarMusica();
		System.out.println(playlist.getMusica());
		playlist.voltarMusica();
		System.out.println(playlist.getMusica());
		playlist.voltarMusica();
		System.out.println(playlist.getMusica());
		playlist.voltarMusica();
		System.out.println(playlist.getMusica());
		playlist.voltarMusica();
		System.out.println(playlist.getMusica());
		
		
	}

}
