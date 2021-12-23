<h3>High Level Design</h3>

<h4>Flow 1:</h4> User called <code>GET [baseUrl]/api/car/CARID10</code>
<ol>
    <li>Once user asked for car details a <code>GET [baseUrl]/api/car/CARID10</code> request will go
to Gateway service which is single point of contract for our sub system</li>
    <li>Gateway Service authenticate and authorized the request by calling IAM service</li>
    <li>Once IAM approve the request it sends the approval to gateway and gateway calls Car Management Service</li>
    <li>Car service get the car details from database and respond accordingly</li>
    <li>Side by side Car service receives the request it creates a car viewed event and put it in Kafka Queue <code>Viewed{"userId":"UU0123","carId":"CARID10","dateTime":"12/12/2021"}</code></li>
</ol>

<h4>Flow 2:</h4> User asked for recommendation <code>GET</code><code>[baseUrl]
/api/recommend/car?viewedCar=CARID10</code>
<ol>
    <li>Once user asked for car details a <code>GET</code><code>[baseUrl]/api/recommend/car?viewedCar=CARID10</code> request will go
to Gateway service which is single point of contract for our sub system</li>
    <li>Gateway Service authenticate and authorized the request by calling IAM service</li>
    <li>Once IAM approve the request it sends the approval to gateway and gateway calls Car recommendation Engine/li>
    <li>Car Recommendation Engine have graph database with all Node Car, User and relation Viewed. 
It calls its database to get all the top 10 most viewed Car by those users who also viewed CARID10 car</li>
    <li>Car Recommendation Engine respond a list of cars</li>
</ol>

<h4>Flow 3:</h4> User asked for comparison <code>GET</code><code>[baseUrl]
/api/report/comparison/car?carIds=CARID10,CARID1</code>
<ol>
    <li>Once user asked for car details a <code>GET</code><code>[baseUrl]/api/report/comparison/car?carIds=CARID10,CARID1</code> request will go
to Gateway service which is single point of contract for our sub system</li>
    <li>Gateway Service authenticate and authorized the request by calling IAM service</li>
    <li>Once IAM approve the request it sends the approval to gateway and gateway calls Car Management Engine/li>
    <li>Car Management Service fetches all car details from its database.</li>
    <li>Car Management Service execute car comparison algorithm and returns the Report</li>
</ol>

<h4> Tools</h4>
<ul>
    <li>Programming language:  Java/GoLang</li>
    <li>Database:  MongoDB (for UserDB and CarManagementDB), Neo4j (for Car Recommendation Engine)</li>
    <li>Event Queue: Kafka</li>
</ul>
