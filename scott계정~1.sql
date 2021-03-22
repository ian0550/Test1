drop table t_student;

CREATE table t_student (
    sid INT NOT NULL,
    student_nm VARCHAR(10) NOT NULL,
    student_addr VARCHAR(50)NOT NULL,
    lecture_nm VARCHAR(20) NOT NULL,
    PRIMARY KEY(sid));

INSERT INTO t_student (sid, student_nm, student_addr, lecture_nm)
VALUES (100, '홍길동', '조선 한양 홍대감댁', '무술과');
INSERT INTO t_student (sid, student_nm, student_addr, lecture_nm)
VALUES (101, '김길동', '조선 한양 김대감댁', '궁술과');
INSERT INTO t_student (sid, student_nm, student_addr, lecture_nm)
VALUES (102, '박길동', '조선 한양 박대감댁', '창술과');

-- 트렌잭션 -> commit (DB에 영구적으로 반영)
-- 롤백(rollback) -> 원상태로 복원
DROP TABLE t_lecture;
CREATE TABLE t_lecture (
    lecture_nm VARCHAR(30) NOT NULL PRIMARY KEY,
    class_location VARCHAR(30) NOT NULL);

INSERT INTO t_lecture (lecture_nm, class_location)
    VALUES ('검술과', '공학관 501호');
INSERT INTO t_lecture (lecture_nm, class_location)
    VALUES ('궁술과', '공학관 502호');
INSERT INTO t_lecture (lecture_nm, class_location)
    VALUES ('창술과', '공학관 503호');
    
CREATE TABLE t_grade(
    sid INT NOT NULL,
    lecture_nm VARCHAR(20) NOT NULL,
    student_grade INT NOT NULL,
    PRIMARY KEY(sid, lecture_nm)
    /*
    FOREIGN KEY(sid) REFERENCES t_student(sid),
    FOREIGN KEY(lecture_nm) REFERENCES t_lecture(lecture_nm)
    */
    );

INSERT INTO t_grade (sid, lecture_nm, student_grade)
    VALUES (400, '궁술과', 3);

DROP TABLE t_hobby;
CREATE TABLE t_hobby (
    sid_h INT,
    hobby VARCHAR(20) NOT NULL,
    PRIMARY KEY(sid_h, hobby),
    FOREIGN KEY(sid_h) REFERENCES t_student(sid));

INSERT INTO t_student (sid, student_nm, student_addr, lecture_nm)
    VALUES (103, '최길동', '조선 한양 최대감댁', '창술과');
INSERT INTO t_hobby (sid_h, hobby) VALUES (500, '독서');
INSERT INTO t_hobby (sid_h, hobby) VALUES (501, '요리');


DROP TABLE t_customer;
CREATE TABLE t_customer (
    i_customer INT,
    customer_nm VARCHAR(20) NOT NULL,
    PRIMARY KEY(i_customer));
    
INSERT INTO t_customer(i_customer, customer_nm)
    VALUES(100, '홍길동');
    
CREATE TABLE t_netflix(
    i_customer INTEGER,
    cus_watching VARCHAR(20) NOT NULL,
    watching_dt DATE DEFAULT NOW(),
    PRIMARY KEY(i_customer, cus_watching),
    FOREIGN KEY(i_custopmer) REFERENCES t_customer(i_customer));
    
INSERT INTO t_netflix (i_customer, cus_watching)
    VALUES (200, '스위트홈');
