<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Details View</title>
<link href="https://cdn.jsdelivr.net/npm/flowbite@2.5.1/dist/flowbite.min.css"  rel="stylesheet" />
</head>
<body>
 <div class="flex min-h-full flex-col justify-center px-6 py-12 lg:px-8">
 <h3 class="text-center mb-2 text-3xl">Using JSTL</h3>
 <h3 class="text-center mb-2 text-3xl"> ${detailsDto1}</h3>
 <h3 class="text-center mb-2 text-3xl">Id: ${detailsDto1.getId()}</h3>
  <h3 class="text-center mb-2 text-3xl">Name: ${detailsDto1.getName()}</h3>
  <h3 class="text-center mb-2 text-3xl">Course: ${course}</h3>
</div>
<script src="https://cdn.jsdelivr.net/npm/flowbite@2.5.1/dist/flowbite.min.js"></script>
</body>
</html>