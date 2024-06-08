package one_to_many_unidirectional.main;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_many_unidirectional_entity.CricketPlayer;
import one_to_many_unidirectional_entity.CricketTeam;
import utils.HibernateUtils;

public class LinkPlayersToTeamExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionRef=factory.openSession();
			){
			//Load all Players
			Class<CricketPlayer> playerType=CricketPlayer.class;
			CricketPlayer player1=sessionRef.find(playerType,1);
			CricketPlayer player2=sessionRef.find(playerType,2);
			CricketPlayer player3=sessionRef.find(playerType,3);
			CricketPlayer player4=sessionRef.find(playerType,4);
			CricketPlayer player5=sessionRef.find(playerType,5);
			CricketPlayer player6=sessionRef.find(playerType,6);
			
			Class<CricketTeam> teamType=CricketTeam.class;
			CricketTeam team1=sessionRef.find(teamType, "IND");
			CricketTeam team2=sessionRef.find(teamType, "AUS");
			
			//Link players to team
			Transaction tr =sessionRef.beginTransaction();
			Set<CricketPlayer> indianPlayers=
			Set.of(player1,player2,player3);
			team1.setPlayers(indianPlayers);
			
			
			team2.SetPlayers(player4);
			team2.SetPlayers(player5);
			team2.SetPlayers(player6);
			
//			team1.SetPlayers(player1);
//			team2.SetPlayers(player2);
			
			//Commit Transaction
			tr.commit();
			System.out.println("Linked");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
