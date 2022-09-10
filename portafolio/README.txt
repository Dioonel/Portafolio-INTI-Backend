Backend para el proyecto final de Argentina Programa.

Endpoints:

"/api/auth/authenticate ---> POST


"/api/header"           ---> GET - PUT

"/api/about"            ---> GET - PUT

"/api/skills"           ---> GET - POST
"/api/skills/{id}"      ---> GET - PUT -DELETE

"/api/projects"         ---> GET - POST
"/api/projects/{id}"    ---> GET - PUT - DELETE

"/api/education"        ---> GET - POST
"/api/education/{id}"   ---> GET - PUT - DELETE


** Los metodos GET son publicos, en los demas metodos se necesita estar autenticado con un token desde /api/auth/authenticate