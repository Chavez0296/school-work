<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.burgerSpecialsLbl = New System.Windows.Forms.Label()
        Me.primeBeefLbl = New System.Windows.Forms.Label()
        Me.veggieLbl = New System.Windows.Forms.Label()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.PictureBox2 = New System.Windows.Forms.PictureBox()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.slctBtn = New System.Windows.Forms.Button()
        Me.Button3 = New System.Windows.Forms.Button()
        Me.exitBtn = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'burgerSpecialsLbl
        '
        Me.burgerSpecialsLbl.AutoSize = True
        Me.burgerSpecialsLbl.Font = New System.Drawing.Font("Tahoma", 15.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.burgerSpecialsLbl.ForeColor = System.Drawing.Color.DarkRed
        Me.burgerSpecialsLbl.Location = New System.Drawing.Point(314, 58)
        Me.burgerSpecialsLbl.Name = "burgerSpecialsLbl"
        Me.burgerSpecialsLbl.Size = New System.Drawing.Size(173, 25)
        Me.burgerSpecialsLbl.TabIndex = 0
        Me.burgerSpecialsLbl.Text = "Burger Specials"
        '
        'primeBeefLbl
        '
        Me.primeBeefLbl.AutoSize = True
        Me.primeBeefLbl.Enabled = False
        Me.primeBeefLbl.Location = New System.Drawing.Point(76, 426)
        Me.primeBeefLbl.Name = "primeBeefLbl"
        Me.primeBeefLbl.Size = New System.Drawing.Size(164, 15)
        Me.primeBeefLbl.TabIndex = 1
        Me.primeBeefLbl.Text = "Enjoy your Prime Beef burger!"
        Me.primeBeefLbl.Visible = False
        '
        'veggieLbl
        '
        Me.veggieLbl.AutoSize = True
        Me.veggieLbl.Enabled = False
        Me.veggieLbl.Location = New System.Drawing.Point(585, 426)
        Me.veggieLbl.Name = "veggieLbl"
        Me.veggieLbl.Size = New System.Drawing.Size(142, 15)
        Me.veggieLbl.TabIndex = 2
        Me.veggieLbl.Text = "Enjoy your Veggie burger!"
        Me.veggieLbl.Visible = False
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(12, 86)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(300, 250)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 3
        Me.PictureBox1.TabStop = False
        Me.PictureBox1.Visible = False
        '
        'PictureBox2
        '
        Me.PictureBox2.Image = CType(resources.GetObject("PictureBox2.Image"), System.Drawing.Image)
        Me.PictureBox2.Location = New System.Drawing.Point(488, 86)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(300, 250)
        Me.PictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox2.TabIndex = 4
        Me.PictureBox2.TabStop = False
        Me.PictureBox2.Visible = False
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(76, 342)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(138, 23)
        Me.Button1.TabIndex = 5
        Me.Button1.Text = "Prime Beef Burger"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'slctBtn
        '
        Me.slctBtn.Enabled = False
        Me.slctBtn.Location = New System.Drawing.Point(330, 342)
        Me.slctBtn.Name = "slctBtn"
        Me.slctBtn.Size = New System.Drawing.Size(138, 23)
        Me.slctBtn.TabIndex = 6
        Me.slctBtn.Text = "Select Burger"
        Me.slctBtn.UseVisualStyleBackColor = True
        '
        'Button3
        '
        Me.Button3.Location = New System.Drawing.Point(585, 342)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(138, 23)
        Me.Button3.TabIndex = 7
        Me.Button3.Text = "Veggie Burger"
        Me.Button3.UseVisualStyleBackColor = True
        '
        'exitBtn
        '
        Me.exitBtn.Enabled = False
        Me.exitBtn.Location = New System.Drawing.Point(330, 382)
        Me.exitBtn.Name = "exitBtn"
        Me.exitBtn.Size = New System.Drawing.Size(138, 23)
        Me.exitBtn.TabIndex = 8
        Me.exitBtn.Text = "Exit Window"
        Me.exitBtn.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(356, 307)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(85, 15)
        Me.Label1.TabIndex = 9
        Me.Label1.Text = "Select a Burger"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.exitBtn)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.slctBtn)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.PictureBox2)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.veggieLbl)
        Me.Controls.Add(Me.primeBeefLbl)
        Me.Controls.Add(Me.burgerSpecialsLbl)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents burgerSpecialsLbl As Label
    Friend WithEvents primeBeefLbl As Label
    Friend WithEvents veggieLbl As Label
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents PictureBox2 As PictureBox
    Friend WithEvents Button1 As Button
    Friend WithEvents slctBtn As Button
    Friend WithEvents Button3 As Button
    Friend WithEvents exitBtn As Button
    Friend WithEvents Label1 As Label
End Class
