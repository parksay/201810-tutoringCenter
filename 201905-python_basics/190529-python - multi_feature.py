#!/usr/bin/env python
# coding: utf-8

# In[11]:


import tensorflow as tf
import numpy as np


# In[46]:


x1_data = [ 73., 93., 89., 96., 73. ] # 국어
x2_data = [ 80., 88., 91., 98., 88. ] # 영어
x3_data = [ 75., 93., 90., 100., 70. ] # 수학
y_data = [ 152., 185., 180., 196., 142. ] # 점수


# In[13]:


x1 = tf.placeholder(tf.float32)
x2 = tf.placeholder(tf.float32)
x3 = tf.placeholder(tf.float32)
y = tf.placeholder(tf.float32)


# In[16]:


w1 = tf.Variable( tf.random_normal([1]), name = 'weight1' )
w2 = tf.Variable( tf.random_normal([1]), name = 'weight2' )
w3 = tf.Variable( tf.random_normal([1]), name = 'weight3' )
b = tf.Variable( tf.random_normal([1]), name = 'bias' )


# In[17]:


hypothesis = x1 * w1 + x2 * w2 + x3 * w3 + b


# In[18]:


cost = tf.reduce_mean(tf.square(hypothesis - y))


# In[21]:


train = tf.train.GradientDescentOptimizer(learning_rate = 1.0e-5).minimize(cost) #1e-5 이러니까 뭐 워닝 나오네


# In[25]:


sess = tf.Session() #with와 함께 쓰면 자동으로 session을 닫아주기 때문에 신경 안 쓰지만, 꼭 해줘야 하는 것


# In[26]:


init = tf.global_variables_initializer() #variable 들 초기화 해주기


# In[27]:


sess.run(init)


# In[34]:


for step in range(100000) :
    _, cost_val, w1_val, w2_val, w3_val, b_bal = sess.run([train, cost, w1, w2, w3, b], feed_dict = {x1 : x1_data, x2 : x2_data, x3 : x3_data, y : y_data})
    #끝에 \ 역슬래시 넣어 주면, 다음 줄에서 이어서 쓰겠다는 뜻
    if step % 1000 == 0 :
        print(cost_val, w1_val, w2_val, w3_val, b_bal)


# In[43]:


test1 = [80.] #테스트 코드 에측을 정확하게 하는지 테스트해 봄
test2 = [99.]
test3 = [78.]


# In[44]:


guess = sess.run(hypothesis, feed_dict = {x1 : test1, x2: test2, x3: test3})


# In[45]:


print(guess)


# In[ ]:


sess.close()

