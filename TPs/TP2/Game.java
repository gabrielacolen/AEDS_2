
import java.util.Date;

public class Game {
	
	 	private int app_id;
	    private String name;
	    private Date release_date;
	    private String owners;
		private int age;
	    private float prince;
	    private int dles;
	    private String [] languages ;
	    private String website;
	    private boolean windowns;
	    private boolean mac;
	    private boolean linux;
		private float upvotes;
	    private int avg_pt;
	    private String developers;
	    private String [] genres;
	    
	    //SETS E GETS
	    
		public int getApp_id() {
			return app_id;
		}
		public void setApp_id(int app_id) {
			this.app_id = app_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getRelease_date() {
			return release_date;
		}
		public void setRelease_date(Date release_date) {
			this.release_date = release_date;
		}
		public String getOwners() {
			return owners;
		}
		public void setOwners(String owners) {
			this.owners = owners;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public float getPrince() {
			return prince;
		}
		public void setPrince(float prince) {
			this.prince = prince;
		}
		public int getDles() {
			return dles;
		}
		public void setDles(int dles) {
			this.dles = dles;
		}
		public String[] getLanguages() {
			return languages;
		}
		public void setLanguages(String[] languages) {
			this.languages = languages;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		public boolean isWindowns() {
			return windowns;
		}
		public void setWindowns(boolean windowns) {
			this.windowns = windowns;
		}
		public boolean isMac() {
			return mac;
		}
		public void setMac(boolean mac) {
			this.mac = mac;
		}
		public boolean isLinux() {
			return linux;
		}
		public void setLinux(boolean linux) {
			this.linux = linux;
		}
		public float getUpvotes() {
			return upvotes;
		}
		public void setUpvotes(float upvotes) {
			this.upvotes = upvotes;
		}
		public int getAvg_pt() {
			return avg_pt;
		}
		public void setAvg_pt(int avg_pt) {
			this.avg_pt = avg_pt;
		}
		public String getDevelopers() {
			return developers;
		}
		public void setDevelopers(String developers) {
			this.developers = developers;
		}
		public String[] getGenres() {
			return genres;
		}
		public void setGenres(String[] genres) {
			this.genres = genres;
		}
		
		//CLONE
		public Game clone () {
			Game novo = new Game ();
			novo.app_id = app_id;
		    novo.name = name;
		    novo.release_date = release_date;
		    novo.owners = owners;
			novo.age = age;
		    novo.prince = prince;
		    novo.dles = dles;
		    novo.languages  = languages;
		    novo.website = website;
		    novo.windowns = windowns;
		    novo.mac = mac;
		    novo.linux = linux;
			novo.upvotes = upvotes;
		    novo.avg_pt = avg_pt;
		    novo.developers = developers;
		    novo.genres = genres;
		    
		    return novo;
		}
		
		
		public static void dividirString () {
			String s = "440,Team Fortress 2,\"Oct 10, 2007\",50000000 - 100000000,0,0.0,1,\"['English', 'Danish', 'Dutch', 'Finnish', 'French', 'German', 'Italian', 'Japanese', 'Norwegian', 'Polish', 'Portuguese', 'Russian', 'Simplified Chinese', 'Spanish - Spain', 'Swedish', 'Traditional Chinese', 'Korean', 'Czech', 'Hungarian', 'Portuguese - Brazil', 'Turkish', 'Greek', 'Bulgarian', 'Romanian', 'Thai', 'Ukrainian']\",http://www.teamfortress.com/,True,True,True,823693,56683,9916,\"Valve,Hidden Path Entertainment\",\"Action,Free to Play\"";
			String atributos [] = new String [1000];
            int posInicialColchete = 0;
            int posFinalColchete = 0;

            atributos = s.split (",");

            if (s.contains("\"")) {
                atributos[2] += atributos[3]; 
            }

            //Colocar todas as linguagens em um atributo
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) == '[') posInicialColchete = i+1;
                if (s.charAt(i) == ']') {
                    posFinalColchete = i;
                    i = s.length();
                }
            }
            atributos[8] = s.substring(posInicialColchete, posFinalColchete);
            
            for (int j=0; j<45; j++){
                System.out.println(atributos[j]);
            }

            //System.out.println(atributos[9] + "\n" + atributos[2]);
			
		}
		
		public static void main (String [] args) {
			dividirString();
		}
    }
		
		