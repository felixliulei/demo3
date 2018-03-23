
<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>后台登录</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" th:href="@{@assets/css/reset.css}">
        <link rel="stylesheet" th:href="@{assets/css/supersized.css}">
        <link rel="stylesheet" th:href="@{assets/css/style.css}">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>
        <form th:action="@{login/checLogin}" method="post" id="entrustForm">
        <div class="page-container">
            <h1>Login</h1>
                <input type="text" id="username" name="username" class="username" placeholder="Username">
                <input type="password" id="password" name="password" class="password" placeholder="Password">
                <button type="button" th:onclick="'sub()'">Sign me in</button>
                <div class="error"><span>+</span></div>
        </div>
        <div align="center" id="div_from">Collect from felix</div>

        <!-- Javascript -->
        <script th:src="@{assets/js/jquery-1.8.2.min.js}"></script>
        <script th:src="@{assets/js/supersized.3.2.7.min.js}"></script>
        <script th:src="@{assets/js/supersized-init.js}"></script>
        <script th:src="@{assets/js/scripts.js}"></script>
        </form>
    </body>
<script>
    function sub (){
        debugger;
        var username=$("#username").val();
        var password=$("#password").val();
        $.ajax({
           type : 'post',
            url : 'login/checLogin',
            data : {
                username : username,
                password : password
            },
            dataType : "json",
            success : function(data){
               if (data == "success"){
                   window.location.href="templates/index";
               }else{
                   alert("密码错误");
               }
            }
        });
    }

</script>
</html>

