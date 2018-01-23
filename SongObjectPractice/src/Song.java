
public class Song
	{
		String title;
		String artist;
		int lengthInSeconds;
		
		public Song(String t, String a, int l)
		{
			title = t;
			artist = a;
			lengthInSeconds = l;
		}

		public String getTitle()
			{
				return title;
			}

		public void setTitle(String title)
			{
				this.title = title;
			}

		public String getArtist()
			{
				return artist;
			}

		public void setArtist(String artist)
			{
				this.artist = artist;
			}

		public int getLengthInSeconds()
			{
				return lengthInSeconds;
			}

		public void setLengthInSeconds(int lengthInSeconds)
			{
				this.lengthInSeconds = lengthInSeconds;
			}
		
	}
