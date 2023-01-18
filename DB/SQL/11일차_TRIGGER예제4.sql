-- 예매를 취소했을 때 예매 가능 좌석을 수정하는 트리거를 추가하고, 확인하세요

DROP TRIGGER IF EXISTS 트리거명;

DELIMITER //
CREATE TRIGGER 트리거명

BEFORE|AFTER DELETE|INSERT|UPDATE
ON 테이블명
FOR EACH ROW
BEGIN
-- 실행 코드
END //
DELIMITER ;