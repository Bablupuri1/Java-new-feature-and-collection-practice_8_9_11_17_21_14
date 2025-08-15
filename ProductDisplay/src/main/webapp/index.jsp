<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<style>
    body {
        margin: 0;
        padding: 0;
        background-color: #121212;
        color: #ffffff;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
    }

    h1 {
        margin-bottom: 40px;
        font-size: 2.5rem;
        color: #00ffe1;
    }

    .btn-container {
        display: flex;
        gap: 20px;
    }

    a.button {
        padding: 12px 25px;
        background-color: #1e88e5;
        color: #ffffff;
        text-decoration: none;
        border-radius: 8px;
        font-weight: bold;
        transition: background-color 0.3s ease;
    }

    a.button:hover {
        background-color: #1565c0;
    }
</style>
</head>
<body>

    <h1>Welcome to Admin Dashboard</h1>

    <div class="btn-container">
        <a href="viewallproduct" class="button">View All Products</a>
        <a href="viewProductById" class="button">View Product by ID</a>
    </div>

</body>
</html>
