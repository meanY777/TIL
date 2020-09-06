<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function sendFile(){


		/* 데이터 전송 준비 */
		/* JQuery에서 form을 전송하라고 제공하는 객체 */
		var formData = new FormData();	
		var file  = $("input:file")[0].files[0];
		formData.append("mfile",file);
				
			
	
		/* 직접 보내기 */
		$.ajax({
			url:"/sendFile"
			,type:"post"
			,data:formData
			,contentType:false
			,processData:false
			,success:function(){
				alert("통신 성공");
				}
			,error:function(e){
				alert("통신 실패");
				console.log(e);
				}
			})
		

		}

	function sendFileList(){

		var formData = new FormData();
		var fileList = $('#multi')[0].files

		for(var i =0; i<fileList.length;i++){
			console.log(fileList[i]);
			formData = append("fileList",fileList[i]);
		
			}
		//위에 것을 이렇게도 할 수 있음.
		var formData = new FormData("form")[0];
		
		$.ajax({
			url:"/sendFileList"
			,type:"post"
			,data: formData
			,contentType:false
			,processType:false
			,seccess:function(){
				alert("통신성공");
				
				}
			,error:function(e){
				alert("통신실패");
				console.log(e);
				}
			})
		}
</script>
</head>
<body>
	<form>
		<input type="file" >		
	</form>
	<button onclick="sendFile();">컨트롤러고 파일 보내기</button>
	<br>
	<form>
		<input type="file" multiple="multiple" id="multi">
	</form>
	<br>
	<button onclick="sendFileList();">컨트롤러로 다중 파일 보내기</button>
</body>
</html>