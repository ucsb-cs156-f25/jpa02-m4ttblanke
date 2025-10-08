package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Matt", Developer.getName());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("m4ttblanke", Developer.getGithubId());
    }

     @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f25-02", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("GAVIN"),"Team should contain GAVIN");
        assertTrue(t.getMembers().contains("AGAM"),"Team should contain AGAM");
        assertTrue(t.getMembers().contains("MANNY ABRAHAM"),"Team should contain MANNY ABRAHAM");
        assertTrue(t.getMembers().contains("MATT"),"Team should contain MATT");
        assertTrue(t.getMembers().contains("JEFFREY SUCHUL"),"Team should contain JEFFREY SUCHUL");
        assertTrue(t.getMembers().contains("FELIPE"),"Team should contain FELIPE");
    }

}
