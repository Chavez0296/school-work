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
        Me.lblBeachBikeRentals = New System.Windows.Forms.Label()
        Me.lblCost = New System.Windows.Forms.Label()
        Me.tbRental = New System.Windows.Forms.TextBox()
        Me.lblRentalDays = New System.Windows.Forms.Label()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.lblTotalCost = New System.Windows.Forms.Label()
        Me.lblTotalCost2 = New System.Windows.Forms.Label()
        Me.btnFindCost = New System.Windows.Forms.Button()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'lblBeachBikeRentals
        '
        Me.lblBeachBikeRentals.AutoSize = True
        Me.lblBeachBikeRentals.Font = New System.Drawing.Font("Segoe UI", 18.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.lblBeachBikeRentals.Location = New System.Drawing.Point(119, 18)
        Me.lblBeachBikeRentals.Name = "lblBeachBikeRentals"
        Me.lblBeachBikeRentals.Size = New System.Drawing.Size(226, 32)
        Me.lblBeachBikeRentals.TabIndex = 0
        Me.lblBeachBikeRentals.Text = "Beach Bike Rentals"
        '
        'lblCost
        '
        Me.lblCost.AutoSize = True
        Me.lblCost.Font = New System.Drawing.Font("Segoe UI", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.lblCost.Location = New System.Drawing.Point(180, 59)
        Me.lblCost.Name = "lblCost"
        Me.lblCost.Size = New System.Drawing.Size(107, 21)
        Me.lblCost.TabIndex = 1
        Me.lblCost.Text = "$9.95 per Day"
        '
        'tbRental
        '
        Me.tbRental.Location = New System.Drawing.Point(316, 96)
        Me.tbRental.Multiline = True
        Me.tbRental.Name = "tbRental"
        Me.tbRental.Size = New System.Drawing.Size(29, 23)
        Me.tbRental.TabIndex = 2
        '
        'lblRentalDays
        '
        Me.lblRentalDays.AutoSize = True
        Me.lblRentalDays.Font = New System.Drawing.Font("Segoe UI", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.lblRentalDays.Location = New System.Drawing.Point(89, 94)
        Me.lblRentalDays.Name = "lblRentalDays"
        Me.lblRentalDays.Size = New System.Drawing.Size(175, 21)
        Me.lblRentalDays.TabIndex = 3
        Me.lblRentalDays.Text = "Number of Rental Days:"
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(1, 201)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(488, 248)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 4
        Me.PictureBox1.TabStop = False
        '
        'lblTotalCost
        '
        Me.lblTotalCost.AutoSize = True
        Me.lblTotalCost.Font = New System.Drawing.Font("Segoe UI", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.lblTotalCost.Location = New System.Drawing.Point(85, 127)
        Me.lblTotalCost.Name = "lblTotalCost"
        Me.lblTotalCost.Size = New System.Drawing.Size(179, 21)
        Me.lblTotalCost.TabIndex = 5
        Me.lblTotalCost.Text = "Total Cost of Bike Rental:"
        '
        'lblTotalCost2
        '
        Me.lblTotalCost2.AutoSize = True
        Me.lblTotalCost2.Font = New System.Drawing.Font("Segoe UI", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.lblTotalCost2.Location = New System.Drawing.Point(316, 127)
        Me.lblTotalCost2.Name = "lblTotalCost2"
        Me.lblTotalCost2.Size = New System.Drawing.Size(0, 21)
        Me.lblTotalCost2.TabIndex = 6
        '
        'btnFindCost
        '
        Me.btnFindCost.BackColor = System.Drawing.Color.Gold
        Me.btnFindCost.Font = New System.Drawing.Font("Segoe UI", 9.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.btnFindCost.Location = New System.Drawing.Point(12, 151)
        Me.btnFindCost.Name = "btnFindCost"
        Me.btnFindCost.Size = New System.Drawing.Size(99, 44)
        Me.btnFindCost.TabIndex = 7
        Me.btnFindCost.Text = "Find Cost"
        Me.btnFindCost.UseVisualStyleBackColor = False
        '
        'btnClear
        '
        Me.btnClear.BackColor = System.Drawing.Color.Gold
        Me.btnClear.Font = New System.Drawing.Font("Segoe UI", 9.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.btnClear.Location = New System.Drawing.Point(197, 152)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(99, 44)
        Me.btnClear.TabIndex = 8
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = False
        '
        'btnExit
        '
        Me.btnExit.BackColor = System.Drawing.Color.Gold
        Me.btnExit.Font = New System.Drawing.Font("Segoe UI", 9.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point)
        Me.btnExit.Location = New System.Drawing.Point(379, 151)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(99, 44)
        Me.btnExit.TabIndex = 9
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(490, 450)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.btnFindCost)
        Me.Controls.Add(Me.lblTotalCost2)
        Me.Controls.Add(Me.lblTotalCost)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.lblRentalDays)
        Me.Controls.Add(Me.tbRental)
        Me.Controls.Add(Me.lblCost)
        Me.Controls.Add(Me.lblBeachBikeRentals)
        Me.Name = "Form1"
        Me.Text = "Beach Bike Rentals"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblBeachBikeRentals As Label
    Friend WithEvents lblCost As Label
    Friend WithEvents tbRental As TextBox
    Friend WithEvents lblRentalDays As Label
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents lblTotalCost As Label
    Friend WithEvents lblTotalCost2 As Label
    Friend WithEvents btnFindCost As Button
    Friend WithEvents btnClear As Button
    Friend WithEvents btnExit As Button
End Class
