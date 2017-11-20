
my $out = "";
loop (my $x = 0; $x < 9; $x++)
{
    loop (my $y = 0; $y < 9; $y++)
    {
        $out += "userVals[%d][$d] = _%dx%d", $x,$y,$x+1,$y+1;
    }
}

spurt "testfile", $out;        
