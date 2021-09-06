package daos;

import java.sql.SQLException;
import java.util.List;


public interface Dao<DaoInterface> {
	
	DaoInterface get(int id);
	
	List<DaoInterface> getAll() throws SQLException;
	
	void save(DaoInterface d) throws SQLException;
	
	void update(DaoInterface d, String[] params);
	
	void delete (DaoInterface d);

}
