// json array movement variable
var i = 0;
var correctCount = 0 ;
//initialize the first question
generate(0);
// generate from json array data with index
function generate(index) {
    document.getElementById("question").innerHTML = jsonData[index].q;
    document.getElementById("optt1").innerHTML = jsonData[index].opt1;
    document.getElementById("optt2").innerHTML = jsonData[index].opt2;
    document.getElementById("optt3").innerHTML = jsonData[index].opt3;
}

function checkAnswer() {
    if (document.getElementById("opt1").checked && jsonData[i].opt1 == jsonData[i].answer) {
       correctCount++;
    }
    if (document.getElementById("opt2").checked && jsonData[i].opt2 == jsonData[i].answer) {
        correctCount++;
    }
    if (document.getElementById("opt3").checked && jsonData[i].opt3 == jsonData[i].answer) {
        correctCount++;
    }
    // increment i for next question
    i++;
    if(jsonData.length-1 < i){
        document.write("<body style='background-color:#ffe6ff;'>");
        document.write("<div style='color:#000000;font-size:18pt;text-align:center;'>*****Your score is : "+correctCount+"*****</div>");
        document.write("</body>");
        document.write("<p>Click here to review your answers</p>")
        document.write("<a href='result.html' button type='submit' class='btn btn-primary mt-3'>click here</button> </a>")
    }
    // callback to generate
    generate(i);
    
}