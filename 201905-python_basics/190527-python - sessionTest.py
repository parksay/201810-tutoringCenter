#!/usr/bin/env python
# coding: utf-8

# In[2]:


import tensorflow as tf


# In[1]:


import numpy as np


# In[4]:


x = tf.placeholder(tf.float32)  #placeholder로 일단 자료형까지만 선언해 놓고, 나중에 연산할 때 즉석에서 데이터 넣어주겠다
y = tf.placeholder(tf.float32)  # 중괄호로 묶고, 그 안에 하나하나의 속성에 값을 부여해 주는 형식 => dictionary


# In[5]:


z = tf.matmul(x, y)


# In[13]:


sess = tf.Session()
sess.run(z, feed_dict ={x: [[3., 3.], [3., 3.]], y: [[5., 5.], [5., 5.]]} )


# In[ ]:


#with 명령어를 이용한 session 객체 사용


# In[ ]:


x = tf.placeholder(tf.float32)
y = tf.placeholder(tf.float32)


# In[ ]:


z = tf.matmul(x, y)


# In[14]:


with tf.Session() as sess :
    print( sess.run(z, feed_dict = {x: [[3., 3.], [3., 3.]], y: [[5., 5.], [5., 5.]]}))


# In[ ]:





# In[ ]:


#interactiveSession()  => run() 을 수행하지 않아도 eval()을 사용해서 출력 결과를 바로 확인 가능


# In[ ]:


import tensorflow as tf


# In[ ]:


x = tf.placeholder(tf.float32)
y = tf.placeholder(tf.float32)


# In[ ]:


z  = tf.matmul()


# In[ ]:


sess = tf.InteractiveSession()


# In[ ]:


print( z.eval(feed_dict = {x: [[3., 3.], [3., 3.]], y: [[5., 5.], [5., 5.]]}) )
sess.close()  #close는 그대로 해줘야 함


# In[ ]:




