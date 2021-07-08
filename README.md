# 1. PREVIEW & 개요
[KH]스마트 콘텐츠 융합 응용SW 엔지니어 양성과정 중 파이널프로젝트 이며 "와디즈 " 라는사이트 클론코딩으로 구현한 사이트입니다 
구현기간:2021/ 06/03 ~ 2021/07/08 입니다.

### `구현한 사이트 주소 입니다.` (http://interact-funding.kro.kr/)  

## 2. 프로젝트 요구사항

### - 프로젝트 전반

크라우드 펀딩 사이트 와디즈를 클론코딩으로 구현하였습니다. 

자금 조달의 문제로 인해 실행되지 못하는 아이디어와 자금이 충분하지만 투자하고 싶은 상품을 찾고있는 사람들을 위한 사이트입니다.  빛나는 아이디어를 가진 다양햔 제품들의 판매를 돕기 위한 Interact Funding 어플리케이션을 구현하였습니다.

## 3.역할 및 담당기능
- Header CSS 전반 : Header부분의 디자인과 CSS등의 프론트단 역할을 맡아 구현하였습니다.
- 새소식 게시판 : 게시글 보기와 게시글 작성, 게시글 수정, 게시글 삭제 기능을 summernote API를 이용하여 구현하였습니다. AddThis를 이용하여 SNS공유하기 기능을 구현하였습니다.
- 커뮤니티 댓글 보기, 작성, 삭제 : 커뮤니티에 댓글 보기와 쓰기, 삭제 기능을 구현하였습니다.
- 서포터 후원 내역 보기: 전체 펀딩 게시글의 후원 내역 및 참여 인원을 확인하는 기능을 구현하였습니다. 참여 인원의 경우 중복 값을 제거하여 순수 참여 인원만 나타나게 하였습니다.
- 펀딩 게시글 FAQ : 펀딩 게시글의 FAQ 부분을 JAVASCRIPT로 구현하였습니다.
- 모달창을 이용하여 수정과 삭제 시 확인할 수 있게 구현하였습니다.

## 4. 개발 목표 및 설계 주안점

1.Spring Framework, MVC 패턴, JQuery의 활용 능력 습득

2.Bootstrap Framework 프레임워크 활용능력 습득

3.Gson 사용법 활용 능력 습득

4.JSTL 동적변수를 활용능력습득

## 5. 핵심 구현 기술 설명
![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0ed3b1cb-001c-4cf5-9976-b33dda633663/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0ed3b1cb-001c-4cf5-9976-b33dda633663/Untitled.png)

**화면설명:** 

새소식을 볼  수 있는 페이지입니다. 전체 새소식을 확인할 수 있고 우측 상단의 글쓰기 버튼으로 글을 작성할 수 있습니다.  글쓰기 버튼은 펀딩 작성자에게만 제공됩니다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f11fc49c-7dc1-4c2d-97b7-9996825ee857/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f11fc49c-7dc1-4c2d-97b7-9996825ee857/Untitled.png)

**화면설명:**

글 작성은 summernote API를 사용하여 구현하였습니다. 이미지 첨부도 가능합니다. 

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/649491ad-6284-47db-a413-892a8e2b6c02/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/649491ad-6284-47db-a413-892a8e2b6c02/Untitled.png)

**화면설명:**

글 상세 보기 화면에서 글의 수정과 삭제, SNS공유하기를 할 수 있습니다. 수정과 삭제는 펀딩 작성자에게만 제공됩니다.

### **구현기능설명**

각 펀딩 게시글에서 새소식을 누르면 새소식 리스트를 볼 수 있는 화면으로 이동합니다. 펀딩 작성자는 우측 상단의 글쓰기 버튼을 클릭하여 글을 작성할 수 있습니다. 글 작성은 summernote API를 이용해 구현하여 이미지 첨부도 가능합니다. 등록 버튼을 누르면 ajax로 form 제출을 합니다. 글 작성이 완료되면 모달창으로 글작성완료를 알려줍니다. 리스트에서 제목을 클릭하면  상세 보기를 할 수 있습니다. 상세보기에서 펀딩 작성자는 글 삭제와 수정이 가능합니다. 수정시 글의 내용과 제목을 불러오도록 했고 수정도 ajax를 통해 form 제출을 하도록 구현하였습니다.  수정과 삭제시에도 모달창으로 완료되었음을 알려줍니다. 하단의 공유하기에서 SNS 공유하기를 할 수 있게 AddThis를 이용하여 구현하였습니다. 

---

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cb14efae-ab6d-4b22-a460-1365e7c354c2/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cb14efae-ab6d-4b22-a460-1365e7c354c2/Untitled.png)

**화면설명:** 

