# Spring-Assignment

1. 수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)
>수정(PUT) = RequestBody와 query , 
> 삭제(DELETE) = query
2. 어떤 상황에 어떤 방식의 request를 써야하나요?
> 이런 답을 원한건지 모르겠다. 답도 모르겠다.
> 1) 생성(POST) =  query?
> 2) 조회(GET) = body or param
> 3) 수정(PUT) = body 와 query
> 4) 삭제(DELETE) = query
> 
> 적긴했는데 그때 그때 다르게 사용하지 않을까 싶다.
3. RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?
><RestFul한 API 설계규칙> --- URI에서
> 1) 동사보다는 명사를, 대문자보단 소문자를 사용하기.
> 2) 마지막에 "/" 슬래시 를 사용하지 않기.
> 3) "_" (언더바) 대신 "-" (하이픈) 사용하기.
> 4) 파일 확장자 포함하지 않기.
> 5) 행위(ex. Running) 포함하지 않기.
4. 적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)
>하긴했다. 근데 다 이해하지는 못했다.
5. 작성한 코드에서 빈(Bean)을 모두 찾아보세요!
> 없다. 빈(Bean)에 대해서 아직 잘모른다.
6. API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요!
>[API 명세서](https://www.notion.so/Spring-API-cd8b64f4cbaf45d8bbd19288fe6c1577)

파일경로 =>> Java > com > sparta > assignment >>> controller,dto,entity,repository,service
확인 부탁드립니다:)