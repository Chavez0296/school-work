Public Class Form1
    Private Sub frmComic_Load(sender As Object, e As EventArgs) Handles MyBase.Load


    End Sub

    Private Sub PictureBox1_Click(sender As Object, e As EventArgs) Handles picComic.Click

    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles lblHeading.Click

    End Sub

    Private Sub GroupBox1_Enter(sender As Object, e As EventArgs) Handles GroupBox1.Enter

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        'Declare my Variables
        Dim decRegistration As Decimal
        Dim decTotalCost As Decimal
        Dim intGroup As Integer
        Dim decSuperHero As Decimal = 380D
        Dim decAutograph As Decimal = 275D
        Dim decConvention As Decimal = 209D

        ' Did user enter a numeric value
        If IsNumeric(TextBox1.Text) Then
            intGroup = Convert.ToInt32(TextBox1.Text)
            ' Is number of group greater than zero
            If intGroup > 0 And intGroup < 20 Then
                'Calculate and display cost
                If radSuperhero.Checked Then
                    decRegistration = decSuperHero
                ElseIf radAutograph.Checked Then
                    decRegistration = decAutograph
                ElseIf radConvention.Checked Then
                    decRegistration = decConvention
                End If

                decTotalCost = (intGroup * decRegistration)
                Label2.Text = decTotalCost.ToString("C")
            Else
                ' Display error message if user entered a negative number
                MessageBox.Show("Enter a positive number between 1 and 20", "Invalid Number Error")
            End If
        Else
            ' Display error message if user entered a nonnumeric value
            MessageBox.Show("Enter a reasonable number between 1 and 20", "Invalid Entry Error")
        End If
    End Sub

    Private Sub radSuperhero_CheckedChanged(sender As Object, e As EventArgs) Handles radSuperhero.CheckedChanged

    End Sub

    Private Sub radAutograph_CheckedChanged(sender As Object, e As EventArgs) Handles radAutograph.CheckedChanged

    End Sub

    Private Sub radConvention_CheckedChanged(sender As Object, e As EventArgs) Handles radConvention.CheckedChanged

    End Sub

    Private Sub Label2_Click(sender As Object, e As EventArgs) Handles Label2.Click

    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        TextBox1.Clear()
        Label2.Text = ""
        radSuperhero.Checked = True
        radAutograph.Checked = False
        radConvention.Checked = False
        TextBox1.Focus()
    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged

    End Sub
End Class
