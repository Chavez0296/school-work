Public Class Form1
    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles burgerSpecialsLbl.Click

    End Sub

    Private Sub Label1_Click_1(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub

    Private Sub PictureBox1_Click(sender As Object, e As EventArgs) Handles PictureBox1.Click

    End Sub

    Private Sub PictureBox2_Click(sender As Object, e As EventArgs) Handles PictureBox2.Click

    End Sub

    Private Sub slctBtn_Click(sender As Object, e As EventArgs) Handles slctBtn.Click
        Button1.Enabled = False
        slctBtn.Enabled = False
        Button3.Enabled = False
        primeBeefLbl.Visible = True
        veggieLbl.Visible = True
        exitBtn.Enabled = True
    End Sub

    Private Sub exitBtn_Click(sender As Object, e As EventArgs) Handles exitBtn.Click
        Close()
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        PictureBox2.Visible = True
        slctBtn.Enabled = True
        PictureBox1.Visible = False
    End Sub

    Private Sub primeBeefLbl_Click(sender As Object, e As EventArgs) Handles primeBeefLbl.Click
        primeBeefLbl.Visible = False
    End Sub

    Private Sub veggieLbl_Click(sender As Object, e As EventArgs) Handles veggieLbl.Click
        veggieLbl.Visible = False
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        PictureBox1.Visible = True
        slctBtn.Enabled = True
        PictureBox2.Visible = False
    End Sub
End Class
