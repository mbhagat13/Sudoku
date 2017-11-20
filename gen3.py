
out = ""
for x in range(0,9):
    for y in range(0,9):
        out += "if(x == {} && y == {}){}_{}x{}.setText(String.valueOf(vals[{}][{}])); _{}x{}.setEditable(false);{} \n".format(x+1,y+1,'{',x+1,y+1,y,x,x+1,y+1,'}')
f = open("gen","w")
f.write(out)

# 
