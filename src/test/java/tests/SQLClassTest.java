package tests;

import org.junit.Test;
import reposotory.QueryResolver;

public class SQLClassTest {
    QueryResolver query = new QueryResolver();

    @Test
    public void oneRecordQuery(){
        String sql = "select category.name, category.color from public.category ORDER BY RANDOM() LIMIT 1";
        query.getValues(sql);
    }


}
