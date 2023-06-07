#include "Tool_Obdelnik.h"
#include <iostream>

void obdelnik()
{
	Obdelnik ob;

	nacti_strany_obdelnika(ob);
	pocitej_obdelnik(ob);
	tisk_UdajeObdelnika(ob);
}

void obdelniky() {

	obdelnik();

	printf("\n\n");

	obdelnik();
}
