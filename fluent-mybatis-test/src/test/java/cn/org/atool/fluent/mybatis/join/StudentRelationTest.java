package cn.org.atool.fluent.mybatis.join;

import cn.org.atool.fluent.mybatis.generate.ATM;
import cn.org.atool.fluent.mybatis.generate.Wrappers;
import cn.org.atool.fluent.mybatis.generate.entity.StudentEntity;
import cn.org.atool.fluent.mybatis.generate.entity.StudentScoreEntity;
import cn.org.atool.fluent.mybatis.generate.mapper.StudentMapper;
import cn.org.atool.fluent.mybatis.test.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentRelationTest extends BaseTest {
    @Autowired
    StudentMapper mapper;

    @Test
    void test() {
        ATM.DataMap.student.initTable(1)
            .id.values(1)
            .userName.values("test")
            .env.values("test_env")
            .cleanAndInsert();
        ATM.DataMap.studentScore.initTable(2)
            .studentId.values(1, 1)
            .score.values(70, 80)
            .env.values("test_env")
            .cleanAndInsert();
        StudentEntity student = mapper.findOne(Wrappers.student.defaultQuery().where.id().eq(1L).end());
        List<StudentScoreEntity> scores = student.getStudentScoreList();
        System.out.println(scores);
        scores = student.getStudentScoreList();
        System.out.println(scores);
    }
}