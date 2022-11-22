Public Class frmFitness
    Private Sub FileToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles mnuFile.Click

    End Sub

    Private Sub ClearToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles mnuClear.Click
        ListBox1.Items.Clear()
        Label4.Text = ""
    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        Dim strInputMessage As String = "Enter the weight loss for team member #1 "
        Dim strInputHeading As String = "Weight Loss"
        Dim intNmbOfEntries As Integer = 1
        Dim intMaxNmbEntries As Integer = 8
        Dim strWeightLoss As String
        Dim strCancelClicked As String = ""
        Dim decWeightLoss As Decimal
        strWeightLoss = InputBox(strInputMessage & intNmbOfEntries, strInputHeading, " ")
        decWeightLoss = System.Convert.ToDecimal(strWeightLoss)

        Do Until intNmbOfEntries > intMaxNmbEntries Or strWeightLoss = strCancelClicked

            intNmbOfEntries += 1

            If intNmbOfEntries <= intMaxNmbEntries Then
                decWeightLoss = InputBox(strInputMessage & intNmbOfEntries, strInputHeading, " ")
            End If
            ListBox1.Items.Add(decWeightLoss)
            Dim decTotalWeightLoss As Decimal = decTotalWeightLoss + decWeightLoss
            Label4.Text = decTotalWeightLoss
        Loop



    End Sub

    Private Sub ListBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ListBox1.SelectedIndexChanged

    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub

    Private Sub Label3_Click(sender As Object, e As EventArgs) Handles Label3.Click

    End Sub

    Private Sub Label4_Click(sender As Object, e As EventArgs) Handles Label4.Click

    End Sub
End Class
