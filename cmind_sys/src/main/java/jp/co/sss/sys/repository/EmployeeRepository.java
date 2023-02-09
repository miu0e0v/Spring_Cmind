package jp.co.sss.sys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.sss.sys.entity.Employee;

/**
 * リポジトリークラス
 * @author Inoue Nami
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
	List<Employee> findByIdAndPass(String empId,String password);
}
