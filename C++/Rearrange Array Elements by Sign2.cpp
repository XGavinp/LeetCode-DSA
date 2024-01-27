class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> pos, neg;
        for (int i = size(nums) - 1; i >= 0; --i) {
            if (nums[i] > 0) {
                pos.emplace_back(nums[i]);
            } else {
                neg.emplace_back(nums[i]);
            }
        }
        vector<int> result;
        for (int i = 0; i < size(nums); ++i) {
            if (i % 2 == 0) {
                result.emplace_back(pos.back()); pos.pop_back();
            } else {
                result.emplace_back(neg.back()); neg.pop_back();
            }
        }
        return result;
    }
};