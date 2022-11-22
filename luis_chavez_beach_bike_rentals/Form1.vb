Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub lblRentalDays_Click(sender As Object, e As EventArgs) Handles lblRentalDays.Click

    End Sub

    Private Sub tbRental_TextChanged(sender As Object, e As EventArgs) Handles tbRental.TextChanged

    End Sub

    Private Sub btnFindCost_Click(sender As Object, e As EventArgs) Handles btnFindCost.Click
        Dim n1 As Double = 9.95
        Dim n2 = Val(tbRental.Text)
        Dim Multi As Double = n1 * n2

        lblTotalCost2.Text = FormatCurrency(Multi)

        btnExit.Enabled = True

    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        tbRental.Text = ""
        lblTotalCost2.Text = ""
        Dim Mutlti As Double = 0.0
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Close()
    End Sub

    Private Sub lblTotalCost2_Click(sender As Object, e As EventArgs) Handles lblTotalCost2.Click

    End Sub
End Class