각 펀딩의 커뮤니티에서 FAQ를 볼 수 있습니다. 제목을 누르면 내용이 나오는 방식으로 화면을 구성하였습니다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9ead3cf0-615f-4e15-979a-72bfe56bfc80/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9ead3cf0-615f-4e15-979a-72bfe56bfc80/Untitled.png)

**화면설명:**

하단의 접기 버튼을 누르면 FAQ 목록이 짧아집니다. 

### **구현기능설명**

각 펀딩 게시글의 커뮤니티에 들어가면 FAQ를 볼 수 있도록 구현하였습니다. CSS와 JAVASCRIPT로 구현하였으며 제목 클릭 시 내용이 펼쳐지는 방식으로 더욱 깔끔하게 구현해 보았습니다. 하단의 접기를 누르면 글 목록이 더 짧아지도록 구현하였습니다. 

---

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f28c6181-3083-4261-924b-334e121fbed5/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f28c6181-3083-4261-924b-334e121fbed5/Untitled.png)

**화면설명:** 

각 펀딩 게시물에서 서포터를 누르면 참여 인원이 나타납니다.

**구현기능설명**

각 펀딩에 참여한 인원수를 구현하였습니다. 한 사람이 중복으로 참여하는 경우의 수를 생각하여 중복값은 제거하고 순수 참여 인원수만 카운트 되도록 쿼리를 통해 구현을 하였습니다. 

---

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f75735fe-418b-4f2c-aeb4-bf57a1b05f93/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f75735fe-418b-4f2c-aeb4-bf57a1b05f93/Untitled.png)

**화면설명:**

각 펀딩 게시물의 커뮤니티 하단에서 응원, 의견, 체험리뷰등의 댓글을 볼  수 있습니다. 

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2b0f9d4d-fc25-47bd-83df-e0389e408b98/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2b0f9d4d-fc25-47bd-83df-e0389e408b98/Untitled.png)

**화면설명:**

글 남기기 버튼을 누르면 댓글을 작성할 수 있는 창이 나옵니다. 

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/14aa0a85-0c22-4bf8-8f1f-149a7a95652d/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/14aa0a85-0c22-4bf8-8f1f-149a7a95652d/Untitled.png)

**화면설명:**

본인이 작성한 댓글은 삭제하기 버튼으로 삭제가 가능합니다.

### 구현기능설명

각 펀딩 게시물의 커뮤니티 메뉴 하단 부분에서 응원, 의견, 체험 리뷰를 열람하고 글을 남길 수 있도록 구현하였습니다. 글 남기기 버튼을 누르면 글을 쓸 수 있는 창이 나옵니다. 글을 작성하면 AJAX를 통해서 글이 등록되도록 구현하였습니다. 본인이 쓴 글에는 삭제하기 버튼이 나타납니다. 삭제 버튼을 클릭하면 글이 삭제됩니다.

## 6. 구현 기간

### - 프로젝트 기획 기간

2021.06.03~2021.06.10

### - 프로젝트 구현 기간

2021.06.03~2021.07.08

## 7. 사용 언어 및 도구

   ### O/S : Windows 10
   
   Server : Tomcat 9.0
   
   DBMS : Oracle 11g
   
   개발 언어 : JAVA, JSP, JavaScript, SQL, HTML5, CSS3
   
   개발 툴 : STS4, SQL Developer, Visual Studio Code
   
   Framework/library
   
   Spring, MyBatis, Bootstrap, CoolSMS , Mail-1.4.7, ojdbc6, summerNote, ImPort, taglibs, spring-webmvc
   
   카카오 지도/로컬, Scheduler (자동 알림), 카카오 OAUTH2.0

## 8.프로젝트 참여소감


## 9.별첨

# Contributors
[<img src="https://user-images.githubusercontent.com/62824389/124744204-7ac8de80-df59-11eb-86ff-28b65ca19886.jpg" width="120">](https://github.com/kimdia200)
[<img src="https://user-images.githubusercontent.com/62824389/124744203-7ac8de80-df59-11eb-8ca8-db42233b9833.jpg" width="120">](https://github.com/hohyuncheon)
[<img src="https://user-images.githubusercontent.com/62824389/124744193-78668480-df59-11eb-9eae-8e0c67a20689.jpg" width="120">](https://github.com/KIMJOOYEON97)
[<img src="https://user-images.githubusercontent.com/62824389/124744198-7997b180-df59-11eb-9aab-48a4b4939e28.jpg" width="120">](https://github.com/dygksqkr12)
[<img src="https://user-images.githubusercontent.com/62824389/124744201-7a304800-df59-11eb-89ec-e78f9cc84800.jpg" width="120">](https://github.com/onreverse01)
[<img src="https://user-images.githubusercontent.com/62824389/124744200-7a304800-df59-11eb-9ec3-537d0ab215ac.jpg" width="120">](https://github.com/rlwi440)

