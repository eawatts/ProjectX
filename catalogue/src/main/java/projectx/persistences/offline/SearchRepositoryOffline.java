package projectx.persistences.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.offline.database.OfflineDB;
import projectx.persistence.repositories.SearchRepository;

@Stateless
@Default
public class SearchRepositoryOffline implements SearchRepository
{
	@Inject
	private OfflineDB db;
	
	@Override
	public List search(String parameter)
	{
		return db.search(parameter);
	}

}