package xyz.itshark.confworkshop.graphqlworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.itshark.confworkshop.graphqlworkshop.pojo.Attendee;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
}
