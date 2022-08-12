import cv2 #for open the camera
cam = cv2.VideoCapture(0) #for video capturing

while True:
    _,frame= cam.read()
    cv2.imshow("Eye show",frame) #im stands for image
    cv2.waitKey(1)