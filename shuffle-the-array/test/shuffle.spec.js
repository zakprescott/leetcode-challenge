const shuffle = require('../src/shuffle');

it('should return [2,3,5,4,1,7] when given nums = [2,5,1,3,4,7], n = 3 as input', () => {
    const nums = [2,5,1,3,4,7];
    const n = 3;

    expect(shuffle(nums, n)).toEqual([2,3,5,4,1,7]);
});

it('should return [1,4,2,3,3,2,4,1] when given nums = [1,2,3,4,4,3,2,1], n = 4 as input', () => {
    const nums = [1,2,3,4,4,3,2,1];
    const n = 4;

    expect(shuffle(nums, n)).toEqual([1,4,2,3,3,2,4,1]);
});

it('should return [1,2,1,2] when given nums = [1,1,2,2], n = 2 as input', () => {
    const nums = [1,1,2,2];
    const n = 2;

    expect(shuffle(nums, n)).toEqual([1,2,1,2]);
});