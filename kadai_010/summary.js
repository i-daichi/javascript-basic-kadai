$(function() {
    // 文字色変化ボタンがクリックされたら
    $('#change-color').on('click', function() {
      // 文字色をredにする
      $('#target').css('color', 'red');
    });
    // 文字内容変化ボタンがクリックされたら
    $('#change-text').on('click', function() {
      // 文字をHello!に変化する
      $('#target').text('Hello!');
    });
    // フェードアウトボタンがクリックされたら
    $('#fade-out').on('click', function() {
      // 文字をフェードアウトする
      $('#target').fadeOut();
    });
    // フェードインボタンがクリックされたら
    $('#fade-in').on('click', function() {
      // 文字をフェードインする
      $('#target').fadeIn();
    });
  });