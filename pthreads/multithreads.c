#include<pthread.h>
#include<stdio.h>

int g = 0;

void * increment(void *vargp) {
    int *threadid = vargp;

    int i;
    for (i = 0; i < 1000; i++) {
        ++g;
    }

    printf("Thread ID: %d finished\n", *threadid);
}

int main(void) {
    int i;

    pthread_t thread_id[10];
    
    for (i = 0; i < 10; i++) {
        pthread_create(&thread_id[i], NULL, increment, (void *)&(thread_id[i]));
    }

    printf("final value: %d\n", g);
    pthread_exit(NULL);
}
