# uBook

## Description du Projet
Projet JEE  
Utilise Spring Boot, Hibernate et le moteur de templates Thymeleaf.

Utilitaire Web conçu dans le but de pouvoir gérer un club de sport. 
Cet outil est imaginé comme une aide à la gestion des réservations des différentes salles, par les membres du club.

La page principale présente 4 possibilités :

### Add Member
Permet au gérant d'ajouter un membre inscrit à son club en mentionnant les informations requises

### See Members
Permet au gérant du club de consulter la liste des membres inscrits, et de les lister selon différents critères (nom, date de naissance, ...)

### Add Booking
Permet au gérant du club d'entrer une réservation. Il peut choisir le membre concerné, puis le lieu (Place) et la ressource (Ressource) demandée. Il doit ensuite entrer la date de réservation.

#### Précision sur les notions de Place et Ressource.
Nous avons imaginé un système qui puisse être relativement générique, pour pouvoir fonctionner avec différents club de sport.
+ Place (lieu) :
Ces clubs présente toujours un ou plusieurs lieux (salles de sport, etc...) où exercer son sport, ce qui est symbolisé par la classe Place.
+ Ressource (ressource) :
Ces lieux sont souvent subdivisés en plus petites entités, comme des terrains dans le cas d'une salle de tennis, des piscines ou des voix d'escalades. Ce sont les Ressources.

### See Reservations
Permet de consulter et gérer les différentes réservations déjà enregistrées.

## Architecture du projet
Dans cette partie, une brève description des différents packages et de ce qu'ils contiennent

### Model
Dans ce package, toutes les classes java relatives au modèle de données sont présentes qui sont : Club, Place, Ressource, Member et Booking.

### Controller
Il y a un controller par page web (vue). Chacun controller contient l'ensemble des méthodes nécessaires à la modification d'un ModelAndView (on modifie le modèle et la vue sera modifiée en conséquence)

### Repository
Les repositories représentent les dépôts, le moyen d'intéragir avec la base de données.

### Tests
Comme expliqué en cours, nous avions déjà commencé à implémenter notre projet avant que soité évoqué l'idée de faire du TDD.
De fait, nous avons continué ainsi. Nous avons donc fait quelques tests par la suite.
Il a été assez difficile de faire configuration des tests pour les repositories, mais nous avons fini par y arrivé et c'est sur la mise en place de ces tests que nous nous sommes concentré.

Pour notre projet, nous avons en plus créé un script contenant plusieurs requetes SQL pour créer en base les Places et Ressources. Nous avons pris l'exemple du club d'escalade Whatsup, qui propose trois salles différentes (Lille, Villeneuve d'Ascq et Wambrechies), chacune des salles ayant des voies ou des blocs plus ou moins nombreux.
