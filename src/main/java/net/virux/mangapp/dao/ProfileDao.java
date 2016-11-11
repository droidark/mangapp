package net.virux.mangapp.dao;

import java.util.List;

import net.virux.mangapp.model.Profile;

public interface ProfileDao {
	
	void addProfile(Profile profile);
		
	List<Profile> getAllProfile();
	
	Profile getProfile(int id);
	
	Profile getProfile(String profile);
	
	void setProfile(Profile profile);
	
	void deleteProfile(Profile profile);
	
}