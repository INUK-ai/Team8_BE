# Team8_BE
<img width="100%" alt="스크린샷 2023-11-11 오후 1 41 12" src="https://github.com/Step3-kakao-tech-campus/Team8_BE/assets/80378041/3ce5f9bf-f4fb-42bf-bb94-12a6ce83aa1f">

## 프로젝트 소개

<br>

<p align="center"><img width="700" alt="image" src="https://github.com/Step3-kakao-tech-campus/Team8_FE/assets/78250089/f83e0e23-ed39-4ac1-a4a8-21329f9ef334">


<div align="center">
    
||설명|
|-----------|----|
|제목 |위키키| 
|개발 목적| 그룹별로 자신들만의 나무위키를 만들고, 기록하고자 하는 사람들을 위해 프로젝트를 만들었습니다. |
|개발 기간|2023.09 - 2023.11|  
</div>

<br>

## 팀원
<div align="center">
    
| [이준희](https://github.com/Jun2-Lee) | [김돈우](https://github.com/kimdonwoo) | [황인욱](https://github.com/INUK-ai)|
|:----------:|:----------:|:----------:|
| <img src="https://github.com/Jun2-Lee.png" width="100"> | <img src="https://github.com/kimdonwoo.png" width="100"> | <img src="https://github.com/INUK-ai.png" width="100"> |
| 회원, 인증 | 페이지, 게시글 | 그룹 |

</div>


<br>

## 배포 링크
> **프론트 서버** : https://kb70bd6b8a3f6a.user-app.krampoline.com/   
**백엔드 서버** : https://kb70bd6b8a3f6a.user-app.krampoline.com/api/        

<br>

## 주요기능
### 그룹 생성

- 사용자는 그룹을 생성하고 관리할 수 있습니다. 그룹의 이름, 대표 사진, 공개 여부 등을 설정할 수 있습니다.

### 그룹 가입 및 초대

- 사용자는 그룹에 가입하거나 초대를 받아 그룹에 참여할 수 있습니다. 초대코드를 통해 그룹 가입을 할 수 있습니다.

### 그룹원 관리

- 그룹의 멤버 리스트를 확인하고 관리할 수 있습니다. 그룹원 초대, 탈퇴 등의 기능이 제공됩니다.

### 페이지 관리

- 그룹 내에서 페이지를 생성하고 수정할 수 있습니다. 각 페이지는 제목, 내용, 목차 등을 가지고 있습니다.

### 히스토리 조회

- 그룹 내에서 변경된 최근 페이지의 히스토리를 확인할 수 있습니다.

### 댓글 기능

- 사용자는 페이지에 댓글을 작성하고 수정, 삭제할 수 있습니다.

### 문서 기여 목록

- 사용자는 그룹 내에서 자신이 기여한 문서의 목록을 확인할 수 있습니다.

### 검색 기능

- 사용자는 메인 페이지에서 그룹을 검색할 수 있으며, 그룹 내에서는 페이지를 검색할 수 있습니다.
- 검색 결과를 확인하고 해당 페이지로 이동할 수 있습니다.

### 회원가입 및 로그인

- 사용자는 카카오 로그인을 통해 로그인 하거나, 회원가입을 통해 계정을 생성하고 로그인하여 서비스를 이용할 수 있습니다.

<br>

## 프로젝트 구조도


<br>

## 문서
|문서 목록|
|----|
[GitHub (FE)](https://github.com/Step3-kakao-tech-campus/Team8_FE)                      
[API 문서](https://www.notion.so/API-e6a2fe24cffe4c54ad9815f32dd8790b)          
[와이어프레임](https://www.figma.com/file/HrjwnC0UfzYJjmwaBRg7uj/8%EC%A1%B0-%EC%99%80%EC%9D%B4%EC%96%B4-%ED%94%84%EB%A0%88%EC%9E%84-Web-%2F-Mobile?type=design&node-id=0-1&mode=design&t=wkU2aDHsx0pHTvYT-0)        

<br>

## ERD

![image](https://github.com/Step3-kakao-tech-campus/Team8_BE/assets/80378041/d3e49985-9543-4e3e-9035-47fe2d4c234c)


<br>

## 기술 스택
**Spring Boot** : 3.1.4        

- **Spring Security**
- **JPA**
- **Lombok**
- **Actuator**
- **JWT**
- **Validation**        

**Java** : 17        

**DB**
        
- 테스트/로컬 용 : H2
- 배포용 : MariaDB 최신 버전        

**redis**        

<br>

## Feature
### 회원 탈퇴
- 회원 탈퇴 시, 회원이 작성했던 글, 댓글, 작성내역 등의 정보를 유지합니다
- 해당 정보를 유지하기 위해, 회원 탈퇴 시 회원과 관련된 groupMember에 외래키를 더미 회원을 만들어서 연결해줍니다.
- 탈퇴한 회원은 Database에서 사라지게 되며, 해당 회원이 작성했던 기록들에는 '알수없음'으로 표기됩니다.

### 그룹 생성
- 신뢰성이 높은 그룹과 폐쇄성이 높은 그룹의 수요가 각각 존재할 것이라 생각해 총 3가지 그룹으로 분류하였습니다
  - 인증이 필요하여 신뢰성을 높인 공식 그룹
  - 공개적인 정보 공유 그룹인 비공식 공개 그룹
  - 폐쇄되어 정보를 공유하는 비공식 비공개 그룹

### 그룹 참가
- 공식 그룹은 해당하는 인증 방식을 통해 가입 권한을 얻을 수 있습니다
- 비공식 공개 그룹은 해당 그룹에 설정된 비밀번호를 맞추거나 초대 링크를 통해 가입 권한을 얻을 수 있습니다
- 비공식 비공개 그룹은 초대 링크를 통한 접근으로 가입 권한을 얻을 수 있습니다.
  - 초대 링크는 일정 기간 동안 해당 링크를 타고 들어오는 사용자들에게 가입 권한을 줍니다
  - Redis에 해당 key 값을 저장하고 일정 주기로 만료된 초대 링크를 찾아 Redis에서 삭제합니다

### 그룹 탈퇴
- 그룹 탈퇴 시 해당 그룹에 남아있는 사람의 존재 여부를 확인한 후 그룹 탈퇴와 나아가 그룹 삭제까지 수행합니다
  - GroupMember가 남아있는 경우 : 그룹 탈퇴
    - 해당 그룹과 회원 사이의 그룹 멤버의 ActiveStatus를 False로 변경하는 것으로
    - 최대한 DB 접근 없이 그 GroupMember의 내역들을 유지하였습니다
    - 또한 재가입의 경우 해당 GroupMember의 ActiveStatus를 True로 변경하여 기존의 내역들을 열람 가능토록 하였습니다
  - GroupMember가 남아있지 않은 경우 : 그룹 삭제
    - 해당 그룹에 남아있는 모든 비활성 GroupMember, Page에 관해 삭제 후 Group 삭제를 진행하였습니다
      

<br>


## How to Use

```
git clone https://github.com/Step3-kakao-tech-campus/Team8_BE.git
// 깃헙 주소 클론
// 그 뒤 로컬 저장소로 이동
./gradlew build
// 프로젝트 빌드
java -jar ./build/libs/wekiki-0.0.1-SNAPSHOT.jar
// 빌드 파일 실행
```


<br>

## License
MIT License

Copyright (c) 2023 [1기] 카카오 테크 캠퍼스 (3단계) 프로젝트 8조

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
