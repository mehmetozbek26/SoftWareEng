SqlDataReader rdr = cmd.ExecuteReader();
                if (rdr.Read())
                {
                    if (txtuserid.Text.ToString() == rdr["userid"].ToString() && txtpwd.Text.ToString() == rdr["confirmpassword"].ToString())
                    {
                        //MessageBox.Show("Giriş başarılı.");
                    }
                    GlobalClass.GlobalVar = rdr["comdepart"].ToString();
                    Form yeniform = new ListeForm();



                    yeniform.Size = Screen.PrimaryScreen.WorkingArea.Size;
                    yeniform.Show();
                    this.Hide();
                    rdr.Close();
                }
                else
                {
                    MessageBox.Show("Hatalı kullanıcı adı veya şifre.");
                }
                cnn.Close();
            }
        }
///////////////////
/////////////////
////////////////
//////////////

        private void btnCancel_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

