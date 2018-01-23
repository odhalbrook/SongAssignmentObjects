import java.util.ArrayList;
public class Playlist
	{
		static ArrayList <Song> playlist = new ArrayList<Song>();
		public static void main(String[] args)
			{
				

				fillArray();
				printList();
				playlistEdit();
			}


		private static void fillArray()
			{

				playlist.add(new Song("Paddy's Meme Track", "BrokeBoy Records", 3600));
				playlist.add(new Song("Gassed up Paddy", "BrokeBoy Records", 520));
				playlist.add(new Song("School", "BrokeBoy Records", 9000000));
				playlist.add(new Song("Keaton's beeen dissssssed", "Luke,James,Zach", 3));
				playlist.add(new Song("Air.............Pods", "PaddyBoy Records", 4630));
				
			}

		private static void printList()
			{
				for(int i = 0; i < playlist.size(); i++)
					{
						System.out.println(playlist.get(i).getTitle() + playlist.get(i).getArtist() + playlist.get(i).getLengthInSeconds());
					}
				
			}

		private static void playlistEdit()
			{
				for(int i = 0; i < playlist.size(); i++)
					{
						playlist.get(i).setLengthInSeconds(playlist.get(i).getLengthInSeconds - 10);
					}
				
			}
	}
