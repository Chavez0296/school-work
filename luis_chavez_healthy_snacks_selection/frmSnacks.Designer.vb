<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmSnacks
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmSnacks))
        Me.btnSnack1 = New System.Windows.Forms.Button()
        Me.btnSnack2 = New System.Windows.Forms.Button()
        Me.btnSnack3 = New System.Windows.Forms.Button()
        Me.btnSnack4 = New System.Windows.Forms.Button()
        Me.btnSelect = New System.Windows.Forms.Button()
        Me.btnExitWindow = New System.Windows.Forms.Button()
        Me.lblHeading = New System.Windows.Forms.Label()
        Me.lblInstructions = New System.Windows.Forms.Label()
        Me.lblSelect = New System.Windows.Forms.Label()
        Me.lblPrice = New System.Windows.Forms.Label()
        Me.picFalafel = New System.Windows.Forms.PictureBox()
        Me.picSpringRolls = New System.Windows.Forms.PictureBox()
        Me.picYogurt = New System.Windows.Forms.PictureBox()
        Me.picBean = New System.Windows.Forms.PictureBox()
        CType(Me.picFalafel, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picSpringRolls, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picYogurt, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picBean, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnSnack1
        '
        Me.btnSnack1.Location = New System.Drawing.Point(32, 116)
        Me.btnSnack1.Name = "btnSnack1"
        Me.btnSnack1.Size = New System.Drawing.Size(110, 23)
        Me.btnSnack1.TabIndex = 0
        Me.btnSnack1.Text = "Bean Burrito"
        Me.btnSnack1.UseVisualStyleBackColor = True
        '
        'btnSnack2
        '
        Me.btnSnack2.Location = New System.Drawing.Point(32, 160)
        Me.btnSnack2.Name = "btnSnack2"
        Me.btnSnack2.Size = New System.Drawing.Size(110, 23)
        Me.btnSnack2.TabIndex = 1
        Me.btnSnack2.Text = "Falafel"
        Me.btnSnack2.UseVisualStyleBackColor = True
        '
        'btnSnack3
        '
        Me.btnSnack3.Location = New System.Drawing.Point(32, 204)
        Me.btnSnack3.Name = "btnSnack3"
        Me.btnSnack3.Size = New System.Drawing.Size(110, 23)
        Me.btnSnack3.TabIndex = 2
        Me.btnSnack3.Text = "Greek Yogurt"
        Me.btnSnack3.UseVisualStyleBackColor = True
        '
        'btnSnack4
        '
        Me.btnSnack4.Location = New System.Drawing.Point(32, 247)
        Me.btnSnack4.Name = "btnSnack4"
        Me.btnSnack4.Size = New System.Drawing.Size(110, 23)
        Me.btnSnack4.TabIndex = 3
        Me.btnSnack4.Text = "Spring Rolls"
        Me.btnSnack4.UseVisualStyleBackColor = True
        '
        'btnSelect
        '
        Me.btnSelect.Location = New System.Drawing.Point(32, 335)
        Me.btnSelect.Name = "btnSelect"
        Me.btnSelect.Size = New System.Drawing.Size(110, 23)
        Me.btnSelect.TabIndex = 4
        Me.btnSelect.Text = "Snack Selected"
        Me.btnSelect.UseVisualStyleBackColor = True
        '
        'btnExitWindow
        '
        Me.btnExitWindow.Location = New System.Drawing.Point(32, 375)
        Me.btnExitWindow.Name = "btnExitWindow"
        Me.btnExitWindow.Size = New System.Drawing.Size(110, 23)
        Me.btnExitWindow.TabIndex = 5
        Me.btnExitWindow.Text = "Exit Window"
        Me.btnExitWindow.UseVisualStyleBackColor = True
        '
        'lblHeading
        '
        Me.lblHeading.AutoSize = True
        Me.lblHeading.Font = New System.Drawing.Font("Segoe UI", 18.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.lblHeading.Location = New System.Drawing.Point(105, 23)
        Me.lblHeading.Name = "lblHeading"
        Me.lblHeading.Size = New System.Drawing.Size(412, 32)
        Me.lblHeading.TabIndex = 6
        Me.lblHeading.Text = "International Healthy Snack Selection"
        '
        'lblInstructions
        '
        Me.lblInstructions.AutoSize = True
        Me.lblInstructions.Font = New System.Drawing.Font("Segoe UI", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.lblInstructions.Location = New System.Drawing.Point(219, 78)
        Me.lblInstructions.Name = "lblInstructions"
        Me.lblInstructions.Size = New System.Drawing.Size(155, 20)
        Me.lblInstructions.TabIndex = 7
        Me.lblInstructions.Text = "Select one free snack"
        '
        'lblSelect
        '
        Me.lblSelect.AutoSize = True
        Me.lblSelect.Font = New System.Drawing.Font("Segoe UI", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.lblSelect.ForeColor = System.Drawing.Color.Yellow
        Me.lblSelect.Location = New System.Drawing.Point(256, 393)
        Me.lblSelect.Name = "lblSelect"
        Me.lblSelect.Size = New System.Drawing.Size(187, 17)
        Me.lblSelect.TabIndex = 8
        Me.lblSelect.Text = "Your snack has been selected"
        Me.lblSelect.Visible = False
        '
        'lblPrice
        '
        Me.lblPrice.AutoSize = True
        Me.lblPrice.Font = New System.Drawing.Font("Segoe UI", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.lblPrice.Location = New System.Drawing.Point(327, 424)
        Me.lblPrice.Name = "lblPrice"
        Me.lblPrice.Size = New System.Drawing.Size(47, 17)
        Me.lblPrice.TabIndex = 9
        Me.lblPrice.Text = "PRICE:"
        Me.lblPrice.Visible = False
        '
        'picFalafel
        '
        Me.picFalafel.Image = CType(resources.GetObject("picFalafel.Image"), System.Drawing.Image)
        Me.picFalafel.Location = New System.Drawing.Point(167, 116)
        Me.picFalafel.Name = "picFalafel"
        Me.picFalafel.Size = New System.Drawing.Size(350, 242)
        Me.picFalafel.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picFalafel.TabIndex = 10
        Me.picFalafel.TabStop = False
        Me.picFalafel.Visible = False
        '
        'picSpringRolls
        '
        Me.picSpringRolls.Image = CType(resources.GetObject("picSpringRolls.Image"), System.Drawing.Image)
        Me.picSpringRolls.Location = New System.Drawing.Point(167, 116)
        Me.picSpringRolls.Name = "picSpringRolls"
        Me.picSpringRolls.Size = New System.Drawing.Size(350, 242)
        Me.picSpringRolls.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picSpringRolls.TabIndex = 11
        Me.picSpringRolls.TabStop = False
        Me.picSpringRolls.Visible = False
        '
        'picYogurt
        '
        Me.picYogurt.Image = CType(resources.GetObject("picYogurt.Image"), System.Drawing.Image)
        Me.picYogurt.Location = New System.Drawing.Point(167, 116)
        Me.picYogurt.Name = "picYogurt"
        Me.picYogurt.Size = New System.Drawing.Size(350, 242)
        Me.picYogurt.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picYogurt.TabIndex = 12
        Me.picYogurt.TabStop = False
        Me.picYogurt.Visible = False
        '
        'picBean
        '
        Me.picBean.Image = CType(resources.GetObject("picBean.Image"), System.Drawing.Image)
        Me.picBean.Location = New System.Drawing.Point(167, 116)
        Me.picBean.Name = "picBean"
        Me.picBean.Size = New System.Drawing.Size(350, 242)
        Me.picBean.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picBean.TabIndex = 13
        Me.picBean.TabStop = False
        Me.picBean.Visible = False
        '
        'frmSnacks
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Olive
        Me.ClientSize = New System.Drawing.Size(588, 472)
        Me.Controls.Add(Me.picBean)
        Me.Controls.Add(Me.picYogurt)
        Me.Controls.Add(Me.picSpringRolls)
        Me.Controls.Add(Me.picFalafel)
        Me.Controls.Add(Me.lblPrice)
        Me.Controls.Add(Me.lblSelect)
        Me.Controls.Add(Me.lblInstructions)
        Me.Controls.Add(Me.lblHeading)
        Me.Controls.Add(Me.btnExitWindow)
        Me.Controls.Add(Me.btnSelect)
        Me.Controls.Add(Me.btnSnack4)
        Me.Controls.Add(Me.btnSnack3)
        Me.Controls.Add(Me.btnSnack2)
        Me.Controls.Add(Me.btnSnack1)
        Me.Name = "frmSnacks"
        Me.Text = "International Snacks"
        CType(Me.picFalafel, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picSpringRolls, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picYogurt, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picBean, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnSnack1 As Button
    Friend WithEvents btnSnack2 As Button
    Friend WithEvents btnSnack3 As Button
    Friend WithEvents btnSnack4 As Button
    Friend WithEvents btnSelect As Button
    Friend WithEvents btnExitWindow As Button
    Friend WithEvents lblHeading As Label
    Friend WithEvents lblInstructions As Label
    Friend WithEvents lblSelect As Label
    Friend WithEvents lblPrice As Label
    Friend WithEvents picFalafel As PictureBox
    Friend WithEvents picSpringRolls As PictureBox
    Friend WithEvents picYogurt As PictureBox
    Friend WithEvents picBean As PictureBox
End Class
