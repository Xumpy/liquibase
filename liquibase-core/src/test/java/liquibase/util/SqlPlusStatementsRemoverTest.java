package liquibase.util;

import java.io.IOException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author nico martens
 */
public class SqlPlusStatementsRemoverTest {
    @Test
    public void testRemove() throws IOException{
        String sqlPlusFile = StreamUtil.getStreamContents(SqlPlusStatementsRemoverTest.class.getResourceAsStream("/liquibase/util/sqlPlus.sql"), "UTF-8");
        
        sqlPlusFile = SqlPlusStatementsRemover.remove(sqlPlusFile);
        String sqlPlusFileClean = StreamUtil.getStreamContents(SqlPlusStatementsRemoverTest.class.getResourceAsStream("/liquibase/util/sqlPlusClean.sql"), "UTF-8");
        
        assertEquals(sqlPlusFile, sqlPlusFileClean);
    }
}
