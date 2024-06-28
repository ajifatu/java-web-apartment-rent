# java-web-apartment-rent

![work status](https://img.shields.io/badge/work-on%20progress-red.svg)

PROJECT DESCRIPTION  
JEE web application that will enable owners to manage their properties, tenants to find lettings and administrators to oversee the entire system.  
**Context**: Advanced Java class

Technos:
+ Java EE (Servlets, JSP, EJB)
+ Tomcat 9.0
+ JDK 22
+ Maven 3.9.*
+ JPA/Hibernate
+ MySQL

# Database Schema

## Utilisateurs
| Column          | Type         | Description                                      |
|-----------------|--------------|--------------------------------------------------|
| id              | INT          | Primary Key, Auto Increment                      |
| username        | VARCHAR(255) | Unique, Non Null                                 |
| name            | VARCHAR(255) | Non Null                                         |
| email           | VARCHAR(255) | Unique, Non Null                                 |
| password        | VARCHAR(255) | Non Null                                         |
| photo           | VARCHAR(255) | Optional                                         |
| phoneNumber     | VARCHAR(20)  | Optional                                         |
| sexe            | ENUM         | ('M', 'F', 'O'), Optional                        |
| role            | ENUM         | ('ADMIN', 'PROPRIETAIRE', 'LOCATAIRE'), Non Null |
| idCard          | VARCHAR(255) | Optional                                         |
| proofOfIncome   | VARCHAR(255) | Optional (for LOCATAIRE)                         |
| proprietyProof  | VARCHAR(255) | Optional (for PROPRIETAIRE)                      |
| statut          | ENUM         | ('ACTIF', 'INACTIF'), Default 'ACTIF'            |

## Immeuble
| Column      | Type         | Description                 |
|-------------|--------------|-----------------------------|
| id          | INT          | Primary Key, Auto Increment |
| nom         | VARCHAR(255) | Non Null                    |
| description | TEXT         | Optional                    |
| ville       | VARCHAR(255) | Non Null                    |
| adresse     | VARCHAR(255) | Non Null                    |
| statut      | ENUM         | ('ACTIF', 'INACTIF')        |

## PhotosImmeuble
| Column      | Type         | Description                 |
|-------------|--------------|-----------------------------|
| id          | INT          | Primary Key, Auto Increment |
| immeuble_id | INT          | Foreign Key to Immeuble     |
| url         | VARCHAR(255) | Non Null                    |

## Equipements
| Column        | Type         | Description |
|---------------|--------------|-------------|
| id            | INT          | Primary Key, Auto Increment |
| ascenseurs    | INT          | Optional                    |
| caméra        | BOOLEAN      | Optional                    |
| salleDeSport  | BOOLEAN      | Optional                    |
| parking       | BOOLEAN      | Optional                    |
| terrasse      | BOOLEAN      | Optional                    |

## Services
| Column        | Type         | Description |
|---------------|--------------|-------------|
| id            | INT          | Primary Key, Auto Increment |
| nettoyage     | BOOLEAN      | Optional                    |
| accesInternet | BOOLEAN      | Optional                    |
| blanchisserie | BOOLEAN      | Optional                    |
| gardiennage   | BOOLEAN      | Optional                    |

## Appartement
| Column       | Type         | Description                 |
|--------------|--------------|-----------------------------|
| id           | INT          | Primary Key, Auto Increment |
| nom          | VARCHAR(255) | Non Null                    |
| description  | TEXT         | Optional                    |
| statut       | ENUM         | ('DISPONIBLE', 'LOUÉ')      |
| superficie   | DECIMAL(10,2)| Optional                    |
| loyer        | DECIMAL(10,2)| Non Null                    |
| caution      | INT          | Number of months, Non Null  |
| meublé       | BOOLEAN      | Non Null                    |
| chargesInclues| BOOLEAN     | Non Null                    |

## PhotosAppartement
| Column          | Type         | Description                 |
|-----------------|--------------|-----------------------------|
| id              | INT          | Primary Key, Auto Increment |
| appartement_id  | INT          | Foreign Key to Appartement  |
| url             | VARCHAR(255) | Non Null                    |

## Pieces
| Column                   | Type  | Description |
|--------------------------|-------|-------------|
| id                       | INT   | Primary Key, Auto Increment |
| chambres                 | INT   | Non Null                    |
| chambreAvecSalleDeBain   | INT   | Non Null                    |
| cuisine                  | INT   | Non Null                    |
| salon                    | INT   | Non Null                    |
| toilettes                | INT   | Non Null                    |
| buanderie                | INT   | Non Null                    |
| salleAManger             | INT   | Non Null                    |

## Contrat
| Column     | Type         | Description                 |
|------------|--------------|-----------------------------|
| id         | INT          | Primary Key, Auto Increment |
| debut      | DATE         | Non Null                    |
| fin        | DATE         | Non Null                    |
| statut     | ENUM         | ('ACTIF', 'TERMINÉ')        |
| document   | VARCHAR(255) | Optional                    |
| message    | TEXT         | Optional                    |

## Messages
| Column     | Type         | Description                 |
|------------|--------------|-----------------------------|
| id         | INT          | Primary Key, Auto Increment |
| sender     | INT          | Foreign Key to Utilisateurs |
| receiver   | INT          | Foreign Key to Utilisateurs |
| content    | TEXT         | Non Null                    |
| object     | VARCHAR(255) | Non Null                    |

# Relations
- Un `Utilisateur` peut être un `LOCATAIRE`, un `PROPRIETAIRE`, ou un `ADMIN`.
- Un `Immeuble` peut contenir un ou plusieurs `Appartement`.
- Un `Immeuble` peut avoir plusieurs `Equipements` et `Services`.
- Un `Appartement` peut avoir plusieurs `Pieces`.
- Un `Contrat` lie un `LOCATAIRE`, un `PROPRIETAIRE`, et un `Appartement`.
- Un `Immeuble` peut avoir plusieurs `PhotosImmeuble`.
- Un `Appartement` peut avoir plusieurs `PhotosAppartement`.


