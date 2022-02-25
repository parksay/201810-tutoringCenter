class Product_Test :

    def __init__(self, code, name, price) :
        self.code = code
        self.name = name
        self.price = price

    def test1(self) :
        print('테스트1 - 코드는 ',self.code, '이름은', self.name, '가격은', self.price )

    def test2() :
        print('테스트2 완료')

def test3() :
    print('테스트3 완료')


#밖에서 import 해서 부를 때 
x = product.Product_Test('A22', '키보드', '12345') # 패키지(폴더이름).모듈(파일 이름).클래스(정의한 이름).메소드(정의한 이름)
x.test1() #위에서 x라는 객체 생성할 때 이미 product.Product_Test()라는 구문이 있으니까, 어떤 모듈인지, 그 안의 어떤 클래스인지 정보가 내표돼 있음
product.Product_Test.test2() # test2()라는 메소드는 Product_Test 라는 클래스에 속해 있기는 해. 그럼 모듈.클래스.메소드() 이렇게 불러야지
product.test3() # test3()이라는 메소드는 product라는 모듈에는 속해 있지만 Product_Test 라는 클래스에는 속해 있지 않아. 그냥 모듈 다음에 바로 메소드 이름.
