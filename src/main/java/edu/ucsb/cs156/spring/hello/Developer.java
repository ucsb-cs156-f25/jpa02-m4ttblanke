package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Matt B.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "m4ttblanke";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-02");
        team.addMember("Matt B.");
        team.addMember("Gavin C.");
        team.addMember("Manny L.");
        team.addMember("Agam M.");
        team.addMember("Jeffrey K.");
        team.addMember("Felipe C.");
        return team;
    }
}
