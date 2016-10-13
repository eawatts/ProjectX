package projectx.persistence.offline;

import javax.ejb.Singleton;


@Singleton
public class OfflineDB 
{
	private OfflineCategoryDB OCDB;

	/**
	 * @return the oCDB
	 */
	public OfflineCategoryDB getOCDB()
	{
		return OCDB;
	}

	/**
	 * @param oCDB the oCDB to set
	 */
	public void setOCDB(OfflineCategoryDB oCDB)
	{
		OCDB = oCDB;
	}
	
	
}
