
out = ""
for x in range(0,9):
    for y in range(0,9):
        out += '_{}x{}.setText({} {}); _{}x{}.setEditable(true);\n'.format(x+1,y+1,'"','"',x+1,y+1)
f = open("gen","w")
f.write(out)

#_{}x{}.setText(String.valueOf(vals[{}][{}])); 
