#!/usr/bin/env python
# coding: utf-8

# In[1]:


import tensorflow as tf
import matplotlib.pyplot as plt


# In[2]:


x = [1, 2, 3]
y = [1, 2, 3]


# In[3]:


w = tf.placeholder(tf.float32) #이거는 나중에 그때가서 외부에서 값 넣어줄 거라서.


# In[4]:


hypothesis = x * w


# In[5]:


cost = tf.reduce_mean( tf.square(hypothesis-y) )


# In[6]:


w_hist = [] #그래프를 그리기 위해 데이터를 수집하는 배열
cost_hist = []


# In[7]:


with tf.Session() as sess :  #그냥 코스트함수의 그래프가 우리가 생각하는 그런 느낌으로 나오는지 보고 싶은 간단한 코드
    for i in range(-30, 50) :
        curr_w = i * 0.1
        curr_cost = sess.run( cost, feed_dict = {w : curr_w} )
        w_hist.append(curr_w)
        cost_hist.append(curr_cost)


# In[9]:


plt.plot(w_hist, cost_hist) #(history 주면 그래프를 그릴 수 있음)


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




