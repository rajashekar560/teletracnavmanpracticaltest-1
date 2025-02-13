package com.teletrac.navman.repository;

import com.teletrac.navman.entity.Echo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EchoRepository extends JpaRepository<Echo, Long> {

}
