Public Class frmSnacks
    Private Sub frmSnacks_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub picFalafel_Click(sender As Object, e As EventArgs) Handles picFalafel.Click

    End Sub

    Private Sub lblHeading_Click(sender As Object, e As EventArgs) Handles lblHeading.Click

    End Sub

    Private Sub lblInstructions_Click(sender As Object, e As EventArgs) Handles lblInstructions.Click

    End Sub

    Private Sub picBean_Click(sender As Object, e As EventArgs) Handles picBean.Click

    End Sub

    Private Sub picYogurt_Click(sender As Object, e As EventArgs) Handles picYogurt.Click

    End Sub

    Private Sub picSpringRolls_Click(sender As Object, e As EventArgs) Handles picSpringRolls.Click

    End Sub

    Private Sub lblSelect_Click(sender As Object, e As EventArgs) Handles lblSelect.Click

    End Sub

    Private Sub lblPrice_Click(sender As Object, e As EventArgs) Handles lblPrice.Click

    End Sub

    Private Sub btnSnack1_Click(sender As Object, e As EventArgs) Handles btnSnack1.Click
        picBean.Visible = True
        picYogurt.Visible = False
        picFalafel.Visible = False
        picSpringRolls.Visible = False
        lblPrice.Visible = True
        btnSelect.Enabled = True

        lblPrice.Text = "Buritto Cost: $20"
    End Sub

    Private Sub btnSnack2_Click(sender As Object, e As EventArgs) Handles btnSnack2.Click
        picBean.Visible = False
        picYogurt.Visible = False
        picFalafel.Visible = True
        picSpringRolls.Visible = False
        lblPrice.Visible = True
        btnSelect.Enabled = True

        lblPrice.Text = "Falafel Cost: $10"
    End Sub

    Private Sub btnSnack3_Click(sender As Object, e As EventArgs) Handles btnSnack3.Click
        picBean.Visible = False
        picYogurt.Visible = True
        picFalafel.Visible = False
        picSpringRolls.Visible = False
        btnSelect.Enabled = True

        lblPrice.Text = "Yogurt Cost: $7"
    End Sub

    Private Sub btnSnack4_Click(sender As Object, e As EventArgs) Handles btnSnack4.Click
        picBean.Visible = False
        picYogurt.Visible = False
        picFalafel.Visible = False
        picSpringRolls.Visible = True
        btnSelect.Enabled = True

        lblPrice.Text = "Spring Rolls Cost: $15"
    End Sub

    Private Sub btnSelect_Click(sender As Object, e As EventArgs) Handles btnSelect.Click
        lblSelect.Visible = True
        btnExitWindow.Enabled = True
    End Sub

    Private Sub btnExitWindow_Click(sender As Object, e As EventArgs) Handles btnExitWindow.Click
        Close()
    End Sub
End Class
