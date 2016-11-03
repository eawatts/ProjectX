package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.repositories.SearchRepository;
import projectx.persistence.repositories.offline.database.OfflineDB;

@Stateless
@Default
public class SearchRepositoryOffline implements SearchRepository
{
	@Inject
	private OfflineDB db;
	
	@Override
	public List search(String searchTerm, String searchType)
	{
		return db.getSearchResults(searchTerm, searchType);
	}

}
