package kr.co.ch06.repository;

import kr.co.ch06.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ParentRepository extends JpaRepository<Parent, String> {
}
