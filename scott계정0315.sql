drop table t_student;

CREATE table t_student (
    sid INT,
    student_nm VARCHAR(10) NOT NULL,
    student_addr VARCHAR(50)NOT NULL,
    lecture_nm VARCHAR(20) NOT NULL,
    PRIMARY KEY(sid));

INSERT INTO t_student (sid, student_nm, student_addr, lecture_nm)
VALUES (100, 'ȫ�浿', '���� �Ѿ� ȫ�밨��', '������');
INSERT INTO t_student (sid, student_nm, student_addr, lecture_nm)
VALUES (101, '��浿', '���� �Ѿ� ��밨��', '�ü���');
INSERT INTO t_student (sid, student_nm, student_addr, lecture_nm)
VALUES (102, '�ڱ浿', '���� �Ѿ� �ڴ밨��', 'â����');

-- Ʈ����� -> commit (DB�� ���������� �ݿ�)
-- �ѹ�(rollback) -> �����·� ����
DROP TABLE t_lecture;
CREATE TABLE t_lecture (
    lecture_nm VARCHAR(30) NOT NULL PRIMARY KEY,
    class_location VARCHAR(30) NOT NULL);

INSERT INTO t_lecture (lecture_nm, class_location)
    VALUES ('�˼���', '���а� 501ȣ');
INSERT INTO t_lecture (lecture_nm, class_location)
    VALUES ('�ü���', '���а� 502ȣ');
INSERT INTO t_lecture (lecture_nm, class_location)
    VALUES ('â����', '���а� 503ȣ');
    
CREATE TABLE t_grade(
    sid INT NOT NULL;
    lecture_nm VARCHAR(
    