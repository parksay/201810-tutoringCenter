#!/usr/bin/env python
# coding: utf-8

# In[1]:


import tensorflow as tf
import numpy as np
import matplotlib.pyplot as plt


# In[5]:


sess  = tf.InteractiveSession()


# In[13]:


data1 = tf.random_normal([100]).eval() #랜덤한 숫자가 10개 들어 있는 1차원 배열 생성


# In[24]:


plt.hist(data1, bins= 100) #히스토그램 bins 는 빈도수


# In[17]:


plt.show()


# In[19]:


data2 = tf.random_uniform([1000]).eval() #1000개인데 음수는 발생하지 않음. 0과 1사이의 수.


# In[26]:


plt.hist(data2, bins = 100)


# In[ ]:


## tf.sum() /tf,reduce_mean()


# In[34]:


tf.reduce_mean([1, 2], axis = 0)


# In[ ]:


x = [[11,12,13],[21,22,23]]


# In[39]:


tf.reduce_mean(x).eval()


# In[40]:


tf.reduce_mean(x, axis = 1).eval()


# In[ ]:


tf.argmax()  #arg => argment()
- 배열에서 가장 큰 인수의 인덱스를 리턴함


# In[36]:


x = [[11,12,13], [21,22,23]]


# In[37]:


tf.argmax(x, axis =0).eval() #axis 가 0인 애들을 중심으로 당장 지금 최대값을 뽑아 옴


# In[38]:


tf.argmax(x, axis =1).eval() 


# In[ ]:


#tf.one_hot()  ==> 하나를 뜨겁게 한다? 데이터를 0과 1의 나열로 변환, 그 갯수로 랭크


# In[45]:


tf.one_hot( [[0],[1],[2],[3],[0],[2]], depth = 3 ).eval()  #그 결과는 rank 가 하나 늘어남. 
#' 0 '인 요소의 갯수가 depth 개 만큼 가지는 배열을 만들고, 그 안에서 몇 번째 요소를 ' 1 ' 로 바꿈. 
#그 값을 인덱스로 갖는 요소를 1로 바꿈


# In[ ]:


tf.argmax(x, axis = 1).eval()

