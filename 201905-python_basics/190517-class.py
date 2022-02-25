import product #이대로 그냥 쓰면 못 불러와. 경로 등록을 따로 해놓아야 함. 근데 귀찮잖아. 그래서 코드로 그냥 즉석에서 처리하는 방식이 있음.

import sys #일단 sys라는 모듈을 임포트 하고
sys.path.append('C:\\PyStudy\\190517-package1') #그 sys 모듈 안에 있는 path 클래스에 속한 append 메소드를 통해서 경로를 등록해줌
import product #그러면 이제 import해도 바로 인식 가능

#이게 임포트해서 쓰는 이상, test()라는 메소드가 있다면, 이름이 겹칠 우려가 있음. 내가 여기서 직접 만든 메소드일지,
#아니면 임포트한 곳에도 test()라는 애가 있을지. 그러니까 모듈 이름을 같이 써주는 거.
x = product.Product_Test('A22', '키보드', '12345') # 패키지(폴더이름).모듈(파일 이름).클래스(정의한 이름).메소드(정의한 이름)
x.test1() #위에서 x라는 객체 생성할 때 이미 product.Product_Test()라는 구문이 있으니까, 어떤 모듈인지, 그 안의 어떤 클래스인지 정보가 내표돼 있음
product.Product_Test.test2() # test2()라는 메소드는 Product_Test 라는 클래스에 속해 있기는 해. 그럼 모듈.클래스.메소드() 이렇게 불러야지
product.test3() # test3()이라는 메소드는 product라는 모듈에는 속해 있지만 Product_Test 라는 클래스에는 속해 있지 않아. 그냥 모듈 다음에 바로 메소드 이름.
