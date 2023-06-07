
#include <iostream>
#include "InOut_Obdelnik.h"

void nacti_strany_obdelnika(Obdelnik& ob)
{
	printf("Zadej strany obdelnika:\n");
	scanf_s("%lf", &ob.a);
	scanf_s("%lf", &ob.b);
}

void tisk_UdajeObdelnika(Obdelnik& ob)
{
	printf("\nObdelnik o stranach %.2f a %.2f ma obvod %.2f a obsah %.2f.\n", ob.a, ob.b, ob.o, ob.S);
}
