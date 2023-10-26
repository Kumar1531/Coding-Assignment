
function reverseWords(s) {
    let st = [];
 
    for (let i = 0; i < s.length; ++i) {
        if (s[i] != ' ')
            st.unshift(s[i]);
 
        else {
            while (st.length != 0) {
                process.stdout.write(st[0]);
            st.shift();
            }
            process.stdout.write(' ');
        }
    }
 
    while (st.length != 0) {
    process.stdout.write(st[0]);
        st.shift();
    }
}
 
let s = "This is a sunny day";
reverseWords(s);
 