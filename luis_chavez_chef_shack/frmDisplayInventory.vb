Option Strict On
Public Class frmDisplayInventory
    Private Sub frmDisplayInventory_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        ' the frmDisplayInventory load event is a second form that 
        ' displays the sorted inventory items 

        Dim strItem As String

        ' Sorts the _strInventoryItem array 
        Array.Sort(frmDepreciation._strInventoryItem)

        ' Displays the _strInventoryItem array
        For Each strItem In frmDepreciation._strInventoryItem
            lstDisplay.Items.Add(strItem)
        Next
    End Sub

    Private Sub BtnReturn_Click(sender As Object, e As EventArgs) Handles btnReturn.Click
        ' This Sub procedure opens the first form 
        Dim frmFirst As New frmDepreciation

        Hide()
        frmFirst.ShowDialog()
    End Sub

    Private Sub lstDisplay_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lstDisplay.SelectedIndexChanged

    End Sub
End Class