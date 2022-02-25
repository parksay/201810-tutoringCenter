#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import tensorflow as tf
import numpy as np


# In[ ]:


data = np.loadtxt('data-01-test-score.csv', delimiter = ',', dtype = np.float32)


# In[ ]:


x_data = data[ :, 0:-1 ] #행은 몇 갠지 모르겠다. 데이터 쌍이, 세트가 총 몇갠지 모르겠다 .그때그때 바뀌는 거니까. 그럼 그냥 ' : '만 주면 처음부터 끝까지
#feature 가 몇 개인지 내가 직접 세지 않고, 끝으로부터 바로 앞까지, 라는 뜻으로, ' -1 '만 입력해도 됨.
y_data = data[ : , [-1]]


# In[ ]:


print(x_data.ndim, x_data.shape) #데이터를 잘 받아 온 건가, 중간 확인. 출력해보기.
print(y_data.ndim, y_data.shape)
y_data #numpy 는 그냥 써도 바로 출력해주는 기능 있음. 


# In[ ]:


x = tf.placeholder(tf.float32, shape = [None,3]) #여기서 우리가 데이터 세트가 얼만큼 몇개나 들어올지 모름. 그러면 그냥 None
y = tf.placeholder(tf.float32, shape = [None,1]) 


# In[ ]:


w = tf.Variable(tf.random_normal([3, 1]), name = 'weight')
b = tf.Variable(tf.random_normal([1]), name = 'bias')
#이거 각 행렬들, 데이터들을 머리 속으로 그려가면서 해야 shape 가 머리 속에 그려지네.
#[x, 3] X [3, 1] = [x, 1] 이런 형태의 행렬 간의 곱을 머리 속으로 상상하면서 봐야 x의 shape, y의 shape, w의 shape 등이 감이 잡힘
# 행렬x X 행렬w = 행렬 y


# In[ ]:


hypothesis = tf.matmul(x, w) + b


# In[ ]:


cost = tf.reduce_mean(tf.square(hypothesis - y))


# In[ ]:


train = tf.train.GradientDescentOptimizer(learning_rate = 1.0e-5).minimize(cost) #1e-5 이러니까 뭐 워닝 나오네


# In[ ]:


sess = tf.Session()


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


sess.run(init)


# In[ ]:


for step in range (300000) :
    _, cost_val, w_val, b_val = sess.run([train, cost, w, b], feed_dict = {x: x_data, y : y_data})
    if step % 3000 == 0 :
        print(cost_val, w_val, b_val)


# In[ ]:


test = [[ 73.,  80.,  75.]
       , [100., 95., 73.]
       , [96., 87., 89.]]


# In[ ]:


guess = sess.run(hypothesis, feed_dict = {x: test})


# In[ ]:


print(guess)


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




