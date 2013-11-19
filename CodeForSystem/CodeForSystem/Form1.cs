using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;
namespace AnaOkuluBilisim
{
    public partial class ChangePassword : Form
    {
        public ChangePassword()
        {
            InitializeComponent();
        }
        SqlConnection conn = new SqlConnection("Data Source=.; database=AnaOkuluDB;integrated security=true");
        SqlCommand cmd;
        string qry;

        private void btncreatepwd_Click_1(object sender, EventArgs e)
        {
            Information.Text = "";
            try
            {
                if (validatedata() == 0)
                {
                    errorProvider1.Clear();
                    if (txtnewpwd.Text.Length == txtconfirmpwd.Text.Length)
                    {
                        qry = "update pwd  set createpassword='" + txtnewpwd.Text + "' where userid='" + txtuserid.Text + "'and createpassword='" + txtoldpwd.Text + "'";
                        cmd = new SqlCommand(qry, conn);
                        //MessageBox.Show(qry);
                        conn.Open();
                        int row = cmd.ExecuteNonQuery();
                        if (row > 0)
                        {
                            MessageBox.Show("Password changed", "Message");
                        }
                        else
                        {
                            MessageBox.Show("Password did not change your user id or password is wrong", "Message");
                            txtuserid.Clear();
                            txtoldpwd.Clear();
                            txtnewpwd.Clear();
                            txtconfirmpwd.Clear();
                        }
                        conn.Close();
                        txtuserid.Clear();
                        txtoldpwd.Clear();
                        txtnewpwd.Clear();
                        txtconfirmpwd.Clear();
                    }
                    else
                    {
                        MessageBox.Show("Your new password and confirm password is not same", "Message");
                        txtnewpwd.Clear();
                        txtconfirmpwd.Clear();
                    }
                }
            }
            catch (SqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
        private void btnresetpwd_Click_1(object sender, EventArgs e)
        {
            txtuserid.Clear();
            txtoldpwd.Clear();
            txtnewpwd.Clear();
            txtconfirmpwd.Clear();
        }

        private void btnexit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void txtuserid_Enter(object sender, EventArgs e)
        {
            Information.Text = "Please enter user id";
        }

        private void txtoldpwd_Enter(object sender, EventArgs e)
        {
            Information.Text = "Please enter current password";
        }

        private void txtnewpwd_Enter(object sender, EventArgs e)
        {
            Information.Text = "Please enter new password";
        }

       
            return i;
        }
    }
}
