#!/usr/bin/env python
# coding: utf-8

# In[ ]:


# 0, 1 로 분류하는 logistic regression 의 첫번째 예제 - sigmoid() 사용하여 0~1 사이의 값만 출력하는 함수


# In[ ]:


import tensorflow as tf
import numpy as np


# In[ ]:


x_data  = [[1,2], [2,3], [3,1], [4,3], [5,3], [6,2]] #행 갯수는 그냥 그때그때 들어오는 자료의 갯수니까 잘 안 셈.
y_data = [[0],[0], [0],[1],[1],[1]] # 우리가 수동으로 0 또는 1만의 조합으로 써 넣었지만, 보통은 one hot encoding이라는 함수를 많이 씀.


# In[ ]:


x = tf.placeholder(tf.float32, shape = [None, 2])
y = tf.placeholder(tf.float32, shape = [None, 1])


# In[ ]:


w = tf.Variable( tf.truncated_normal([2,1]), name = 'weight' ) #random_normal 이나 truncated_normal 이나 비슷한 거 같은데 좀 더 잘 만든다고.
b = tf.Variable(tf.truncated_normal( [1] ), name = 'bias') # 0 ~ 1 사이 수 뽑아주는데 0은 나오지만 1은 안 나옴


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


hypothesis = tf.sigmoid( tf.matmul(x,w)+b )  #정확한 작동 원리나 과정은 몰라도 되는데, 그 sigmoid 라는 용어는 잘 알아야 함.


# In[ ]:


cost = -tf.reduce_mean(y * tf.log(hypothesis) + (1-y)* tf.log(1-hypothesis)) 
# 방향이 서로 다른 두 개의 로그함수를 붙여서 U자형을 만듦. cross 해서 만듦. csross entropy


# In[ ]:


#이제 그래프가 매끄럽게 됐기 때문에 기울기를 구할 수가 있게 됐음
#그럼 이제부턴 똑같음. GradientDescentOptimizer 써서 기울기를 찾고
#minimize 써서 cost가 최소값을 찾으면 됨


# In[ ]:


optimizer = tf.train.GradientDescentOptimizer(learning_rate = 0.01)


# In[ ]:


train = optimizer.minimize(cost)
# 예측값이 > 0.5 이면 1로, 아니면 0으로 수정하여 뽑아주기


# In[ ]:


predicted = tf.cast(hypothesis > 0.5, dtype = tf.float32)


# In[ ]:


#정확성 체크 (predicted 값이 label 과 얼마나 맞는지 평균을 구하여 정확성 확률을 구함)


# In[ ]:


accuracy = tf.reduce_mean(tf.cast( tf.equal(predicted, - y), dtype = tf.float32 ))


# In[ ]:


with tf.Session() as sess :
    sess.run(tf.global_variables_initializer())
    
    for step in range( 10000 ) : 
            _, cost_val = sess.run([train, cost], feed_dict = {x: x_data, y: y_data})
            if step % 500 == 0 :
                print(step, cost_val)
    hy_val, pre_val, acc_val = sess.run( [hypothesis, predicted, accuracy], feed_dict = {x : x_data, y : y_data})
    print('\nHypothesis : ', hy_val, '\nPredicted : ', pre_val, 'Accuracy : ', acc_val, sep = '\n')


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




