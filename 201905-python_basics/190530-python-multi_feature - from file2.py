#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import tensorflow as tf
import numpy as np


# In[ ]:


data = np.loadtxt('data-03-diabetes.csv', delimiter = ',', dtype = np.float32)


# In[ ]:


x_data = data[ : , :-1]
y_data = data[ : , [-1]]


# In[ ]:


print(x_data.ndim, x_data.shape)
print(y_data.ndim, y_data.shape)


# In[ ]:


x = tf.placeholder(tf.float32, shape = [None, 8])
y = tf.placeholder(tf.float32, shape = [None, 1])


# In[ ]:


w = tf.Variable(tf.random_normal([8,1]), name = 'weight')
b = tf.Variable(tf.random_normal([1]), name = 'bias')


# In[ ]:


hypothesis = tf.matmul(x, w) + b


# In[ ]:


cost = tf.reduce_mean( tf.square(hypothesis - y) )


# In[ ]:


optimizer = tf.train.GradientDescentOptimizer(1.0e-5)


# In[ ]:


train = optimizer.minimize(cost)


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


sess = tf.Session()


# In[ ]:


sess.run(init)


# In[ ]:


for step in range(100000) : 
    _, cost_val, w_val, b_val = sess.run([train, cost, w, b], feed_dict = {x: x_data, y : y_data})
    if step % 1000 == 0 :
        print(cost_val, w_val, b_val)


# In[ ]:


test = [[-0.294118, 0.487437, 0.180328, 0.292929, 0, 0.00149028, -0.53117, -0.0333333]]


# In[ ]:


guess = sess.run(hypothesis, feed_dict = {x: test})


# In[ ]:


print(guess)


# In[ ]:





# In[ ]:




