spool on;
set echo on;
spool MESSMASTER.log

DROP USER MESSMASTER CASCADE;

create user MESSMASTER identified by MESSMASTER;
grant connect,resource,dba to MESSMASTER;


--------------------------------------------------------
--  DDL for Table FILE_COMPLAINT
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."FILE_COMPLAINT" 
   (	"COMPLAINT_ID" VARCHAR2(20 BYTE), 
	"TRANSACTION_ID" VARCHAR2(30 BYTE), 
	"COMP_REASON" VARCHAR2(200 BYTE), 
	"NODE_CODE" VARCHAR2(30 BYTE), 
	"ISS_MAST_MNO_ID" VARCHAR2(30 BYTE), 
	"CREATED_ON" DATE, 
	"CREATED_BY" VARCHAR2(30 BYTE), 
	"MODIFIED_ON" DATE, 
	"MODIFIED_BY" VARCHAR2(30 BYTE), 
	"STATUS" VARCHAR2(15 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table GROUP_ROLES
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."GROUP_ROLES" 
   (	"GROUP_ROLE_CODE" VARCHAR2(30 BYTE), 
	"DESCRIPTION" VARCHAR2(50 BYTE), 
	"CREATED_ON" DATE, 
	"CREATED_BY" VARCHAR2(30 BYTE), 
	"MODIFIED_ON" DATE, 
	"MODIFIED_BY" VARCHAR2(30 BYTE)
   )  ;
--------------------------------------------------------
--  DDL for Table HIERARCHY
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."HIERARCHY" 
   (	"NODE_CODE" VARCHAR2(30 BYTE), 
	"DESCRIPTION" VARCHAR2(30 BYTE), 
	"NODE_TYPE" VARCHAR2(30 BYTE), 
	"PARENT_NODE" VARCHAR2(30 BYTE), 
	"EFFECTIVE_DATE" DATE, 
	"EXPIRATION_DATE" DATE, 
	"STATUS" VARCHAR2(30 BYTE), 
	"NODE_LEVEL" NUMBER(*,0), 
	"CREATED_ON" DATE, 
	"CREATED_BY" VARCHAR2(30 BYTE), 
	"MODIFIED_ON" DATE, 
	"MODIFIED_BY" VARCHAR2(30 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table LANGUAGES
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."LANGUAGES" 
   (	"LANG_CODE" VARCHAR2(30 BYTE), 
	"LANGUAGE" VARCHAR2(30 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table PRODUCT
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."PRODUCT" 
   (	"PRODUCT_CODE" VARCHAR2(10 BYTE), 
	"DESCRIPTION" VARCHAR2(30 BYTE), 
	"CREATED_ON" DATE, 
	"CREATED_BY" VARCHAR2(30 BYTE), 
	"MODIFIED_ON" DATE, 
	"MODIFIED_BY" VARCHAR2(30 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table RESOURCES
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."RESOURCES" 
   (	"RESOURCE_ID" NUMBER(*,0), 
	"RESOURCE_DESC" VARCHAR2(50 BYTE), 
	"CREATED_ON" DATE, 
	"CREATED_ BY" VARCHAR2(30 BYTE), 
	"MODIFIED_ON" DATE, 
	"MODIFIED_BY" VARCHAR2(30 BYTE), 
	"RESOURCE_TYPE" VARCHAR2(30 BYTE), 
	"URL" VARCHAR2(100 BYTE), 
	"MODULE_CODE" VARCHAR2(30 BYTE), 
	"SEQUENCE_NO" NUMBER(*,0), 
	"LOCALE" VARCHAR2(8 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table ROLES
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."ROLES" 
   (	"ROLE_CODE" VARCHAR2(30 BYTE), 
	"ROLE_DESC" VARCHAR2(50 BYTE), 
	"CREATED_ON" DATE, 
	"CREATED_BY" VARCHAR2(30 BYTE), 
	"MODIFIED_ON" DATE, 
	"MODIFIED_BY" VARCHAR2(30 BYTE), 
	"STATUS" VARCHAR2(10 BYTE), 
	"PRODUCT_CODE" VARCHAR2(10 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table ROLES_GROUP_ROLES
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."ROLES_GROUP_ROLES" 
   (	"ROLE_CODE" VARCHAR2(30 BYTE), 
	"GROUP_ROLE_CODE" VARCHAR2(30 BYTE), 
	"PRODUCT_CODE" VARCHAR2(10 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table ROLES_HIERARCHY
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."ROLES_HIERARCHY" 
   (	"ROLE_CODE" VARCHAR2(30 BYTE), 
	"NODE_CODE" VARCHAR2(30 BYTE), 
	"PRODUCT_CODE" VARCHAR2(10 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table ROLES_RESOURCES
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."ROLES_RESOURCES" 
   (	"ROLE_CODE" VARCHAR2(30 BYTE), 
	"PRODUCT_CODE" VARCHAR2(10 BYTE), 
	"RESOURCE_ID" NUMBER(*,0)
   ) ;

--------------------------------------------------------
--  DDL for Table SYS_PREFERENCES
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."SYS_PREFERENCES" 
   (	"PREFERENCE_CODE" VARCHAR2(30 BYTE), 
	"DESCRIPTION" VARCHAR2(80 BYTE), 
	"VALUE_DATATYPE" VARCHAR2(20 BYTE), 
	"VALUE_OPTIONS" VARCHAR2(10 BYTE), 
	"DEFAULT_VALUE" VARCHAR2(30 BYTE), 
	"MODIFIED_ALLOWED" CHAR(1 BYTE), 
	"DISPLAY_ALLOWED" CHAR(1 BYTE)
   )  ;

--------------------------------------------------------
--  DDL for Table USER_AUDIT_TRAIL
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."USER_AUDIT_TRAIL" 
   (	"AUDIT_ID" NUMBER(*,0), 
	"USER_ID" VARCHAR2(30 BYTE), 
	"USER_ACTION_CODE" VARCHAR2(30 BYTE), 
	"ACTION_DESC" VARCHAR2(40 BYTE), 
	"IP_ADDRESS" VARCHAR2(30 BYTE), 
	"ACTION_TAKEN_TIME" DATE, 
	"ACTION_RESULT" VARCHAR2(30 BYTE), 
	"CREATED_ON" DATE, 
	"MODIFIED_ON" DATE, 
	"ACCOUNT_ID" NUMBER(*,0)
   ) ;

--------------------------------------------------------
--  DDL for Table USER_LOGON_AUDIT
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."USER_LOGON_AUDIT" 
   (	"LOGON_AUDIT_ID" NUMBER(*,0), 
	"USER_ID" VARCHAR2(30 BYTE), 
	"LOGON_TIME" DATE, 
	"LOGOFF_TIME" DATE, 
	"IP_ADDRESS" NUMBER(*,0), 
	"OSUSER" NUMBER(*,0), 
	"ACCOUNT_ID" NUMBER(*,0)
   ) ;
--------------------------------------------------------
--  DDL for Table USER_PASSWORDS
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."USER_PASSWORDS" 
   (	"ACCOUNT_ID" NUMBER(*,0), 
	"PIN" VARCHAR2(200 BYTE), 
	"PIN_RETRY_COUNT" NUMBER(*,0), 
	"PIN_STATUS" NUMBER(*,0), 
	"CREATION_DATE" DATE, 
	"EXPIRATION_DATE" DATE, 
	"AUTHENTICATION_TYPE" VARCHAR2(30 BYTE), 
	"PASSWORD_CHANGE_FLAG" VARCHAR2(30 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table USER_THRESHOLDS
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."USER_THRESHOLDS" 
   (	"THRESHOLD_ID" NUMBER(*,0), 
	"THRESHOLD_CATEGORY" VARCHAR2(30 BYTE), 
	"THRESHOLD_ VALUE" NUMBER(*,0), 
	"ACCOUNT_ID" NUMBER(*,0)
   )  ;
--------------------------------------------------------
--  DDL for Table USERS
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."USERS" 
   (	"ACCOUNT_ID" NUMBER(*,0), 
	"AGE" VARCHAR2(30 BYTE), 
	"RELIGION" VARCHAR2(30 BYTE), 
	"USER_ID" VARCHAR2(30 BYTE), 
	"MSISDN" VARCHAR2(30 BYTE), 
	"NODE_CODE" VARCHAR2(30 BYTE), 
	"PARENT_ACCOUNT_ID" VARCHAR2(30 BYTE), 
	"USER_TYPE" VARCHAR2(30 BYTE), 
	"SHIPPING_ADDRESS" VARCHAR2(30 BYTE), 
	"SHIPPING_CITY" VARCHAR2(30 BYTE), 
	"SHIPPING_STATE" VARCHAR2(30 BYTE), 
	"SHIPPING_ZIP_CODE" VARCHAR2(20 BYTE), 
	"HOME_ADDRESS" VARCHAR2(100 BYTE), 
	"HOME_CITY" VARCHAR2(30 BYTE), 
	"HOME_STATE" VARCHAR2(30 BYTE), 
	"HOME_ZIP_CODE" VARCHAR2(20 BYTE), 
	"ADDRESS_1" VARCHAR2(30 BYTE), 
	"ADDRESS_1_CITY" VARCHAR2(30 BYTE), 
	"ADDRESS_1_STATE" VARCHAR2(30 BYTE), 
	"ADDRESS_1_ZIP_CODE" VARCHAR2(20 BYTE), 
	"PRIMARY_PHONE_NBR" VARCHAR2(30 BYTE), 
	"SECONDARY_PHONE_NBR" VARCHAR2(30 BYTE), 
	"SECONDARY_PHONE_NBR2" VARCHAR2(30 BYTE), 
	"SECONDARY_PHONE_NBR3" VARCHAR2(30 BYTE), 
	"SECONDARY_PHONE_NBR4" VARCHAR2(30 BYTE), 
	"AUTHENTICATION_TYPE" VARCHAR2(30 BYTE), 
	"FIRST_NAME" VARCHAR2(30 BYTE), 
	"NAME_PREFIX" VARCHAR2(30 BYTE), 
	"MIDDLE_NAME" VARCHAR2(30 BYTE), 
	"LAST_NAME" VARCHAR2(30 BYTE), 
	"STATUS" VARCHAR2(30 BYTE), 
	"ALLOWED_IP" VARCHAR2(150 BYTE), 
	"ALLOWED_DAYS" VARCHAR2(15 BYTE), 
	"FROM_TIME" VARCHAR2(10 BYTE), 
	"TO_TIME" VARCHAR2(10 BYTE), 
	"DOB" DATE, 
	"LAST_LOGIN_ON" DATE, 
	"EMAIL" VARCHAR2(50 BYTE), 
	"LEVEL1_APPROVED_BY" VARCHAR2(30 BYTE), 
	"LEVEL1_APPROVED_ON" DATE, 
	"LEVEL2_APPROVED_BY" VARCHAR2(30 BYTE), 
	"LEVEL2_APPROVED_ON" DATE, 
	"BATCH_ID" VARCHAR2(35 BYTE), 
	"REMARKS" VARCHAR2(100 BYTE), 
	"MODIFY_APPROVED_BY" VARCHAR2(30 BYTE), 
	"MODIFY_APPROVED_ON" DATE, 
	"DELETE_APPROVED_BY" VARCHAR2(30 BYTE), 
	"DELETE_APPROVED_ON" DATE, 
	"PREF_LANGUAGE" VARCHAR2(5 BYTE), 
	"MNO_ID" VARCHAR2(20 BYTE), 
	"COL1" VARCHAR2(30 BYTE), 
	"COL2" VARCHAR2(30 BYTE), 
	"COL3" VARCHAR2(30 BYTE), 
	"COL4" VARCHAR2(30 BYTE), 
	"COL5" VARCHAR2(30 BYTE), 
	"COL6" VARCHAR2(30 BYTE), 
	"COL7" VARCHAR2(30 BYTE), 
	"COL8" VARCHAR2(30 BYTE), 
	"COL9" VARCHAR2(30 BYTE), 
	"COL10" VARCHAR2(30 BYTE), 
	"CREATED_ON" DATE, 
	"CREATED_BY" VARCHAR2(30 BYTE), 
	"MODIFIED_ON" DATE, 
	"MODIFIED_BY" VARCHAR2(30 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table USERS_GROUP_ROLES
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."USERS_GROUP_ROLES" 
   (	"ACCOUNT_ID" NUMBER(*,0), 
	"GROUP_ROLE_CODE" VARCHAR2(30 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table USERS_KYC_INFO
--------------------------------------------------------

  CREATE TABLE "MESSMASTER"."USERS_KYC_INFO" 
   (	"KYC_ID" NUMBER(*,0), 
	"KYC_DOC_TYPE" VARCHAR2(30 BYTE), 
	"KYC_DOC_ID" NUMBER(*,0), 
	"DOC_TYPE_DESC" VARCHAR2(30 BYTE), 
	"CREATED_ON" DATE, 
	"CREATED_BY" VARCHAR2(30 BYTE), 
	"MODIFIED_ON" DATE, 
	"MODIFIED_BY" VARCHAR2(30 BYTE), 
	"ACCOUNT_ID" NUMBER(*,0)
   ) ;

--------------------------------------------------------
--  DDL for Index Unique_Identifier213
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier213" ON "MESSMASTER"."FILE_COMPLAINT" ("COMPLAINT_ID") ;
--------------------------------------------------------
--  DDL for Index Unique_Identifier17
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier17" ON "MESSMASTER"."GROUP_ROLES" ("GROUP_ROLE_CODE") ;
--------------------------------------------------------
--  DDL for Index Unique_Identifier18
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier18" ON "MESSMASTER"."HIERARCHY" ("NODE_CODE");
--------------------------------------------------------
--  DDL for Index Unique_Identifier_lang
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier_lang" ON "MESSMASTER"."LANGUAGES" ("LANG_CODE");
--------------------------------------------------------
--  DDL for Index Unique_Identifier24
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier24" ON "MESSMASTER"."PRODUCT" ("PRODUCT_CODE");
--------------------------------------------------------
--  DDL for Index Unique_Identifier9
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier9" ON "MESSMASTER"."RESOURCES" ("RESOURCE_ID", "LOCALE") ;
--------------------------------------------------------
--  DDL for Index Unique_Identifier8
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier8" ON "MESSMASTER"."ROLES" ("ROLE_CODE", "PRODUCT_CODE") ;

--------------------------------------------------------
--  DDL for Index SYS_PREFERENCES_PK
	--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."SYS_PREFERENCES_PK" ON "MESSMASTER"."SYS_PREFERENCES" ("PREFERENCE_CODE") ;

--------------------------------------------------------
--  DDL for Index Unique_Identifier14
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier14" ON "MESSMASTER"."USER_AUDIT_TRAIL" ("AUDIT_ID", "ACCOUNT_ID") ;

--------------------------------------------------------
--  DDL for Index Unique_Identifier15
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier15" ON "MESSMASTER"."USER_LOGON_AUDIT" ("LOGON_AUDIT_ID", "ACCOUNT_ID") ;
--------------------------------------------------------
--  DDL for Index Unique_Identifier13
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier13" ON "MESSMASTER"."USER_PASSWORDS" ("ACCOUNT_ID") ;
--------------------------------------------------------
--  DDL for Index Unique_Identifier5
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier5" ON "MESSMASTER"."USER_THRESHOLDS" ("THRESHOLD_ID", "ACCOUNT_ID") ;
--------------------------------------------------------
--  DDL for Index Unique_Identifier1
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier1" ON "MESSMASTER"."USERS" ("ACCOUNT_ID") ;
--------------------------------------------------------
--  DDL for Index Unique_Identifier4
--------------------------------------------------------

  CREATE UNIQUE INDEX "MESSMASTER"."Unique_Identifier4" ON "MESSMASTER"."USERS_KYC_INFO" ("KYC_ID", "ACCOUNT_ID") ;

--------------------------------------------------------
--  Constraints for Table FILE_COMPLAINT
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."FILE_COMPLAINT" MODIFY ("COMPLAINT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."FILE_COMPLAINT" MODIFY ("CREATED_ON" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."FILE_COMPLAINT" MODIFY ("CREATED_BY" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."FILE_COMPLAINT" ADD CONSTRAINT "Unique_Identifier213" PRIMARY KEY ("COMPLAINT_ID");
--------------------------------------------------------
--  Constraints for Table GROUP_ROLES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."GROUP_ROLES" MODIFY ("GROUP_ROLE_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."GROUP_ROLES" ADD CONSTRAINT "Unique_Identifier17" PRIMARY KEY ("GROUP_ROLE_CODE") ;
--------------------------------------------------------
--  Constraints for Table HIERARCHY
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."HIERARCHY" MODIFY ("NODE_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."HIERARCHY" ADD CONSTRAINT "Unique_Identifier18" PRIMARY KEY ("NODE_CODE");
--------------------------------------------------------
--  Constraints for Table LANGUAGES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."LANGUAGES" ADD CONSTRAINT "Unique_Identifier_lang" PRIMARY KEY ("LANG_CODE");
--------------------------------------------------------
--  Constraints for Table PRODUCT
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."PRODUCT" MODIFY ("PRODUCT_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."PRODUCT" MODIFY ("DESCRIPTION" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."PRODUCT" MODIFY ("CREATED_ON" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."PRODUCT" MODIFY ("CREATED_BY" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."PRODUCT" ADD CONSTRAINT "Unique_Identifier24" PRIMARY KEY ("PRODUCT_CODE");
--------------------------------------------------------
--  Constraints for Table RESOURCES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."RESOURCES" MODIFY ("RESOURCE_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."RESOURCES" MODIFY ("RESOURCE_DESC" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."RESOURCES" MODIFY ("CREATED_ON" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."RESOURCES" MODIFY ("CREATED_ BY" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."RESOURCES" MODIFY ("SEQUENCE_NO" NOT NULL ENABLE);
  
  ALTER TABLE "MESSMASTER"."RESOURCES" MODIFY ("LOCALE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."RESOURCES" ADD CONSTRAINT "Unique_Identifier9" PRIMARY KEY ("RESOURCE_ID", "LOCALE");
 
  ALTER TABLE "MESSMASTER"."RESOURCES" ADD CONSTRAINT "ValidValuesRESOURCE_TYPE" CHECK (("RESOURCE_TYPE" IN ('SUBMENU','SUBOPR'))) ENABLE;
--------------------------------------------------------
--  Constraints for Table ROLES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."ROLES" MODIFY ("ROLE_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."ROLES" MODIFY ("PRODUCT_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."ROLES" ADD CONSTRAINT "Unique_Identifier8" PRIMARY KEY ("ROLE_CODE", "PRODUCT_CODE") ;
--------------------------------------------------------
--  Constraints for Table ROLES_GROUP_ROLES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."ROLES_GROUP_ROLES" MODIFY ("ROLE_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."ROLES_GROUP_ROLES" MODIFY ("GROUP_ROLE_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."ROLES_GROUP_ROLES" MODIFY ("PRODUCT_CODE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ROLES_HIERARCHY
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."ROLES_HIERARCHY" MODIFY ("ROLE_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."ROLES_HIERARCHY" MODIFY ("NODE_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."ROLES_HIERARCHY" MODIFY ("PRODUCT_CODE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ROLES_RESOURCES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."ROLES_RESOURCES" MODIFY ("ROLE_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."ROLES_RESOURCES" MODIFY ("PRODUCT_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."ROLES_RESOURCES" MODIFY ("RESOURCE_ID" NOT NULL ENABLE);
 
--------------------------------------------------------
--  Constraints for Table SYS_PREFERENCES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."SYS_PREFERENCES" ADD CONSTRAINT "SYS_PREFERENCES_PK" PRIMARY KEY ("PREFERENCE_CODE") ;
--------------------------------------------------------
--  Constraints for Table USER_AUDIT_TRAIL
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USER_AUDIT_TRAIL" MODIFY ("AUDIT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USER_AUDIT_TRAIL" MODIFY ("ACCOUNT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USER_AUDIT_TRAIL" ADD CONSTRAINT "Unique_Identifier14" PRIMARY KEY ("AUDIT_ID", "ACCOUNT_ID") ;

--------------------------------------------------------
--  Constraints for Table USER_LOGON_AUDIT
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USER_LOGON_AUDIT" MODIFY ("LOGON_AUDIT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USER_LOGON_AUDIT" MODIFY ("ACCOUNT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USER_LOGON_AUDIT" ADD CONSTRAINT "Unique_Identifier15" PRIMARY KEY ("LOGON_AUDIT_ID", "ACCOUNT_ID");
--------------------------------------------------------
--  Constraints for Table USER_PASSWORDS
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USER_PASSWORDS" MODIFY ("ACCOUNT_ID" NOT NULL ENABLE);
  
  ALTER TABLE "MESSMASTER"."USER_PASSWORDS" ADD CONSTRAINT "Unique_Identifier13" PRIMARY KEY ("ACCOUNT_ID");
--------------------------------------------------------
--  Constraints for Table USER_THRESHOLDS
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USER_THRESHOLDS" MODIFY ("THRESHOLD_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USER_THRESHOLDS" MODIFY ("ACCOUNT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USER_THRESHOLDS" ADD CONSTRAINT "Unique_Identifier5" PRIMARY KEY ("THRESHOLD_ID", "ACCOUNT_ID");
--------------------------------------------------------
--  Constraints for Table USERS
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USERS" MODIFY ("ACCOUNT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USERS" MODIFY ("NODE_CODE" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USERS" MODIFY ("CREATED_ON" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USERS" MODIFY ("CREATED_BY" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USERS" ADD CONSTRAINT "Unique_Identifier1" PRIMARY KEY ("ACCOUNT_ID");
 
  ALTER TABLE "MESSMASTER"."USERS" ADD CONSTRAINT "ValidValuesAUTHENTICATION_TYPE" CHECK (("AUTHENTICATION_TYPE" IN ('THIRD PARTY','SYSTEM'))) ENABLE;
--------------------------------------------------------
--  Constraints for Table USERS_GROUP_ROLES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USERS_GROUP_ROLES" MODIFY ("ACCOUNT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USERS_GROUP_ROLES" MODIFY ("GROUP_ROLE_CODE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table USERS_KYC_INFO
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USERS_KYC_INFO" MODIFY ("KYC_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USERS_KYC_INFO" MODIFY ("ACCOUNT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "MESSMASTER"."USERS_KYC_INFO" ADD CONSTRAINT "Unique_Identifier4" PRIMARY KEY ("KYC_ID", "ACCOUNT_ID");  


--------------------------------------------------------
--  Ref Constraints for Table ROLES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."ROLES" ADD CONSTRAINT "DEPENDS ON" FOREIGN KEY ("PRODUCT_CODE")
	  REFERENCES "MESSMASTER"."PRODUCT" ("PRODUCT_CODE") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ROLES_GROUP_ROLES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."ROLES_GROUP_ROLES" ADD CONSTRAINT "is part of_GROUP_ROLES" FOREIGN KEY ("GROUP_ROLE_CODE")
	  REFERENCES "MESSMASTER"."GROUP_ROLES" ("GROUP_ROLE_CODE") ENABLE;
 
  ALTER TABLE "MESSMASTER"."ROLES_GROUP_ROLES" ADD CONSTRAINT "is part of_ROLES" FOREIGN KEY ("ROLE_CODE", "PRODUCT_CODE")
	  REFERENCES "MESSMASTER"."ROLES" ("ROLE_CODE", "PRODUCT_CODE") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ROLES_HIERARCHY
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."ROLES_HIERARCHY" ADD CONSTRAINT "SUPERSET_HIERARCHY" FOREIGN KEY ("NODE_CODE")
	  REFERENCES "MESSMASTER"."HIERARCHY" ("NODE_CODE") ENABLE;
 
  ALTER TABLE "MESSMASTER"."ROLES_HIERARCHY" ADD CONSTRAINT "SUPERSET_ROLES" FOREIGN KEY ("ROLE_CODE", "PRODUCT_CODE")
	  REFERENCES "MESSMASTER"."ROLES" ("ROLE_CODE", "PRODUCT_CODE") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ROLES_RESOURCES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."ROLES_RESOURCES" ADD CONSTRAINT "Relationship10_ROLES" FOREIGN KEY ("ROLE_CODE", "PRODUCT_CODE")
	  REFERENCES "MESSMASTER"."ROLES" ("ROLE_CODE", "PRODUCT_CODE") ENABLE;




--------------------------------------------------------
--  Ref Constraints for Table USER_AUDIT_TRAIL
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USER_AUDIT_TRAIL" ADD CONSTRAINT "action create" FOREIGN KEY ("ACCOUNT_ID")
	  REFERENCES "MESSMASTER"."USERS" ("ACCOUNT_ID") ENABLE;

--------------------------------------------------------
--  Ref Constraints for Table USER_LOGON_AUDIT
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USER_LOGON_AUDIT" ADD CONSTRAINT "access creates" FOREIGN KEY ("ACCOUNT_ID")
	  REFERENCES "MESSMASTER"."USERS" ("ACCOUNT_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table USER_PASSWORDS
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USER_PASSWORDS" ADD CONSTRAINT "IS AUTHENTICATED WITH" FOREIGN KEY ("ACCOUNT_ID")
	  REFERENCES "MESSMASTER"."USERS" ("ACCOUNT_ID") ENABLE;
 
--------------------------------------------------------
--  Ref Constraints for Table USER_THRESHOLDS
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USER_THRESHOLDS" ADD CONSTRAINT "MAINTAIN" FOREIGN KEY ("ACCOUNT_ID")
	  REFERENCES "MESSMASTER"."USERS" ("ACCOUNT_ID") ENABLE;

--------------------------------------------------------
--  Ref Constraints for Table USERS_GROUP_ROLES
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USERS_GROUP_ROLES" ADD CONSTRAINT "are assigned_GROUP_ROLES" FOREIGN KEY ("GROUP_ROLE_CODE")
REFERENCES "MESSMASTER"."GROUP_ROLES" ("GROUP_ROLE_CODE") ENABLE;
  ALTER TABLE "MESSMASTER"."USERS_GROUP_ROLES" ADD CONSTRAINT "are assigned_USERS" FOREIGN KEY ("ACCOUNT_ID")
	  REFERENCES "MESSMASTER"."USERS" ("ACCOUNT_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table USERS_KYC_INFO
--------------------------------------------------------

  ALTER TABLE "MESSMASTER"."USERS_KYC_INFO" ADD CONSTRAINT "are validated with" FOREIGN KEY ("ACCOUNT_ID")
	  REFERENCES "MESSMASTER"."USERS" ("ACCOUNT_ID") ENABLE;
	  
	  spool off;
	  
