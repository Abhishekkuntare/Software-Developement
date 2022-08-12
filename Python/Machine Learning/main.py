import matplotlib.pyplot as plt
import numpy as np
from sklearn import datasets ,linear_model
from sklearn.metrics import mean_squared_error


# ['data', 'target', 'frame', 'DESCR', 'feature_names', 'data_filename', 'target_filename', 'data_module'

dibetes = datasets.load_diabetes()
# printing the keys of dibetes
# print(dibetes.keys()) 

# print(dibetes.DESCR)

# dibetes_x = dibetes.data[:,np.newaxis,2]
# print(dibetes_x)


# dibetes_x = dibetes.data[:,np.newaxis,2] # get only one feature
dibetes_x = dibetes.data # get all features
# 1.slicing the data 
dibetes_x_train = dibetes_x[:-30]
dibetes_x_test = dibetes_x[-30:]

dibetes_y_train = dibetes.target[:-30]
dibetes_y_test = dibetes.target[-30:]

model = linear_model.LinearRegression()

model.fit(dibetes_x_train,dibetes_y_train)

dibetes_y_predicted = model.predict(dibetes_x_test)

# finding the mean square 
print("Mean squared is: ", mean_squared_error(dibetes_y_test,dibetes_y_predicted))

print("Weights: ", model.coef_)
print("Intercept: ",model.intercept_)


# plt.scatter(dibetes_x_test,dibetes_y_test) # show the graph 
# plt.plot(dibetes_x_test,dibetes_y_predicted) # show predicted line 
# plt.show()

# Mean squared is:  3035.0601152912695
# Weights:  [941.43097333]
# Intercept:  153.39713623331698