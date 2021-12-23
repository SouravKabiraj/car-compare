<h3>Algorithms</h3>
<p>
Neo4j query to get all suggestion for viewed car:

<code>MATCH (otherViewedCar:Car)<-[:compared]-(:Person)-[:viewed]->(thisCar:Car)
WHERE thisCar.id=CARID10 RETURN otherViewedCar.id, COUNT(otherViewedCar.id)</code>
</p>

<p>
Comparison Logic : Java files 
</p>
