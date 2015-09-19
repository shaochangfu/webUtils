package org.webutils.dao;

import java.util.List;

import org.webutils.beans.Person;


public interface PersonDao {
  List<Person> selectAll();
}
