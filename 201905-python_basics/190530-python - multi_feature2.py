#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import tensorflow as tf
import numpy as np


# In[ ]:


#feature가 여러 개 일 때 2차원으로 matrix 만들어서 처리하는 코딩


# In[ ]:


#x1_data = [ 73., 93., 89., 96., 73. ] # 국어
#x2_data = [ 80., 88., 91., 98., 66. ] # 영어
#x3_data = [ 75., 93., 90., 100., 70. ] # 수학
#y_data = [ 152., 185., 180., 196., 142. ] # 점수


# In[ ]:


#x1,x2,x3을 다 합쳐서 하나로 만들기. 그럼 2차원이 되겠지.
x_data = [[ 73., 93., 89., 96., 73. ] # A라는 사람의 국영수사과 5개 과목 점수들
          , [ 80., 88., 91., 98., 66. ] # B라는 사람의 국영수사과 5개 과목 점수들
          , [ 75., 93., 90., 100., 70. ]] # 국영수 세 과목의 5명 데이터라면 [[73,80,75],[93,88,93]...... 세로로 해야 ]
y_data = [ [152.], [185.], [180.]]  #얘는 5행 1열이 돼야 하는데, 그 설명은 밑에 Variable 정의 하는 구문에 써놓음


# In[ ]:


#x1 = tf.placeholder(tf.float32)
#x2 = tf.placeholder(tf.float32)
#x3 = tf.placeholder(tf.float32)
#y = tf.placeholder(tf.float32)


# In[ ]:


#x1,x2,x3 에 대한 placeholder도 하나로 통합
x = tf.placeholder(tf.float32)
y = tf.placeholder(tf.float32)


# In[ ]:


#w1 = tf.Variable( tf.random_normal([1]), name = 'weight1' )
#w2 = tf.Variable( tf.random_normal([1]), name = 'weight2' )
#w3 = tf.Variable( tf.random_normal([1]), name = 'weight3' )
#b = tf.Variable( tf.random_normal([1]), name = 'bias' )


# In[ ]:


w =  tf.Variable( tf.random_normal([5,1]), name = 'weight' )
#x라는 데이터가 3행 5열 이니까, 그 배열이랑 곱하려면 w는shpae이 5행이 되어야지 이렇게 해서 곱한 경과는 [3,5] X [5, 1] => [3, 1] 나오겠지
b = tf.Variable( tf.random_normal([1]), name = 'bias' )  #이거는 모든 계산이 끝난 후 상수 더하는 거라서, 그냥 그대로 두면 됨.


# In[ ]:


#hypothesis = x1 * w1 + x2 * w2 + x3 * w3 + b


# In[ ]:


hypothesis = tf.matmul(x, w)  #데이터의 곱도 matrix 간의 곱으로 바꿔 주기


# In[ ]:


cost = tf.reduce_mean( tf.square(hypothesis - y) )


# In[ ]:


train = tf.train.GradientDescentOptimizer(learning_rate = 1.0e-5).minimize(cost) #1e-5 이러니까 뭐 워닝 나오네


# In[ ]:


sess = tf.Session() #with와 함께 쓰면 자동으로 session을 닫아주기 때문에 신경 안 쓰지만, 꼭 해줘야 하는 것


# In[ ]:


init = tf.global_variables_initializer() #variable 들 초기화 해주기


# In[ ]:


sess.run(init)


# In[ ]:


for step in range(100000) :
    _, cost_val, w_val, b_val = sess.run([train, cost, w, b], feed_dict = {x : x_data, y : y_data})
    #끝에 \ 역슬래시 넣어 주면, 다음 줄에서 이어서 쓰겠다는 뜻
    if step % 1000 == 0 :
        print(cost_val, w_val, b_val)


# In[ ]:


test = [[73., 93., 89., 96., 73.]] #테스트 코드 에측을 정확하게 하는지 테스트해 봄. 
    #학습이 끝나서 나름의 최적의 함수를 만들어졌으면, 그럼 그 함수에 feature(한 세트의 데이터 단위) 하나를 넣어주면 어떤 결과가 나오는지.
    #위에서 x 를 맨 처음에 2차원 배열로 줬기 때문에, test 줄 때도 2차원 배열로 줘야 하는 듯.


# In[ ]:


guess = sess.run(hypothesis, feed_dict = {x : test})


# In[ ]:


print(guess) #원래 넣었던 데이터 넣었으면 그대로 나와야지


# In[ ]:


sess.close()

