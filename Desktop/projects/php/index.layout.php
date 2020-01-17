<!DOCTYPE html>
<head>
<title>Learning php </title>
</head>
<body>
<h1>
<?php foreach ($person as $object => $value) :?>
<li><?= $object; ?>:<?= $value; ?></li>
<?php endforeach; ?>
</h1>
</body>
</html>