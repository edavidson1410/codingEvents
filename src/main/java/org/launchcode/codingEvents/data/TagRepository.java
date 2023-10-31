package org.launchcode.codingEvents.data;

import org.launchcode.codingEvents.models.Event;
import org.launchcode.codingEvents.models.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Integer> {

}
