package me.kaede.mvp.loginoptimized.model;

public interface IUser {
	String getName();

	String getPasswd();

	int checkUserValidity(String name, String passwd);
}
