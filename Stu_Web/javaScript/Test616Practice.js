

document.write("<table border='0' align='center'>");
for(var i =1; i<=9;i++){
    document.write("<tr>");
    for (let j = 1; j <= i; j++) {
        //输出
        document.write("<td>");
        document.write(i+"*"+j+"="+i*j+"&nbsp&nbsp&nbsp");
        document.write("</td>");
    }
    document.write("</tr>")
    // document.write("<br>");
}
document.write("</table>");