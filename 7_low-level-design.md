<h3>Low Level Design</h3>

User - <code>ID, Name</code>

Car - <code>ID, Name, ReleaseDate, Description, List[ComparableAttribute], List[Photo]</code>

ComparableAttribute - <code>ID, AttributeName, Value,</code> 
<code> int compareTo(ComparableAttribute)</code>

AttributeComparisonReport - <code> ID, AttributeName, List[ComparableAttribute1,ComparableAttribute2], isSimilar</code>

CarComparisonReport - <code>ID, List[CarName], List[AttributeComparisonReport]</code> 

Recommendation Model - [GRAPH] <code>[u1:User]->[v:viewed]->[c1:Car]</code>