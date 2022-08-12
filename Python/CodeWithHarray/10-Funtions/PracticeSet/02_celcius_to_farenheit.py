
def cel_to_fer(c):
    c_t_f = (c * (9/5)) + 32
    return c_t_f

n = int(input("Enter a celcius : "))
find_c_t_f = cel_to_fer(n)
print(f"{n} celcius = {find_c_t_f} farenheit")