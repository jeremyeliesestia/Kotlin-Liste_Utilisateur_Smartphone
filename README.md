# Créer une application de gestion de tâches 
Dans ce TP vous allez réaliser une application de gestion de tâches en utilisant une API REST. 

# Liens vers les slides 
https://drive.google.com/drive/folders/1g-RpHOLWInkNnwskicv0TDiqZJvT2JWK?usp=sharing


Pour effectuer des appels réseaux depuis une application Android > https://docs.google.com/presentation/d/1_kzOG3mOXAHgRLB5ldJ7Y2bh1e2DcnU5/edit#slide=id.p23

# Lien vers l'assignment sur Github classroom
https://classroom.github.com/a/rDJsajU_

# Description de l'API
L'url de base de l'API étant : https://dmi-gobelins.herokuapp.com/

## Liste des actions 
1. Créer une tâche `POST /todos` : JsonArray
2. Lister les tâches `GET /todos`: JsonObject
3. Terminer une tâche `PUT /todos/{id}/status/1`: JsonObject
4. Réouvert une tâche `PUT /todos/{id}/status/0`: JsonObject
5. Supprimer une tâche `DELETE /todos/{id}`: JsonObject

## Structure d'une tâche 
```json
{
        "_id": "6227e16b5869760016ae3f80",
        "task": "Fix Sink",
        "description": "This sink has been broken for too long now, it's time to fix it",
        "requested_by": "John",
        "assignee": "Doe",
        "due_date": "2021-03-09 10:00:00"
 }
```
>> Vous pouvez utiliser la collection postman pour tester l'API
# Partie 1
Utiliser l'API REST.
  - Ajouter une tâche
  - Lister toutes les tâches
  - Terminer une tâche
  - Réouvert une tâche
  - Supprimer une tâche

# Partie 2
Gestion d'une base de données locales
- Sauvegarder les tâches récupérées du serveur dans une base de données locales (Room)
- Si internet, effectuer les toutes les opérations en ligne et maintenir la base en local à jour 
- Si hors connexion, utiliser uniquement les données en locales
- Quand la connexion internet est rétablie, synchroniser les opérations locales avec celles sur le serveur en respectant les contraintes suivantes: 
        - Si une tâche à été supprimée sur le serveur, il ne faut pas la recréer (i.e la supprimer en locale); 
        - Les tâches supprimées en locales doivent être supprimées sur le serveur;
        - Les tâches créées en locales doivent être synchronisées avec le serveur;
        - Si une tâche a été modifiée en local et sur le serveur, prioriser l'état du serveur

# Partie 3
Créer des tests unitaires, d'intégrations et instrumentaires
- Faire des tests instrumentaires sur moins 3 cas d'utilisation
- Faire des tests d'intégration sur la base de données
- Tester unitairement le repository

# Bonus
- Possibilité de partager une tâche (WhatsApp, Facebook, Email, ...)
- Afficher une notification quand de nouvelles tâches sont créés et/ou quand les dates limites des tâches sont passées 

# Contraintes
- Design : Faites travailler votre imagination pour proposer une application la plus zolie que possible
- L'application doit avoir une seule activité qui gère uniquement la navigation
- Toutes les vues de l'application doivent être gérées dans des fragments
- Les fragments doivent gérer uniquement l'affichage de données
- Les données des vues sont gérées dans des viewmodels
- Les données de l'application sont gérés dans un repository
- La communication entre les différentes couches se fait via des livedatas
