<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>AI Disease Predictor</title>
    <style>
        body { font-family: Arial; margin: 50px; background-color: #f4f7f6; }
        .card { background: white; padding: 20px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
        input { margin-bottom: 10px; padding: 8px; width: 100%; }
        button { background: #28a745; color: white; padding: 10px; border: none; cursor: pointer; }
    </style>
</head>
<body>
    <div class="card">
        <h2>Diabetes Risk Predictor</h2>
        <form action="predict" method="POST">
            <label>Glucose Level:</label>
            <input type="number" name="glucose" required>
            <label>Age:</label>
            <input type="number" name="age" required>
            <button type="submit">Analyze Risk</button>
        </form>
        
        <%-- Display result if available --%>
        <h3 style="color: blue;">${predictionResult}</h3>
    </div>
</body>
</html>