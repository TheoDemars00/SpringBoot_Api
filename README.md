Theo Demars SpringBoot REST API

## Installation JAVA
 - git clone dans le dossier souhaité
 - Ouvrir SpringBoot_API dans l'IDE JAVA de votre choix
 - Clique droit sur le fichier pom.xml -> Maven -> Reload project (pour charger les dépendances)
 - Build le projet
 - Clique droit sur le fichier api\src\main\java\com\tdemars\api\ApiApplication.java -> Run as Java Application

## Test via Postman
 - Ouvrir Postman

 - Faire une requête GET sur http://localhost:9000/teams -> la liste des équipes est retournée
 - Faire une requête GET sur http://localhost:9000/teams/1 -> l'équipe avec l'id 1 est retourné
 - Faire une requête POST sur http://localhost:9000/teams en indiquant dans le body un JSON (ex : {"teamName": "Lakers", "city": "Los Angeles"}) avec les attributs de l'équipe -> l'équipe est créé
 - Faire une requête GET sur http://localhost:9000/teams -> la liste des équipes est retournée avec la nouvelle équipe
 - Faire une requête PUT sur http://localhost:9000/teams/3 en indiquant dans le body au format JSON (ex : {"teamName": "Clippers", "city": "Los Angeles"} les nouvelles informations sur une equipe déjà créer 
 - Faire une requête DELETE sur http://localhost:9000/teams/3 -> Supprime l'équipe possédant l'ID 3

 - Faire une requête GET sur http://localhost:9000/players -> la liste des joueurs est retournée
 - Faire une requête GET sur http://localhost:9000/players/1 -> le joueur avec l'id 1 est retourné
 - Faire une requête POST sur  http://localhost:9000/players en indiquant dans le body un JSON (ex : {"firstName": "Jaylen", "lastName": "Brown", "position": "Small Forward", "age" : 27}) avec les attributs du joueur -> le joueur est créé
 - Faire une requête GET sur  http://localhost:9000/players -> la liste des joueurs est retournée avec le nouveau joueur 
 - Faire une requête PUT sur http://localhost:9000/players/3 en indiquant dans le body au format JSON (ex : {"firstName": "Jaylen", "lastName": "Brown", "position": "Shooting Guard", "age" : 27} les nouvelles informations sur un joueur déjà créer 
 - Faire une requête DELETE sur http://localhost:9000/players/3 -> Supprime le joueurs possédant l'ID 3 

## Utilisation avec le script NodeJS
 - Ouvrir un terminal a la racine du projet
 - Taper la commande : `cd JS` 
 - Faire la commande `npm install axios` pour installer la dépendance axios
 - Faire la commande `node script.js` pour lancer le script

#### Attention ! 
Veuillez noter que le script exécute les requêtes dans un ordre qui n'est pas toujours cohérent. Il est possible que certaines erreurs soient remontées, car vous tentez d'update des données qui ont été préalablement supprimées par le script. Si cela se produit, éditez le fichier : "script.js" en modifiant les id dans les méthodes PUT et Delete
