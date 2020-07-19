# 缓冲区
1 ）缓冲区的capacity 不能为负数，缓冲区的l imit 不能为负数，缓冲区的position 不能
为负数。
2) position 不能大于其limit 。
3) limit 不能大于其capac ity 。
4 ）如果定义了mark ，则在将pos ition 或l imit 调整为小于该mark 的值时，该mark 被
丢弃。
5 ）如果未定义mark ，那么调用reset（） 方法将导致抛出InvalidMarkException 异常。
6 ）如果position 大于新的limit ，则position 的值就是新limit 的值。
7 ）当limit 和position 值一样时，在指定的pos ition 写入数据时会出现异常，因为此位
置是被限制的。