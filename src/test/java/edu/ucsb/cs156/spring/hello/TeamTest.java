package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)


    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object_returns_true() {
        assertEquals(true, team.equals(team));
    }

    @Test
    public void equals_different_class_returns_false() {
        String notATeam = "not a team";
        assertEquals(false, team.equals(notATeam));
    }

    @Test
    public void equals_same_name_and_members_returns_true() {
        Team other = new Team("test-team");
        assertEquals(true, team.equals(other));
    }

    @Test
    public void equals_same_name_different_members_returns_false() {
        Team other = new Team("test-team");
        other.addMember("Alice");
        assertEquals(false, team.equals(other));
    }

    @Test
    public void equals_different_name_same_members_returns_false() {
        Team other = new Team("other-team");
        assertEquals(false, team.equals(other));
    }

    @Test
    public void equals_different_name_and_members_returns_false() {
        Team other = new Team("other-team");
        other.addMember("Bob");
        assertEquals(false, team.equals(other));
    }

    @Test
    public void hashCode_same_content_same_hash() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hashCode_default_team_value() {
        Team t = new Team();
        int expected = t.getName().hashCode() | t.getMembers().hashCode(); // implementation-specific
        assertEquals(expected, t.hashCode());
    }
}
