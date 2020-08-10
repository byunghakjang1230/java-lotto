# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 1단계 - 문자열 덧셈 계산기

### 요구사항

- 쉼표 또는 콜론을 구분자로, 문자열의 합을 반환
- 커스텀 구분자 지점 가능
  - 커스텀 구분자는 \\(.+)\n 를 사용한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하면 RuntimeException

- depth 1단계
- 메소드 10라인 이하
- else 사용 x

### 기능 구현 목록

- [x] 쉼표가 구분자일 때 덧셈 결과 값을 반환한다.
- [x] 콜론이 구분자일 때 덧셈 결과 값을 반환한다.
- [x] 커스텀 구분자를 추출한다
- [x] 커스텀 구분자로 덧셈 결과 값을 반환한다.
- [x] 음수나 숫자가 아니면 RuntimeExceiption을 반환한다.