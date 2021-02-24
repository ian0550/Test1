-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        8.0.22 - MySQL Community Server - GPL
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- 테이블 데이터 test0224.t_user:~8 rows (대략적) 내보내기
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT IGNORE INTO `t_user` (`i_user`, `user_nm`, `user_age`, `email`, `user_phone`) VALUES
	(1, '김태연', '31세', 'taeyeon_@naver.com', '01024569876'),
	(2, '이순규', '29세', 'sunkyulee@naver.com', '01023451234'),
	(3, '황미영', '20세', 'tiffany22@naver.com', '01056563434'),
	(4, '김효연', '29세', 'dj_hyo@123@naver.com', '01089892425'),
	(5, '권유리', '28세', 'glass_798@daum.net', '01078905987'),
	(6, '최수영', '25세', 'swimming57@naver.com', '01012340987'),
	(7, '임윤아', '27세', 'yunn_a999@daum.net', '01079804739'),
	(8, '서주현', '24세', 'seojuhyeon1@daum.net', '01029496088');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
