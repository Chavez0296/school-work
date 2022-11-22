Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        picPumpkin.Visible = True
        picMocha.Visible = False
        btnSelect.Enabled = True

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        picMocha.Visible = True
        picPumpkin.Visible = False
        btnSelect.Enabled = True

    End Sub

    Private Sub Label2_Click(sender As Object, e As EventArgs) Handles lblInstructions.Click

    End Sub

    Private Sub PictureBox1_Click(sender As Object, e As EventArgs) Handles picPumpkin.Click

    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Close()

    End Sub

    Private Sub btnSelect_Click(sender As Object, e As EventArgs) Handles btnSelect.Click
        Button1.Enabled = False
        btnSelect.Enabled = False
        Button2.Enabled = False
        lblInstructions.Visible = False
        lblConfirmation.Visible = True
        btnExit.Enabled = True
    End Sub

    Private Sub lblConfirmation_Click(sender As Object, e As EventArgs) Handles lblConfirmation.Click
        lblConfirmation.Visible = False
    End Sub
End Class
