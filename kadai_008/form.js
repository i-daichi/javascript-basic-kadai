$(function () {
    // class属性がbtnのよそがクリックされたら
    $('.btn').on('click', function() {
      // テキストボックスにクリックしました！と表示する
      $('.text-box').val('クリックしました！');
    });
  });