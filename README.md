# Demo Java procédure pour travailler sur Github

## Envoyer son projet sur Github

### Initialiser un repo git

`git init`

Penser à ajouter un fichier `.gitignore` à la racine du projet. Ce fichier doit contenir la liste des éléments à ignorer au moiment du commit.

### Enregistrer les changements depuis la création du repo git

`git add .`; ajoute tous les fichiers (sauf ceux présent dans .gitignore) au prochain commit.

`git commit -m "initial commit"`: commit qui indique le début du projet. (checkpoint)

### Créer un repository (depot) distant

Aller sur Github, créer un repository.

Copier l'url du repository, et l'ajouter aux "remotes" du projet:

`git remote add origin https://github.com/benoitsemifir/demo_java_idp`

### Pousser le projet sur le repository distant

`git push`

## Importer son projet sur Eclipse

`File -> import -> Git -> Project from Git (with smart import)`

Renseigner l'url si ce n'est pas déja fait.
