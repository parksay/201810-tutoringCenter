#!/usr/bin/env python
# coding: utf-8

# In[ ]:


# 동물들의 특성을 데이터화 하여 동물들을 분류하는 프로그램


# In[ ]:


import tensorflow as tf
import numpy as np


# In[ ]:


data = np.loadtxt('data-04-zoo.csv', delimiter = ',', dtype = np.float32)


# In[ ]:


x_data = data[ : , 0:-1]
y_data = data[ :, [-1]] #y 데이터는 0과 1로만 돼 있는 상태가 아니므로, one_hot encoding을 해줘야 한다는 점.


# In[ ]:


print(x_data.shape, y_data.shape)
#(101, 16) => 101개의 동물들에 대한 데이터가 있고, 한 동물을 분류하기 위한 항목, 특성이 16가지가 있음. x_data
#(101, 1) => 101개의 동물들에 대한 데이터가 있고, 그 결과값을 한 가지로만 나타냄. y_data


# In[ ]:


x = tf.placeholder(tf.float32,[None, 16]) #행 값은 그냥 너 알아서 하라고 해도 되지만, 열 값은 꼭 알려줘야 함.
y = tf.placeholder(tf.float32,[None, 1])


# In[ ]:


classes = 7 #그래서 동물들 분류하는 가짓수가, 카테고리가 7개라고. 0~6까지


# In[ ]:


y_onehot = tf.one_hot(y_data, classes) # y의 데이터가 1/0만으로 돼있지 않으니까, one_hot encoding 해주기
# 0 => [1 0 0 0 0 0 0]
# 1 => [0 1 0 0 0 0 0]


# In[ ]:


print(y_onehot) 
#이거 보면 우리 2차원 데이터 다루고 있었는데, shape이 3차원 데이터로 바껴 있어. 이러면 데이터가 뒤죽박죽이 됨. reshape 시켜줘야 함.


# In[ ]:


y_onehot = tf.reshape(y_onehot, [-1, classes])


# In[ ]:


print(y_onehot)


# In[ ]:


w = tf.Variable(tf.truncated_normal([16, classes]), name = 'weight')
b = tf.Variable(tf.truncated_normal([classes]), name = 'bias')


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


logits = tf.matmul(x, w) + b # ann이라고도 부름 - artificial neural network


# In[ ]:


hypothesis = tf.nn.softmax(logits)


# In[ ]:


cost  = tf.reduce_mean(tf.nn.softmax_cross_entropy_with_logits_v2(logits = logits, labels = [y_onehot]) ) #데이터를 두개 넣어주게 돼있음. 


# In[ ]:


optimizer = tf.train.GradientDescentOptimizer(learning_rate = 0.2)


# In[ ]:


train = optimizer.minimize(cost)


# In[ ]:


sess = tf.Session()


# In[ ]:


sess.run(init)


# In[ ]:


predict = tf.argmax(hypothesis, 1)
is_correct = tf.equal(predict, tf.argmax(y_onehot, 1))
accuracy = tf.reduce_mean(tf.cast(is_correct,tf.float32))


# In[ ]:


for step in range(10000) :
    _, cost_val, acc_val = sess.run([train,cost,accuracy], feed_dict = {x: x_data, y: y_data})
    
    if step % 500 == 0:
        print(step, cost_val, acc_val)


# In[ ]:




