#!/usr/bin/env python
# coding: utf-8

# In[2]:


import tensorflow as tf


# In[4]:


hello = tf.constant("Hello, Big World")


# In[5]:


sess = tf.Session()


# In[6]:


sess.run(hello)


# In[ ]:


#여기서 뜨는 ' b ' 는 binary 라는 뜻

