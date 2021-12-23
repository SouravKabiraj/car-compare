<h3>Assumptions</h3>
<ul>
    <li>
        Car Recommendation algorithm options:
            <ol>
                <li>We can recommend those cars to the user which has similar body type.
                    ex. 
                        <ul>
                            <li><B>GIVEN</B> user opened tata nexon which has compact SUV body type.</li>
                            <li><B>WHEN</B> user asked for recommendation.</li>
                            <li><B>THEN</B> user will be able to see all cars with SUV body type</li>
                        </ul>
                </li>
                <li>We can recommend those cars to the user which are also seen by other users while searching tata nexon
                    ex.
                        <ul>
                            <li><B>GIVEN</B> user opened tata nexon EV.</li>
                            <li><B>GIVEN</B> other users searched for different other electric vehicles while searching for nexon EV.</li>
                            <li><B>WHEN</B> user asked for recommendation.</li>
                            <li><B>THEN</B> user will be able to see different electric vehicles.</li>
                        </ul>
                </li>
            </ol>
        <b>Second options sounds more relatable in this scenario.</b>
    </li>
    <li> Assuming there are total 10K car models (variants) in india.</li>
    <li> Assuming there are total 10M user in our app.</li>
</ul>