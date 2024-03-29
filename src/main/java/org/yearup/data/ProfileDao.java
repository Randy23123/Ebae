package org.yearup.data;


import org.yearup.models.Profile;

public interface ProfileDao {
    Profile create(Profile profile);
    Profile getProfile(String username);
    Profile update(String userName, Profile profile);
}
