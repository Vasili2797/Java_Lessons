package main.com.JavaProgrammingMasterclassUpdatedToJava17.Generics;


interface Player{
    String name();
}
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
record VolletballPlayer(String name, String position) implements Player{}

public class Main {
    public static void main(String[] args) {
        var philly = new Affiliation("city","Philadelphia, PA", "US");

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Atros");
        scoreResult(phillies1,3,astros1,5);

        SportsTeam phillies = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros = new SportsTeam("Houston Atros");
        scoreResult(phillies,3,astros,5);

        Team<BaseballPlayer, Affiliation> phillies2 = new Team<>("Philadelphia Phillies", philly);
        Team<BaseballPlayer, Affiliation> astros2 = new Team<>("Houston Atros");
        scoreResult(phillies2,3,astros2,5);

        var harper = new BaseballPlayer("B Harper","Right Fielder");
        var marsh = new BaseballPlayer("B Marsh","Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);


        var guthrie = new BaseballPlayer("D Guthrie","Center Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, String> afc = new Team<>("Adelaide Crows",
                "City of Adelaide, South Australia, in AU");
//        afc1.listTeamMembers();
        var tex=new FootballPlayer("Tex Walker","Center midfielder");
        afc.addTeamMember(tex);


        var rory = new FootballPlayer("Rory Laird","MidFielder");
        afc.addTeamMember(rory);

        afc.listTeamMembers();

        Team<VolletballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolletballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolletballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolletballPlayer("canberra C", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra,0,adelaide,1);

//        Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");
    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score){
        String message=team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score,
                                   SportsTeam team2, int t2_score){
        String message=team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score){
        String message=team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }


    public boolean isValid(String s) {
        int leng = s.length()-1;
        int l=0;
        l++;
        while(l<leng){
            int m=l+(leng-1)/2;
            if(leng==1) {
                return true;
            }else if((s.charAt(m)=='('&& s.charAt(m+1)==')') ||(s.charAt(m)=='{' && s.charAt(m+1)=='}') || (s.charAt(m)=='[' && s.charAt(m+1)==']')){
                return true;
            }else{
                return false;
            }
//            l++;
        }
        return true;
    }
}
