# fault_trees_textual_editor

This repository has been created to provide the code needed for creating a textual editor for simple fault trees using Xtext and Eclipse IDE. The textual editor is generated from an Xtext project which specifies the grammar that defines the rules of creating a fault tree. There is a precedence defined for Events, Or Gate, And Gate and Inhibit Gate, in that order. Left recursion is sorted in the definition by manually setting this operator precedence. The rule with less precedence is written in terms of the rule with the higher precedence
