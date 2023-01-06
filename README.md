# Mini_Annuaire-JAVAEE
Application Web de gestion de l'annuaire scolaire Avec Java JEE( JSP + SERVLET ) + Mysql

Description de l’application:

• L’application simule l’accès à un annuaire scolaire. Sa consultation s’effectue par l’intermédiaire du Web à l’aide d’un ensemble de JSP et de pages HTML constituant une application Web 3-tier (MVC).
• Le stockage des données de l’application se fait sur une base MySQL qui est accédée grâce à JDBC.
• Au début, les données sont stockées dans une unique table « étudiant» qui stocke les CNE, nom, prénom, filière, département et téléphone de chacune des entrées de l’annuaire. Mis à part le CNE, numérique (number),
chaque colonne de la table est stockée sous la forme d’une chaîne de caractères (varchar). 
Ces chaînes ont une taille maximale qu’il faut impérativement respecter lors des insertions.
• La page d’accueil de l’application affiche deux menus (utilisation et administration) qui permet d’effectuer des actions sur l’annuaire :
Menu utilisation :
    Liste complète des étudiants
    Recherche d’un étudiant
    Liste complète des départements
    Recherche d’un département
    Liste complète des filières
    Recherche d’une filière
 Menu administration :
    Insertion d’un nouvel étudiant
    Insertion d’un nouveau département
    Insertion d’une nouvelle filière
• Seul le premier item du menu utilisation est réalisé et fonctionnel, il permet d’afficher la liste complète des étudiants référencées dans la base.
• Ultérieurement, l’application gérera aussi les départements dans lequel appartiennent les étudiants.
