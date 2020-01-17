<?php

$Animal = [
	'herbivore' => false,
	'fourlimbs' => true,
	'chewscud' => false,
];
?>
<ul>
	<li>Eats Grass: <?= $Animal['herbivore'] ? 	'Yes' : 'No' ;?></li>
	<li>Walks on four: <?= $Animal['fourlimbs'] ? 	'Yes' : 'No' ;?></li>
	<li>Chews at night: <?= $Animal['chewscud'] ? 	'Yes' : 'No' ;?></li>
</ul>