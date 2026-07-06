class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for (i in nums.indices){
            val twoSumProblem = target - nums[i]
            if(map.contains(twoSumProblem)){
                return intArrayOf(map[twoSumProblem]!!,i)
            }
            map[nums[i]] = i
        } 
        return intArrayOf()
    }
}
