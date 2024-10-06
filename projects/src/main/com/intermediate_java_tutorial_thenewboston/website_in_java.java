//package data.access;
//public interface DatabaseAccessor {
//	String[] ExecuteSingleColumn(String sql);
//	
//	String ExecuteSingleCell(String sql);
//	
//	Map<String, String> Execute(String sql);
//	
//	DataRow[] Execute(String sql);
//}
//
//package data.access;
//public interface DataRow {
//	String[] GetColumns();
//}
//
//package data.access;
//public class DatabaseUtility implements DatabaseAccessor {
//	public String[] ExecuteSingleColumn(String sql) {
//		return null;
//	}
//	public String ExecuteSingleCell(String sql) {
//		return null;
//	}
//	public DataRow[] Execute(String sql) {
//		return null;
//	}
//}
//
//testNG class data.access/src/teset/java/data/access where we will do things
//JdbcTests{
//	public void canAccessDatabase(DatabaseAccessor dbAccess) {
//		DatabaseAccessor db = new DatabaseUtility();
//		var result = this.accessor.Execute("dummmySQL");
//	}
//}
//
////use utility do not access database explicitly
//
///*
// * 
// * A1. Get 10 cities in descending alphabetical order.
//B3. Get the highest payment amount.
//C6. Use a View to get the film info for actor Bob Fawcett.
//D7. Use a Stored Procedure to get the 4 inventory ids for the film "Alien Center" at Store #2. 
//
//A1. Collection of String returned (single column)
//A3. Single string returned. (single cell)
//C6. HashMap<string, string> returned. (multiple rows, multiple cols)
//D7. HashMap<string, string> returned. (multiple rows, multiple cols)
//
//*/
//
