#!/usr/bin/env python
# coding: utf-8

# In[2]:


import tensorflow as tf
import numpy as np


# In[3]:


#파일 새로 만들어서, 그 파일에서 데이터 불러 오기. 파일은 같은 폴더에 있어야 함.


# In[9]:


data = np.loadtxt('simple_data.csv', delimiter = ',', dtype = np.float32)  #csv가 comma separated values의 약자.
#파일로부터 자료를 읽어 오는 기능. delimiter는 데이터 간의 구분하는 기호


# In[10]:


data_x = data[ : , 0] #불러온 data 라는 자료 중에서, 행은 전체, 열은 0번째, 에 있는 데이터들의 배열이 바로 x다. 슬라이싱해서 가져오기
data_y = data[ : , 1]


# In[11]:


print(data_x.ndim, data_x.shape)


# In[12]:


print(data_y.ndim, data_y.shape)


# In[41]:


x = tf.placeholder(tf.float32, shape = [None])
y = tf.placeholder(tf.float32, shape = [None])


# In[42]:


w = tf.Variable( tf.random_normal([1]), name = 'weight' ) 
# w = tf.constant(0.5) 이런 식으로 내가 알아서 상수 만들어서 넣어줘도 되긴 되는데, 컴퓨터가 알아서 주라고


# In[43]:


b = tf.Variable(tf.random_normal([1]), name = 'bias')


# In[44]:


sess = tf.Session()
sess.run( tf.global_variables_initializer() )


# In[45]:


hypothesis = x * w + b


# In[46]:


cost = tf.reduce_mean( tf.square(hypothesis - y) )


# In[47]:


optimizer = tf.train.GradientDescentOptimizer(learning_rate = 0.0001)


# In[48]:


train = optimizer.minimize(cost)


# In[49]:


for i in range(2000) :
    cost_val, w_val, b_val, _ = sess.run( [cost, w, b, train], feed_dict = {x: data_x, y: data_y} ) #dictionary 방식 { ~~ }
    if i % 100 == 0 :
        print(cost_val, w_val, b_val) #학습이 종료되면 cost_val이 최소값이 되어 


# In[64]:


print(sess.run( hypothesis, feed_dict = {x: [2.5]} ))


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




