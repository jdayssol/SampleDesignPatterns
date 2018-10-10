____              _                ____          _    _
|  _ \   ___  ___ (_)  __ _  _ __  |  _ \   __ _ | |_ | |_   ___  _ __  _ __  
| | | | / _ \/ __|| | / _` || '_ \ | |_) | / _` || __|| __| / _ \| '__|| '_ \ 
| |_| ||  __/\__ \| || (_| || | | ||  __/ | (_| || |_ | |_ |  __/| |   | | | |
|____/  \___||___/|_| \__, ||_| |_||_|     \__,_| \__| \__| \___||_|   |_| |_|
​                      |___/                                                   

# DesignPatterns
A list of design pattern in java / Sample of Stream / Best practices

## Behaviour - Comportement

### Chain of responsability
**Definition :** 
- permet à un nombre quelconque de classes d'essayer de répondre à une requête sans connaître les possibilités des autres classes sur cette requête. Cela permet de diminuer le couplage entre objets. Le seul lien commun entre ces objets étant cette requête qui passe d'un objet à l'autre jusqu'à ce que l'un des objets puisse répondre.

**Utilisation :**
- Dès lors qu'une information doit recevoir plusieurs traitements, ou juste être transmise entre différents objets.Une variante de ce patron de conception est un arbre de responsabilité, où chaque nœud de traitement transmet l'objet non plus à un seul autre nœud mais à plusieurs nœuds

### Command
**Definition :** 
- encapsule la notion d'invocation. Il permet de séparer complètement le code initiateur de l'action, du code de l'action elle-même. Ce patron de conception est souvent utilisé dans les interfaces graphiques où, par exemple, un item de menu peut être connecté à différentes Commandes de façons à ce que l'objet d'item de menu n'ait pas besoin de connaître les détails de l'action effectuée par la Commande.
- Un objet Commande sert à communiquer une action à effectuer, ainsi que les arguments requis. L'objet est envoyé à une seule méthode dans une classe, qui traite les Commandes du type requis. L'objet est libre d'implémenter le traitement de la Commande par un switch, ou un appel à d'autres méthodes (notamment des méthodes surchargées dans les sous-classes). Cela permet d'apporter des modifications aux Commandes définies simplement dans la définition de la Commande, et non dans chaque classe qui utilise la Commande.

**Utilisation :**
- Dès lors qu'il y a prolifération de méthodes similaires, et que le code de l'interface devient difficile à maintenir. Par exemple lorsque les objets possèdent trop de méthodes publiques à l'usage d'autres objets,l'interface est inexploitable et on la modifie tout le temps,les noms des méthodes deviennent de longues périphrases.

### Interpreter
**Definition :** 
- utilisé pour des logiciels ayant besoin d'un langage afin de décrire les opérations qu'ils peuvent réaliser (exemple : SQL pour interroger une base de données).
- Le modèle de conception Interpréteur définit la grammaire de ce langage et utilise celle-ci pour interpréter des états dans ce langage.
- Ce patron définit comment interpréter les éléments du langage. Dans ce patron de conception, il y a une classe par symbole terminal et non-terminal du langage à interpréter. L'arbre de syntaxe du langage est représenté par une instance du patron de conception

**Utilisation :**
- Ce patron de conception est très utile dans deux cas: 
- lorsque le logiciel doit analyser/interpréter une chaîne algébrique. C'est un cas assez évident où le logiciel doit exécuter des opérations en fonction d'une équation (dessiner la courbe d'une fonction par exemple),
- lorsque le logiciel doit produire différents types de données comme résultat. Ce cas est moins évident, mais l'interpréteur y est très utile. Prenez l'exemple d'un logiciel capable d'afficher des données dans n'importe quel ordre, en les triant ou pas, etc.

### Iterator
**Definition :** 
- Un itérateur est un objet qui permet de parcourir tous les éléments contenus dans un autre objet, le plus souvent un conteneur (liste, arbre, etc.). Un synonyme d'itérateur est curseur, notamment dans le contexte des bases de données.
- Un itérateur ressemble à un pointeur disposant essentiellement de deux primitives : accéder à l'élément pointé en cours (dans le conteneur), et se déplacer pour pointer vers l'élément suivant. En sus, il faut pouvoir créer un itérateur pointant sur le premier élément ; ainsi que déterminer à tout moment si l'itérateur a épuisé la totalité des éléments du conteneur. Diverses implémentations peuvent également offrir des comportements supplémentaires.

**Utilisation :**
- Le but d'un itérateur est de permettre à son utilisateur de parcourir le conteneur, c'est-à-dire d'accéder séquentiellement à tous ses éléments pour leur appliquer un traitement, tout en isolant l'utilisateur de la structure interne du conteneur, potentiellement complexe. Ainsi, le conteneur peut stocker les éléments de la façon qu'il veut, tout en permettant à l'utilisateur de le traiter comme une simple liste. Le plus souvent l'itérateur est conçu en même temps que la classe-conteneur qu'il devra parcourir, et ce sera le conteneur lui-même qui créera et distribuera les itérateurs pour accéder à ses éléments.

### Mediator
**Definition :** 
- Fournit une interface unifiée pour un ensemble d'interfaces d'un sous-système. Il est utilisé pour réduire les dépendances entre plusieurs classes.
- Le Médiateur est la seule classe ayant connaissance des interfaces des autres classes. Lorsqu'une classe désire interagir avec une autre, elle doit passer par le médiateur qui se chargera de transmettre l'information à la ou les classes concernées.

**Utilisation :**
- Lorsqu'un logiciel est composé de plusieurs classes, les traitements et les données sont répartis entre toutes ces classes. Plus il y a de classes, plus le problème de communication entre celles-ci peut devenir complexe. En effet, plus les classes dépendent des méthodes des autres classes plus l'architecture devient complexe. Cela ayant des impacts sur la lisibilité du code et sa maintenabilité dans le temps. 


### Memento
**Definition :** 
- fournit la manière de renvoyer un objet à un état précédent (retour arrière) sans violer le principe d'encapsulation.
- Le fait de sauvegarder l'état interne de l'objet créateur doit s'effectuer sans casser le principe d'encapsulation.

**Utilisation :**
- Le mémento est utilisé par deux objets : le créateur et le gardien. Le créateur est un objet ayant un état interne (état à sauvegarder). Le gardien agira sur le créateur, tout en conservant la possibilité de revenir en arrière. Le gardien demande alors au créateur l'objet mémento pour enregistrer son état actuel. Il effectue l'opération (ou séquence d'opérations) souhaitée. 
- Afin de permettre le retour arrière dans l'état d'avant les opérations, le mémento est retourné au créateur. L'objet mémento même est opaque (le gardien ne peut, ou ne devrait pas, le modifier). Lors de l'utilisation de ce patron, une attention toute particulière doit être prise si le créateur modifie d'autres objets ou ressources : Le patron mémento n'opère que sur un seul objet.


### Observer
**Definition :** 
- Permet d'envoyer un signal à des modules qui jouent le rôle d'observateur. En cas de notification, les observateurs effectuent alors l'action adéquate en fonction des informations qui parviennent depuis les modules qu'ils observent (les "observables").
- Le principe est que chaque classe observable contienne une liste d'observateurs, ainsi à l'aide d'une méthode de notification l'ensemble des observateurs sont prévenus. La classe observée hérite de "Observable" qui gère la liste des observateurs. La classe Observateur est quant à elle purement abstraite, la fonction de mise à jour ne pouvant être définie que par une classe spécialisée.

**Utilisation :**
- La notion d'observateur/observable permet de découpler des modules de façon à réduire les dépendances aux seuls phénomènes observés.
- Dès que l'on a besoin de gérer des événements, quand une classe déclenche l'exécution d'une ou plusieurs autres.
- Dans une interface graphique utilisant MVC (Modèle-Vue-Contrôleur), le patron Observateur est utilisé pour associer Modèle et Vue. Par exemple, en Java Swing, le modèle est censé notifier la vue de toute modification en utilisant PropertyChangeNotification. Les Java beans sont les observés, les éléments de la vue sont les observateurs. Tout changement dans le modèle est alors visible sur l'interface graphique.

### Visitor
**Definition :** 
- Le visiteur est une manière de séparer un algorithme d'une structure de données. Un visiteur possède une méthode par type d'objet traité. Pour ajouter un nouveau traitement, il suffit de créer une nouvelle classe dérivée de la classe Visiteur. On n'a donc pas besoin de modifier la structure des objets traités, contrairement à ce qu'il aurait été obligatoire de faire si on avait implémenté les traitements comme des méthodes de ces objets.

**Utilisation :**
- L'avantage du patron visiteur est qu'un visiteur peut avoir un état. Ce qui signifie que le traitement d'un type d'objet peut différer en fonction de traitements précédents. Par exemple, un visiteur affichant une structure arborescente peut présenter les nœuds de l'arbre de manière lisible en utilisant une indentation dont le niveau est stocké comme valeur d'état du visiteur.


### State
**Definition :** 
- Est utilisé entre autres lorsqu'il est souhaité pouvoir changer le comportement de l'État d'un objet sans pour autant en changer l'instance.
- Ce patron permet donc à la classe de passer d'un état à l'autre de telle façon que cette dernière apparaît changer de type dynamiquement (sans changer d'instance).

**Utilisation :**
- La classe censée changer d'état a un lien vers une classe abstraite "État". Cette classe abstraite "État" définit les différentes méthodes qui seront à redéfinir dans les implémentations. Dans chaque classe dérivée d'État, l'appel à la méthode X pourra avoir un comportement différent.
- La classe pouvant changer d'état appellera les services de sa classe d'état dont l'instance change quand le comportement de notre classe change. De plus l'instance de la classe pouvant changer d'état peut être passée en paramètre à la méthode X de sa classe d'état. Ceci permet de changer l'état de la classe pendant l'exécution de la méthode X en instanciant un nouvel état.



### Strategy
**Definition :** 
- Permet à des algorithmes d'être sélectionnés à la volée au cours de l'exécution selon certaines conditions, comme les stratégies utilisées en temps de guerre.
- Le patron stratégie est prévu pour fournir des moyens de définir une famille d'algorithmes, encapsuler chacun comme objet, et les rendre interchangeables. Le patron stratégie laisse les algorithmes changer indépendamment des clients qui les emploient.

**Utilisation :**
- Dès lors qu'un objet peut effectuer plusieurs traitements différents, dépendant d'une variable ou d'un état.
- Le patron de conception stratégie est utile pour des situations où il est nécessaire de permuter dynamiquement les algorithmes utilisés dans une application. 


### Template Method / Patron de methode
**Definition :** 
- Définit le squelette d'un algorithme à l'aide d'opérations abstraites dont le comportement concret se trouvera dans les sous-classes, qui implémenteront ces opérations.Cette technique est très répandue dans les classes abstraites
- C'est la méthode de la classe parent qui appelle des opérations n'existant que dans les sous-classes. C'est une pratique courante dans les classes abstraites, alors que d'habitude dans une hiérarchie de classes concrètes c'est le contraire : ce sont plutôt les méthodes des sous-classes qui appellent les méthodes de la super-classe comme morceau de leur propre comportement.

**Utilisation :**
- Permet de fixer clairement des comportements standards qui devraient être partagés par toutes les sous-classes, même lorsque le détail des sous-opérations diffère.
Factoriser du code qui serait redondant s'il se trouvait répété dans chaque sous-classe.
- Ce patron est parfois appelée méthode socle parce qu'elle ancre solidement un comportement qui s'applique alors à toute la hiérarchie de classes par héritage. Pour s'assurer que ce comportement ne sera pas redéfini arbitrairement dans les sous-classes, on déclare la méthode socle final en Java, ou bien non virtuelle en C++. Les méthodes servant de "briques de comportement" à la méthode socle devraient être déclarées abstract en Java, ou bien virtuelles pures en C++.


## Constructor - Fabrique

### Abstract Factory
**Definition :** 
- Encapsule un groupe de fabriques ayant une thématique commune. Le code client crée une implémentation concrète de la fabrique abstraite, puis utilise les interfaces génériques pour créer des objets concrets de la thématique. Le client ne se préoccupe pas de savoir laquelle de ces fabriques a donné un objet concret, car il n'utilise que les interfaces génériques des objets produits. 
- Ce patron de conception sépare les détails d'implémentation d'un ensemble d'objets de leur usage générique.
- Une fabrique est un endroit du code où sont construits des objets. Le but de ce patron de conception est d'isoler la création des objets de leur utilisation. On peut ainsi ajouter de nouveaux objets dérivés sans modifier le code qui utilise l'objet de base.
- On peut interchanger des classes concrètes sans changer le code qui les utilise, même à l'exécution. Toutefois, ce patron de conception exige un travail supplémentaire lors du développement initial, et apporte une certaine complexité qui n'est pas forcément souhaitable.

**Utilisation :**
- La fabrique détermine le type de l'objet concret qu'il faut créer, et c'est ici que l'objet est effectivement créé (dans le cas de C++, Java et C#, c'est l'instruction new). Cependant, la fabrique retourne un pointeur abstrait ou une référence abstraite sur l'objet concret créé.
- Le code client est ainsi isolé de la création de l'objet en l'obligeant à demander à une fabrique de créer l'objet du type abstrait désiré et de lui en retourner le pointeur.
- Comme la fabrique retourne uniquement un pointeur abstrait, le code client qui sollicite la fabrique ne connaît pas et n'a pas besoin de connaître le type concret précis de l'objet qui vient d'être créé. Le code client n'interagit qu'avec la classe abstraite et ne  manipule les objets crées qu'avec leur interface abstraite.
- L'ajout de nouveaux types concrets dans le code client se fait en spécifiant l'utilisation d'une fabrique différente, modification qui concerne typiquement une seule ligne de code. C'est beaucoup plus simple que de modifier chaque création de l'objet dans le code client.
- Si toutes les fabriques sont stockées de manière globale dans un singleton et que tout le code client utilise ce singleton pour accéder aux fabriques pour la création d'objets, alors modifier les fabriques revient simplement à modifier l'objet singleton.

### Builder - Monteur
**Definition :** 
- Utilisé pour la création d'une variété d'objets complexes à partir d'un objet source. L'objet source peut consister en une variété de parties contribuant individuellement à la création de chaque objet complet grâce à un ensemble d'appels à l'interface commune de la classe abstraite Monteur.
- Un exemple d'objet source est une liste de caractères ou d'images dans un message devant être codé. Un objet directeur est nécessaire pour fournir les informations à propos de l'objet source vers la classe Monteur. La classe Monteur abstraite pourrait être une liste d'appel de l'interface que la classe directeur utilise comme par exemple handleCharacter() ou handleImage(). Chaque version concrète de la classe Monteur pourrait implémenter une méthode pour ces appels ou bien simplement ignorer l'information si appelée. Un exemple de monteur concret serait enigmaBuilder qui chiffrerait le texte, mais ignorerait les images.
- Dans l'exemple précédent, le logiciel va créer une classe Monteur spécifique, enigmaBuilder. Cet objet est passé à un objet directeur simple qui effectue une itération à travers chaque donnée du message principal de l'objet source. La classe monteur crée, incrémentalement, son projet final. Finalement, le code principal va demander l'objet final depuis le Monteur et ensuite détruire celui-ci et l'objet directeur. Par la suite, si jamais un remplacement de la technique de cryptage de enigmaBuilder par une autre se faisait sentir, une nouvelle classe Monteur pourrait être substituée avec peu de changements pour la classe directeur et le code principal. En effet, le seul changement serait la classe Monteur actuelle passée en paramètre au directeur.

**Utilisation :**
- But : Séparer la construction d'un objet complexe de la représentation afin que le même processus de construction puisse créer différentes représentations.


### Factory Method
**Definition :** 
- La fabrique a pour rôle l'instanciation d'objets divers dont le type n'est pas prédéfini : les objets sont créés dynamiquement en fonction des paramètres passés à la fabrique.
- Les méthodes de fabrication n'ont pas cette obligation et peuvent avoir un nom qui décrit mieux leur fonction.Le constructeur de la classe peut être privé, ce qui oblige à utiliser les méthodes de fabrication qui ne prêtent pas à confusion.

**Utilisation :**
- Les fabriques sont utilisées dans les toolkits ou les frameworks, car leurs classes sont souvent dérivées par les applications qui les utilisent.
- Des hiérarchies de classes parallèles peuvent avoir besoin d'instancier des classes les une des autres.
- Bien que la principale utilisation de la Fabrique soit d'instancier dynamiquement des sous-classes, elle possède d'autres avantages qui ne sont pas liés à l'héritage des classes. On peut donc écrire des fabriques qui ne font pas appel au polymorphisme pour créer plusieurs types d'objets (on fait alors appel à des méthodes statiques).
- Les méthodes de fabrication permettent d'encapsuler la création des objets. Ce qui peut être utile lorsque le processus de création est très complexe, s'il dépend par exemple de fichiers de configuration ou d'entrées utilisateur.

### Pluggable Factory
**Definition :** 
- 
**Utilisation :**
- 


### Prototype
**Definition :** 
- Est utilisé lorsque la création d'une instance est complexe ou consommatrice en temps
- Plutôt que créer plusieurs instances de la classe, on copie la première instance et on modifie la copie de façon appropriée.

**Utilisation :**
- Il faut déclarer une classe abstraite spécifiant une méthode abstraite (virtuelle pure en C++) appelée clone(). Toute classe nécessitant un constructeur polymorphique dérivera de cette classe abstraite et implantera la méthode clone().Le client de cette classe, au lieu d'écrire du code invoquant directement l'opérateur "new" sur une classe explicitement connue, appellera la méthode clone() sur le prototype ou passera par un mécanisme fourni par un autre patron de conception (par exemple une méthode de fabrique avec un paramètre désignant la classe concrète à instancier).
- Exemple où prototype s'applique : supposons une classe pour interroger une base de données. À l'instanciation de cette classe on se connecte et on récupère les données de la base avant d'effectuer tous types de manipulation. Par la suite, il sera plus performant pour les futures instances de cette classe de continuer à manipuler ces données que de réinterroger la base. Le premier objet de connexion à la base de données aura été créé directement puis initialisé. Les objets suivants seront une copie de celui-ci et donc ne nécessiteront pas de phase d'initialisation.
### Singleton
**Definition :** 
- Le but est de restreindre l'instanciation d'une classe à un seul objet (ou bien à quelques objets seulement). Il est utilisé lorsque l'on a besoin d'exactement un objet pour coordonner des opérations dans un système. Le modèle est parfois utilisé pour son efficacité, lorsque le système est plus rapide ou occupe moins de mémoire avec peu d'objets qu'avec beaucoup d'objets similaires.

**Utilisation :**
- On implémente le singleton en écrivant une classe contenant une méthode qui crée une instance uniquement s'il n'en existe pas encore. Sinon elle renvoie une référence vers l'objet qui existe déjà. Dans beaucoup de langages de type objet, il faudra veiller à ce que le constructeur de la classe soit privé ou bien protégé, afin de s'assurer que la classe ne puisse être instanciée autrement que par la méthode de création contrôlée.
- Le singleton doit être implémenté avec précaution dans les applications multi-thread. Si deux processus légers exécutent en même temps la méthode de création alors que l'objet unique n'existe pas encore, il faut absolument s'assurer qu'un seul créera l'objet, et que l'autre obtiendra une référence vers ce nouvel objet.
La solution classique à ce problème consiste à utiliser l'exclusion mutuelle pour indiquer que l'objet est en cours d'instanciation.

## Structuration - Structure

### Adapter - Adaptateur
**Definition :** 
- Permet de convertir l'interface d'une classe en une autre interface que le client attend. 
- Adaptateur fait fonctionner un ensemble de classes qui n'auraient pas pu fonctionner sans lui, à cause d'une incompatibilité d'interfaces.
- Un objet Adaptateur sert de liaison entre les objets manipulés et un programme les utilisant, à simplifier la communication entre deux classes. Il est utilisé pour modifier l'interface d'un objet vers une autre interface.

**Utilisation :**
- Vous voulez intégrer une classe que vous ne voulez/pouvez pas modifier.
- Une API tiers convient à votre besoin fonctionnel, mais la signature de ses méthodes ne vous convient pas.
- Vous voulez normaliser l'utilisation d'anciennes classes sans pour autant en reprendre tout le code.
- On peut également utiliser un adaptateur lorsque l'on ne veut pas implémenter toutes les méthodes d'une certaine interface


### Bridge - Pont
**Definition :** 
- Permet de découpler l'interface d'une classe et son implémentation. Ainsi, vous pouvez modifier ou changer l'implémentation d'une classe sans devoir modifier le code client (si l'interface ne change pas bien entendu).

**Utilisation :**
- Considérons une classe représentant la classe de base de formes géométriques, et ses classes (cercles, rectangles, triangles, ...). Tous les types de formes ont des propriétés communes (une couleur par exemple) et des méthodes abstraites communes (calcul de surface par exemple) implémentées par les classes dérivées (comment calculer la surface d'un cercle, ...).
- Toutes les formes peuvent également se dessiner à l'écran. Mais la façon de dessiner dépend de l'environnement graphique et du système d'exploitation. Plutôt que d'ajouter une méthode par environnement possible à chacune des formes, le patron de conception Pont suggère de créer une interface séparée pour les primitives de dessin. Cette interface est utilisée par les différentes formes qui alors ne dépendent pas de l'implémentation.


### Composite - Objet composite
**Definition :** 
- un objet composite est constitué d'un ou de plusieurs objets similaires (ayant des fonctionnalités similaires). L'idée est de manipuler un groupe d'objets de la même façon que s'il s'agissait d'un seul objet. 
- Les objets ainsi regroupés doivent posséder des opérations communes, c'est-à-dire un "dénominateur commun".

**Utilisation :**
- Quand vous avez l'impression d'utiliser de multiples objets de la même façon, souvent avec des lignes de code identiques ou presque. Par exemple, lorsque la seule et unique différence entre deux méthodes est que l'une manipule un objet de type Carré, et l'autre un objet Cercle. Lorsque, pour le traitement considéré, la différenciation n'a pas besoin d'exister, il serait plus simple de considérer l'ensemble de ces objets comme homogène.



### Decorator - Decorateur
**Definition :** 
- Un décorateur permet d'attacher dynamiquement de nouveaux comportements ou responsabilités à un objet. 
- Les décorateurs offrent une alternative assez souple à l'héritage pour composer de nouvelles fonctionnalités.

**Utilisation :**
- Beaucoup de langages de programmation orientés objets ne permettent pas de créer dynamiquement des classes, et la conception ne permet pas de prévoir quelles combinaisons de fonctionnalités sont utilisées pour créer autant de classes.
- Les classes décoratrices sont allouées dynamiquement à l'utilisation, permettant toutes sortes de combinaisons.

### Facade
**Definition :** 
- a pour but de cacher une conception et une interface ou un ensemble d'interfaces complexes difficiles à comprendre (cette complexité étant apparue "naturellement" avec l'évolution du sous-système en question). La façade permet de simplifier cette complexité en fournissant une interface simple du sous-système. 
- Habituellement, la façade est réalisée en réduisant les fonctionnalités de ce dernier mais en fournissant toutes les fonctions nécessaires à la plupart des utilisateurs.

**Utilisation :**
- L'utilisation d'une façade a les avantages suivants :
- simplifier l'utilisation et la compréhension d'une bibliothèque logicielle car la façade possède des méthodes pratiques pour les tâches courantes,
- rendre le code source de la bibliothèque plus lisible pour la même raison,
- réduire les dépendances entre les classes utilisatrices et les classes internes à la bibliothèque puisque la plupart des classes utilisatrices utilisent la façade, ce qui autorise plus de flexibilité pour le développement du système,
- rassembler une collection d'API complexes en une unique et meilleure API (orientée tâches utilisateurs).

- Un adaptateur est utilisé quand la façade doit respecter une interface particulière et doit supporter un comportement polymorphique.


### Fly Weight - Poids mouche
**Definition :** 
- Dans le cas d'une classe représentant des données, il est parfois possible de réduire le nombre d'objets à instancier si tous ces objets sont semblables et se différencient sur quelques paramètres. Si ces quelques paramètres peuvent être extraits de la classe et les passer ensuite via des paramètres des méthodes, on peut réduire grandement le nombre d'objets à instancier. Le patron poids-mouche est l'approche pour utiliser de telles classes. D'une part la classe avec ses données internes qui la rendent unique, et d'autre part les données externes passées à la classe en tant qu'arguments. Ce modèle est très pratique pour des petites classes très simples. 

- Dans le patron poids-mouche, les données n'ont pas de pointeurs vers les méthodes du type de données, parce que cela consommerait trop d'espace mémoire. À la place, les routines sont appelées directement.

**Utilisation :**
- Lorsque de nombreux (petits) objets doivent être manipulés, mais qu'il serait trop coûteux en mémoire s'il fallait instancier tous ces objets, il est judicieux d'implémenter le poids-mouche.
- Un exemple classique du patron poids-mouche : les caractères manipulés dans un traitement de texte. Chaque caractère correspond à un objet ayant une police de caractères, une taille de caractères, et d'autres données de formatage. chaque caractère peut être représenté par une instance d'une classe contenant sa police, sa taille, etc. La position des caractères à afficher est stockée en dehors de cette classe. Ainsi, on a une et une seule instance de la classe par caractère et non une instance par caractère affiché à l'écran.

### Proxy
**Definition :** 
- Un proxy est une classe se substituant à une autre classe. Par convention et simplicité, le proxy implémente la même interface que la classe à laquelle il se substitue. L'utilisation de ce proxy ajoute une indirection à l'utilisation de la classe à substituer. 
- Le proxy sert à gérer l'accès à un objet, il agit comme un intermédiaire entre la classe utilisatrice et l'objet.
- Un proxy est un cas particulier du patron de comportement État. Un proxy implémente une et une seule interface, donc se substitue à une seule classe. Un état peut implémenter un nombre quelconque d'interfaces.

**Utilisation :**
- Contrôler l'accès aux méthodes de la classe substituée. Un état est utilisé pour changer dynamiquement d'interface.
- Simplifier l'utilisation d'un objet « complexe » à la base : si l'objet doit être manipulé à distance (via un réseau) ou si l'objet est consommateur de temps.
- Il existe différents types de Proxy ayant un comportement ou un rôle différent :

Remote proxy : fournir une référence sur un objet situé sur un espace d'adressage différent, sur la même machine ou sur une autre,
Virtual proxy : retarder l'allocation mémoire des ressources de l'objet jusqu'à son utilisation réelle,
Copy-on-write proxy : une forme de proxy virtuel pour retarder la copie de l'objet jusqu'à demande par la classe utilisatrice, utilisé notamment pour la modification concurrente par différents threads,
Protection (access) proxy : fournir à chaque classe cliente un accès à l'objet avec des niveaux de protection différents,
Firewall proxy : protéger l'accès à l'objet par des classes « malveillantes » ou vice-versa,
Synchronization proxy : fournir plusieurs accès à l'objet synchronisé entre différentes classes utilisatrices (cas de threads multiples),
Smart reference proxy : fournir des actions supplémentaires à chaque accès à l'objet (compteur de références, ...),
Cache proxy : stocker le résultat d'opérations coûteuse en temps, afin de pouvoir les partager avec les différentes classes utilisatrices.
