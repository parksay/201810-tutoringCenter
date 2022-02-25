#!/usr/bin/env python
# coding: utf-8

# In[ ]:


# tensorboard 이용하기 -  linear regression1 복붙한 거


# In[ ]:


import tensorflow as tf
import numpy as np


# In[ ]:


x = [1, 2, 3] #feature
y = [1, 2, 3] # lable


# In[ ]:


w = tf.Variable(tf.random_normal([1]), name = "weight")
b = tf.Variable(tf.random_normal([1]), name = "bias")


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


w_hist = tf.summary.histogram('w', w)
b_hist = tf.summary.histogram('b', b)


# In[ ]:


hypothesis = x * w + b
hypo_hist = tf.summary.histogram('hypothesis', hypothesis)


# In[ ]:


cost = tf.reduce_mean(tf.square(hypothesis - y))
cost_hist = tf.summary.histogram('cost',cost)


# In[ ]:


learning_rate1 = 0.01


# In[ ]:


optimizer = tf.train.GradientDescentOptimizer(learning_rate1)


# In[ ]:


train = optimizer.minimize(cost)


# In[ ]:


sess = tf.Session()


# In[ ]:


sess.run( init )


# In[ ]:


#그래프 그릴 친구들 histo 추가하고, merge하고, run에 같이 넣고, 출력할 때 끼워 넣고


# In[ ]:


with tf.Session() as sess :
    summary = tf.summary.merge_all()
    writer = tf.summary.FileWriter('./tmp_log')
    writer.add_graph(sess.graph)
    
    for step in range(3000) :
        _, cost_val, w_val, b_val, s = sess.run([train, cost, w, b, summary])
        writer.add_summary(s, global_step = global_step)
        if step % 50 == 0 :
            print(step, cost_val, w_val, b_val, s)


# In[ ]:


#cmd 모드에 텐서플로 작업 폴더 들어가서 - cd myTflow
#다음 줄 뜨면 Tensorboard --logdir = ./tem_log 이렇게 치면 실행 됨

