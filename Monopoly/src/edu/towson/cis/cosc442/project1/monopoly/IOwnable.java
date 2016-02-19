package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	public abstract String getName();

	public abstract Player getTheOwner();

	public abstract int getPrice();

	public abstract boolean isAvailable();

	public abstract void playAction();

	public abstract void setAvailable(boolean available);

	public abstract void setTheOwner(Player owner);

	public abstract String toString();

}