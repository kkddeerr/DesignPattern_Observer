# DesignPattern_Strategy-Observer

<b> UML Diagram </b>
<div>  <img align="center" src="https://user-images.githubusercontent.com/22215395/49061960-b5bcee80-f255-11e8-84e4-9955ca7042f1.jpg"> 
</div>
<br>

<b> -Strategy Pattern이란? </b>

동적으로 알고리즘을 교체할 수 있는 구조로의 패턴으로 <br>
알고리즘 인터페이스를 정의하고, 각각의 알고리즘의 클래스를 캡슐화하여 각각의 <br>
알고리즘을 교체, 재사용, 추가, 삭제를 가능하게 한다. <br>
이는 객체 또는 기능이 추가, 변경되더라도 쉽고 간단하게 적용 할 수 있으며 <br>
코드의 중복 없이 코드의 재사용이 가능하게 됩니다. <br>

<b> 구현 방법 </b>
1) 알고리즘에 대한 인터페이스를 만든다. <br>
2) 인터페이스를 구현한 알고리즘 클래스들을 만든다. <br>
3) 실제 이 인터페이스들을 사용할 클래스를 만든다. <br>

<b> Strategy 활용 방법 </b>

1. 각각의 말의 속도를 정하는 인터페이스를 만든다. <br>
2. 말들은 설정된 150ms의 스레드 실행 속도에 따라 랜덤하게 말의 속력을 지정 받는다. <br>
3. 속력은 각각의 인터페이스로 구성되어 있으며 mode라는 변수의 <br>
   ArrayList에 각각의 속력 인터페이스 인스턴스가 담겨있고 이를 랜덤하게 말의 속도에 셋팅한다. <br>
   
   int random = (int) (Math.random() * 4); <br>
   setVelocity mode= modes.get(random); <br>
   horse.setRunningMode(mode); <br>
   
<b> -Observer Pattern이란? </b>
<br>

 
객체의 상태 변화를 관찰하는 관찰자(Observer)를 객체에 등록하여, <br>
변화가 있을 때 마다 등록된 목록의 관찰자들에게 통지 하도록 하는 패턴입니다. <br>
즉 객체에 변화가 있을 때 이를 notifyObservers라는 메소드를 이용해 변화가 있음을 Observer에게 알리고 <br>
옵저버는 등록된 객체들에게 통지하여 그에 해당하는 작동을 수행하게 합니다. <br> 
이는 각 개체간의 결합을 느슨하게 만들고 코드의 재사용성을 향상시킵니다.

<b> 구현방법 </b>
1) Subject 객체를 선정하고 구현한다
2) 해당 데이터를 활용하는 객체를 구현한다 (Observer)
3) 변경시 해당 옵저버에게 상태를 알리는 부분(update)을 구현한다

<b> Observer 활용 방법 </b>

1. 각각의 말들에 Stamina 100을 지정
2. 랜덤으로 주어지는 말의 속력에 따라서 체력을 감소시킴 <br>
( VeryFast – Stamina 5감소 ) ( Fast – Stamina 3감소 )
( Slow – Stamina 1감소 ) ( VerySlow – Stamina 1증가 )
3. 각 말의 Stamina의 증감시 옵저버에게 전달
4. 옵저버는 update가 구현된 FullStaminaAlarm, HighStaminaAlarm, <br>
 NormalStaminaAlarm, LowStaminaAlarm, ZeroStaminalAlarm 인스턴스들에게 <br>
 Horse객체가 변화되었음을 전달하고 각각의 Alarm 인스턴스에서 Stamina를 체크한다. <br>
 Stamina의 상태에 따라 화면에 다른 메시지를 출력하는 각각의 클래스를 작동시킨다. <br>
 The Horse is <현재의 스테미나 상태> Present Stamina : <현재 남은 Stamina>
