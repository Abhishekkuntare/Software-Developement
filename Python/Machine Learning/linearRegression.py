import matplotlib.pyplot as plt
import numpy as np
from sklearn import datasets ,linear_model
from sklearn.metrics import mean_squared_error



dibetes = datasets.load_diabetes()



# dibetes_x = dibetes.data[:,np.newaxis,2] # get only one feature
dibetes_x = dibetes.data # get all features
# 1.slicing the data 

dibetes_x = np.array([[1],[2],[3]])

dibetes_x_train = dibetes_x
dibetes_x_test = dibetes_x

dibetes_y_train = np.array([3, 2, 4])
dibetes_y_test = np.array([3,2,4])

model = linear_model.LinearRegression()

model.fit(dibetes_x_train,dibetes_y_train)

dibetes_y_predicted = model.predict(dibetes_x_test)

# finding the mean square 
print("Mean squared is: ", mean_squared_error(dibetes_y_test,dibetes_y_predicted))

print("Weights: ", model.coef_)
print("Intercept: ",model.intercept_)


plt.scatter(dibetes_x_test,dibetes_y_test) # show the graph 
plt.plot(dibetes_x_test,dibetes_y_predicted) # show predicted line 
plt.show()
