#include <my_library.h>
void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
int result = add(9,6);
Serial.print(result);
}
void loop() {
  // put your main code here, to run repeatedly:
}
