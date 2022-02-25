#!/usr/bin/env python
# coding: utf-8

# In[1]:


import tensorflow as tf


# In[2]:


import numpy as np


# In[6]:


#간단한 linear regression 테스트


# In[7]:


x = [1, 2, 3] #feature
y = [1, 2, 3] # lable


# In[8]:


w = tf.Variable(tf.random_normal([1]), name = "weight")
b = tf.Variable(tf.random_normal([1]), name = "bias")


# In[15]:


hypothesis = x * w + b #hypothesis = Wx + b 수학적으로는 이렇게 수식을 쓰는 게 더 일반적이지만,
#코딩할 때는 데이터가 x에 들어가기 때문에 x가 많아져. 보기 편하게


# In[16]:


cost = tf.reduce_mean(tf.square(hypothesis - y))


# In[17]:


learning_rate1 = 0.01


# In[18]:


optimizer = tf.train.GradientDescentOptimizer(learning_rate1) #괄호 안에는 learning rate 전달


# In[19]:


train = optimizer.minimize(cost) #위에서 구한 optimizer 를 구하는 게 끝이 아니라, 그게 최소가 되는 값을 찾는 거니까.


# In[25]:


with tf.Session() as sess :
    sess.run( tf.global_variables_initializer() )
    
    for step in range(3000) :  #얘네가 한 번에 못 찾아 냄. 계속 반복하면서 찾아내는 거. 반복 횟수를 크게 잡을 수록 근사한 값을 찾아냄.
        _, cost_val, w_val, b_val = sess.run([train, cost, w, b]) #넣어서 나온 값들을 저장. train 은 찾아도 none으로 나와서. 안 받아 그냥.
        #이거 그대로 계속 출력하면 2000번 다 나오는데, 너무 많잖아. 그래서 일정 횟수마다 출력하라고 보통 설정해줌.
        if step % 50 == 0 :
            print(step, cost_val, w_val, b_val)


# In[ ]:




