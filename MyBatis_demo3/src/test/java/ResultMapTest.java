import com.fall.mybatis.mapper.DeptMapper;
import com.fall.mybatis.mapper.EmpMapper;
import com.fall.mybatis.pojo.Dept;
import com.fall.mybatis.pojo.Emp;
import com.fall.mybatis.utils.SqlSessionUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author FAll
 * @date 2022/9/19 12:56
 *
 * To let the field name be correspond with attribute name:
 *  1、make an alias for field, and let alias be correspond with attribute
 *  2、configure the global setting, and map "_" to CamelCase automatically
 *
 * To handle many-to-one mapping relation:
 *  1、cascading attribute assignment
 *  2、use label 'association' to map the object property
 *  3、use hybrid lookup with label 'association'
 */
@Slf4j
public class ResultMapTest {

    @Test
    public void testGetEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDept = mapper.getEmpAndDeptByStepOne(3);
        log.info(empAndDept.getEmpName());
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        log.info(empAndDept.getDept().toString());

    }
    @Test
    public void testGetEmpAndDept(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDept = mapper.getEmpAndDept(1);
        log.info(empAndDept.toString());

    }

    @Test
    public void testGetAllEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        for (Emp emp : mapper.getAllEmp()) {
            log.info(emp.toString());
        }

    }

    @Test
    public void testGetDeptAndEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmp(1);
        log.info(dept.toString());

    }

    @Test
    public void testGetDeptAndEmpByStep(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepOne(1);
        log.info(dept.toString());

    }

}
