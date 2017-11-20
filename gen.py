
out = ""
for x in range(0,9):
    for y in range(0,9):
        out += "userVals[{}][{}] = Integer.parseInt(_{}x{}.getText());".format(y,x,x+1,y+1)
f = open("gen","w")
f.write(out)


