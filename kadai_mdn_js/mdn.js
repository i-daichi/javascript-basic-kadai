const today = new Date();

const options = { year:"numeric",  month: "long",  day: "numeric",};

console.log(today.toLocaleString ("ja-JP", options));