
#1.For opening the camera
import cv2 #for open the camera
import mediapipe as mp #it is used to detectd the face
import pyautogui # ro move the cursor 
face_mesh = mp.solutions.face_mesh.FaceMesh(refine_landmarks=True)
screen_w,screen_h =pyautogui.size()

cam = cv2.VideoCapture(0) #for video capturing

while True:
    _,frame= cam.read()
    frame =cv2.flip(frame,1)
    rgb_frame =cv2.cvtColor(frame,cv2.COLOR_BGR2RGB)
    output =face_mesh.process(rgb_frame)
    landmark_points =output.multi_face_landmarks
    # print(landmark_points)
    frame_h,frame_w, _ = frame.shape # _ means the dimetions but we don't care about that

    if(landmark_points):
        landmarks =landmark_points[0].landmark
        for id,landmark in enumerate(landmarks[474:478]):
            x = int(landmark.x*frame_w)
            y = int(landmark.y*frame_h)
            cv2.circle(frame,(x,y),3,(0,255,0))
            # print(x,y)
            if(id ==1):
                screen_x = screen_w /frame_w *x
                screen_y = screen_h /frame_h *y
                pyautogui.moveTo(screen_x,screen_y)
        left =[landmarks[145],landmarks[159]]
        for landmark in left:
            x = int(landmark.x*frame_w)
            y = int(landmark.y*frame_h)
            cv2.circle(frame,(x,y),3,(0,255,255))
        if(left[0].y-left[1].y) < 0.004:
            print("click")
            pyautogui.click()
            pyautogui.sleep(1)

    cv2.imshow("Eye Controller Mouse",frame) #im stands for image
    cv2.waitKey(1)

