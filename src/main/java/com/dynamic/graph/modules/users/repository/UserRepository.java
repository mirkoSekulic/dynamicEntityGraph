package com.dynamic.graph.modules.users.repository;

import com.dynamic.graph.custom_executor.JpaSpecificationExecutorWithEntityGraph;
import com.dynamic.graph.modules.users.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutorWithEntityGraph {
}
