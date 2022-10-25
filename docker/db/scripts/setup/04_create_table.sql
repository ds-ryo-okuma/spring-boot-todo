-- PDBへ切り替え
ALTER SESSION SET CONTAINER=pdb01;

-- テーブル作成するユーザ(変数定義)
DEFINE USER_NAME='SpringBoot';

-- テーブル作成
CREATE TABLE &USER_NAME..todo
(
    id NUMBER GENERATED ALWAYS AS IDENTITY,
    name VARCHAR2(300),
    CONSTRAINT pk1 PRIMARY KEY(id)
 ) 
;

-- データ挿入
INSERT INTO &USER_NAME..todo(name) values('初期データ１');
INSERT INTO &USER_NAME..todo(name) values('初期データ２');
INSERT INTO &USER_NAME..todo(name) values('初期データ３４');
COMMIT;