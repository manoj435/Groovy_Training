package com.test.demo

def num = 11

//if-else

if (num == 10) {
	println "num is  10"	
}
else {
	println "number is not  10"
}

//switch-case

def x = 10
def result = ""

switch(x) {
	case 0:
		result = "x is zero"
		break
	case {x>0}:
		result = "x is +ve"
		break
	case {x<0}:
		result = "x is -ve"
		break
	default:
		result = "Invalid number"
}
println result