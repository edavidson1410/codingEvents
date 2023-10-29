package org.launchcode.codingEvents.data;

import org.launchcode.codingEvents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {

}
