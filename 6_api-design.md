<h3>API Design</h3>

1. Get Car details by ID
   <p><h5>REQUEST:</h5>
   <code>GET</code>    
   <code>[baseUrl]/api/car/CARID10</code></p>
   <p><h5>RESPONSE:</h5>
   Status <code>OK</code>
   Body <code>{"id":"CARID10", "name":"Nexon", ...} </code></p>
2. Fetch recommended car list for viewed car
   <p><h5>REQUEST:</h5>
   <code>GET</code>    
   <code>[baseUrl]/api/recommend/car?viewedCar=CARID10&limit=10</code></p>
   <p><h5>RESPONSE:</h5>
   Status <code>OK</code>
   Body <code>[CARID1,CARID5,CARID9,CARID3] </code></p>
3. Compare multiple cars
   <p><h5>REQUEST:</h5>
   <code>GET</code>    
   <code>[baseUrl]/api/report/comparison/car?carIds=CARID10,CARID1</code></p>
   <p><h5>RESPONSE:</h5>
   Status <code>OK</code>
   Body <code> 
   [
   {attribute:"ID", comparison:{"CARID10","CARID1"}},
   {attribute:"NAME", comparison:{"NEXON","VENUE"}
   ] </code>
4. We can reuse previous API and filter out similar attributes to get only differences during comparison.