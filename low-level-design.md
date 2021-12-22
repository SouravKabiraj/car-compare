<h3>Low Level Design</h3>

User - <code>ID, Name</code>

Car - <code>ID, Name, ReleaseDate, Description, List[ComparableAttribute]</code>

ComparableAttribute - <code>ID, AttributeName, Value,</code> 
<code> int compareTo(ComparableAttribute)</code>

AttributeComparisonReport - <code> ID, List[ComparableAttribute1,ComparableAttribute2], isSimilar</code>

ComparisonReport - <code>ID, List[CarName], List[AttributeComparisonReport]</code> 
