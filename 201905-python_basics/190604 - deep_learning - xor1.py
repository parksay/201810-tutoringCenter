#!/usr/bin/env python
# coding: utf-8

# In[ ]:


# 하나의 레이어만으로는 학습을 할 수가 없다는 것을 보여주는 코딩


# In[ ]:


import tensorflow as tf


# In[ ]:


# constant 를 만들어 줌. True = 1 / False = -1
T, F = 1., -1.


# In[ ]:


x_data =  [[T, T], [T, F], [F, T], [F, F]]
y_data = [[F], [T], [T], [F]]


# In[ ]:


x = tf.placeholder(tf.float32, shape = [None, 2])
y = tf.placeholder(tf.float32, shape = [None, 1])


# In[ ]:


w1 = tf.Variable(tf.truncated_normal([2,1]))
b1 = tf.Variable(tf.truncated_normal([1]))


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


hypothesis = tf.tanh( tf.add( tf.matmul(x, w1), b1) ) #accuration 함수를 뭘 쓰느냐


# In[ ]:


error = tf.subtract(y, hypothesis)
cost = tf.reduce_mean(tf.square(error))


# In[ ]:


train = tf.train.GradientDescentOptimizer(0.01).minimize(cost)


# In[ ]:


sess = tf.Session()


# In[ ]:


sess.run(init)


# In[ ]:


for step in range(100001) :
    _, cost_val, err = sess.run([train, cost, error], feed_dict = {x: x_data , y: y_data})
    
    if step % 5000 == 0 :
        print(step, 'Cost: ', cost_val, 'Error: ', error)
print('end')


# In[ ]:


result = sess.run(hypothesis, feed_dict = {x: [[T, T], [T, F], [F, T], [F, F]] ,y: [[F], [T], [T], [F]]})


# In[ ]:


print(result>0) #학습을 아무리 많이 시켜도, 결과를 맞출 수 없다는 걸 보여줌.


# In[ ]:





# In[ ]:


#deep learning을 이용. 가중치를 두는 입력과 출력의 과정을 여러 층에 걸쳐서 진행해 보기 => 된다.


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




