
#include <iostream>
#include <thread>

bool running;

void foo(){
	running = false;
}

int main(){

	running = true;
	int n=0;
	std::thread other(foo);
	while(running){
		n = n+1;
	}

	std::cout << "n : " << n << std::endl;

	other.join();

	return 0;
}