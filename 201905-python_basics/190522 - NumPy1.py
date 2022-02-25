#!/usr/bin/env python
# coding: utf-8

# In[ ]:


#mathList3 = [e + 1 for e in mathList] #리스트 컴프리헨션


# In[ ]:


nested_MathList = [ [11,12,13], [21,22,23], [31,32,33] ]


# In[ ]:


nested_MathList2 = []


# In[ ]:


for math_List in nested_MathList :


# In[ ]:


temp_List = []


# In[ ]:


for e in math_List :


# In[ ]:


temp_List.append(e + 1)


# In[ ]:


nested_MathList2.append(temp_List)


# In[ ]:


#이거는 차원이 늘어나면 방법이 없음


# In[1]:


import numpy as np #닉네임을 꼭 np라고 할 필요는 없지만, 관례임. 웬만하면 쓰도록.


# In[ ]:





# In[ ]:




