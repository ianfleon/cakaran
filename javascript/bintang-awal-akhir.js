function bintang(jumlah) {

    let b = [];

    for(let i = 0; i < jumlah; i++) {
        b[i] = "*";
    }

    b.forEach((bintang, i)=>{
        console.log(b.join(''));
        if (i == b.length - 2) {
            for(let j = 1; j < b.length-1; j++) {
                b[j] = "*";
            } 
        } else {
            for(let j = 1; j < b.length-1; j++) {
                b[j] = " ";
            }
        }
        
    });

}

bintang(4);