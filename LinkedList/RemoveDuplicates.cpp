//Given the head of a doubly linked list with its values sorted in non-decreasing order. Remove all duplicate occurrences of any value in the list so that only distinct values are present in the list.

#include <iostream>
using namespace std;

struct ListNode
{
    int val;
    ListNode *next;
    ListNode *prev;
    ListNode()
    {
        val = 0;
        next = NULL;
        prev = NULL;
    }
    ListNode(int data1)
    {
        val = data1;
        next = NULL;
        prev = NULL;
    }
    ListNode(int data1, ListNode *next1, ListNode *prev1)
    {
        val = data1;
        next = next1;
        prev = prev1;
    }
};

class Solution {
public:
    ListNode * removeDuplicates(ListNode *head) {
      if(head == NULL) return NULL;
      ListNode* current = head;
      while(current != NULL && current->next != NULL) {
        if(current->val == current->next->val) {
          ListNode* duplicate = current->next;
          current->next = duplicate->next;
          if(duplicate->next != NULL) {
            duplicate->next->prev = current;
          }
          delete duplicate;
        } else {
          current = current->next;
        }
      }
      return head;
    
    
    }
};