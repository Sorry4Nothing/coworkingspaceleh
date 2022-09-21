# CoWorking Space Lehmann

## How to set up the Project
* **Git clone:** You either clone the repository from the GitHub
* **Unpack the Zip:** extract the ZIP-File and import the Code

### How to make a Account yourself
If you want to use your own Admin account, do the following
````
* Register a new Account via Swagger(auth/register)
* Edit the SQL **MEMBER** Table and make the user Admin
* get new token via Swagger(auth/token)
* paste the Token in coworkingspaceleh/http-requests/http-client.env.json
````
If you want to use the premade Admin account, do the following
````
* go to auth/token and login using username: admin and password: password1234
* paste the acces token into the coworkingspaceleh/http-requests/http-client.env.json file
````

### How to use CoWorking Space
* Just read the comments in the **coworkingspaceleh/http-requests/client-requests.rest**
* Be aware that you have to check witch environment you are using for the operations

## Useful links:
* **API documentation:** <http://localhost:8080/swagger-ui/index.html>
* **H2 console:** <http://localhost:8080/h2-console>
## Important to know
* **Admin:** Admin gets initiated when started