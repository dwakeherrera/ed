using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{
	int cont = 0;
	int opc;
	float num1, num2;
	Calculadora calc = new Calculadora();
	float resultado;

	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnButtonUnoClicked (object sender, EventArgs e)
	{
		String display = Pantalla.Text.ToString();
		Pantalla.DeleteText (0,Pantalla.Text.Length);
		Pantalla.InsertText (display + "1");
	}

	protected void OnButtonDosClicked (object sender, EventArgs e)
	{
		String display = Pantalla.Text.ToString();
		Pantalla.DeleteText (0,Pantalla.Text.Length);
		Pantalla.InsertText (display + "2");
	}

	protected void OnButtonTresClicked (object sender, EventArgs e)
	{
		String display = Pantalla.Text.ToString();
		Pantalla.DeleteText (0,Pantalla.Text.Length);
		Pantalla.InsertText (display + "3");
	}

	protected void OnButtonCuatroClicked (object sender, EventArgs e)
	{
		String display = Pantalla.Text.ToString();
		Pantalla.DeleteText (0,Pantalla.Text.Length);
		Pantalla.InsertText (display + "4");
	}

	protected void OnButtonCincoClicked (object sender, EventArgs e)
	{
		String display = Pantalla.Text.ToString();
		Pantalla.DeleteText (0,Pantalla.Text.Length);
		Pantalla.InsertText (display + "5");
	}

	protected void OnButtonSeisClicked (object sender, EventArgs e)
	{
		String display = Pantalla.Text.ToString();
		Pantalla.DeleteText (0,Pantalla.Text.Length);
		Pantalla.InsertText (display + "6");
	}

	protected void OnButtonSieteClicked (object sender, EventArgs e)
	{
		String display = Pantalla.Text.ToString();
		Pantalla.DeleteText (0,Pantalla.Text.Length);
		Pantalla.InsertText (display + "7");
	}

	protected void OnButtonOchoClicked (object sender, EventArgs e)
	{
		String display = Pantalla.Text.ToString();
		Pantalla.DeleteText (0,Pantalla.Text.Length);
		Pantalla.InsertText (display + "8");
	}

	protected void OnButtonNueveClicked (object sender, EventArgs e)
	{
		String display = Pantalla.Text.ToString();
		Pantalla.DeleteText (0,Pantalla.Text.Length);
		Pantalla.InsertText (display + "9");
	}

	protected void OnButtonCeroClicked (object sender, EventArgs e)
	{
		String display = Pantalla.Text.ToString();
		Pantalla.DeleteText (0,Pantalla.Text.Length);
		Pantalla.InsertText (display + "0");
	}

	protected void OnButtonPuntoClicked (object sender, EventArgs e)
	{
		if (cont == 0) {
			String display = Pantalla.Text.ToString ();
			Pantalla.DeleteText (0, Pantalla.Text.Length);
			Pantalla.InsertText (display + ".");
			cont++;
		}
	}

	protected void OnButtonVaciarClicked (object sender, EventArgs e)
	{
		Pantalla.DeleteText (0, Pantalla.Text.Length);
		cont = 0;
	}

	protected void OnButtonSumaClicked (object sender, EventArgs e)
	{
		if(opc == 0) {
			num1 = Convert.ToSingle(Pantalla.Text);
			Pantalla.DeleteText(0, Pantalla.Text.Length);
			cont = 0;
			opc = 1;
		}
	}

	protected void OnButtonRestaClicked (object sender, EventArgs e)
	{
		if(opc == 0) {
			num1 = Convert.ToSingle(Pantalla.Text);
			Pantalla.DeleteText(0, Pantalla.Text.Length);
			cont = 0;
			opc = 2;
		}
	}

	protected void OnButtonMultClicked (object sender, EventArgs e)
	{
		if(opc == 0) {
			num1 = Convert.ToSingle(Pantalla.Text);
			Pantalla.DeleteText(0, Pantalla.Text.Length);
			cont = 0;
			opc = 3;
		}
	}

	protected void OnButtonDivClicked (object sender, EventArgs e)
	{
		if(opc == 0) {
			num1 = Convert.ToSingle(Pantalla.Text);
			Pantalla.DeleteText(0, Pantalla.Text.Length);
			cont = 0;
			opc = 4;
		}
	}

	protected void OnButtonResultClicked (object sender, EventArgs e)
	{
		if (opc != 0) {
			num2 = Convert.ToSingle(Pantalla.Text);
			Pantalla.DeleteText(0, Pantalla.Text.Length);
			switch(opc) {
			case 1:
				resultado = calc.suma (num1, num2);
				Pantalla.InsertText (Convert.ToString (resultado));
				break;
			case 2:
				resultado = calc.resta (num1, num2);
				Pantalla.InsertText (Convert.ToString (resultado));
				break;
			case 3:
				resultado = calc.multiplicacion (num1, num2);
				Pantalla.InsertText (Convert.ToString (resultado));
				break;
			case 4:
				resultado = calc.division (num1, num2);
				Pantalla.InsertText (Convert.ToString (resultado));
				break;
			}
			opc = 0;
		}
	}
}