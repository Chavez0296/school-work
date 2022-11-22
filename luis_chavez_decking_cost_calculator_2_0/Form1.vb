Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged

    End Sub

    Private Sub RadioButton1_CheckedChanged(sender As Object, e As EventArgs) Handles RadioButton1.CheckedChanged

    End Sub

    Private Sub RadioButton2_CheckedChanged(sender As Object, e As EventArgs) Handles RadioButton2.CheckedChanged

    End Sub

    Private Sub RadioButton3_CheckedChanged(sender As Object, e As EventArgs) Handles RadioButton3.CheckedChanged

    End Sub

    Private Sub Label4_Click(sender As Object, e As EventArgs) Handles Label4.Click

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        'Declare Variables
        Dim decN As Decimal
        Dim decCostEstimate As Decimal
        Dim intSqrFtg = Val(TextBox1.Text)
        Dim decPtl As Decimal = 2.35D
        Dim decRed As Decimal = 7.75D
        Dim decComp As Decimal = 8.5D
        'Functionality of selecting a group and then proceeding to calculate based on inputted square footage and chosen group
        If RadioButton1.Checked = True Then
            decCostEstimate = decPtl * intSqrFtg
            decN = decCostEstimate
            Label4.Text = FormatCurrency(decN)
        ElseIf RadioButton2.Checked = True Then
            decCostEstimate = decRed * intSqrFtg
            decN = decCostEstimate
            Label4.Text = FormatCurrency(decN)
        ElseIf RadioButton3.Checked = True Then
            decCostEstimate = decComp * intSqrFtg
            decN = decCostEstimate
            Label4.Text = FormatCurrency(decN)
        Else
            MessageBox.Show("Select an option.")
            'message box if no group is selected
        End If
        If TextBox1.Text = "" Then
            MessageBox.Show("Enter the Square Footage of Decking")
            'message box if textbox is empty
        ElseIf Val(TextBox1.Text) < 0 Then
            MessageBox.Show("Cannot enter a negative number.")
            'messafe box for negative number entries
        End If
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        'clears everything on the app
        TextBox1.Text = ""
        Label4.Text = ""
        RadioButton1.Checked = False
        RadioButton2.Checked = False
        RadioButton3.Checked = False
    End Sub
End Class
