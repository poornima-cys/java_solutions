/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int ml = INT_MIN;
    void traverse(TreeNode* root, int l, int& ml, vector<int>& vec) {
        if(!root) return;
        if(l > ml) {
            vec.push_back(root->val);
            ml = max(l, ml);
        }
        traverse(root->right, l + 1, ml, vec);
      //  cout << l << ml << endl;
        traverse(root->left, l + 1, ml, vec);
       // cout << l << ml << endl;
        return;
    }
    vector<int> rightSideView(TreeNode* root) {
        if(!root) return{};
        vector<int> vec;
        traverse(root, 0, ml, vec);
        return vec;
    }
};