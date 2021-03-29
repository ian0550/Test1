--------------------------------------------------------
--  파일이 생성됨 - 수요일-3월-24-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table NAMECARD
--------------------------------------------------------

  CREATE TABLE "C##IAN"."NAMECARD" 
   (	"ID" NUMBER(*,0), 
	"NAME" VARCHAR2(10 BYTE), 
	"TEL" VARCHAR2(20 BYTE), 
	"EMAIL" VARCHAR2(30 BYTE), 
	"ADDRESS" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into C##IAN.NAMECARD
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index NAMECARD_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##IAN"."NAMECARD_PK" ON "C##IAN"."NAMECARD" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table NAMECARD
--------------------------------------------------------

  ALTER TABLE "C##IAN"."NAMECARD" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "C##IAN"."NAMECARD" MODIFY ("NAME" NOT NULL ENABLE);
  ALTER TABLE "C##IAN"."NAMECARD" MODIFY ("TEL" NOT NULL ENABLE);
  ALTER TABLE "C##IAN"."NAMECARD" MODIFY ("ADDRESS" NOT NULL ENABLE);
  ALTER TABLE "C##IAN"."NAMECARD" ADD CONSTRAINT "NAMECARD_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
