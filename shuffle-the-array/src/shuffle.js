const shuffle = (nums, n) => {
    let shuffled = [];

    for (let i = 0; i < n; i++) {
        shuffled.push(nums[i]);
        shuffled.push(nums[n+i]);
    }

    return shuffled;
};

module.exports = shuffle;