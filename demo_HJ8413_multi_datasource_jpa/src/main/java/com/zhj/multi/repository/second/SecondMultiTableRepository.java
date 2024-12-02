package com.zhj.multi.repository.second;

import com.zhj.multi.entity.second.SecondMultiTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondMultiTableRepository extends JpaRepository<SecondMultiTable, Long> {
}
