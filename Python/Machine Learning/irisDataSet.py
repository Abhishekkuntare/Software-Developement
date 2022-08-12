#Loading required models
from sklearn import datasets
from sklearn.neighbors import KNeighborsClassifier

#Loading datasets
iris  = datasets.load_iris()

# Define features and labels 
features = iris.data
labels = iris.target

# printing description and features and labels
print(iris.DESCR)
print("\n")
print(f"F: {features[0]} L: {labels[0]}")


#Traning the Classifier
clf = KNeighborsClassifier()
clf.fit(features,labels)

# preds = clf.predict([[1, 12, 1, 13]])
preds = clf.predict([[9.1, 3.90, 9.0, 7.2]])
print(preds)

    