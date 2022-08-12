
# for i in range(2,21):
#     with open (f"F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\tables{i}.txt","w") as f:
#         for j in range(1,11):
#             f.write(f"{i} * {j} = {i*j}")
#             if( j!=10):
#                 f.write("\n")





for i in range(2,5):
    with open (f"F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\tables{i}.txt","w") as f:
     for j in range(1,11):
                f.write(f"{i} * {j} = {i * j}")
                if(j!=10):
                    f.write("\n")



            