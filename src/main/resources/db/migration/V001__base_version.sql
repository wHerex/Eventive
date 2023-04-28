CREATE TABLE PLACE
(
    GUID         CHAR(36) NOT NULL,
    NAME         VARCHAR(255) DEFAULT NULL,
    ADDRESS_GUID CHAR(36) UNIQUE DEFAULT NULL,
    RATING_GUID  CHAR(36) UNIQUE DEFAULT NULL,
    CONTACT_GUID CHAR(36) UNIQUE DEFAULT NULL,

    PRIMARY KEY (GUID),

    CONSTRAINT FK_PLACE_ADDRESS_GUID FOREIGN KEY (ADDRESS_GUID) REFERENCES PLACE (ADDRESS_GUID),
    CONSTRAINT FK_PLACE_RATING_GUID FOREIGN KEY (RATING_GUID) REFERENCES PLACE (RATING_GUID),
    CONSTRAINT FK_CONTACT_RATING_GUID FOREIGN KEY (CONTACT_GUID) REFERENCES PLACE (CONTACT_GUID)
);

CREATE TABLE ADDRESS
(
    GUID     CHAR(36)     NOT NULL,
    CITY     VARCHAR(255) NOT NULL,
    STREET   VARCHAR(255) NOT NULL,
    POSTCODE VARCHAR(10)  NOT NULL,

    PRIMARY KEY (GUID)
);

CREATE TABLE RATING
(
    GUID        CHAR(36) NOT NULL,
    CLIENT_GUID CHAR(36)     DEFAULT NULL,
    RATE        INT      NOT NULL,
    DESCRIPTION VARCHAR(255) DEFAULT NULL,

    PRIMARY KEY (GUID)
);

CREATE TABLE CONTACT (
    GUID        CHAR(36) NOT NULL,
    NAME         VARCHAR(255) DEFAULT NULL,
    EMAIL         VARCHAR(255) DEFAULT NULL,
    PHONE_NUMBER        INT      NOT NULL,

    PRIMARY KEY (GUID)
);

INSERT INTO CONTACT VALUES(gen_random_uuid(), 'Marcin Ogrodniczak', 'marcin.ogrodniczak@gmail.com', 608399202);
