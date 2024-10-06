package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.LinkedLists.challenge.PlayList;

import java.util.*;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public static void main(String[] args) {

        int a=5;
        int b=5;
        System.out.println(a==b);
        System.out.println();

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);

//        albums.get(1).addToPlayList(24, playList);  // There is no track 24
    }

        // write code here
        public Album(String name, String artist){
            this.name=name;
            this.artist=artist;
            songs = new ArrayList<Song>();
        }

        private Song findSong(String title){
            for(Song checked : songs){
                if(checked.getTitle().equals(title)){
                    return checked;
                }
            }
            return null;
        }

        public boolean addSong(String title,double duration){
            if(findSong(title)==null){

                //System.out.println(title);

                //sc.nextLine();
                songs.add(new Song(title,duration));
                return true;
            }

            return false;

        }

        public boolean addToPlayList(int trackNumber, LinkedList<Song> list){
            if(trackNumber<=0) return false;
            Song song = songs.get(trackNumber-1);
            list.add(song);
            return true;
        }

        public boolean addToPlayList(String title, LinkedList<Song> list){
            //verify the song exists
            Song songToAdd = findSong(title);
            if (songToAdd == null) {
                // The song was not found
                return false;
            }
            // Check if the song is already in the playList
            ListIterator<Song> playListIterator = list.listIterator();
            while (playListIterator.hasNext()) {
                if  (playListIterator.next().getTitle().compareTo(songToAdd.getTitle()) == 0) {
                    // The song is already in the playlist
                    return false;
                }
            }

            // Add the song to the end of the playList.
            list.add(songToAdd);
            return true;
        }
    }