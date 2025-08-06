package com.main.level3cache.repository;

import com.main.level3cache.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActionRepository extends JpaRepository<Action, Long> {
  Action findByRefName(String refName);
  Optional<Action> findById(Long commentId);
}
