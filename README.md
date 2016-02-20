# uBook

## Description du Projet
Projet JEE Spring Boot

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
