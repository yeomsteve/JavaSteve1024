-- 제품 구매를 취소했을 때 트리거
USE SHOPPINGMALL;
DROP TRIGGER IF EXISTS UPDATE_BUY;

DELIMITER //
CREATE TRIGGER UPDATE_BUY AFTER UPDATE
ON BUY
FOR EACH ROW
BEGIN
-- 제품 수량을 변경
	IF NEW.BU_AMOUNT = OLD.BU_AMOUNT AND NEW.BU_STATE = '구매취소' THEN
		UPDATE PRODUCT
			SET PR_AMOUNT = PR_AMOUNT + OLD.BU_AMOUNT
		WHERE PR_NUM = NEW.BU_PR_NUM;
	ELSE
		IF NEW.BU_AMOUNT != OLD.BU_AMOUNT THEN
			UPDATE PRODUCT
				SET PR_AMOUNT = PR_AMOUNT + OLD.BU_AMOUNT - NEW.BU_AMOUNT
			WHERE PR_NUM = NEW.BU_PR_NUM;
        END IF;
    END IF;
END //
DELIMITER ;
UPDATE BUY SET BU_STATE = '구매취소' WHERE BU_NUM = 'abc1';
UPDATE BUY SET BU_AMOUNT = 2 WHERE BU_NUM = 'QWE202212211712';