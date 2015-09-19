package org.webutils.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;
import org.webutils.beans.Person;
import org.webutils.dao.PersonDao;

import com.ibatis.sqlmap.client.SqlMapClient;

@Repository
public class SqlMapPersonDaoImpl extends SqlMapClientDaoSupport implements PersonDao {
  private static final String NAMESPACE = "person.";

  @Autowired
  @Qualifier("sqlMapClient1")
  public void injectSqlMapClient(SqlMapClient sqlMapClient) {
    setSqlMapClient(sqlMapClient);
  }

  @Override
  @SuppressWarnings("unchecked")
  public List<Person> selectAll() {
    return getSqlMapClientTemplate().queryForList(NAMESPACE + "selectAll");
  }
}
