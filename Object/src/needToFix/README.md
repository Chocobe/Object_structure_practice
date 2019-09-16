#Object 오탈자

1. (13p) 클래스 다이어그램의 두번째 ``Audience`` --> ``TicketSeller`` 인것 같습니다.


1. (24p) 클래스 다이어그램에서 ``Audience``에서 ``Ticket``방향의 의존관계(dependency)를 표시하지 않아도 되는지 궁금합니다.

	* Audience 클래스의 ``public long buy(Ticket ticket)`` 메소드
	
	
1. (64p) 마지막 문단 

	> Sequence Condition과 PeriodCondition은 동일한 인터페이스를 공유하며 다형적인 협력에 참여할 수 있다.

	* 수정하면 --> SequenceCondition 과 PeriodCondition은 동일한 ... 
	(Sequence Condition에 공백문자가 있습니다.)


1. (69p) 그림 2.15에서 ``NoneDiscountPolicy`` 클래스의 메소드가 잘못 된거 같습니다.

	* ``#getDiscountAmount()`` --> ``calculateDiscountAmount()``

	
1. (70p) ``상속``의 두번째 문단 3번째 줄 ``Movie의 calculateFee ...`` --> ``Movie의 calculateMovieFee``로 수정해야 할 거 같습니다.


1. (79p) CRC카드에서 ``세번째 Movie`` --> ``DiscountCondition``인것 같습니다.


1. (111p) ``그림4.2``의 각 캡션이 ``높은 결합도, 낮은 결합도`` --> ``높은 응집도, 낮은 응집도`` 인것 같습니다.


1. (111p) ``그림4.3``은 본문 내용상 좌측, 우측이 반대로 되어있는 것 같습니다. 또한 우측 그림은 본문내용과 요소의 수가 일치하지 않습니다.


1. (141p) 두번째 클래스 다이어그램에서 ``3:할인 요금을 계산하라`` --> ``3:할인 여부를 판단하라`` 인것 같습니다.


1. (164p) ``그림5.8``에서 클래스명이 잘못된것 같습니다.

	* ``좌측 상단 Screening 클래스`` -> ``Movie 클래스`` 로 변경
	
		* 메소드 : calculateMovieFee()
	
	* ``Movie 클래스`` -> ``DiscountPolicy 클래스`` 로 변경
	
		* 메소드 : calculateDiscountAmount()
		
		
1. (170p) ``calculateNoneDiscountedFee(Movie movie) 메소드의 반환값이 잘못된 것 같습니다.

	* ``return movie.getFee();`` -> ``return Money.ZERO;``
	
	* ``calculate----DiscountedFee(Movie movie)`` 메소드 들은 할인해줄 차감액을 계산하는 부분인데, 원래 가격을 반환하고 있습니다.
	
	
1. (285p) 코드에서 ``calculateDiscountAmount(Screening screening) 메소드의 리턴 부분이 잘못된 것 같습니다.

	* ``return getDiscountedFee(screening);`` -> ``return getDiscountAmount(screening);``
	
	
1. (285p) 본문 두번째 단락 첫번째 줄에 의미가 반대인것 같습니다.

	* ``여기서 변하는 부분을 고정하고 변하지 않는 부분을 생략하는..`` -> ``여기서 변하지 않는 부분을 고정하고 변하는 부분을 생략하는..`` 으로 수정해야 할 것 같습니다.
	
	
1. (290p) 두번째 코드블록에서 ``public Money getAvatarFee()``의 코드를 수정해야 할 것 같습니다.

	* ``Movie avatar = factory.createMadMaxMovie();`` -> ``Movie avatar = factory.createAvatarMovie();``
	
	
1. (355p) 코드 블록 중, 추상클래스 ``Phone``의 메소드 중, ``call(Call call)``메소드가 빠진것 같습니다. (핵심과는 무관하지만, 테스트로 실행하기 위해선 필요했었습니다.)

	```java
	public void Call(Call call) {
		calls.add(call);
	}
	```
	
	
1. (365p) 두번째 코드블록의 클래스 명에 **Rate**단어가 누락된 것 같습니다.

	```java
	public class TaxableAndDiscountableNightlyDiscountPhone {}
	
	// 다음과 같이 변경해야 할 것 같습니다.
	
	public class TaxableAndRateDiscountableNightlyDiscountPhone {}
	```
	
	* (366p)와 (367p)의 클래스 다이어그램에는 해당 클래스명이 올바르게 적혀 있습니다. 
	
	
1. (369p) 두번째 코드블록의 ``for()`` 문 내부의 ``plus``연산이 잘못된 것 같습니다.

	```java
	for(Call call : phone.getCalls()) {
		
		result.plus(calculateCallFee(call));
		
		// 위의 plus 연산은 결과를 반환값으로 보내는 쿼리문이었습니다.
		// 그래서 아래와 같이 수정이 필요할 것 같습니다.
		
		result = result.plus(calculateCallFee(call));
	}
	
	
1. (374p) 본문 두번째 문단의 마지막 문장을 수정해야 할 것 같습니다.

	* 원본 : ``AddionalRatePolicy를 상속받은 자식 클래스는 calculateFee 메서드를 오버라이딩해서...``
	
	* 수정한다면 : ``AddionalRatePolicy를 상속받은 자식 클래스는 afterCalculated 메서드를 오버라이딩해서...``
	
	* 이유 : ``AddionalRatePolicy를 상속받는 자식 클래스가 자신의 정책을 구현하는 부분이 추상메서드인 afterCalculated 메서드를 오버라이딩 해야 한다고 이 책에서 배웠습니다``
	
	
1. (396p) 세번째 코드블록에서 동일한 ``evaluate()``메서드가 두번 작성되어 있습니다.


1. (423p) 코드블록에서 생성자의 매개변수 중 ``String name``은 부모 클래스들에서는 ``String title``로 정의되어 왔습니다.

	* 원본 : 
	```java
	public FormattedGradeLecture(String name, ...) {
		super(name, ...);
	}
	```
	
	* 수정 : 
	```java
	public FormattedGradeLecture(String title, ...) {
		super(title, ...);
	}
	```
	

1. next