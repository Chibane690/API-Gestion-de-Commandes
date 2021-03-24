-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------

USE dbGestion;


-- -----------------------------------------------------------------------------
-- - Construction de la table des informations clients                  ---
-- -----------------------------------------------------------------------------


INSERT INTO clients (nom_client, prenom_client, ville_client, Code_postal_client) 
VALUES ( 'Chibane', 'Yahya', 'casa', 20020 ),
       ( 'Akkad', 'Youness', 'Tata', 30030 ),
       ( 'Yasser', 'Chibane', 'New York',2000 ),
       ( 'Nisrine', 'Chibane', 'oujda', 4004 );


SELECT * FROM clients;

-- -----------------------------------------------------------------------------
-- - Construction de la table des Produits                               ---
-- -----------------------------------------------------------------------------



INSERT INTO produits (nom_produit, prix_unitaire_produit,quantite_stock_produi,tva_produit) 
VALUES ( 'iphone 12',   1000.0 , 100 , 0.2),
       ( 'iphone 8',   200.0 ,   130 , 0.2),
       ( 'iphone 7' ,    400.0 , 200 , 0.2),
       ( 'iphone 6',      500.0 , 150 , 0.2);

SELECT * FROM produits;

-- -----------------------------------------------------------------------------
-- - Construction de la table Commande                  ---
-- -----------------------------------------------------------------------------



INSERT INTO commandes ( id_client) 
VALUES (  1 ),
       (  2 ),
       (  3 );

SELECT * FROM commandes;

-- -----------------------------------------------------------------------------
-- - Construction de la table composantes                  ---
-- -----------------------------------------------------------------------------


INSERT INTO composantes ( quantite_composante,id_commande,id_produit) 
VALUES (  5 , 1 , 1 ),
       (  2 , 1 , 2 ),
       (  3 , 2 , 1 ),
       (  3 , 2 , 2 ),
       (  3 , 3 , 1 ),
       (  3 , 3 , 2 );

SELECT * FROM composantes;