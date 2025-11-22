//Given the head of a doubly linked list and an integer target. Delete all nodes in the linked list with the value target and return the head of the modified linked list.
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
    ListNode * deleteAllOccurrences(ListNode* head, int target) {
      if(head == NULL) return NULL;
      while(head!=NULL && head->val==target){
        ListNode* temp=head;
        head=head->next;
        if(head!=NULL){
          head->prev=NULL;
        }
        delete temp;
      }
      if(head==NULL) return NULL;
      ListNode* curr=head;
      while(curr!=NULL){
        if(curr->val==target){
          ListNode* temp=curr;
          curr->prev->next=curr->next;
          if(curr->next!=NULL){
            curr->next->prev=curr->prev;
          }
          curr=curr->next;
          delete temp;
        }
        else{
          curr=curr->next;
        }
      }
    }
};